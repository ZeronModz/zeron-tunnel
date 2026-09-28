package com.vpn.sandok.ultrasshservice.tunnel;

import android.content.Context;
import dev.zeron.tunnel.R;
import com.trilead.ssh2.ProxyData;
import com.trilead.ssh2.crypto.Base64;
import com.trilead.ssh2.transport.ClientServerHello;
import com.trilead.ssh2.transport.TransportManager;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
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
public class HttpProxyCustom implements ProxyData {
    private Context mContext;
    private boolean modoDropbear;
    private final String proxyHost;
    private final String proxyPass;
    private final int proxyPort;
    private final String proxyUser;
    private final String requestPayload;
    private Socket sock;

    public HttpProxyCustom(String str, int i, String str2, String str3, String str4, boolean z, Context context) {
        this.modoDropbear = false;
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
        this.requestPayload = str4;
        this.modoDropbear = true;
        this.mContext = context;
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
        Socket socket = this.sock;
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
        int lineRN;
        this.sock = new Socket();
        this.sock.connect(new InetSocketAddress(TransportManager.createInetAddress(this.proxyHost), this.proxyPort), i2);
        this.sock.setSoTimeout(i3);
        String requestPayload = getRequestPayload(str, i);
        if (TunnelUtils.isActiveVpn(this.mContext)) {
            SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.error_vpn_sniffer_detected) + "</strong>");
            p60.f("error detected");
            return null;
        }
        SkStatus.logInfo(R.string.state_proxy_inject, new Object[0]);
        OutputStream outputStream = this.sock.getOutputStream();
        if (!TunnelUtils.injectSplitPayload(requestPayload, outputStream)) {
            try {
                outputStream.write(requestPayload.getBytes("ISO-8859-1"));
            } catch (UnsupportedEncodingException unused) {
                outputStream.write(requestPayload.getBytes());
            }
            outputStream.flush();
        }
        boolean z = this.modoDropbear;
        Socket socket = this.sock;
        if (z) {
            return socket;
        }
        byte[] bArr = new byte[1024];
        InputStream inputStream = socket.getInputStream();
        int lineRN2 = ClientServerHello.readLineRN(inputStream, bArr);
        try {
            str2 = new String(bArr, 0, lineRN2, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused2) {
            str2 = new String(bArr, 0, lineRN2);
        }
        SkStatus.logInfo("<strong>" + str2 + "</strong>");
        int i4 = Integer.parseInt(str2.substring(9, 12));
        if (i4 == 200) {
            return this.sock;
        }
        String strValueOf = String.valueOf(i4);
        str2.replace(str2, "HTTP/1.1 200 Ok");
        SkStatus.logInfo("Sending 200 HTTP Status - HTTP/1.1 200 OK");
        Integer.parseInt(strValueOf.replace(strValueOf, "200"));
        String strConcat = str2;
        while (true) {
            lineRN = ClientServerHello.readLineRN(inputStream, bArr);
            if (lineRN == 0) {
                break;
            }
            String strConcat2 = strConcat.concat("\n");
            try {
                strConcat = strConcat2 + new String(bArr, 0, lineRN, "ISO-8859-1");
            } catch (UnsupportedEncodingException unused3) {
                strConcat = strConcat2.concat(new String(bArr, 0, lineRN));
            }
        }
        if (!strConcat.isEmpty()) {
            SkStatus.logDebug(strConcat);
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
            return this.sock;
        }
        outputStream.write("<b>HTTP/1.1 200 Ok</b>\r\n\r\n".getBytes());
        outputStream.flush();
        SkStatus.logInfo("<b>HTTP/1.1 200 Ok</b>\r\n\r\n".toString());
        return this.sock;
    }

    public HttpProxyCustom(String str, int i, String str2, String str3, Context context) {
        this(str, i, str2, str3, null, false, context);
    }

    public HttpProxyCustom(String str, int i, Context context) {
        this(str, i, null, null, context);
    }
}
