package com.vpn.sandok.ultrasshservice.tunnel;

import android.net.SSLCertificateSocketFactory;
import com.trilead.ssh2.ProxyData;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import java.io.IOException;
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
public class SSLTunnelProxy implements ProxyData {
    private Socket mSocket;
    private String stunnelHostSNI;
    private int stunnelPort;
    private String stunnelServer;

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
            stringBuffer.append(" connection with ********:");
            stringBuffer.append(this.val$port);
            stringBuffer.append(" using ");
            stringBuffer.append(handshakeCompletedEvent.getCipherSuite());
            stringBuffer.append("</b>");
            SkStatus.logInfo(stringBuffer.toString());
            SkStatus.logInfo("SSL: Using protocol " + handshakeCompletedEvent.getSession().getProtocol());
            SkStatus.logInfo("SSL: Handshake finished");
        }
    }

    public SSLTunnelProxy(String str, int i, String str2) {
        this.stunnelServer = str;
        this.stunnelPort = i;
        this.stunnelHostSNI = str2;
    }

    private Socket doSSLHandshake(Socket socket, String str, String str2, int i) throws IOException {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.vpn.sandok.ultrasshservice.tunnel.SSLTunnelProxy.1
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
                    SkStatus.logInfo("Setting up SNI..");
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

    @Override // com.trilead.ssh2.ProxyData
    public void close() {
        try {
            Socket socket = this.mSocket;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.trilead.ssh2.ProxyData
    public Socket openConnection(String str, int i, int i2, int i3) throws IOException {
        Socket socket = SocketChannel.open().socket();
        this.mSocket = socket;
        socket.connect(new InetSocketAddress(this.stunnelServer, this.stunnelPort));
        if (this.mSocket.isConnected()) {
            this.mSocket = doSSLHandshake(str, this.stunnelHostSNI, i);
        }
        return this.mSocket;
    }

    private SSLSocket doSSLHandshake(String str, String str2, int i) throws IOException {
        try {
            SSLSocket sSLSocket = (SSLSocket) new TLSSocketFactory().createSocket(str, i);
            try {
                sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str2);
                SkStatus.logInfo("Setting up SNI..");
            } catch (Throwable unused) {
            }
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
