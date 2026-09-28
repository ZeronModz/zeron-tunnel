package com.vpn.sandok.ultrasshservice.tunnel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.utils.ConfigUtil;
import com.trilead.ssh2.Connection;
import com.trilead.ssh2.ConnectionMonitor;
import com.trilead.ssh2.DebugLogger;
import com.trilead.ssh2.DynamicPortForwarder;
import com.trilead.ssh2.InteractiveCallback;
import com.trilead.ssh2.KnownHosts;
import com.trilead.ssh2.ServerHostKeyVerifier;
import com.trilead.ssh2.transport.TransportManager;
import com.vpn.sandok.ultrasshservice.config.PasswordCache;
import com.vpn.sandok.ultrasshservice.config.Settings;
import com.vpn.sandok.ultrasshservice.config.SettingsConstants;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelState;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnManager;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnSettings;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.VpnUtils;
import com.vpn.sandok.ultrasshservice.util.securepreferences.SecurePreferences;
import defpackage.p60;
import defpackage.vh;
import defpackage.wl0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TunnelManagerThread implements Runnable, ConnectionMonitor, InteractiveCallback, ServerHostKeyVerifier, DebugLogger {
    private static final String AUTH_KEYBOARDINTERACTIVE = "keyboard-interactive";
    private static final String AUTH_PASSWORD = "password";
    private static final String AUTH_PUBLICKEY = "publickey";
    private static final int AUTH_TRIES = 1;
    private static final int RECONNECT_TRIES = 0;
    private static final String TAG = "TunnelManagerThread";
    private ConfigUtil configutil;
    private DynamicPortForwarder dpf;
    private Settings mConfig;
    private Connection mConnection;
    private Context mContext;
    private Handler mHandler;
    private OnStopCliente mListener;
    private CountDownLatch mTunnelThreadStopSignal;
    String serverAddr;
    private Thread thPing;
    private boolean mRunning = false;
    private boolean mStopping = false;
    private boolean mStarting = false;
    private boolean mConnected = false;
    private boolean useProxy = false;
    private long lastPingLatency = -1;
    public boolean mReconnecting = false;
    private BroadcastReceiver m_vpnTunnelBroadcastReceiver = new BroadcastReceiver() { // from class: com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerThread.5
        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TunnelVpnService.TUNNEL_VPN_START_BROADCAST.equals(action)) {
                    if (!intent.getBooleanExtra(TunnelVpnService.TUNNEL_VPN_START_SUCCESS_EXTRA, true)) {
                        TunnelManagerThread.this.stopAll();
                    }
                } else if (TunnelVpnService.TUNNEL_VPN_DISCONNECT_BROADCAST.equals(action)) {
                    TunnelManagerThread.this.stopAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface OnStopCliente {
        void onStop();
    }

    public TunnelManagerThread(Handler handler, Context context) {
        this.mContext = context;
        this.mHandler = handler;
        this.mConfig = new Settings(context);
    }

    public static boolean isServiceVpnRunning() {
        TunnelState tunnelState = TunnelState.getTunnelState();
        return tunnelState.getStartingTunnelManager() || tunnelState.getTunnelManager() != null;
    }

    private synchronized void startForwarderSocks(int i) throws Exception {
        try {
            if (!this.mConnected) {
                throw new Exception();
            }
            SkStatus.logDebug(String.format("socks local listen: %d", Integer.valueOf(i)));
            try {
                int maximoThreadsSocks = this.mConfig.getMaximoThreadsSocks();
                Connection connection = this.mConnection;
                if (maximoThreadsSocks > 0) {
                    this.dpf = connection.createDynamicPortForwarder(i, maximoThreadsSocks);
                    SkStatus.logDebug("socks local number threads: " + Integer.toString(maximoThreadsSocks));
                } else {
                    this.dpf = connection.createDynamicPortForwarder(i);
                }
            } catch (Exception e) {
                SkStatus.logError("Socks Local: " + e.getCause().toString());
                throw new Exception();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void startPinger(final int i) throws Exception {
        if (!this.mConnected) {
            throw new Exception();
        }
        Thread thread = new Thread() { // from class: com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerThread.4
            private synchronized void makePinger() throws InterruptedException {
                try {
                    if (TunnelManagerThread.this.mConnection == null) {
                        throw new InterruptedException();
                    }
                    long jPing = TunnelManagerThread.this.mConnection.ping();
                    if (TunnelManagerThread.this.lastPingLatency < 0) {
                        TunnelManagerThread.this.lastPingLatency = jPing;
                    }
                    int i2 = i;
                    if (i2 == 0) {
                        return;
                    }
                    if (i2 > 0) {
                        Thread.sleep(i2 * 1000);
                    } else {
                        SkStatus.logError("ping invalid");
                        throw new InterruptedException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (TunnelManagerThread.this.mConnected) {
                    try {
                        makePinger();
                    } catch (InterruptedException unused) {
                    }
                }
                SkStatus.logDebug("pinger stopped");
            }
        };
        this.thPing = thread;
        thread.start();
    }

    private synchronized void stopForwarderSocks() {
        DynamicPortForwarder dynamicPortForwarder = this.dpf;
        if (dynamicPortForwarder != null) {
            try {
                dynamicPortForwarder.close();
            } catch (IOException unused) {
            }
            this.dpf = null;
        }
    }

    private synchronized void stopPinger() {
        Thread thread = this.thPing;
        if (thread != null && thread.isAlive()) {
            this.thPing.interrupt();
            this.thPing = null;
        }
    }

    public void addProxy(boolean z, int i, String str, String str2, Connection connection) throws Exception {
        String str3 = str2;
        if (i != 0) {
            this.useProxy = true;
            switch (i) {
                case 1:
                    if (str == null) {
                        this.useProxy = false;
                        return;
                    } else {
                        try {
                            connection.setProxyData(new HttpProxyCustom(this.configutil.getSSHHost(), Integer.parseInt(this.mConfig.getPrivString(SettingsConstants.SERVIDOR_PORTA_KEY)), null, null, str, true, this.mContext));
                            return;
                        } catch (Exception unused) {
                            throw new Exception(this.mContext.getString(R.string.error_proxy_invalid));
                        }
                    }
                case 2:
                    try {
                        connection.setProxyData(new HttpProxyCustom(this.mConfig.getPrivString(SettingsConstants.PROXY_IP_KEY), Integer.parseInt(this.mConfig.getPrivString(SettingsConstants.PROXY_PORTA_KEY)), null, null, (str == null || !str.isEmpty()) ? str : null, false, this.mContext));
                        return;
                    } catch (Exception unused2) {
                        SkStatus.logError(R.string.error_proxy_invalid);
                        throw new Exception(this.mContext.getString(R.string.error_proxy_invalid));
                    }
                case 3:
                    try {
                        connection.setProxyData(new SSLTunnelProxy(this.configutil.getSSHHost(), Integer.parseInt(this.mConfig.getPrivString(SettingsConstants.SERVIDOR_PORTA_KEY)), str3));
                        return;
                    } catch (Exception e) {
                        SkStatus.logInfo(e.getMessage());
                        return;
                    }
                case 4:
                    if (str3 != null && str3.isEmpty()) {
                        str3 = null;
                    }
                    try {
                        connection.setProxyData(new SSLProxy(this.configutil.getSSHHost(), Integer.parseInt(this.mConfig.getPrivString(SettingsConstants.SERVIDOR_PORTA_KEY)), str3, (str == null || !str.isEmpty()) ? str : null));
                        return;
                    } catch (Exception e2) {
                        SkStatus.logInfo(e2.getMessage());
                        return;
                    }
                case 5:
                    if (str3 != null && str3.isEmpty()) {
                        str3 = null;
                    }
                    try {
                        connection.setProxyData(new SSLRemoteProxy(this.configutil.getSSHHost(), Integer.parseInt(this.mConfig.getPrivString(SettingsConstants.SERVIDOR_PORTA_KEY)), str3, (str == null || !str.isEmpty()) ? str : null));
                        return;
                    } catch (Exception e3) {
                        SkStatus.logInfo(e3.getMessage());
                        return;
                    }
                case 6:
                    if (str == null) {
                        this.useProxy = false;
                        return;
                    } else {
                        try {
                            connection.setProxyData(new HttpProxyCustom("127.0.0.1", Integer.parseInt("8989"), null, null, str, true, this.mContext));
                            return;
                        } catch (Exception unused3) {
                            throw new Exception(this.mContext.getString(R.string.error_proxy_invalid));
                        }
                    }
                default:
                    this.useProxy = false;
                    return;
            }
        }
    }

    public void autenticar(String str, String str2, String str3) throws IOException {
        if (!this.mConnected) {
            throw new IOException();
        }
        SkStatus.updateStateString(SkStatus.SSH_AUTENTICANDO, this.mContext.getString(R.string.state_auth));
        try {
            if (str.equals("ungol")) {
                File file = new File(this.mContext.getFilesDir(), "pass.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write("-----BEGIN OPENSSH PRIVATE KEY-----\nb3BlbnNzaC1rZXktdjEAAAAABG5vbmUAAAAEbm9uZQAAAAAAAAABAAABFAAAAAdz\nc2gtcnNhAAAAASUAAAEAc1V8GtoRuLKaihHMGtwnEIEv5HPywQwkOj4mlZisciHq\nuDR/TL8sNV3EtAhAA3f9MqmwQHFEwnRIWoShNL88C22hxs7HNbvqwCBhJvnljbKF\nYO6ZKQssJKxdXkfy8qXsNpXcfQvb9eCB7JATrnn777Gap5PvmGgBQ9kpDFo5SA+u\nLZJDsx2f4k4ja1hj1bpEANsVOzOX5eNQHd5WtVgrQtN111XesojtXpouWGTUSoxT\nVMRXAdvgFFqr0QVsc/R5z6c9aMQO6I1eUJRs/2wBPRpi7SRhBAsy45WrfP2whocW\nlsSnBZhwDl+dVezQBw8v3Jn+MsVfOlLgklldr6lriQAAA9A4T69UOE+vVAAAAAdz\nc2gtcnNhAAABAHNVfBraEbiymooRzBrcJxCBL+Rz8sEMJDo+JpWYrHIh6rg0f0y/\nLDVdxLQIQAN3/TKpsEBxRMJ0SFqEoTS/PAttocbOxzW76sAgYSb55Y2yhWDumSkL\nLCSsXV5H8vKl7DaV3H0L2/XggeyQE655+++xmqeT75hoAUPZKQxaOUgPri2SQ7Md\nn+JOI2tYY9W6RADbFTszl+XjUB3eVrVYK0LTdddV3rKI7V6aLlhk1EqMU1TEVwHb\n4BRaq9EFbHP0ec+nPWjEDuiNXlCUbP9sAT0aYu0kYQQLMuOVq3z9sIaHFpbEpwWY\ncA5fnVXs0AcPL9yZ/jLFXzpS4JJZXa+pa4kAAAABJQAAAQAcDd/q2xkRQDNtsU1S\npEDagEnrdiZKohamYiUPoa1n3ryNq+edC+goqBsXCOz57MEMUsoB1lzVWo4j2xJ0\nnTgedJz5Ad1t73Bz7DNOq30Gyo8lanhIQPzmU3CoOwO+e2L4hVFO2V8EdOFVN81v\noSGbKzN03suTxkV/NNKiI8i+gAX8jqdDqL56ARbTnEvZ7lUj2oj7WpM3XHHuFaTc\nmuHphtnr1IQfQkmN0QHK1lRq8waELAx/fnudlvpL5itLCPrrfrJnsNnPIIJ4QiUc\n43cfAC05QxzKiu6ee+92XgY1p8Dgf8BZjtTb8S/kIgbMJ5fkWCwe1MVeQiEBdUkZ\nqNEBAAAAgCmmsYqKae+dywq5Y696c+sbl3Bvzi9rFB6+8t7MGJaipPqGEqkSzbaH\nG2urx/E+suVttiPcj2gFO2ZlD1idL5qjXVwm90QSdU7bMxxBqP8zBc9M59a/9gK4\nsevMvCj18RWJzU21Dd7mJ2QXVNH8Ovte4H49khoZQiWs8O+AzlmtAAAAgQDLz2ed\nZ9YGBnHUKRu1wlADAD/NzsMLUKJq4b6gZmQvJUlRhG6GKd7OG9MeTlTJodBEe728\nGzwqvHjMXEQmiNSPLQsxwtl32BBh1isHye1YhHa3xgzW+d/NRj8bV3SSJ4JK6Sbw\nwKIPXtJwXaGc8fqCHkNbuN0Ln8+OVb3HFzLpQwAAAIEAkN4ZExiuUeZJnBUr6AVB\nG978aZv8L1xTENscEIsh6ZZfwN62jrLSfxgy7Dn0PdScEIDDSxNe1Zcf2nWdPpoz\n4xNaSqZMbPXa5Bo9BYXXhhy/YwLKvle3V7x1fs0jBNfE66Dl2GMAg9IC9k5p+rFV\ndjAIl8JEtmxXA2+AhoROtUMAAAAQcnNhLWtleS0yMDIzMDQxOAECAwQFBgcICQoL\nDA0O\n-----END OPENSSH PRIVATE KEY-----\n".getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
                if (file.exists()) {
                    SkStatus.logInfo("Authenticating with password");
                    if (this.mConnection.authenticateWithPublicKey("test2", file, str2)) {
                        SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.state_auth_success) + "</strong>");
                    }
                }
            } else if (this.mConnection.isAuthMethodAvailable(str, AUTH_PASSWORD)) {
                SkStatus.logInfo("Authenticating with password");
                if (this.mConnection.authenticateWithPassword(str, str2)) {
                    SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.state_auth_success) + "</strong>");
                }
            }
        } catch (IllegalStateException | Exception unused) {
        }
        if (this.mConnection.isAuthenticationComplete()) {
            return;
        }
        SkStatus.logInfo("Failed to authenticate, expired user or password");
        p60.f("It was not possible to authenticate with the data provided");
    }

    public synchronized void closeSSH() {
        stopForwarder();
        stopPinger();
        if (this.mConnection != null) {
            SkStatus.logDebug("Stopping SSH");
            this.mConnection.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void conectar(java.lang.String r11, int r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerThread.conectar(java.lang.String, int):void");
    }

    @Override // com.trilead.ssh2.ConnectionMonitor
    public void connectionLost(Throwable th) {
        if (this.mStarting || this.mStopping || this.mReconnecting) {
            return;
        }
        SkStatus.logError("<strong>" + this.mContext.getString(R.string.log_conection_lost) + "</strong>");
        if (th == null) {
            stopAll();
        } else {
            if (th.getMessage().contains("There was a problem during connect") || th.getMessage().contains("Closed due to user request") || !th.getMessage().contains("The connect timeout expired")) {
                return;
            }
            stopAll();
        }
    }

    @Override // com.trilead.ssh2.DebugLogger
    public void log(int i, String str, String str2) {
        SkStatus.logDebug(str + ": " + str2);
    }

    @Override // com.trilead.ssh2.ConnectionMonitor
    public void onReceiveInfo(int i, String str) {
        if (i == 101) {
            boolean zEquals = this.mConfig.getPrivString("SIRBIRNETH").equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            Context context = this.mContext;
            if (zEquals) {
                SkStatus.logInfo("<strong>" + context.getString(R.string.log_server_banner) + "</strong> " + str);
                return;
            }
            SkStatus.logInfo("<strong>" + context.getString(R.string.log_server_banner) + "</strong> " + this.mConfig.getPrivString("SIRBIRNETH"));
        }
    }

    public void reconnectSSH() {
        if (this.mStarting || this.mStopping || this.mReconnecting) {
            return;
        }
        this.mReconnecting = true;
        closeSSH();
        SkStatus.updateStateString(SkStatus.SSH_RECONECTANDO, "Reconnecting..");
        try {
            Thread.sleep(100L);
            this.mReconnecting = false;
            stopAll();
        } catch (InterruptedException unused) {
            this.mReconnecting = false;
        }
    }

    @Override // com.trilead.ssh2.InteractiveCallback
    public String[] replyToChallenge(String str, String str2, int i, String[] strArr, boolean[] zArr) throws Exception {
        String[] strArr2 = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (strArr[i2].toLowerCase().contains(AUTH_PASSWORD)) {
                strArr2[i2] = this.mConfig.getPrivString(SettingsConstants.SENHA_KEY);
            }
        }
        return strArr2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mStarting = true;
        this.mTunnelThreadStopSignal = new CountDownLatch(1);
        this.configutil = new ConfigUtil(this.mContext);
        SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.starting_service_ssh) + "</strong>");
        int i = 0;
        while (true) {
            if (this.mStopping) {
                break;
            }
            try {
            } catch (Exception unused) {
                SkStatus.logError("<strong>" + this.mContext.getString(R.string.state_disconnected) + "</strong>");
                closeSSH();
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused2) {
                    stopAll();
                }
            }
            if (TunnelUtils.isNetworkOnline(this.mContext)) {
                if (i > 0) {
                    SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.state_reconnecting) + "</strong>");
                }
                try {
                    Thread.sleep(100L);
                    if (i < 2) {
                        startClienteSSH();
                    }
                } catch (InterruptedException unused3) {
                    stopAll();
                }
            } else {
                SkStatus.updateStateString(SkStatus.SSH_AGUARDANDO_REDE, this.mContext.getString(R.string.state_nonetwork));
                SkStatus.logInfo(R.string.state_nonetwork, new Object[0]);
                try {
                    Thread.sleep(1000L);
                    i++;
                } catch (InterruptedException unused4) {
                    stopAll();
                }
            }
        }
        this.mStarting = false;
        if (!this.mStopping) {
            try {
                this.mTunnelThreadStopSignal.await();
            } catch (InterruptedException unused5) {
                Thread.currentThread().interrupt();
            }
        }
        OnStopCliente onStopCliente = this.mListener;
        if (onStopCliente != null) {
            onStopCliente.onStop();
        }
    }

    public void setOnStopClienteListener(OnStopCliente onStopCliente) {
        this.mListener = onStopCliente;
    }

    public void startClienteSSH() throws Exception {
        this.mStopping = false;
        this.mRunning = true;
        String sSHHost = this.configutil.getSSHHost();
        int i = Integer.parseInt(this.mConfig.getPrivString(SettingsConstants.SERVIDOR_PORTA_KEY));
        String privString = this.mConfig.getPrivString(SettingsConstants.USUARIO_KEY);
        String privString2 = this.mConfig.getPrivString(SettingsConstants.SENHA_KEY);
        if (privString2.isEmpty()) {
            privString2 = PasswordCache.getAuthPassword(null, false);
        }
        String sSHKeypath = this.mConfig.getSSHKeypath();
        int i2 = Integer.parseInt(this.mConfig.getPrivString(SettingsConstants.PORTA_LOCAL_KEY));
        try {
            conectar(sSHHost, i);
            if (this.mStopping) {
                return;
            }
            try {
                autenticar(privString, privString2, sSHKeypath);
                SkStatus.updateStateString(SkStatus.SSH_CONECTADO, "Connected");
                SkStatus.logInfo("<strong><html><font color='#008A00'>" + this.mContext.getString(R.string.state_connected) + "</font></html></strong>");
                this.mConfig.getSSHPinger();
                startForwarder(i2);
            } catch (IOException unused) {
                throw new IOException("Autenticação falhou");
            }
        } catch (Exception e) {
            this.mConnected = false;
            throw e;
        }
    }

    public void startForwarder(int i) throws Exception {
        if (!this.mConnected) {
            throw new Exception();
        }
        startForwarderSocks(i);
        startTunnelVpnService();
        new Thread(new Runnable() { // from class: com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerThread.2
            @Override // java.lang.Runnable
            public void run() {
                while (TunnelManagerThread.this.mConnected) {
                    try {
                        Thread.sleep(100L);
                        if (TunnelManagerThread.this.lastPingLatency > 0) {
                            SkStatus.logInfo(String.format("Ping Latency: %d ms", Long.valueOf(TunnelManagerThread.this.lastPingLatency)));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        }).start();
    }

    public void startTunnelVpnService() throws IOException {
        if (!this.mConnected) {
            throw new IOException();
        }
        SkStatus.logInfo("starting tunnel service");
        SecurePreferences prefsPrivate = this.mConfig.getPrefsPrivate();
        IntentFilter intentFilter = new IntentFilter(TunnelVpnService.TUNNEL_VPN_DISCONNECT_BROADCAST);
        intentFilter.addAction(TunnelVpnService.TUNNEL_VPN_START_BROADCAST);
        wl0.a(this.mContext).b(this.m_vpnTunnelBroadcastReceiver, intentFilter);
        String strL = vh.l("127.0.0.1:", this.mConfig.getPrivString(SettingsConstants.PORTA_LOCAL_KEY));
        boolean vpnDnsForward = prefsPrivate.getInt(SettingsConstants.TUNNELTYPE_KEY, 1) == 6 ? true : this.mConfig.getVpnDnsForward();
        String vpnUdpResolver = this.mConfig.getVpnUdpForward() ? this.mConfig.getVpnUdpResolver() : null;
        String sSHHost = this.configutil.getSSHHost();
        if (prefsPrivate.getInt(SettingsConstants.TUNNELTYPE_KEY, 1) == 2) {
            try {
                sSHHost = this.mConfig.getPrivString(SettingsConstants.PROXY_IP_KEY);
            } catch (Exception unused) {
                SkStatus.logError(R.string.error_proxy_invalid);
                p60.f(this.mContext.getString(R.string.error_proxy_invalid));
                return;
            }
        }
        try {
            String hostAddress = TransportManager.createInetAddress(sSHHost).getHostAddress();
            this.serverAddr = hostAddress;
            String[] strArr = {hostAddress};
            String[] strArr2 = vpnDnsForward ? new String[]{this.mConfig.getVpnDnsResolver(), this.mConfig.getVpnDnsResolver2()} : new String[]{VpnUtils.getNetworkDnsServer(this.mContext).get(0)};
            if (isServiceVpnRunning()) {
                TunnelVpnManager tunnelManager = TunnelState.getTunnelState().getTunnelManager();
                if (tunnelManager != null) {
                    tunnelManager.restartTunnel(strL);
                    return;
                }
                return;
            }
            Intent intent = new Intent(this.mContext, (Class<?>) TunnelVpnService.class);
            intent.setFlags(268435456);
            intent.putExtra(TunnelVpnManager.VPN_SETTINGS, new TunnelVpnSettings(strL, vpnDnsForward, strArr2, (vpnDnsForward && vpnUdpResolver == null) || !(vpnDnsForward || vpnUdpResolver == null), vpnUdpResolver, strArr, this.mConfig.getIsFilterApps(), this.mConfig.getIsFilterBypassMode(), this.mConfig.getFilterApps(), this.mConfig.getIsTetheringSubnet(), this.mConfig.getBypass()));
            if (this.mContext.startService(intent) != null) {
                TunnelState.getTunnelState().setStartingTunnelManager();
            } else {
                SkStatus.logInfo("failed to start tunnel vpn service");
                p60.f("Failed to start Vpn Service");
            }
        } catch (UnknownHostException unused2) {
            p60.f(this.mContext.getString(R.string.error_server_ip_invalid));
        }
    }

    public void stopAll() {
        if (this.mStopping) {
            return;
        }
        SkStatus.updateStateString(SkStatus.SSH_PARANDO, this.mContext.getString(R.string.stopping_service_ssh));
        SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.stopping_service_ssh) + "</strong>");
        new Thread(new Runnable() { // from class: com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerThread.1
            @Override // java.lang.Runnable
            public void run() {
                TunnelManagerThread.this.mStopping = true;
                if (TunnelManagerThread.this.mTunnelThreadStopSignal != null) {
                    TunnelManagerThread.this.mTunnelThreadStopSignal.countDown();
                }
                TunnelManagerThread.this.closeSSH();
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
                SkStatus.updateStateString(SkStatus.SSH_DESCONECTADO, TunnelManagerThread.this.mContext.getString(R.string.state_disconnected));
                TunnelManagerThread.this.mRunning = false;
                TunnelManagerThread.this.mStarting = false;
                TunnelManagerThread.this.mReconnecting = false;
            }
        }).start();
    }

    public void stopForwarder() {
        stopTunnelVpnService();
        stopForwarderSocks();
    }

    public synchronized void stopTunnelVpnService() {
        try {
            if (isServiceVpnRunning()) {
                SkStatus.logInfo("stopping tunnel service");
                TunnelVpnManager tunnelManager = TunnelState.getTunnelState().getTunnelManager();
                if (tunnelManager != null) {
                    tunnelManager.signalStopService();
                }
                wl0.a(this.mContext).d(this.m_vpnTunnelBroadcastReceiver);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.trilead.ssh2.ServerHostKeyVerifier
    public boolean verifyServerHostKey(String str, int i, String str2, byte[] bArr) throws Exception {
        SkStatus.logInfo("Finger Print: " + KnownHosts.createHexFingerprint(str2, bArr));
        SkStatus.logInfo("Using Algorithm: " + str2);
        return true;
    }
}
