package com.vpn.sandok.ultrasshservice.tunnel;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import com.trilead.ssh2.ProxyData;
import com.trilead.ssh2.crypto.Base64;
import com.trilead.ssh2.transport.ClientServerHello;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import defpackage.p60;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SSLProxy implements ProxyData {
    private Context mContext;
    private Socket mSocket;
    private String proxyHost;
    private int proxyPort;
    private String requestPayload;
    private String stunnelHostSNI;
    private int stunnelPort;
    private String stunnelServer;
    private String proxyUser = null;
    private String proxyPass = null;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class HandshakeTunnelCompletedListener implements HandshakeCompletedListener {
        private final String val$host;
        private final int val$port;
        private final SSLSocket val$sslSocket;

        public HandshakeTunnelCompletedListener(String str, int i, SSLSocket sSLSocket) {
            this.val$host = str;
            this.val$port = i;
            this.val$sslSocket = sSLSocket;
        }

        @Override // javax.net.ssl.HandshakeCompletedListener
        public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
            StringBuffer stringBuffer = new StringBuffer("<b>Established ");
            stringBuffer.append(handshakeCompletedEvent.getSession().getProtocol());
            stringBuffer.append(" connection  using ");
            stringBuffer.append(handshakeCompletedEvent.getCipherSuite());
            stringBuffer.append("</b>");
            SkStatus.logInfo(stringBuffer.toString());
            SkStatus.logInfo("SSL: Using protocol " + handshakeCompletedEvent.getSession().getProtocol());
            SkStatus.logInfo("SSL: Handshake finished");
        }
    }

    public SSLProxy(String str, int i, String str2, String str3) {
        this.stunnelServer = str;
        this.stunnelPort = i;
        this.stunnelHostSNI = str2;
        this.requestPayload = str3;
    }

    private SSLSocket doSSLHandshake(String str, String str2, int i) throws IOException {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.vpn.sandok.ultrasshservice.tunnel.SSLProxy.2
            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str3) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str3) {
            }
        }};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocket sSLSocket = (SSLSocket) new TLSSocketFactory().createSocket(str, i);
            if (sSLContext.getSocketFactory() instanceof SSLCertificateSocketFactory) {
                ((SSLCertificateSocketFactory) sSLContext.getSocketFactory()).setHostname(sSLSocket, str2);
            } else {
                try {
                    sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str2);
                    SkStatus.logInfo("Setting up SNI...");
                } catch (Throwable unused) {
                }
            }
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
            sSLSocket.addHandshakeCompletedListener(new HandshakeTunnelCompletedListener(str, i, sSLSocket));
            SkStatus.logInfo("Starting SSL Handshake...");
            sSLSocket.startHandshake();
            return sSLSocket;
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer("Could not do SSL handshake: ");
            stringBuffer.append(e);
            throw new IOException(stringBuffer.toString());
        }
    }

    private String getRequestPayload(String str, int i) {
        char[] cArrEncode;
        String str2 = this.requestPayload;
        if (str2 != null) {
            return TunnelUtils.formatCustomPayload(str, i, str2);
        }
        StringBuffer stringBuffer = new StringBuffer("CONNECT ");
        stringBuffer.append(str);
        stringBuffer.append(':');
        stringBuffer.append(i);
        stringBuffer.append(" HTTP/1.0\r\n");
        if (this.proxyUser != null && this.proxyPass != null) {
            String str3 = this.proxyUser + ":" + this.proxyPass;
            try {
                cArrEncode = Base64.encode(str3.getBytes("ISO-8859-1"));
            } catch (UnsupportedEncodingException unused) {
                cArrEncode = Base64.encode(str3.getBytes());
            }
            stringBuffer.append("Proxy-Authorization: Basic ");
            stringBuffer.append(cArrEncode);
            stringBuffer.append("\r\n");
        }
        stringBuffer.append("\r\n");
        return stringBuffer.toString();
    }

    @Override // com.trilead.ssh2.ProxyData
    public void close() {
        Socket socket = this.mSocket;
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    @Override // com.trilead.ssh2.ProxyData
    public Socket openConnection(String str, int i, int i2, int i3) throws IOException {
        String str2;
        Socket socket = SocketChannel.open().socket();
        this.mSocket = socket;
        socket.connect(new InetSocketAddress(this.stunnelServer, this.stunnelPort));
        if (!this.mSocket.isConnected()) {
            return this.mSocket;
        }
        this.mSocket = doSSLHandshake(str, this.stunnelHostSNI, i);
        String requestPayload = getRequestPayload(str, i);
        OutputStream outputStream = this.mSocket.getOutputStream();
        if (!TunnelUtils.injectSplitPayload(requestPayload, outputStream)) {
            try {
                outputStream.write(requestPayload.getBytes("ISO-8859-1"));
            } catch (UnsupportedEncodingException unused) {
                outputStream.write(requestPayload.getBytes());
            }
            outputStream.flush();
        }
        byte[] bArr = new byte[1024];
        int lineRN = ClientServerHello.readLineRN(this.mSocket.getInputStream(), bArr);
        try {
            str2 = new String(bArr, 0, lineRN, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused2) {
            str2 = new String(bArr, 0, lineRN);
        }
        int i4 = Integer.parseInt(str2.substring(9, 12));
        if (i4 == 200) {
            return this.mSocket;
        }
        if (i4 == 101) {
            SkStatus.logInfo("<b>HTTP/1.1 200 Connection established</b>");
            return this.mSocket;
        }
        if (!str2.startsWith("HTTP/")) {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
        if (str2.length() < 14) {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
        if (str2.charAt(8) != ' ') {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
        if (str2.charAt(12) != ' ') {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
        if (lineRN < 0 || lineRN > 999) {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
        if (lineRN == 200) {
            return this.mSocket;
        }
        outputStream.write("HTTP/1.0 200 Connection established\r\n\r\n".getBytes());
        outputStream.flush();
        SkStatus.logInfo("HTTP/1.0 200 Connection established\r\n\r\n".toString());
        return this.mSocket;
    }

    private Socket doSSLHandshake(Socket socket, String str, String str2, int i) throws IOException {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.vpn.sandok.ultrasshservice.tunnel.SSLProxy.1
            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str3) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str3) {
            }
        }};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocket sSLSocket = (SSLSocket) sSLContext.getSocketFactory().createSocket(socket, str, i, true);
            if (sSLContext.getSocketFactory() instanceof SSLCertificateSocketFactory) {
                ((SSLCertificateSocketFactory) sSLContext.getSocketFactory()).setHostname(socket, str2);
            } else {
                try {
                    socket.getClass().getMethod("setHostname", String.class).invoke(socket, str2);
                    SkStatus.logInfo("Setting up SNI...");
                } catch (Throwable unused) {
                }
            }
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
            sSLSocket.addHandshakeCompletedListener(new HandshakeTunnelCompletedListener(str, i, sSLSocket));
            SkStatus.logInfo("Starting SSL Handshake...");
            sSLSocket.startHandshake();
            return sSLSocket;
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer("Could not do SSL handshake: ");
            stringBuffer.append(e);
            throw new IOException(stringBuffer.toString());
        }
    }
}
