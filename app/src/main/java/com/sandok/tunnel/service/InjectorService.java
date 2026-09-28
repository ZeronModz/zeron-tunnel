package com.sandok.tunnel.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.thread.BackServer;
import com.sandok.tunnel.thread.ProxyThread;
import com.sandok.tunnel.utils.ConfigUtil;
import com.sandok.tunnel.utils.SSLUtil;
import com.sandok.tunnel.utils.VPNUtil;
import defpackage.hz;
import defpackage.n5;
import defpackage.p60;
import defpackage.vh;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class InjectorService extends Service implements Runnable, Handler.Callback {
    public static final String NOTIFICATION_CHANNEL_ID = "injector";
    public static boolean isRunning = false;
    private InjectorListener InjectorListener;
    private Socket client;
    private ConfigUtil config;
    private HttpsURLConnection huc;
    private BackServer mBackServerThread;
    private Handler mHandler;
    public SSLSocket mSSLSocket;
    private Thread mThread;
    private int mTunnelType;
    private int repeatCount = 0;
    public Socket server;
    private ServerSocket ss;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface InjectorListener {
        void startOpenVPN();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class MyBinder extends Binder {
        public MyBinder() {
        }

        public InjectorService getService() {
            return InjectorService.this;
        }
    }

    private void a(String str, Socket socket) throws Exception {
        OutputStream outputStream = socket.getOutputStream();
        if (str.contains("[random]")) {
            Random random = new Random();
            String[] strArrSplit = str.split(Pattern.quote("[random]"));
            str = strArrSplit[random.nextInt(strArrSplit.length)];
        }
        int i = 0;
        if (str.contains("[repeat]")) {
            String[] strArrSplit2 = str.split(Pattern.quote("[repeat]"));
            int i2 = this.repeatCount;
            String str2 = strArrSplit2[i2];
            int i3 = i2 + 1;
            this.repeatCount = i3;
            if (i3 > strArrSplit2.length - 1) {
                this.repeatCount = 0;
            }
            str = str2;
        }
        log("Payload: " + ConfigUtil.hide(str.replace("\r\n", "\\r\\n")));
        log("Injecting");
        if (str.contains("[split_delay]")) {
            String[] strArrSplit3 = str.split(Pattern.quote("[split_delay]"));
            int length = strArrSplit3.length;
            while (i < length) {
                String str3 = strArrSplit3[i];
                if (a(str3, socket, outputStream)) {
                    outputStream.write(str3.getBytes());
                    outputStream.flush();
                    Thread.sleep(1500L);
                }
                i++;
            }
            return;
        }
        if (str.contains("[split_instant]")) {
            String[] strArrSplit4 = str.split(Pattern.quote("[split_instant]"));
            int length2 = strArrSplit4.length;
            while (i < length2) {
                String str4 = strArrSplit4[i];
                if (a(str4, socket, outputStream)) {
                    outputStream.write(str4.getBytes());
                    outputStream.flush();
                    Thread.sleep(0L);
                }
                i++;
            }
            return;
        }
        if (str.contains("[instant_split]")) {
            String[] strArrSplit5 = str.split(Pattern.quote("[instant_split]"));
            int length3 = strArrSplit5.length;
            while (i < length3) {
                String str5 = strArrSplit5[i];
                if (a(str5, socket, outputStream)) {
                    outputStream.write(str5.getBytes());
                    outputStream.flush();
                    Thread.sleep(0L);
                }
                i++;
            }
            return;
        }
        if (!str.contains("[delay_split]")) {
            if (a(str, socket, outputStream)) {
                outputStream.write(str.getBytes());
                outputStream.flush();
                Thread.sleep(1000L);
                return;
            }
            return;
        }
        String[] strArrSplit6 = str.split(Pattern.quote("[delay_split]"));
        int length4 = strArrSplit6.length;
        while (i < length4) {
            String str6 = strArrSplit6[i];
            if (a(str6, socket, outputStream)) {
                outputStream.write(str6.getBytes());
                outputStream.flush();
                Thread.sleep(1500L);
            }
            i++;
        }
    }

    private String c(String str) {
        if (str != null) {
            try {
                if (!str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                    String str2 = str.split("\r\n")[0];
                    String[] strArrSplit = str2.split(" ");
                    String[] strArrSplit2 = strArrSplit[1].split(":");
                    String str3 = strArrSplit2[0];
                    return d(this.config.getPayload().replace("[rlb]", this.config.getSSHHost()).replace("[real_raw]", str).replace("[raw]", str2).replace("[method]", strArrSplit[0]).replace("[host_port]", strArrSplit[1]).replace("[host]", str3).replace("[port]", strArrSplit2[1]).replace("[protocol]", strArrSplit[2]).replace("[cr]", "\r").replace("[lf]", "\n").replace("[crlf]", "\r\n").replace("[lfcr]", "\n\r").replace("\\r", "\r").replace("\\n", "\n"));
                }
            } catch (Exception e) {
                this.log("Payload Error", e.toString());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAll() {
        try {
            ServerSocket serverSocket = this.ss;
            if (serverSocket != null) {
                serverSocket.close();
                this.ss = null;
            }
            Socket socket = this.client;
            if (socket != null) {
                socket.close();
                this.client = null;
            }
            Socket socket2 = this.server;
            if (socket2 != null) {
                socket2.close();
                this.server = null;
            }
            SSLSocket sSLSocket = this.mSSLSocket;
            if (sSLSocket != null) {
                sSLSocket.close();
                this.mSSLSocket = null;
            }
            Thread thread = this.mThread;
            if (thread != null) {
                thread.interrupt();
                this.mThread = null;
            }
            HttpsURLConnection httpsURLConnection = this.huc;
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
                this.huc = null;
            }
            BackServer backServer = this.mBackServerThread;
            if (backServer != null) {
                backServer.Stop();
                this.mBackServerThread = null;
            }
        } catch (Exception e) {
            log("CloseAll error: " + e.getMessage());
        }
    }

    private void connectSSL() throws Exception {
        SSLUtil sSLUtil = new SSLUtil(this);
        URL url = new URL(vh.l("https://", this.config.getSni()));
        String host = url.getHost();
        if (url.getPort() > 0) {
            host = host + ":" + url.getPort();
        }
        if (!url.getPath().equals("/")) {
            StringBuilder sbY = hz.y(host);
            sbY.append(url.getPath());
            host = sbY.toString();
        }
        log("(SNI) Host: " + ConfigUtil.hide(host));
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, this.mBackServerThread.getLocalSocketAddr()));
        this.huc = httpsURLConnection;
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.sandok.tunnel.service.InjectorService.2
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        });
        this.huc.setSSLSocketFactory(sSLUtil);
        this.huc.connect();
    }

    private boolean connectSocket() throws Exception {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String line = bufferedReader.readLine();
            if (line != null && line.length() > 0) {
                stringBuffer.append(line);
                stringBuffer.append("\r\n");
                if (line.concat("\r\n").equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                    log("Get Request", "Get request data failed, empty requestline");
                    return false;
                }
                log("Connecting to: ", this.config.getServerSelectedName());
                if (this.mTunnelType != 0) {
                    log("Selected Network", this.config.getNetworkSelectedName());
                }
                int i = this.mTunnelType;
                if (i == 0) {
                    String str = stringBuffer.toString().split("\r\n")[0].split(" ")[1];
                    connectSocket(str.split(":")[0], Integer.parseInt(str.split(":")[1]));
                    send200Status(this.client.getOutputStream());
                } else if (i == 1) {
                    String strC = c(stringBuffer.toString());
                    if (strC == null) {
                        return false;
                    }
                    String proxy = this.config.getProxy();
                    int i2 = Integer.parseInt(this.config.getProxyPort());
                    log("[Proxy Server]", "Connecting to ".concat(proxy + ":" + i2));
                    connectSocket(proxy, i2);
                    if (!strC.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                        a(strC, this.server);
                    }
                } else if (i == 2) {
                    String strC2 = c(stringBuffer.toString());
                    if (strC2 == null) {
                        return false;
                    }
                    connectSocket(this.config.getProxy(), Integer.parseInt(this.config.getProxyPort()));
                    if (!strC2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                        a(strC2, this.server);
                    }
                } else if (i == 3) {
                    String str2 = stringBuffer.toString().split("\r\n")[0].split(" ")[1];
                    connectSocket(str2.split(":")[0], Integer.parseInt(str2.split(":")[1]));
                    connectSSL();
                    send200Status(this.client.getOutputStream());
                } else if (i == 4) {
                    String strC3 = c(stringBuffer.toString());
                    if (strC3 == null) {
                        return false;
                    }
                    String str3 = stringBuffer.toString().split("\r\n")[0].split(" ")[1];
                    connectSocket(str3.split(":")[0], Integer.parseInt(str3.split(":")[1]));
                    connectSSL();
                    if (!strC3.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                        a(strC3, this.mSSLSocket);
                    }
                    send200Status(this.client.getOutputStream());
                } else if (i == 5) {
                    String strC4 = c(stringBuffer.toString());
                    if (strC4 == null) {
                        return false;
                    }
                    connectSocket(this.config.getProxy(), Integer.parseInt(this.config.getProxyPort()));
                    connectSSL();
                    if (!strC4.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                        a(strC4, this.mSSLSocket);
                    }
                } else if (i == 8) {
                    String str4 = stringBuffer.toString().split("\r\n")[0].split(" ")[1];
                    connectSocket(str4.split(":")[0], Integer.parseInt(str4.split(":")[1]));
                    send200Status(this.client.getOutputStream());
                }
                SSLSocket sSLSocket = this.mSSLSocket;
                Socket socket = this.client;
                return sSLSocket != null ? !socket.isClosed() && this.server.isConnected() && this.mSSLSocket.isConnected() : !socket.isClosed() && this.server.isConnected();
            }
        } catch (Exception unused) {
            log("Socket Server", "Error Proxy");
        }
        return false;
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "Injector Service", 2);
            notificationChannel.setDescription("VPN Injector Service");
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    private String d(String str) {
        if (str.contains("[cr*")) {
            str = a(str, "[cr*", "\r");
        }
        if (str.contains("[lf*")) {
            str = a(str, "[lf*", "\n");
        }
        if (str.contains("[crlf*")) {
            str = a(str, "[crlf*", "\r\n");
        }
        return str.contains("[lfcr*") ? a(str, "[lfcr*", "\n\r") : str;
    }

    private void doVpnProtect(Socket socket) {
        if (VPNUtil.isProtected(socket)) {
            log("Socket Protected!");
        }
    }

    private void log(String str, Exception exc) {
        log(str + ": " + exc.getMessage());
    }

    private void retryOnFailure() throws Exception {
        String str;
        byte[] bArr = new byte[1024];
        InputStream inputStream = this.server.getInputStream();
        int lineRN = readLineRN(inputStream, bArr);
        try {
            str = new String(bArr, 0, lineRN, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr, 0, lineRN);
        }
        log("<strong>" + str + "</strong>");
        int i = Integer.parseInt(str.substring(9, 12));
        if (i != 200) {
            String strValueOf = String.valueOf(i);
            str.replace(str, "HTTP/1.1 200 OK");
            log("Proxy: Auto Replace Header");
            Integer.parseInt(strValueOf.replace(strValueOf, "200"));
        }
        String strConcat = str;
        while (true) {
            int lineRN2 = readLineRN(inputStream, bArr);
            if (lineRN2 == 0) {
                break;
            }
            String strConcat2 = strConcat.concat("\n");
            try {
                strConcat = strConcat2 + new String(bArr, 0, lineRN2, "ISO-8859-1");
            } catch (UnsupportedEncodingException unused2) {
                strConcat = strConcat2.concat(new String(bArr, 0, lineRN2));
            }
        }
        if (!strConcat.isEmpty()) {
            log(strConcat);
        }
        OutputStream outputStream = this.client.getOutputStream();
        if (!str.startsWith("HTTP/")) {
            p60.f("The proxy did not send back b valid HTTP response.");
            return;
        }
        if (str.length() < 14) {
            p60.f("The proxy did not send back b valid HTTP response.");
            return;
        }
        if (str.charAt(8) != ' ') {
            p60.f("The proxy did not send back b valid HTTP response.");
        } else {
            if (str.charAt(12) != ' ') {
                p60.f("The proxy did not send back b valid HTTP response.");
                return;
            }
            outputStream.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
            outputStream.flush();
            log("HTTP/1.1 200 OK\r\n\r\n");
        }
    }

    private void send200Status(OutputStream outputStream) throws Exception {
        outputStream.write("HTTP/1.0 200 Connection Established\r\n\r\n".getBytes());
        outputStream.flush();
    }

    private synchronized void startInjector() {
        Thread thread = this.mThread;
        if (thread != null && thread.isAlive()) {
            log("Injector already running");
            return;
        }
        isRunning = true;
        Thread thread2 = new Thread(this, "InjectorThread");
        this.mThread = thread2;
        thread2.start();
    }

    private void startVPN() {
        InjectorListener injectorListener = this.InjectorListener;
        if (injectorListener != null) {
            injectorListener.startOpenVPN();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            String str = (String) message.obj;
            if (VPNUtil.getService() != null) {
                OpenVPNService.log_message(str);
            }
        } else if (i == 2) {
            startVPN();
        }
        return true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        this.mHandler = new Handler(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        if (intent != null && intent.getAction() != null) {
            onStartCommand(intent, 0, i);
        }
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("START")) {
            createNotificationChannel();
            startForeground(1, Build.VERSION.SDK_INT >= 26 ? n5.a(this).setContentTitle(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).setContentText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).setSmallIcon(R.drawable.ic_stat_name).build() : null);
            ConfigUtil configUtil = ConfigUtil.getInstance(this);
            this.config = configUtil;
            this.mTunnelType = configUtil.getTunnelType();
            log("<b>Injector Service Start</b>");
            isRunning = true;
            startInjector();
        }
        return 1;
    }

    public int readLineRN(InputStream inputStream, byte[] bArr) throws IOException {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read();
            if (i3 == -1) {
                p60.f("Premature connection close");
                return 0;
            }
            int i4 = i + 1;
            bArr[i] = (byte) i3;
            if (i3 == 13) {
                z = true;
            } else {
                if (i3 == 10) {
                    return i2;
                }
                if (z) {
                    p60.f("Malformed line sent by the server, the line does not end correctly.");
                    return 0;
                }
                i2++;
                if (i4 >= bArr.length) {
                    p60.f("The server sent b too long line: ".concat(new String(bArr, "ISO-8859-1")));
                    return 0;
                }
            }
            i = i4;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            log("Listening for incoming connection");
            this.ss = new ServerSocket(8989);
            int i = this.mTunnelType;
            if (i == 3 || i == 4 || i == 5) {
                BackServer backServer = this.mBackServerThread;
                if (backServer != null) {
                    backServer.Stop();
                }
                BackServer backServer2 = new BackServer();
                this.mBackServerThread = backServer2;
                backServer2.start();
            }
            this.mHandler.sendEmptyMessage(2);
            while (isRunning) {
                Socket socketAccept = this.ss.accept();
                this.client = socketAccept;
                if (socketAccept != null && !socketAccept.isClosed() && connectSocket()) {
                    this.client.setKeepAlive(true);
                    SSLSocket sSLSocket = this.mSSLSocket;
                    if (sSLSocket == null || !sSLSocket.isConnected()) {
                        Socket socket = this.server;
                        if (socket != null && socket.isConnected()) {
                            this.server.setKeepAlive(true);
                            doVpnProtect(this.server);
                            ProxyThread.connect(this.client, this.server, "16384", "32768", false);
                        }
                    } else {
                        this.mSSLSocket.setKeepAlive(true);
                        this.server.setKeepAlive(true);
                        doVpnProtect(this.mSSLSocket);
                        ProxyThread.connect(this.client, this.mSSLSocket, "16384", "32768", false);
                    }
                }
            }
        } catch (Exception e) {
            log("InjectorException", e);
            e.toString();
            closeAll();
        }
    }

    public void setInjectorListener(InjectorListener injectorListener) {
        this.InjectorListener = injectorListener;
    }

    public void stopInjector() {
        isRunning = false;
        log("<b>InjectorService Stopped</b>");
        this.repeatCount = 0;
        new Thread(new Runnable() { // from class: com.sandok.tunnel.service.InjectorService.1
            @Override // java.lang.Runnable
            public void run() {
                InjectorService.this.closeAll();
            }
        }).start();
        stopForeground(true);
        stopSelf();
    }

    private void log(String str, String str2) {
        log(str + ": " + str2);
    }

    public void log(String str) {
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(1, str));
    }

    private boolean a(String str, Socket socket, OutputStream outputStream) throws Exception {
        if (!str.contains("[split]")) {
            return true;
        }
        for (String str2 : str.split(Pattern.quote("[split]"))) {
            outputStream.write(str2.getBytes("ISO-8859-1"));
            outputStream.flush();
            Thread.sleep(1500L);
        }
        return false;
    }

    private String a(String str, String str2, String str3) {
        while (str.contains(str2)) {
            Matcher matcher = Pattern.compile("\\[.*?\\*(.*?[0-9])\\]").matcher(str);
            if (matcher.find()) {
                int iIntValue = Integer.valueOf(matcher.group(1)).intValue();
                String str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                for (int i = 0; i < iIntValue; i++) {
                    str4 = ((Object) str4) + str3;
                }
                StringBuilder sbY = hz.y(str2);
                sbY.append(String.valueOf(iIntValue));
                sbY.append("]");
                str = str.replace(sbY.toString(), str4);
            }
        }
        return str;
    }

    private void connectSocket(String str, int i) throws Exception {
        Socket socket = new Socket();
        this.server = socket;
        int i2 = this.mTunnelType;
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            socket.bind(new InetSocketAddress(0));
        }
        this.server.connect(new InetSocketAddress(str, i));
        doVpnProtect(this.server);
    }
}
