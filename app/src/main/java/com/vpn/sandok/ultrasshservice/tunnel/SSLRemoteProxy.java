package com.vpn.sandok.ultrasshservice.tunnel;

import android.content.SharedPreferences;
import com.trilead.ssh2.ProxyData;
import com.trilead.ssh2.crypto.Base64;
import com.trilead.ssh2.transport.ClientServerHello;
import com.vpn.sandok.ultrasshservice.SocksHttpService;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SSLRemoteProxy implements ProxyData {
    private Socket mSocket;
    private String requestPayload;
    private String stunnelHostSNI;
    private int stunnelPort;
    private String stunnelServer;
    private boolean notdropbear = true;
    private String proxyUser = null;
    private String proxyPass = null;
    private SharedPreferences sp = SocksHttpService.getSharedPrefs();

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
            SkStatus.logInfo("SSL: Using protocol " + handshakeCompletedEvent.getSession().getProtocol());
            SkStatus.logInfo("SSL: Handshake finished");
        }
    }

    public SSLRemoteProxy(String str, int i, String str2, String str3) {
        this.stunnelServer = str;
        this.stunnelPort = i;
        this.stunnelHostSNI = str2;
        this.requestPayload = str3;
    }

    private SSLSocket doSSLHandshake(String str, String str2, int i) throws IOException {
        try {
            SSLSocket sSLSocket = (SSLSocket) new TLSSocketFactory().createSocket(str, i);
            try {
                sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str2);
                SkStatus.logInfo("Remote Proxy");
                SkStatus.logInfo("Setting up SNI..");
            } catch (Throwable unused) {
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
            StringBuffer stringBuffer2 = new StringBuffer();
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(this.proxyUser);
            stringBuffer3.append(":");
            stringBuffer2.append(stringBuffer3.toString());
            stringBuffer2.append(this.proxyPass);
            String string = stringBuffer2.toString();
            try {
                cArrEncode = Base64.encode(string.getBytes("ISO-8859-1"));
            } catch (UnsupportedEncodingException unused) {
                cArrEncode = Base64.encode(string.getBytes());
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
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.trilead.ssh2.ProxyData
    public Socket openConnection(String str, int i, int i2, int i3) throws IOException {
        String str2;
        int lineRN;
        Socket socket = SocketChannel.open().socket();
        this.mSocket = socket;
        socket.connect(new InetSocketAddress(this.stunnelServer, this.stunnelPort));
        boolean zIsConnected = this.mSocket.isConnected();
        Socket socket2 = this.mSocket;
        if (!zIsConnected) {
            return socket2;
        }
        socket2.setKeepAlive(true);
        this.mSocket.setTcpNoDelay(false);
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
        InputStream inputStream = this.mSocket.getInputStream();
        int lineRN2 = ClientServerHello.readLineRN(inputStream, bArr);
        if (this.notdropbear) {
            return this.mSocket;
        }
        try {
            str2 = new String(bArr, 0, lineRN2, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused2) {
            str2 = new String(bArr, 0, lineRN2);
        }
        int i4 = Integer.parseInt(str2.substring(9, 12));
        if (i4 == 200) {
            return this.mSocket;
        }
        String strValueOf = String.valueOf(i4);
        str2.replace(str2, "HTTP/1.1 200 Ok");
        SkStatus.logInfo("Proxy: Auto Replace Header");
        Integer.parseInt(strValueOf.replace(strValueOf, "200"));
        String string = str2;
        while (true) {
            lineRN = ClientServerHello.readLineRN(inputStream, bArr);
            if (lineRN == 0) {
                break;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(string);
            stringBuffer.append("\n");
            String string2 = stringBuffer.toString();
            try {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(string2);
                stringBuffer2.append(new String(bArr, 0, lineRN, "ISO-8859-1"));
                string = stringBuffer2.toString();
            } catch (UnsupportedEncodingException unused3) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(string2);
                stringBuffer3.append(new String(bArr, 0, lineRN));
                string = stringBuffer3.toString();
            }
        }
        if (!string.isEmpty()) {
            SkStatus.logDebug(string);
        }
        if (!str2.startsWith("HTTP/")) {
            throw new NoClassDefFoundError("The proxy did not send back a valid HTTP response.");
        }
        if (str2.length() < 14) {
            throw new NoClassDefFoundError("The proxy did not send back a valid HTTP response.");
        }
        if (str2.charAt(8) != ' ') {
            throw new NoClassDefFoundError("The proxy did not send back a valid HTTP response.");
        }
        if (str2.charAt(12) != ' ') {
            throw new NoClassDefFoundError("The proxy did not send back a valid HTTP response.");
        }
        if (lineRN < 0 || lineRN > 999) {
            throw new NoClassDefFoundError("The proxy did not send back a valid HTTP response.");
        }
        if (lineRN == 200) {
            return this.mSocket;
        }
        outputStream.write("HTTP/1.0 200 Connection established\r\n\r\n".getBytes());
        outputStream.flush();
        SkStatus.logInfo("HTTP/1.0 200 Connection established\r\n\r\n".toString());
        return this.mSocket;
    }
}
