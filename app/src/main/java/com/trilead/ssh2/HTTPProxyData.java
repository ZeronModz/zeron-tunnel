package com.trilead.ssh2;

import com.trilead.ssh2.crypto.Base64;
import com.trilead.ssh2.transport.ClientServerHello;
import com.trilead.ssh2.transport.TransportManager;
import defpackage.p60;
import defpackage.u7;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class HTTPProxyData implements ProxyData {
    private final String proxyHost;
    private final String proxyPass;
    private final int proxyPort;
    private final String proxyUser;
    private final String[] requestHeaderLines;
    private Socket sock;

    public HTTPProxyData(String str, int i, String str2, String str3, String[] strArr) {
        if (str == null) {
            u7.r("proxyHost must be non-null");
            throw null;
        }
        if (i < 0) {
            u7.r("proxyPort must be non-negative");
            throw null;
        }
        this.proxyHost = str;
        this.proxyPort = i;
        this.proxyUser = str2;
        this.proxyPass = str3;
        this.requestHeaderLines = strArr;
    }

    @Override // com.trilead.ssh2.ProxyData
    public void close() {
        Socket socket = this.sock;
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
        char[] cArrEncode;
        this.sock = new Socket();
        this.sock.connect(new InetSocketAddress(TransportManager.createInetAddress(this.proxyHost), this.proxyPort), i2);
        this.sock.setSoTimeout(i3);
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
        if (this.requestHeaderLines != null) {
            int i4 = 0;
            while (true) {
                String[] strArr = this.requestHeaderLines;
                if (i4 >= strArr.length) {
                    break;
                }
                String str4 = strArr[i4];
                if (str4 != null) {
                    stringBuffer.append(str4);
                    stringBuffer.append("\r\n");
                }
                i4++;
            }
        }
        stringBuffer.append("\r\n");
        OutputStream outputStream = this.sock.getOutputStream();
        try {
            outputStream.write(stringBuffer.toString().getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException unused2) {
            outputStream.write(stringBuffer.toString().getBytes());
        }
        outputStream.flush();
        byte[] bArr = new byte[1024];
        InputStream inputStream = this.sock.getInputStream();
        int lineRN = ClientServerHello.readLineRN(inputStream, bArr);
        try {
            str2 = new String(bArr, 0, lineRN, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused3) {
            str2 = new String(bArr, 0, lineRN);
        }
        if (!str2.startsWith("HTTP/")) {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
        if (str2.length() < 14 || str2.charAt(8) != ' ' || str2.charAt(12) != ' ') {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
        try {
            int i5 = Integer.parseInt(str2.substring(9, 12));
            if (i5 < 0 || i5 > 999) {
                p60.f("The proxy did not send back a valid HTTP response.");
                return null;
            }
            if (i5 != 200) {
                throw new HTTPProxyException(str2.substring(13), i5);
            }
            while (ClientServerHello.readLineRN(inputStream, bArr) != 0) {
            }
            return this.sock;
        } catch (NumberFormatException unused4) {
            p60.f("The proxy did not send back a valid HTTP response.");
            return null;
        }
    }

    public HTTPProxyData(String str, int i, String str2, String str3) {
        this(str, i, str2, str3, null);
    }

    public HTTPProxyData(String str, int i) {
        this(str, i, null, null);
    }
}
