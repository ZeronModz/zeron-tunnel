package com.sandok.tunnel.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.IpPrefix;
import android.net.VpnService;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.security.KeyChain;
import android.util.Base64;
import android.widget.Toast;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.connectivity.ConnectionState;
import com.sandok.tunnel.connectivity.ConnectivityReceiverBase;
import com.sandok.tunnel.utils.ConfigUtil;
import com.sandok.tunnel.utils.VPNUtil;
import com.vpn.sandok.ultrasshservice.SocksHttpService;
import defpackage.hz;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import javax.crypto.Cipher;
import net.openvpn.openvpn.CPUUsage;
import net.openvpn.openvpn.ClientAPI_Config;
import net.openvpn.openvpn.ClientAPI_ConnectionInfo;
import net.openvpn.openvpn.ClientAPI_DynamicChallenge;
import net.openvpn.openvpn.ClientAPI_EvalConfig;
import net.openvpn.openvpn.ClientAPI_Event;
import net.openvpn.openvpn.ClientAPI_ExternalPKICertRequest;
import net.openvpn.openvpn.ClientAPI_ExternalPKISignRequest;
import net.openvpn.openvpn.ClientAPI_InterfaceStats;
import net.openvpn.openvpn.ClientAPI_LLVector;
import net.openvpn.openvpn.ClientAPI_LogInfo;
import net.openvpn.openvpn.ClientAPI_MergeConfig;
import net.openvpn.openvpn.ClientAPI_OpenVPNClient;
import net.openvpn.openvpn.ClientAPI_ProvideCreds;
import net.openvpn.openvpn.ClientAPI_ServerEntry;
import net.openvpn.openvpn.ClientAPI_ServerEntryVector;
import net.openvpn.openvpn.ClientAPI_Status;
import net.openvpn.openvpn.ClientAPI_TransportStats;
import net.openvpn.openvpn.FileUtil;
import net.openvpn.openvpn.JellyBeanHack;
import net.openvpn.openvpn.OpenVPNClientThread;
import net.openvpn.openvpn.PasswordUtil;
import net.openvpn.openvpn.PrefUtil;
import net.openvpn.openvpn.ProxyList;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class OpenVPNService extends VpnService implements VPNUtil.VPNProtectListener, Handler.Callback, OpenVPNClientThread.EventReceiver {
    public static final String ACTION_BASE = "net.openvpn.openvpn.";
    public static final String ACTION_BIND = "net.openvpn.openvpn.BIND";
    public static final String ACTION_CONNECT = "net.openvpn.openvpn.CONNECT";
    public static final String ACTION_DELETE_PROFILE = "net.openvpn.openvpn.DELETE_PROFILE";
    public static final String ACTION_DISCONNECT = "net.openvpn.openvpn.DISCONNECT";
    public static final String ACTION_IMPORT_PROFILE = "net.openvpn.openvpn.IMPORT_PROFILE";
    public static final String ACTION_IMPORT_PROFILE_VIA_PATH = "net.openvpn.openvpn.ACTION_IMPORT_PROFILE_VIA_PATH";
    public static final String ACTION_RENAME_PROFILE = "net.openvpn.openvpn.RENAME_PROFILE";
    public static final String ACTION_SUBMIT_PROXY_CREDS = "net.openvpn.openvpn.ACTION_SUBMIT_PROXY_CREDS";
    public static final int EV_PRIO_HIGH = 3;
    public static final int EV_PRIO_INVISIBLE = 0;
    public static final int EV_PRIO_LOW = 1;
    public static final int EV_PRIO_MED = 2;
    private static final int GCI_REQ_ESTABLISH = 0;
    private static final int GCI_REQ_NOTIFICATION = 1;
    public static final String INTENT_PREFIX = "net.openvpn.openvpn";
    private static final int MSG_EVENT = 1;
    private static final int MSG_LOG = 2;
    private static final int NOTIFICATION_ID = 1642;
    private static final String TAG = "OpenVPNService";
    private static ConfigUtil config = null;
    public static final int log_deque_max = 250;
    private static OpenVPNClientThread mThread;
    private CPUUsage cpu_usage;
    private Profile current_profile;
    private boolean enable_notifications;
    private HashMap event_info;
    private JellyBeanHack jellyBeanHack;
    private EventMsg last_event;
    private EventMsg last_event_prof_manage;
    private ConnectivityReceiver mConnectivityReceiver;
    private Handler mHandler;
    private NotificationManager mNotificationManager;
    Notification.Builder mNotifyBuilder;
    private PrefUtil prefs;
    private ProfileList profile_list;
    public ProxyList proxy_list;
    private PasswordUtil pwds;
    private Timer timer;
    private static final Set<String> OPENVPN3_STRIPPED_OPTIONS = new HashSet(Arrays.asList("allow-recursive-routing", "connect-retry", "connect-retry-max", "http-proxy-retry", "ifconfig-nowarn", "machine-readable-output", "management", "management-client", "management-hold", "management-query-passwords", "management-query-proxy", "ping-timer-rem", "resolv-retry"));
    private static ArrayDeque<EventReceiver> clients = new ArrayDeque<>();
    private static ArrayDeque<LogMsg> log_deque = new ArrayDeque<>();
    public static boolean i = true;
    private static boolean isStopping = true;
    private boolean active = false;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
    private final IBinder mBinder = new LocalBinder();
    private boolean shutdown_pending = false;
    private long thread_started = 0;
    public boolean paused = false;
    public boolean screen_on = true;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class Challenge {
        private String challenge;
        private boolean echo;
        private boolean response_required;

        public String get_challenge() {
            return this.challenge;
        }

        public boolean get_echo() {
            return this.echo;
        }

        public boolean get_response_required() {
            return this.response_required;
        }

        public String toString() {
            return this.challenge + "/" + this.echo + "/" + this.response_required;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ConnectionStats {
        public long bytes_in;
        public long bytes_out;
        public int duration;
        public int last_packet_received;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class ConnectivityReceiver extends ConnectivityReceiverBase {
        private String TAG;
        private ConnectionState currentState;

        public ConnectivityReceiver(Context context) {
            super(context);
            this.TAG = "ConnectivityReceiver";
            this.currentState = getConnectionState();
        }

        private void checkNewState() {
            ConnectionState connectionState = getConnectionState();
            if (this.currentState.hasChanged(connectionState)) {
                onStateChange(connectionState);
            }
            this.currentState = connectionState;
        }

        private ConnectionState getConnectionState() {
            return ConnectionState.getInstance(getManager());
        }

        private boolean getPVBS() {
            return OpenVPNService.this.prefs.b("pause_vpn_on_blanked_screen");
        }

        private void onStateChange(ConnectionState connectionState) {
            boolean pvbs = getPVBS();
            if (this.currentState.isConnected() && connectionState.isDisconnected()) {
                OpenVPNService openVPNService = OpenVPNService.this;
                if (openVPNService.paused || !openVPNService.active) {
                    return;
                }
                OpenVPNService.this.network_pause();
                return;
            }
            if (!this.currentState.isDisconnected() || !connectionState.isConnected()) {
                if (OpenVPNService.this.active) {
                    OpenVPNService openVPNService2 = OpenVPNService.this;
                    if (openVPNService2.paused) {
                        return;
                    }
                    openVPNService2.network_reconnect(1);
                    return;
                }
                return;
            }
            OpenVPNService openVPNService3 = OpenVPNService.this;
            if (openVPNService3.paused && openVPNService3.active) {
                if (!pvbs || OpenVPNService.this.screen_on) {
                    OpenVPNService.this.network_resume();
                }
            }
        }

        @Override // com.sandok.tunnel.connectivity.ConnectivityReceiverBase
        public void onAvailable(Object obj) {
            checkNewState();
        }

        @Override // com.sandok.tunnel.connectivity.ConnectivityReceiverBase
        public void onLost(Object obj) {
            checkNewState();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class EventInfo {
        public int flags;
        public int icon_res_id;
        public int priority;
        public int progress;
        public int res_id;

        public EventInfo(int i, int i2, int i3, int i4, int i5) {
            this.res_id = i;
            this.icon_res_id = i2;
            this.progress = i3;
            this.priority = i4;
            this.flags = i5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class EventMsg {
        public static final int F_ERROR = 1;
        public static final int F_EXCLUDE_SELF = 16;
        public static final int F_FROM_JAVA = 2;
        public static final int F_PROF_IMPORT = 32;
        public static final int F_PROF_MANAGE = 4;
        public static final int F_UI_RESET = 8;
        public ClientAPI_ConnectionInfo conn_info;
        public String info;
        public String name;
        public String profile_override;
        public EventReceiver sender;
        public long expires = 0;
        public int flags = 0;
        public int icon_res_id = -1;
        public int priority = 1;
        public int progress = 0;
        public int res_id = -1;
        public Transition transition = Transition.NO_CHANGE;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public enum Transition {
            NO_CHANGE,
            TO_CONNECTED,
            TO_DISCONNECTED
        }

        public static EventMsg disconnected() {
            EventMsg eventMsg = new EventMsg();
            eventMsg.flags = 2;
            eventMsg.res_id = R.string.disconnected;
            eventMsg.icon_res_id = R.drawable.ic_about_24dp;
            eventMsg.name = "DISCONNECTED";
            eventMsg.info = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            return eventMsg;
        }

        public boolean is_expired() {
            return this.expires != 0 && SystemClock.elapsedRealtime() > this.expires;
        }

        public boolean is_reflected(EventReceiver eventReceiver) {
            EventReceiver eventReceiver2 = this.sender;
            if (eventReceiver2 == null) {
                return false;
            }
            return ((this.flags & 16) == 0 && eventReceiver2 == eventReceiver) ? false : true;
        }

        public String toString() {
            String str = this.name;
            Object[] objArr = {str};
            StringBuffer stringBuffer = new StringBuffer(str);
            if (this.info.length() > 0) {
                objArr = new Object[]{this.info};
            }
            Transition transition = this.transition;
            if (transition != Transition.NO_CHANGE) {
                objArr = new Object[]{transition};
            }
            String.format("%s", objArr).contains("unexpected EOF:");
            if (String.format("%s", objArr).equals("WAIT")) {
                OpenVPNService.i = false;
            } else {
                OpenVPNService.i = true;
            }
            return stringBuffer.toString();
        }

        public String toStringFull() {
            return String.format("EVENT: name=%s info='%s' trans=%s flags=%d progress=%d prio=%d res=%d", this.name, this.info, this.transition, Integer.valueOf(this.flags), Integer.valueOf(this.progress), Integer.valueOf(this.priority), Integer.valueOf(this.res_id));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface EventReceiver {
        void event(EventMsg eventMsg);

        PendingIntent get_configure_intent(int i);

        void log(LogMsg logMsg);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class InternalError extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class LocalBinder extends Binder {
        public LocalBinder() {
        }

        public OpenVPNService getService() {
            return OpenVPNService.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class LogMsg {
        public String line;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class Profile {
        private boolean allow_password_save;
        private boolean autologin;
        private DynamicChallenge dynamic_challenge;
        private String errorText;
        private boolean external_pki;
        private String external_pki_alias;
        public String location;
        private String name;
        public String orig_filename;
        private boolean private_key_password_required;
        private ProxyContext proxy_context;
        private ServerList server_list;
        private Challenge static_challenge;
        private String userlocked_username;

        public Profile(String str, String str2, boolean z, ClientAPI_EvalConfig clientAPI_EvalConfig) {
            this.location = str;
            this.orig_filename = str2;
            if (z) {
                this.name = str2;
                if (ProfileFN.has_ovpn_ext(str2)) {
                    this.name = ProfileFN.strip_ovpn_ext(this.name);
                }
                try {
                    this.name = URLDecoder.decode(this.name, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
            } else {
                this.name = str2;
            }
            if (clientAPI_EvalConfig.getError()) {
                this.errorText = clientAPI_EvalConfig.getMessage();
                return;
            }
            this.userlocked_username = clientAPI_EvalConfig.getUserlockedUsername();
            this.autologin = clientAPI_EvalConfig.getAutologin();
            this.external_pki = clientAPI_EvalConfig.getExternalPki();
            this.private_key_password_required = clientAPI_EvalConfig.getPrivateKeyPasswordRequired();
            this.allow_password_save = clientAPI_EvalConfig.getAllowPasswordSave();
            String staticChallenge = clientAPI_EvalConfig.getStaticChallenge();
            boolean z2 = true;
            if (staticChallenge.length() > 0) {
                Challenge challenge = new Challenge();
                challenge.challenge = staticChallenge;
                challenge.echo = clientAPI_EvalConfig.getStaticChallengeEcho();
                challenge.response_required = true;
                this.static_challenge = challenge;
            }
            String string = null;
            if (!z) {
                String profileName = clientAPI_EvalConfig.getProfileName();
                String friendlyName = clientAPI_EvalConfig.getFriendlyName();
                String str3 = this.location;
                if (str3 != null) {
                    str3.equals("imported");
                }
                if (friendlyName.length() > 0) {
                    profileName = friendlyName;
                } else {
                    z2 = false;
                }
                if (str2 != null && str2.equalsIgnoreCase("client.ovpn")) {
                    str2 = null;
                }
                str2 = ProfileFN.has_ovpn_ext(str2) ? ProfileFN.strip_ovpn_ext(str2) : str2;
                if (str2 != null && profileName != null && str2.equals(profileName)) {
                    str2 = null;
                }
                StringBuffer stringBuffer = new StringBuffer();
                if (this.autologin && !z2 && str2 == null) {
                    stringBuffer.append(OpenVPNService.this.getText(R.string.autologin_suffix).toString());
                }
                if (str2 != null) {
                    stringBuffer.append(str2);
                }
                this.name = stringBuffer.toString();
            }
            this.server_list = new ServerList();
            ClientAPI_ServerEntryVector serverList = clientAPI_EvalConfig.getServerList();
            int size = serverList.size();
            for (int i = 0; i < size; i++) {
                ClientAPI_ServerEntry clientAPI_ServerEntry = serverList.get(i);
                ServerEntry serverEntry = new ServerEntry();
                serverEntry.server = clientAPI_ServerEntry.getServer();
                serverEntry.friendly_name = clientAPI_ServerEntry.getFriendlyName();
                this.server_list.list.add(serverEntry);
            }
            PrefUtil prefUtil = OpenVPNService.this.prefs;
            String str4 = this.name;
            prefUtil.getClass();
            try {
                string = prefUtil.a.getString(PrefUtil.d(str4), null);
            } catch (ClassCastException unused2) {
            }
            this.external_pki_alias = string;
        }

        private void expire_dynamic_challenge() {
            DynamicChallenge dynamicChallenge = this.dynamic_challenge;
            if (dynamicChallenge == null || !dynamicChallenge.is_expired()) {
                return;
            }
            this.dynamic_challenge = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean get_epki() {
            return this.external_pki;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String get_epki_alias() {
            return this.external_pki_alias;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidate_epki_alias(String str) {
            String str2 = this.external_pki_alias;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.external_pki_alias = null;
            OpenVPNService.this.prefs.a(this.name);
            OpenVPNService.this.jellyBeanHackPurge();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void persist_epki_alias(String str) {
            this.external_pki_alias = str;
            PrefUtil prefUtil = OpenVPNService.this.prefs;
            String str2 = this.name;
            SharedPreferences.Editor editorEdit = prefUtil.a.edit();
            editorEdit.putString(PrefUtil.d(str2), str);
            editorEdit.apply();
            OpenVPNService.this.jellyBeanHackPurge();
        }

        public boolean challenge_defined() {
            expire_dynamic_challenge();
            return (this.static_challenge == null && this.dynamic_challenge == null) ? false : true;
        }

        public void forget_cert() {
            if (this.external_pki_alias != null) {
                this.external_pki_alias = null;
                OpenVPNService.this.prefs.a(this.name);
                OpenVPNService.this.jellyBeanHackPurge();
            }
        }

        public boolean get_allow_password_save() {
            return this.allow_password_save;
        }

        public boolean get_autologin() {
            return this.autologin;
        }

        public Challenge get_challenge() {
            expire_dynamic_challenge();
            DynamicChallenge dynamicChallenge = this.dynamic_challenge;
            return dynamicChallenge != null ? dynamicChallenge.challenge : this.static_challenge;
        }

        public long get_dynamic_challenge_expire_delay() {
            if (is_dynamic_challenge()) {
                return this.dynamic_challenge.expire_delay();
            }
            return 0L;
        }

        public String get_error() {
            return this.errorText;
        }

        public String get_filename() {
            String str = this.location;
            if (str != null && str.equals("bundled")) {
                return this.orig_filename;
            }
            String strEncode_profile_fn = ProfileFN.encode_profile_fn(this.name);
            return strEncode_profile_fn == null ? this.orig_filename : strEncode_profile_fn;
        }

        public String get_location() {
            return this.location;
        }

        public String get_name() {
            return this.name;
        }

        public boolean get_private_key_password_required() {
            return this.private_key_password_required;
        }

        public ProxyContext get_proxy_context(boolean z) {
            ProxyContext proxyContext = this.proxy_context;
            if (proxyContext != null && !proxyContext.is_expired()) {
                return this.proxy_context;
            }
            if (!z) {
                this.proxy_context = null;
                return null;
            }
            ProxyContext proxyContext2 = new ProxyContext(0);
            this.proxy_context = proxyContext2;
            return proxyContext2;
        }

        public ServerList get_server_list() {
            return this.server_list;
        }

        public String get_type_string() {
            if (get_autologin()) {
                return OpenVPNService.this.getText(R.string.profile_type_autologin).toString();
            }
            boolean z = get_epki();
            OpenVPNService openVPNService = OpenVPNService.this;
            return z ? openVPNService.getText(R.string.profile_type_epki).toString() : openVPNService.getText(R.string.profile_type_standard).toString();
        }

        public String get_userlocked_username() {
            return this.userlocked_username;
        }

        public boolean have_external_pki_alias() {
            return this.external_pki && this.external_pki_alias != null;
        }

        public boolean is_deleteable() {
            String str = this.location;
            return (str == null || str.equals("bundled")) ? false : true;
        }

        public boolean is_dynamic_challenge() {
            expire_dynamic_challenge();
            return this.dynamic_challenge != null;
        }

        public boolean is_renameable() {
            return is_deleteable();
        }

        public boolean need_external_pki_alias() {
            return this.external_pki && this.external_pki_alias == null;
        }

        public void reset_dynamic_challenge() {
            this.dynamic_challenge = null;
        }

        public void reset_proxy_context() {
            this.proxy_context = null;
        }

        public boolean server_list_defined() {
            return this.server_list.list.size() > 0;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.orig_filename;
            String str3 = this.userlocked_username;
            boolean z = this.autologin;
            boolean z2 = this.external_pki;
            String str4 = this.external_pki_alias;
            String string = this.server_list.toString();
            Challenge challenge = this.static_challenge;
            String string2 = challenge != null ? challenge.toString() : "null";
            DynamicChallenge dynamicChallenge = this.dynamic_challenge;
            String string3 = dynamicChallenge != null ? dynamicChallenge.toString() : "null";
            StringBuilder sbA = hz.A("Profile name='", str, "' ofn='", str2, "' userlock=");
            sbA.append(str3);
            sbA.append(" auto=");
            sbA.append(z);
            sbA.append(" epki=");
            sbA.append(z2);
            sbA.append("/");
            sbA.append(str4);
            sbA.append(" sl=");
            hz.H(sbA, string, " sc=", string2, " dc=");
            sbA.append(string3);
            return sbA.toString();
        }

        public boolean userlocked_username_defined() {
            return this.userlocked_username.length() > 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ProfileFN {
        private ProfileFN() {
        }

        public static String encode_profile_fn(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8") + ".ovpn";
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }

        public static boolean has_ovpn_ext(String str) {
            if (str == null) {
                return false;
            }
            return str.endsWith(".ovpn") || str.endsWith(".OVPN");
        }

        public static String strip_ovpn_ext(String str) {
            return (str == null || !has_ovpn_ext(str)) ? str : str.substring(0, str.length() - 5);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ServerEntry {
        private String friendly_name;
        private String server;

        public String display_name() {
            return this.friendly_name.length() > 0 ? this.friendly_name : this.server;
        }

        public String toString() {
            return this.server + "/" + this.friendly_name;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ServerList {
        private ArrayList<ServerEntry> list = new ArrayList<>();

        public String[] display_names() {
            int size = this.list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = this.list.get(i).display_name();
            }
            return strArr;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<ServerEntry> it = this.list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString() + ",");
            }
            return stringBuffer.toString();
        }
    }

    static {
        System.loadLibrary("ovpncli");
        ClientAPI_OpenVPNClient.init_process();
        openVpnRuntimeInfo();
    }

    private String cert_format_pem(X509Certificate x509Certificate) throws CertificateEncodingException {
        return String.format("-----BEGIN CERTIFICATE-----%n%s-----END CERTIFICATE-----%n", Base64.encodeToString(x509Certificate.getEncoded(), 0));
    }

    public static void clear_log_history() {
        log_deque.clear();
    }

    private boolean connect_action(final String str, final Intent intent, final boolean z) {
        if (!this.active) {
            do_connect_action(str, intent, z);
            return true;
        }
        this.paused = false;
        stop_thread();
        new Handler().postDelayed(new Runnable() { // from class: com.sandok.tunnel.service.OpenVPNService.1
            @Override // java.lang.Runnable
            public void run() {
                OpenVPNService.this.do_connect_action(str, intent, z);
            }
        }, 1000L);
        return true;
    }

    private void createNotificationChannel(NotificationManager notificationManager, String str) {
        String string = getString(R.string.app);
        String str2 = getString(R.string.app) + "notifications";
        NotificationChannel notificationChannel = new NotificationChannel(str, string, 2);
        notificationChannel.setShowBadge(true);
        notificationChannel.setDescription(str2);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private void crypto_self_test() {
        String strOpenVpnRuntimeInfo = openVpnRuntimeInfo();
        if (strOpenVpnRuntimeInfo.length() > 0) {
            "SERV: crypto_self_test\n".concat(strOpenVpnRuntimeInfo);
        }
    }

    private boolean delete_profile_action(String str, Intent intent) {
        String stringExtra = intent.getStringExtra(str + ".PROFILE");
        get_profile_list();
        Profile profile = this.profile_list.get_profile_by_name(stringExtra);
        if (profile == null) {
            return false;
        }
        if (!profile.is_deleteable()) {
            gen_event(1, "PROFILE_DELETE_FAILED", stringExtra);
            return false;
        }
        if (this.active && profile == this.current_profile) {
            stop_thread();
        }
        if (!deleteFile(profile.get_filename())) {
            gen_event(1, "PROFILE_DELETE_FAILED", profile.get_name());
            return false;
        }
        this.pwds.b("auth", stringExtra);
        this.pwds.b("pk", stringExtra);
        refresh_profile_list();
        gen_event(0, "PROFILE_DELETE_SUCCESS", profile.get_name());
        return true;
    }

    private void delete_profiles() {
        ProfileList profileList = get_profile_list();
        if (profileList != null) {
            for (int i2 = 0; i2 < profileList.size(); i2++) {
                Profile profile = profileList.get(i2);
                if (profile != null) {
                    deleteFile(profile.get_name());
                    this.pwds.b("auth", profile.get_name());
                    this.pwds.b("pk", profile.get_name());
                }
            }
            refresh_profile_list();
        }
    }

    private void disconnect_action(String str, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(str + ".STOP", false);
        this.paused = true;
        stop_thread();
        if (booleanExtra) {
            stopSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean do_connect_action(String str, Intent intent, boolean z) {
        String str2;
        Profile profile;
        int i2;
        ProxyContext proxyContext;
        String str3;
        String str4;
        boolean z2;
        String strConcat;
        String strU = hz.u(str, ".PROFILE", intent);
        String strU2 = hz.u(str, ".GUI_VERSION", intent);
        String strU3 = hz.u(str, ".PROXY_NAME", intent);
        String strU4 = hz.u(str, ".PROXY_USERNAME", intent);
        String strU5 = hz.u(str, ".PROXY_PASSWORD", intent);
        boolean booleanExtra = intent.getBooleanExtra(str + ".PROXY_ALLOW_CREDS_DIALOG", false);
        String strU6 = hz.u(str, ".SERVER", intent);
        String strU7 = hz.u(str, ".PROTO", intent);
        String strU8 = hz.u(str, ".IPv6", intent);
        String strU9 = hz.u(str, ".CONN_TIMEOUT", intent);
        String strU10 = hz.u(str, ".USERNAME", intent);
        String strU11 = hz.u(str, ".PASSWORD", intent);
        boolean booleanExtra2 = intent.getBooleanExtra(str + ".CACHE_PASSWORD", false);
        String strU12 = hz.u(str, ".PK_PASSWORD", intent);
        String strU13 = hz.u(str, ".RESPONSE", intent);
        String strU14 = hz.u(str, ".EPKI_ALIAS", intent);
        String strU15 = hz.u(str, ".COMPRESSION_MODE", intent);
        Profile profileLocate_profile = locate_profile(strU);
        if (profileLocate_profile == null) {
            return false;
        }
        if (strU3 != null) {
            proxyContext = profileLocate_profile.get_proxy_context(true);
            str2 = strU15;
            i2 = 1;
            profile = profileLocate_profile;
            proxyContext.new_connection(intent, strU, strU3, strU4, strU5, booleanExtra, this.proxy_list, z);
        } else {
            str2 = strU15;
            profile = profileLocate_profile;
            i2 = 1;
            profile.reset_proxy_context();
            proxyContext = null;
        }
        ProxyContext proxyContext2 = proxyContext;
        String str5 = profile.get_location();
        String str6 = profile.get_filename();
        String sSHPortString = config.getSSHPortString();
        try {
            String str7 = read_file(str5, str6);
            int tunnelType = config.getTunnelType();
            if (tunnelType == 3 || tunnelType == 4 || tunnelType == 5) {
                sSHPortString = config.getSSLPort();
            }
            String strReplace = str7.replace(getPort(str7), sSHPortString);
            String strReplace2 = strReplace.replace(getIpOrHost(strReplace), config.getSSHHost());
            Object[] objArr = new Object[i2];
            objArr[0] = Integer.valueOf(strReplace2.length());
            String.format("SERV: profile file len=%d", objArr);
            if (config.getTunnelType() == 8 && getPackageName().contains("rocket")) {
                String strReplace3 = strReplace2.replace(getPort(strReplace2), "53");
                if (strReplace3.contains(" tcp-client")) {
                    strReplace3 = strReplace3.replace(" tcp-client", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                strConcat = strReplace3 + "proto udp\n";
            } else {
                strConcat = strReplace2.concat("proto tcp\n");
            }
            str3 = str5;
            str4 = str6;
            z2 = false;
            try {
                return start_connection(profile, strConcat, strU2, proxyContext2, strU6, strU7, strU8, strU9, strU10, strU11, booleanExtra2, strU12, strU13, strU14, str2);
            } catch (IOException unused) {
                gen_event(1, "PROFILE_NOT_FOUND", str3 + "/" + str4);
                return z2;
            }
        } catch (IOException unused2) {
            str3 = str5;
            str4 = str6;
            z2 = false;
        }
    }

    public static /* bridge */ /* synthetic */ PendingIntent e(OpenVPNService openVPNService) {
        return openVPNService.get_configure_intent(0);
    }

    private void gen_event(int i2, String str, String str2, String str3, EventReceiver eventReceiver) {
        EventInfo eventInfo = (EventInfo) this.event_info.get(str);
        EventMsg eventMsg = new EventMsg();
        int i3 = i2 | 2;
        eventMsg.flags = i3;
        if (eventInfo != null) {
            eventMsg.progress = eventInfo.progress;
            eventMsg.priority = eventInfo.priority;
            eventMsg.res_id = eventInfo.res_id;
            eventMsg.icon_res_id = eventInfo.icon_res_id;
            eventMsg.sender = eventReceiver;
            i3 |= eventInfo.flags;
            eventMsg.flags = i3;
        } else {
            eventMsg.res_id = R.string.unknown;
        }
        eventMsg.name = str;
        if (str2 != null) {
            eventMsg.info = str2;
        } else {
            eventMsg.info = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if ((i3 & 4) != 0) {
            eventMsg.expires = SystemClock.elapsedRealtime() + 60000;
        }
        eventMsg.profile_override = str3;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, eventMsg));
    }

    private String getIpOrHost(String str) {
        for (String str2 : str.split("\n")) {
            if (str2.toLowerCase().contains("remote ")) {
                return str2.split(" ")[1];
            }
        }
        return "None";
    }

    private String getPort(String str) {
        for (String str2 : str.split("\n")) {
            if (str2.toLowerCase().contains("remote ")) {
                return str2.split(" ")[2];
            }
        }
        return "None";
    }

    private PendingIntent get_configure_intent(int i2) {
        Iterator<EventReceiver> it = clients.iterator();
        while (it.hasNext()) {
            PendingIntent pendingIntent = it.next().get_configure_intent(i2);
            if (pendingIntent != null) {
                return pendingIntent;
            }
        }
        return null;
    }

    public static String get_openvpn_core_platform() {
        return ClientAPI_OpenVPNClient.platform();
    }

    private boolean import_profile(String str, String str2, boolean z) {
        if (ProfileFN.has_ovpn_ext(str2)) {
            if ((str2 != null ? new File(str2).getParent() : null) == null) {
                if (z) {
                    ClientAPI_MergeConfig clientAPI_MergeConfigMerge_config_string_static = ClientAPI_OpenVPNClient.merge_config_string_static(str);
                    String str3 = "PROFILE_" + clientAPI_MergeConfigMerge_config_string_static.getStatus();
                    if (!str3.equals("PROFILE_MERGE_SUCCESS")) {
                        gen_event(1, str3, clientAPI_MergeConfigMerge_config_string_static.getErrorText());
                        return false;
                    }
                    str = clientAPI_MergeConfigMerge_config_string_static.getProfileContent();
                }
                String strSanitizeOpenVpn3Profile = sanitizeOpenVpn3Profile(str);
                ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
                clientAPI_Config.setContent(strSanitizeOpenVpn3Profile);
                ClientAPI_EvalConfig clientAPI_EvalConfigEval_config_static = ClientAPI_OpenVPNClient.eval_config_static(clientAPI_Config);
                if (clientAPI_EvalConfigEval_config_static.getError()) {
                    gen_event(1, "PROFILE_PARSE_ERROR", str2 + " : " + clientAPI_EvalConfigEval_config_static.getMessage());
                    return false;
                }
                Profile profile = new Profile("imported", str2, false, clientAPI_EvalConfigEval_config_static);
                try {
                    FileUtil.b(this, profile.get_filename(), strSanitizeOpenVpn3Profile);
                    String str4 = profile.get_name();
                    this.pwds.b("auth", str4);
                    this.pwds.b("pk", str4);
                    refresh_profile_list();
                    gen_event(0, "PROFILE_IMPORT_SUCCESS", str4, str4);
                    return true;
                } catch (IOException unused) {
                    gen_event(1, "PROFILE_WRITE_ERROR", str2);
                    return false;
                }
            }
        }
        gen_event(1, "PROFILE_FILENAME_ERROR", str2);
        return false;
    }

    private boolean import_profile_action(String str, Intent intent) {
        return import_profile(hz.u(str, ".CONTENT", intent), hz.u(str, ".FILENAME", intent), intent.getBooleanExtra(str + ".MERGE", false));
    }

    private boolean import_profile_via_path_action(String str, Intent intent) {
        ClientAPI_MergeConfig clientAPI_MergeConfigMerge_config_static = ClientAPI_OpenVPNClient.merge_config_static(intent.getStringExtra(str + ".PATH"), true);
        StringBuilder sb = new StringBuilder("PROFILE_");
        sb.append(clientAPI_MergeConfigMerge_config_static.getStatus());
        String string = sb.toString();
        if (string.equals("PROFILE_MERGE_SUCCESS")) {
            return import_profile(clientAPI_MergeConfigMerge_config_static.getProfileContent(), clientAPI_MergeConfigMerge_config_static.getBasename(), false);
        }
        gen_event(1, string, clientAPI_MergeConfigMerge_config_static.getErrorText());
        return false;
    }

    private Profile locate_profile(String str) {
        get_profile_list();
        Profile profile = this.profile_list.get_profile_by_name(str);
        if (profile != null) {
            return profile;
        }
        gen_event(1, "PROFILE_NOT_FOUND", str);
        return null;
    }

    private static void log_message(LogMsg logMsg) {
        if (logMsg.line.contains("TO PROXY") || logMsg.line.contains("FROM PROXY") || logMsg.line.contains("via HTTP PROXY") || logMsg.line.contains("via TCP") || logMsg.line.contains("mssfix disabled")) {
            logMsg.line = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a", Locale.getDefault());
        if (logMsg.line.isEmpty()) {
            return;
        }
        logMsg.line = hz.v("[", simpleDateFormat.format(new Date()), "]: ", logMsg.line);
        log_deque.addLast(logMsg);
        while (log_deque.size() > 250) {
            log_deque.removeFirst();
        }
        Iterator<EventReceiver> it = clients.iterator();
        while (it.hasNext()) {
            it.next().log(logMsg);
        }
    }

    private void log_stats() {
        if (this.active) {
            String[] strArrStat_names = stat_names();
            ClientAPI_LLVector clientAPI_LLVectorStat_values_full = stat_values_full();
            if (clientAPI_LLVectorStat_values_full != null) {
                for (int i2 = 0; i2 < strArrStat_names.length; i2++) {
                    String str = strArrStat_names[i2];
                    Long l = clientAPI_LLVectorStat_values_full.get(i2);
                    if (l.longValue() > 0) {
                        StringBuilder sb = new StringBuilder("STAT ");
                        sb.append(str);
                        sb.append("=");
                        sb.append(l);
                    }
                }
            }
        }
    }

    public static long max_profile_size() {
        return ClientAPI_OpenVPNClient.max_profile_size();
    }

    private static String openVpnRuntimeInfo() {
        return "platform=" + ClientAPI_OpenVPNClient.platform() + ", copyright=" + ClientAPI_OpenVPNClient.copyright() + ", cryptoSelfTest=" + ClientAPI_OpenVPNClient.crypto_self_test();
    }

    private void populate_event_info_map() {
        HashMap map = new HashMap();
        this.event_info = map;
        map.put("RECONNECTING", new EventInfo(R.string.reconnecting, R.drawable.connecting, 20, 2, 0));
        this.event_info.put("RESOLVE", new EventInfo(R.string.resolve, R.drawable.connecting, 30, 1, 0));
        this.event_info.put("WAIT_PROXY", new EventInfo(R.string.wait_proxy, R.drawable.connecting, 40, 1, 0));
        this.event_info.put("WAIT", new EventInfo(R.string.wait, R.drawable.connecting, 50, 1, 0));
        this.event_info.put("CONNECTING", new EventInfo(R.string.connecting, R.drawable.connecting, 60, 1, 0));
        this.event_info.put("GET_CONFIG", new EventInfo(R.string.connecting, R.drawable.connecting, 70, 1, 0));
        this.event_info.put("ASSIGN_IP", new EventInfo(R.string.connecting, R.drawable.connecting, 80, 1, 0));
        this.event_info.put("ADD_ROUTES", new EventInfo(R.string.add_routes, R.drawable.connecting, 90, 1, 0));
        this.event_info.put("CONNECTED", new EventInfo(R.string.connected, R.drawable.connected, 100, 3, 0));
        this.event_info.put("COMPRESSION_ENABLED", new EventInfo(R.string.compression_enabled, -1, 0, 0, 0));
        this.event_info.put("DISCONNECTED", new EventInfo(R.string.disconnected, R.drawable.disconnected, 0, 2, 0));
        this.event_info.put("AUTH_FAILED", new EventInfo(R.string.auth_failed, R.drawable.error, 0, 3, 0));
        this.event_info.put("PEM_PASSWORD_FAIL", new EventInfo(R.string.pem_password_fail, R.drawable.error, 0, 3, 0));
        this.event_info.put("CERT_VERIFY_FAIL", new EventInfo(R.string.cert_verify_fail, R.drawable.error, 0, 3, 0));
        this.event_info.put("TLS_VERSION_MIN", new EventInfo(R.string.tls_version_min, R.drawable.error, 0, 3, 0));
        this.event_info.put("DYNAMIC_CHALLENGE", new EventInfo(R.string.dynamic_challenge, R.drawable.error, 0, 2, 0));
        this.event_info.put("TUN_SETUP_FAILED", new EventInfo(R.string.tun_setup_failed, R.drawable.error, 0, 3, 0));
        this.event_info.put("TUN_IFACE_CREATE", new EventInfo(R.string.tun_iface_create, R.drawable.error, 0, 3, 0));
        this.event_info.put("TAP_NOT_SUPPORTED", new EventInfo(R.string.tap_not_supported, R.drawable.error, 0, 3, 0));
        this.event_info.put("PROFILE_NOT_FOUND", new EventInfo(R.string.profile_not_found, R.drawable.error, 0, 3, 0));
        this.event_info.put("CONFIG_FILE_PARSE_ERROR", new EventInfo(R.string.config_file_parse_error, R.drawable.error, 0, 3, 0));
        this.event_info.put("NEED_CREDS_ERROR", new EventInfo(R.string.need_creds_error, R.drawable.error, 0, 3, 0));
        this.event_info.put("CREDS_ERROR", new EventInfo(R.string.creds_error, R.drawable.error, 0, 3, 0));
        this.event_info.put("CONNECTION_TIMEOUT", new EventInfo(R.string.connection_timeout, R.drawable.error, 0, 3, 0));
        this.event_info.put("INACTIVE_TIMEOUT", new EventInfo(R.string.inactive_timeout, R.drawable.error, 0, 3, 0));
        this.event_info.put("INFO", new EventInfo(R.string.info_msg, R.drawable.rightarrow, 0, 0, 0));
        this.event_info.put("WARN", new EventInfo(R.string.warn_msg, R.drawable.rightarrow, 0, 0, 0));
        this.event_info.put("PROXY_NEED_CREDS", new EventInfo(R.string.proxy_need_creds, R.drawable.error, 0, 3, 0));
        this.event_info.put("PROXY_ERROR", new EventInfo(R.string.proxy_error, R.drawable.error, 0, 3, 0));
        this.event_info.put("PROXY_CONTEXT_EXPIRED", new EventInfo(R.string.proxy_context_expired, R.drawable.error, 0, 3, 0));
        this.event_info.put("EPKI_ERROR", new EventInfo(R.string.epki_error, R.drawable.error, 0, 3, 0));
        this.event_info.put("EPKI_INVALID_ALIAS", new EventInfo(R.string.epki_invalid_alias, R.drawable.error, 0, 0, 0));
        this.event_info.put("PAUSE", new EventInfo(R.string.pause, R.drawable.pause, 0, 3, 0));
        this.event_info.put("RESUME", new EventInfo(R.string.resume, R.drawable.connecting, 0, 2, 0));
        this.event_info.put("CORE_THREAD_ACTIVE", new EventInfo(R.string.core_thread_active, R.drawable.connecting, 10, 1, 0));
        this.event_info.put("CORE_THREAD_INACTIVE", new EventInfo(R.string.core_thread_inactive, -1, 0, 0, 0));
        this.event_info.put("CORE_THREAD_ERROR", new EventInfo(R.string.core_thread_error, R.drawable.error, 0, 3, 0));
        this.event_info.put("CORE_THREAD_ABANDONED", new EventInfo(R.string.core_thread_abandoned, R.drawable.error, 0, 3, 0));
        this.event_info.put("CLIENT_HALT", new EventInfo(R.string.client_halt, R.drawable.error, 0, 3, 0));
        this.event_info.put("CLIENT_RESTART", new EventInfo(R.string.client_restart, R.drawable.connecting, 0, 2, 0));
        this.event_info.put("PROFILE_IMPORT_SUCCESS", new EventInfo(R.string.profile_import_success, R.drawable.rightarrow, 0, 2, 44));
        this.event_info.put("PROFILE_DELETE_SUCCESS", new EventInfo(R.string.profile_delete_success, R.drawable.delete, 0, 2, 12));
        this.event_info.put("PROFILE_DELETE_FAILED", new EventInfo(R.string.profile_delete_failed, R.drawable.error, 0, 2, 4));
        this.event_info.put("PROFILE_PARSE_ERROR", new EventInfo(R.string.profile_parse_error, R.drawable.error, 0, 3, 4));
        this.event_info.put("PROFILE_CONFLICT", new EventInfo(R.string.profile_conflict, R.drawable.error, 0, 3, 4));
        this.event_info.put("PROFILE_WRITE_ERROR", new EventInfo(R.string.profile_write_error, R.drawable.error, 0, 3, 4));
        this.event_info.put("PROFILE_FILENAME_ERROR", new EventInfo(R.string.profile_filename_error, R.drawable.error, 0, 3, 4));
        this.event_info.put("PROFILE_RENAME_SUCCESS", new EventInfo(R.string.profile_rename_success, R.drawable.rightarrow, 0, 2, 12));
        this.event_info.put("PROFILE_RENAME_FAILED", new EventInfo(R.string.profile_rename_failed, R.drawable.error, 0, 2, 4));
        this.event_info.put("PROFILE_MERGE_EXCEPTION", new EventInfo(R.string.profile_merge_exception, R.drawable.error, 0, 2, 4));
        this.event_info.put("PROFILE_MERGE_OVPN_EXT_FAIL", new EventInfo(R.string.profile_merge_ovpn_ext_fail, R.drawable.error, 0, 2, 4));
        this.event_info.put("PROFILE_MERGE_OVPN_FILE_FAIL", new EventInfo(R.string.profile_merge_ovpn_file_fail, R.drawable.error, 0, 2, 4));
        this.event_info.put("PROFILE_MERGE_REF_FAIL", new EventInfo(R.string.profile_merge_ref_fail, R.drawable.error, 0, 2, 4));
        this.event_info.put("PROFILE_MERGE_MULTIPLE_REF_FAIL", new EventInfo(R.string.profile_merge_multiple_ref_fail, R.drawable.error, 0, 2, 4));
        this.event_info.put("UI_RESET", new EventInfo(R.string.ui_reset, R.drawable.rightarrow, 0, 0, 8));
    }

    private void register_connectivity_receiver() {
        this.mConnectivityReceiver = new ConnectivityReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.mConnectivityReceiver.register();
    }

    private boolean rename_profile_action(String str, Intent intent) {
        String strU = hz.u(str, ".PROFILE", intent);
        String stringExtra = intent.getStringExtra(str + ".NEW_PROFILE");
        get_profile_list();
        Profile profile = this.profile_list.get_profile_by_name(strU);
        if (profile == null) {
            return false;
        }
        if (!profile.is_renameable() || stringExtra == null || stringExtra.length() == 0) {
            gen_event(1, "PROFILE_RENAME_FAILED", strU);
            return false;
        }
        File filesDir = getFilesDir();
        String str2 = filesDir.getPath() + "/" + profile.orig_filename;
        String str3 = filesDir.getPath() + "/" + ProfileFN.encode_profile_fn(stringExtra);
        if (!new File(str2).renameTo(new File(str3))) {
            StringBuilder sb = new StringBuilder("PROFILE_RENAME_FAILED: rename operation from='");
            sb.append(str2);
            sb.append("' to='");
            sb.append(str3);
            sb.append("'");
            gen_event(1, "PROFILE_RENAME_FAILED", strU);
            return false;
        }
        refresh_profile_list();
        Profile profile2 = this.profile_list.get_profile_by_name(stringExtra);
        if (profile2 == null) {
            gen_event(1, "PROFILE_RENAME_FAILED", strU);
            return false;
        }
        this.pwds.b("auth", strU);
        this.pwds.b("pk", strU);
        gen_event(0, "PROFILE_RENAME_SUCCESS", profile2.get_name(), profile2.get_name());
        return true;
    }

    private static String render_bandwidth(long j) {
        String str;
        float f;
        float f2 = j;
        if (f2 >= 1.0E12f) {
            str = "TB";
            f = 1.0995116E12f;
        } else if (f2 >= 1.0E9f) {
            str = "GB";
            f = 1.0737418E9f;
        } else if (f2 >= 1000000.0f) {
            str = "MB";
            f = 1048576.0f;
        } else {
            if (f2 < 1000.0f) {
                return String.format("%.0f", Float.valueOf(f2));
            }
            str = "KB";
            f = 1024.0f;
        }
        return String.format("%.2f %s", Float.valueOf(f2 / f), str);
    }

    private String resString(int i2) {
        return getResources().getString(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String sanitizeOpenVpn3Profile(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i2 = 0;
        boolean z = false;
        for (String str2 : str.split("\\r?\\n", -1)) {
            String strTrim = str2.trim();
            if (strTrim.startsWith("<") && !strTrim.startsWith("</")) {
                z = true;
            }
            if (z || !shouldStripOpenVpn3Option(strTrim)) {
                sb.append(str2);
                sb.append('\n');
            } else {
                i2++;
            }
            if (strTrim.startsWith("</")) {
                z = false;
            }
        }
        if (i2 > 0) {
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder("OpenVPN3 profile sanitizer removed ");
            sb2.append(i2);
            sb2.append(" legacy option(s)");
        }
        return sb.toString();
    }

    private static boolean shouldStripOpenVpn3Option(String str) {
        if (!str.isEmpty() && !str.startsWith("#") && !str.startsWith(";")) {
            String[] strArrSplit = str.split("\\s+", 2);
            if (strArrSplit.length > 0 && OPENVPN3_STRIPPED_OPTIONS.contains(strArrSplit[0].toLowerCase(Locale.US))) {
                return true;
            }
        }
        return false;
    }

    private boolean start_connection(Profile profile, String str, String str2, ProxyContext proxyContext, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12) {
        String string;
        int i2;
        String str13;
        if (this.active) {
            return false;
        }
        this.enable_notifications = this.prefs.b("enable_notifications");
        OpenVPNClientThread openVPNClientThread = new OpenVPNClientThread();
        ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
        if (ConfigUtil.getInstance(this).getTunnelType() != 8) {
            StringBuilder sbY = hz.y(str);
            Locale locale = Locale.US;
            sbY.append("\nhttp-proxy 127.0.0.1 8989\n");
            string = sbY.toString();
        } else {
            string = str;
        }
        clientAPI_Config.setContent(sanitizeOpenVpn3Profile(string));
        clientAPI_Config.setInfo(true);
        if (str3 != null) {
            clientAPI_Config.setServerOverride(str3);
        }
        if (str4 != null) {
            clientAPI_Config.setProtoOverride(str4);
        }
        if (str5 != null) {
            clientAPI_Config.setIpv6(str5);
        }
        if (str6 != null) {
            try {
                i2 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
            clientAPI_Config.setConnTimeout(i2);
        }
        if (str12 != null) {
            clientAPI_Config.setCompressionMode(str12);
        }
        if (str9 != null) {
            clientAPI_Config.setPrivateKeyPassword(str9);
        }
        clientAPI_Config.setTunPersist(this.prefs.b("tun_persist"));
        clientAPI_Config.setGoogleDnsFallback(this.prefs.b("google_dns_fallback"));
        clientAPI_Config.setForceAesCbcCiphersuites(this.prefs.b("force_aes_cbc_ciphersuites_v2"));
        clientAPI_Config.setAltProxy(this.prefs.b("alt_proxy"));
        this.prefs.b("cert_profile_insecure");
        String strC = this.prefs.c("tls_version_min_override");
        if (strC != null) {
            clientAPI_Config.setTlsVersionMinOverride(strC);
        }
        if (str2 != null) {
            clientAPI_Config.setGuiVersion(str2);
        }
        if (profile.get_epki()) {
            if (str11 != null) {
                profile.persist_epki_alias(str11);
                str13 = str11;
            } else {
                str13 = profile.get_epki_alias();
            }
            if (str13 != null) {
                if (str13.equals("DISABLE_CLIENT_CERT")) {
                    clientAPI_Config.setDisableClientCert(true);
                } else {
                    clientAPI_Config.setExternalPkiAlias(str13);
                }
            }
        }
        if (proxyContext != null) {
            proxyContext.client_api_config(clientAPI_Config);
        }
        ClientAPI_EvalConfig clientAPI_EvalConfigEval_config = openVPNClientThread.eval_config(clientAPI_Config);
        if (clientAPI_EvalConfigEval_config.getError()) {
            gen_event(1, "CONFIG_FILE_PARSE_ERROR", clientAPI_EvalConfigEval_config.getMessage());
            return false;
        }
        ClientAPI_ProvideCreds clientAPI_ProvideCreds = new ClientAPI_ProvideCreds();
        if (profile.is_dynamic_challenge()) {
            if (str10 != null) {
                clientAPI_ProvideCreds.setResponse(str10);
            }
            clientAPI_ProvideCreds.setDynamicChallengeCookie(profile.dynamic_challenge.cookie);
            profile.reset_dynamic_challenge();
        } else {
            if (!clientAPI_EvalConfigEval_config.getAutologin() && str7 != null && str7.length() == 0) {
                gen_event(1, "NEED_CREDS_ERROR", null);
                return false;
            }
            if (str7 != null) {
                clientAPI_ProvideCreds.setUsername(str7);
            }
            if (str8 != null) {
                clientAPI_ProvideCreds.setPassword(str8);
            }
            if (str10 != null) {
                clientAPI_ProvideCreds.setResponse(str10);
            }
        }
        clientAPI_ProvideCreds.setCachePassword(z);
        clientAPI_ProvideCreds.setReplacePasswordWithSessionID(true);
        ClientAPI_Status clientAPI_StatusProvide_creds = openVPNClientThread.provide_creds(clientAPI_ProvideCreds);
        if (clientAPI_StatusProvide_creds.getError()) {
            gen_event(1, "CREDS_ERROR", clientAPI_StatusProvide_creds.getMessage());
            return false;
        }
        String unused2 = profile.name;
        if (proxyContext != null) {
            proxyContext.name();
        }
        this.current_profile = profile;
        set_autostart_profile_name(profile.get_name());
        this.paused = false;
        start_notification();
        gen_event(0, "CORE_THREAD_ACTIVE", null);
        if (openVPNClientThread.a) {
            throw new OpenVPNClientThread.ConnectCalledTwice();
        }
        openVPNClientThread.a = true;
        openVPNClientThread.c = this;
        openVPNClientThread.b = null;
        Thread thread = new Thread(openVPNClientThread, "OpenVPNClientThread");
        openVPNClientThread.d = thread;
        thread.start();
        mThread = openVPNClientThread;
        this.thread_started = SystemClock.elapsedRealtime();
        this.cpu_usage = new CPUUsage();
        this.active = true;
        return true;
    }

    private void start_notification() {
        if (this.mNotifyBuilder != null || this.current_profile == null) {
            return;
        }
        Notification.Builder builder = new Notification.Builder(this);
        this.mNotifyBuilder = builder;
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId(SocksHttpService.NOTIFICATION_CHANNEL_USERREQ_ID);
            createNotificationChannel(this.mNotificationManager, SocksHttpService.NOTIFICATION_CHANNEL_USERREQ_ID);
        }
        this.mNotifyBuilder.setContentIntent(get_configure_intent(1)).setSmallIcon(R.drawable.ic_stat_name).setContentTitle(getString(R.string.app)).setContentText(resString(R.string.app)).setOnlyAlertOnce(true).setOngoing(true).setWhen(new Date().getTime());
        this.mNotificationManager.notify(NOTIFICATION_ID, this.mNotifyBuilder.getNotification());
        startForeground(NOTIFICATION_ID, this.mNotifyBuilder.getNotification());
    }

    public static String[] stat_names() {
        int iStats_n = ClientAPI_OpenVPNClient.stats_n();
        String[] strArr = new String[iStats_n];
        for (int i2 = 0; i2 < iStats_n; i2++) {
            strArr[i2] = ClientAPI_OpenVPNClient.stats_name(i2);
        }
        return strArr;
    }

    private void stop_notification() {
        if (this.mNotifyBuilder != null) {
            this.mNotifyBuilder = null;
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
            }
            stopForeground(true);
        }
    }

    private void stop_thread() {
        if (this.active) {
            stop_notification();
            mThread.stop();
            OpenVPNClientThread openVPNClientThread = mThread;
            Thread thread = openVPNClientThread.d;
            if (thread != null) {
                try {
                    thread.join(5000L);
                } catch (InterruptedException unused) {
                }
                if (thread.isAlive()) {
                    ClientAPI_Status clientAPI_Status = new ClientAPI_Status();
                    clientAPI_Status.setError(true);
                    clientAPI_Status.setMessage("CORE_THREAD_ABANDONED");
                    openVPNClientThread.b(clientAPI_Status);
                }
            }
        }
    }

    private boolean submit_proxy_creds_action(String str, Intent intent) {
        ProxyContext proxyContext;
        Profile profileLocate_profile = locate_profile(hz.u(str, ".PROFILE", intent));
        if (profileLocate_profile != null && (proxyContext = profileLocate_profile.get_proxy_context(false)) != null) {
            Intent intentSubmit_proxy_creds = proxyContext.submit_proxy_creds(hz.u(str, ".PROXY_NAME", intent), hz.u(str, ".PROXY_USERNAME", intent), hz.u(str, ".PROXY_PASSWORD", intent), intent.getBooleanExtra(str + ".PROXY_REMEMBER_CREDS", false), this.proxy_list);
            if (intentSubmit_proxy_creds != null) {
                connect_action(str, intentSubmit_proxy_creds, true);
                return true;
            }
        }
        gen_event(1, "PROXY_CONTEXT_EXPIRED", null);
        return false;
    }

    private void unregister_connectivity_receiver() {
        this.mConnectivityReceiver.unregister();
    }

    private void update_notification_event(final EventMsg eventMsg) {
        Notification.Builder builder = this.mNotifyBuilder;
        if (builder == null || eventMsg.priority < 1) {
            return;
        }
        builder.setContentText(resString(eventMsg.res_id));
        int i2 = eventMsg.res_id;
        Notification.Builder builder2 = this.mNotifyBuilder;
        if (i2 == R.string.connected) {
            builder2.setContentTitle("Connected to " + this.current_profile.get_name());
            Timer timer = new Timer();
            this.timer = timer;
            timer.schedule(new TimerTask() { // from class: com.sandok.tunnel.service.OpenVPNService.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (eventMsg.res_id == R.string.connected) {
                        OpenVPNService openVPNService = OpenVPNService.this;
                        if (openVPNService.mNotifyBuilder == null || openVPNService.mHandler == null) {
                            return;
                        }
                        OpenVPNService.this.mHandler.sendEmptyMessage(99);
                    }
                }
            }, 0L, 1000L);
        } else {
            builder2.setContentTitle(getString(R.string.app));
            this.mNotifyBuilder.setContentText(getString(eventMsg.res_id));
        }
        this.mNotificationManager.notify(NOTIFICATION_ID, this.mNotifyBuilder.getNotification());
        startForeground(NOTIFICATION_ID, this.mNotifyBuilder.getNotification());
    }

    public void addProfile(String str, String str2) throws Exception {
        String strSanitizeOpenVpn3Profile = sanitizeOpenVpn3Profile(str2);
        ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
        clientAPI_Config.setContent(strSanitizeOpenVpn3Profile);
        ClientAPI_EvalConfig clientAPI_EvalConfigEval_config_static = ClientAPI_OpenVPNClient.eval_config_static(clientAPI_Config);
        if (clientAPI_EvalConfigEval_config_static.getError()) {
            gen_event(1, "PROFILE_PARSE_ERROR", str + " : " + clientAPI_EvalConfigEval_config_static.getMessage());
        }
        Profile profile = new Profile("imported", str, false, clientAPI_EvalConfigEval_config_static);
        try {
            FileUtil.b(this, profile.get_filename(), strSanitizeOpenVpn3Profile);
            String str3 = profile.get_name();
            this.pwds.b("auth", str3);
            this.pwds.b("pk", str3);
            refresh_profile_list();
            gen_event(0, "PROFILE_IMPORT_SUCCESS", str3, str3);
        } catch (IOException unused) {
            gen_event(1, "PROFILE_WRITE_ERROR", str);
        }
    }

    public void client_attach(EventReceiver eventReceiver) {
        clients.remove(eventReceiver);
        clients.addFirst(eventReceiver);
        String.format("SERV: client attach n_clients=%d", Integer.valueOf(clients.size()));
    }

    public void client_detach(EventReceiver eventReceiver) {
        clients.remove(eventReceiver);
        String.format("SERV: client detach n_clients=%d", Integer.valueOf(clients.size()));
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public void done(ClientAPI_Status clientAPI_Status) {
        boolean error = clientAPI_Status.getError();
        String message = clientAPI_Status.getMessage();
        StringBuilder sb = new StringBuilder("EXIT: connect() exited, err=");
        sb.append(error);
        sb.append(", msg='");
        sb.append(message);
        sb.append("'");
        log_stats();
        if (error) {
            if (message == null || !message.equals("CORE_THREAD_ABANDONED")) {
                String status = clientAPI_Status.getStatus();
                if (status.length() == 0) {
                    status = "CORE_THREAD_ERROR";
                }
                gen_event(1, status, message);
            } else {
                gen_event(1, "CORE_THREAD_ABANDONED", null);
            }
        }
        gen_event(0, "CORE_THREAD_INACTIVE", null);
        this.active = false;
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public void event(ClientAPI_Event clientAPI_Event) {
        OpenVPNClientThread openVPNClientThread;
        EventMsg eventMsg = new EventMsg();
        if (clientAPI_Event.getError()) {
            eventMsg.flags |= 1;
        }
        eventMsg.name = clientAPI_Event.getName();
        eventMsg.info = clientAPI_Event.getInfo();
        EventInfo eventInfo = (EventInfo) this.event_info.get(eventMsg.name);
        if (eventInfo != null) {
            eventMsg.progress = eventInfo.progress;
            eventMsg.priority = eventInfo.priority;
            int i2 = eventInfo.res_id;
            eventMsg.res_id = i2;
            eventMsg.icon_res_id = eventInfo.icon_res_id;
            eventMsg.flags = eventInfo.flags | eventMsg.flags;
            if (i2 == R.string.connected && (openVPNClientThread = mThread) != null) {
                eventMsg.conn_info = openVPNClientThread.connection_info();
            }
        } else {
            eventMsg.res_id = R.string.unknown;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, eventMsg));
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public void external_pki_cert_request(ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest) {
        try {
            X509Certificate[] certificateChain = KeyChain.getCertificateChain(this, clientAPI_ExternalPKICertRequest.getAlias());
            if (certificateChain == null) {
                clientAPI_ExternalPKICertRequest.setError(true);
                clientAPI_ExternalPKICertRequest.setInvalidAlias(true);
                return;
            }
            if (certificateChain.length < 1) {
                clientAPI_ExternalPKICertRequest.setError(true);
                clientAPI_ExternalPKICertRequest.setInvalidAlias(true);
                clientAPI_ExternalPKICertRequest.setErrorText(resString(R.string.epki_missing_cert));
                return;
            }
            clientAPI_ExternalPKICertRequest.setCert(cert_format_pem(certificateChain[0]));
            if (certificateChain.length >= 2) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 1; i2 < certificateChain.length; i2++) {
                    sb.append(cert_format_pem(certificateChain[i2]));
                }
                clientAPI_ExternalPKICertRequest.setSupportingChain(sb.toString());
            }
        } catch (Exception e) {
            clientAPI_ExternalPKICertRequest.setError(true);
            clientAPI_ExternalPKICertRequest.setInvalidAlias(true);
            clientAPI_ExternalPKICertRequest.setErrorText(e.toString());
        }
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public void external_pki_sign_request(ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest) {
        byte[] bArrDoFinal;
        try {
            byte[] bArrDecode = Base64.decode(clientAPI_ExternalPKISignRequest.getData(), 0);
            PrivateKey privateKey = KeyChain.getPrivateKey(this, clientAPI_ExternalPKISignRequest.getAlias());
            if (privateKey != null) {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
                cipher.init(1, privateKey);
                bArrDoFinal = cipher.doFinal(bArrDecode);
            } else {
                clientAPI_ExternalPKISignRequest.setError(true);
                clientAPI_ExternalPKISignRequest.setInvalidAlias(true);
                bArrDoFinal = null;
            }
            if (bArrDoFinal != null) {
                clientAPI_ExternalPKISignRequest.setSig(Base64.encodeToString(bArrDoFinal, 2));
            }
        } catch (Exception e) {
            clientAPI_ExternalPKISignRequest.setError(true);
            clientAPI_ExternalPKISignRequest.setInvalidAlias(true);
            clientAPI_ExternalPKISignRequest.setErrorText(e.toString());
        }
    }

    public void gen_proxy_context_expired_event() {
        gen_event(0, "PROXY_CONTEXT_EXPIRED", null);
    }

    public void gen_ui_reset_event(boolean z, EventReceiver eventReceiver) {
        gen_event(z ? 16 : 0, "UI_RESET", null, null, eventReceiver);
    }

    public ConnectionStats get_connection_stats() {
        ConnectionStats connectionStats = new ConnectionStats();
        ClientAPI_TransportStats clientAPI_TransportStatsTransport_stats = mThread.transport_stats();
        connectionStats.last_packet_received = -1;
        if (!this.active) {
            connectionStats.duration = 0;
            connectionStats.bytes_in = 0L;
            connectionStats.bytes_out = 0L;
            return connectionStats;
        }
        int iElapsedRealtime = ((int) (SystemClock.elapsedRealtime() - this.thread_started)) / 1000;
        connectionStats.duration = iElapsedRealtime;
        if (iElapsedRealtime < 0) {
            connectionStats.duration = 0;
        }
        connectionStats.bytes_in = clientAPI_TransportStatsTransport_stats.getBytesIn();
        connectionStats.bytes_out = clientAPI_TransportStatsTransport_stats.getBytesOut();
        int lastPacketReceived = clientAPI_TransportStatsTransport_stats.getLastPacketReceived();
        if (lastPacketReceived >= 0) {
            connectionStats.last_packet_received = lastPacketReceived >> 10;
        }
        return connectionStats;
    }

    public Profile get_current_profile() {
        Profile profile = this.current_profile;
        if (profile != null) {
            return profile;
        }
        ProfileList profileList = get_profile_list();
        if (profileList.size() >= 1) {
            return profileList.get(0);
        }
        return null;
    }

    public EventMsg get_last_event() {
        EventMsg eventMsg = this.last_event;
        if (eventMsg == null || eventMsg.is_expired()) {
            return null;
        }
        return this.last_event;
    }

    public EventMsg get_last_event_prof_manage() {
        EventMsg eventMsg = this.last_event_prof_manage;
        if (eventMsg == null || eventMsg.is_expired()) {
            return null;
        }
        return this.last_event_prof_manage;
    }

    public ProfileList get_profile_list() {
        if (this.profile_list == null) {
            refresh_profile_list();
        }
        return this.profile_list;
    }

    public long get_tunnel_bytes_per_cpu_second() {
        CPUUsage cPUUsage = this.cpu_usage;
        if (cPUUsage == null) {
            return 0L;
        }
        double elapsedCpuTime = (cPUUsage.b ? cPUUsage.a : Process.getElapsedCpuTime() / 1000.0d) - cPUUsage.c;
        if (elapsedCpuTime <= 0.0d) {
            return 0L;
        }
        ClientAPI_InterfaceStats clientAPI_InterfaceStatsTun_stats = mThread.tun_stats();
        return (long) ((clientAPI_InterfaceStatsTun_stats.getBytesOut() + clientAPI_InterfaceStatsTun_stats.getBytesIn()) / elapsedCpuTime);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i2;
        int i3;
        ProfileList profileList;
        EventMsg eventMsg = get_last_event();
        int i4 = message.what;
        int i5 = 0;
        if (i4 == 1) {
            EventMsg eventMsg2 = (EventMsg) message.obj;
            int i6 = eventMsg2.res_id;
            if (i6 == R.string.auth_failed) {
                Profile profile = this.current_profile;
                if (profile != null) {
                    profile.get_name();
                }
            } else if (i6 == R.string.connected) {
                Toast.makeText(getApplicationContext(), "Connected Successfully😍", 0).show();
                Profile profile2 = this.current_profile;
                if (profile2 != null) {
                    profile2.reset_proxy_context();
                }
            } else if (i6 == R.string.core_thread_inactive) {
                CPUUsage cPUUsage = this.cpu_usage;
                if (cPUUsage != null && !cPUUsage.b) {
                    cPUUsage.a = Process.getElapsedCpuTime() / 1000.0d;
                    cPUUsage.b = true;
                }
                stop_notification();
                stop_thread();
                if (!this.shutdown_pending) {
                    set_autostart_profile_name(null);
                }
            } else if (i6 == R.string.disconnected) {
                if (eventMsg != null) {
                    if ((eventMsg.flags & 1) != 0) {
                        eventMsg2.priority = 0;
                    }
                    Profile profile3 = this.current_profile;
                    if (profile3 != null && (i2 = eventMsg.res_id) != R.string.proxy_need_creds && i2 != R.string.dynamic_challenge) {
                        profile3.reset_proxy_context();
                    }
                    stop_notification();
                }
            } else if (i6 == R.string.pause) {
                this.paused = true;
            } else if (i6 == R.string.dynamic_challenge) {
                if (this.current_profile != null) {
                    ClientAPI_DynamicChallenge clientAPI_DynamicChallenge = new ClientAPI_DynamicChallenge();
                    if (ClientAPI_OpenVPNClient.parse_dynamic_challenge(eventMsg2.info, clientAPI_DynamicChallenge)) {
                        DynamicChallenge dynamicChallenge = new DynamicChallenge(i5);
                        dynamicChallenge.expires = SystemClock.elapsedRealtime() + 60000;
                        dynamicChallenge.cookie = eventMsg2.info;
                        dynamicChallenge.challenge.challenge = clientAPI_DynamicChallenge.getChallenge();
                        dynamicChallenge.challenge.echo = clientAPI_DynamicChallenge.getEcho();
                        dynamicChallenge.challenge.response_required = clientAPI_DynamicChallenge.getResponseRequired();
                        this.current_profile.dynamic_challenge = dynamicChallenge;
                        eventMsg2.info = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                }
            } else if (i6 == R.string.pem_password_fail) {
                eventMsg2.info = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                Profile profile4 = this.current_profile;
                if (profile4 != null) {
                    profile4.get_name();
                }
            }
            if (eventMsg2.res_id == R.string.epki_invalid_alias && (profileList = this.profile_list) != null) {
                profileList.invalidate_epki_alias(eventMsg2.info);
            }
            if (this.enable_notifications && ((i3 = eventMsg2.priority) == 2 || i3 == 3)) {
                Toast.makeText(this, eventMsg2.res_id, 0).show();
            }
            int i7 = eventMsg2.res_id;
            if (i7 == R.string.connected && (eventMsg == null || eventMsg.res_id != R.string.connected)) {
                eventMsg2.transition = EventMsg.Transition.TO_CONNECTED;
            } else if (i7 != R.string.connected && eventMsg != null && eventMsg.res_id == R.string.connected) {
                eventMsg2.transition = EventMsg.Transition.TO_DISCONNECTED;
            }
            if ((eventMsg2.flags & 4) != 0) {
                this.last_event_prof_manage = eventMsg2;
            } else if (eventMsg2.priority >= 2) {
                this.last_event = eventMsg2;
            }
            String string = i7 != R.string.ui_reset ? eventMsg2.toString() : null;
            if (eventMsg2.res_id == R.string.core_thread_active) {
                log_message("<b>----- " + getString(R.string.app) + " Start -----</b>");
            }
            if (string != null) {
                log_message(string);
            }
            if (eventMsg2.res_id == R.string.core_thread_inactive) {
                log_message(String.format("Tunnel bytes per CPU second: %d", Long.valueOf(get_tunnel_bytes_per_cpu_second())));
                log_message("<b>----- " + getString(R.string.app) + " Stop -----</b>");
            }
            update_notification_event(eventMsg2);
            for (EventReceiver eventReceiver : clients) {
                if ((eventMsg2.flags & 16) == 0 || eventReceiver != eventMsg2.sender) {
                    eventReceiver.event(eventMsg2);
                }
            }
        } else {
            if (i4 == 2) {
                Object[] objArr = {((LogMsg) message.obj).line};
                String.format("LOG: %s", objArr);
                log_message(String.format("%s", objArr));
                return true;
            }
            if (i4 == 99) {
                ConnectionStats connectionStats = get_connection_stats();
                if (this.mNotifyBuilder != null && connectionStats != null) {
                    this.mNotifyBuilder.setContentText(hz.v("⬆ ", render_bandwidth(connectionStats.bytes_out), " - ⬇ ", render_bandwidth(connectionStats.bytes_in)));
                    this.mNotificationManager.notify(NOTIFICATION_ID, this.mNotifyBuilder.getNotification());
                    startForeground(NOTIFICATION_ID, this.mNotifyBuilder.getNotification());
                    return true;
                }
            }
        }
        return true;
    }

    public boolean is_active() {
        return this.active;
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public void log(ClientAPI_LogInfo clientAPI_LogInfo) {
        LogMsg logMsg = new LogMsg();
        logMsg.line = clientAPI_LogInfo.getText();
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(2, logMsg));
    }

    public ArrayDeque<LogMsg> log_history() {
        return log_deque;
    }

    public MergedProfile merge_parse_profile(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        ClientAPI_MergeConfig clientAPI_MergeConfigMerge_config_string_static = ClientAPI_OpenVPNClient.merge_config_string_static(str2);
        String strResString = "PROFILE_" + clientAPI_MergeConfigMerge_config_string_static.getStatus();
        if (strResString.equals("PROFILE_MERGE_SUCCESS")) {
            String strSanitizeOpenVpn3Profile = sanitizeOpenVpn3Profile(clientAPI_MergeConfigMerge_config_string_static.getProfileContent());
            ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
            clientAPI_Config.setContent(strSanitizeOpenVpn3Profile);
            MergedProfile mergedProfile = new MergedProfile(this, str, ClientAPI_OpenVPNClient.eval_config_static(clientAPI_Config));
            mergedProfile.profile_content = strSanitizeOpenVpn3Profile;
            return mergedProfile;
        }
        ClientAPI_EvalConfig clientAPI_EvalConfig = new ClientAPI_EvalConfig();
        EventInfo eventInfo = (EventInfo) this.event_info.get(strResString);
        if (eventInfo != null) {
            strResString = resString(eventInfo.res_id);
        }
        clientAPI_EvalConfig.setError(true);
        clientAPI_EvalConfig.setMessage(strResString + " : " + clientAPI_MergeConfigMerge_config_string_static.getErrorText());
        return new MergedProfile(this, str, clientAPI_EvalConfig);
    }

    public void network_pause() {
        if (this.active) {
            this.paused = true;
            mThread.pause(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    public void network_reconnect(int i2) {
        if (this.active) {
            mThread.reconnect(i2);
        }
    }

    public void network_resume() {
        if (this.active) {
            this.paused = false;
            mThread.resume();
        }
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null || !intent.getAction().equals(ACTION_BIND)) {
            String.format("SERV: onBind SUPER intent=%s", intent);
            return super.onBind(intent);
        }
        String.format("SERV: onBind intent=%s", intent);
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        crypto_self_test();
        this.mHandler = new Handler(this);
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
        populate_event_info_map();
        register_connectivity_receiver();
        this.prefs = new PrefUtil(PreferenceManager.getDefaultSharedPreferences(this));
        this.pwds = new PasswordUtil(PreferenceManager.getDefaultSharedPreferences(this));
        String.format("Build.VERSION.SDK_INT=%d", Integer.valueOf(Build.VERSION.SDK_INT));
        ProxyList proxyList = new ProxyList(resString(R.string.proxy_none));
        this.proxy_list = proxyList;
        proxyList.b = this;
        proxyList.a = "proxies.json";
        try {
            OpenVPNService openVPNService = proxyList.b;
            String str = proxyList.a;
            ProxyList proxyListF = ProxyList.f(proxyList.f, (JSONObject) new JSONTokener(FileUtil.a(openVPNService.openFileInput(str), str)).nextValue());
            proxyList.e = proxyListF.e;
            proxyList.d = proxyListF.d;
            proxyList.c = false;
        } catch (IOException | Exception unused) {
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.shutdown_pending = true;
        stop_thread();
        unregister_connectivity_receiver();
        super.onDestroy();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        stop_thread();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent == null) {
            return 1;
        }
        String action = intent.getAction();
        new StringBuilder("SERV: onStartCommand action=").append(action);
        if (action.equals(ACTION_CONNECT)) {
            VPNUtil.setVPNProtectListener(this);
            VPNUtil.setVPNService(this);
            config = ConfigUtil.getInstance(this);
            connect_action(INTENT_PREFIX, intent, false);
            return 1;
        }
        if (action.equals(ACTION_SUBMIT_PROXY_CREDS)) {
            submit_proxy_creds_action(INTENT_PREFIX, intent);
            return 1;
        }
        if (action.equals(ACTION_DISCONNECT)) {
            disconnect_action(INTENT_PREFIX, intent);
            return 1;
        }
        if (action.equals(ACTION_IMPORT_PROFILE)) {
            import_profile_action(INTENT_PREFIX, intent);
            return 1;
        }
        if (action.equals(ACTION_IMPORT_PROFILE_VIA_PATH)) {
            import_profile_via_path_action(INTENT_PREFIX, intent);
            return 1;
        }
        if (action.equals(ACTION_DELETE_PROFILE)) {
            delete_profile_action(INTENT_PREFIX, intent);
            return 1;
        }
        if (action.equals(ACTION_RENAME_PROFILE)) {
            rename_profile_action(INTENT_PREFIX, intent);
            return 1;
        }
        if (!action.equals("DELETE_PROFILES")) {
            return 1;
        }
        delete_profiles();
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        new StringBuilder("SERV: onUnbind called intent=").append(intent.toString());
        return super.onUnbind(intent);
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public boolean pause_on_connection_timeout() {
        new StringBuilder("pause_on_connection_timeout ").append(Boolean.FALSE);
        return false;
    }

    @Override // com.sandok.tunnel.utils.VPNUtil.VPNProtectListener
    public boolean protectSocket(Socket socket) {
        return protect(socket);
    }

    public String read_file(String str, String str2) throws IOException {
        if (str.equals("bundled")) {
            return FileUtil.a(getResources().getAssets().open(str2), str2);
        }
        if (str.equals("imported")) {
            return FileUtil.a(openFileInput(str2), str2);
        }
        throw new InternalError();
    }

    public void refresh_profile_list() {
        ProfileList profileList = new ProfileList();
        try {
            profileList.load_profiles("bundled");
            profileList.load_profiles("imported");
            profileList.sort();
        } catch (IOException unused) {
        }
        Iterator<Profile> it = profileList.iterator();
        while (it.hasNext()) {
            it.next().toString();
        }
        this.profile_list = profileList;
    }

    public void set_autostart_profile_name(String str) {
        PrefUtil prefUtil = this.prefs;
        if (str != null) {
            SharedPreferences.Editor editorEdit = prefUtil.a.edit();
            editorEdit.putString("autostart_profile_name", str);
            editorEdit.apply();
        } else {
            SharedPreferences.Editor editorEdit2 = prefUtil.a.edit();
            editorEdit2.remove("autostart_profile_name");
            editorEdit2.apply();
        }
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public boolean socket_protect(int i2) {
        boolean zProtect = protect(i2);
        String.format("SOCKET PROTECT: fd=%d protected status=%b", Integer.valueOf(i2), Boolean.valueOf(zProtect));
        return zProtect;
    }

    public ClientAPI_LLVector stat_values_full() {
        OpenVPNClientThread openVPNClientThread = mThread;
        if (openVPNClientThread != null) {
            return openVPNClientThread.stats_bundle();
        }
        return null;
    }

    @Override // net.openvpn.openvpn.OpenVPNClientThread.EventReceiver
    public OpenVPNClientThread.TunBuilder tun_builder_new() {
        return new TunBuilder(this, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ProxyContext {
        private boolean allow_creds_dialog;
        private Intent connect_intent;
        private long expires;
        private boolean explicit_creds;
        private int n_retries;
        private String profile_name;
        private ProxyList.Item proxy;
        private String proxy_password;
        private String proxy_username;

        public /* synthetic */ ProxyContext(int i) {
            this();
        }

        private void reset() {
            this.profile_name = null;
            this.proxy = null;
            this.connect_intent = null;
            this.expires = 0L;
            this.explicit_creds = false;
            this.proxy_username = null;
            this.proxy_password = null;
            this.allow_creds_dialog = false;
            this.n_retries = 0;
        }

        public void client_api_config(ClientAPI_Config clientAPI_Config) {
            ProxyList.Item item = this.proxy;
            if (item != null) {
                clientAPI_Config.setProxyHost(item.c);
                clientAPI_Config.setProxyPort(this.proxy.e);
                String str = this.proxy_username;
                if (str != null && this.proxy_password != null) {
                    clientAPI_Config.setProxyUsername(str);
                    clientAPI_Config.setProxyPassword(this.proxy_password);
                }
                clientAPI_Config.setProxyAllowCleartextAuth(this.proxy.a);
            }
        }

        public void configure_creds_dialog_intent(Intent intent) {
            String str;
            if (this.proxy == null || (str = this.profile_name) == null) {
                return;
            }
            intent.putExtra("net.openvpn.openvpn.PROFILE", str);
            intent.putExtra("net.openvpn.openvpn.PROXY_NAME", this.proxy.a());
            intent.putExtra("net.openvpn.openvpn.N_RETRIES", this.n_retries);
            intent.putExtra("net.openvpn.openvpn.EXPIRES", this.expires);
        }

        public void invalidate_proxy_creds(ProxyList proxyList) {
            ProxyList.Item item = this.proxy;
            if (item != null && item.f) {
                item.g = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                item.d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                item.f = false;
                proxyList.c(item);
                proxyList.d();
            }
            this.proxy_username = null;
            this.proxy_password = null;
        }

        public boolean is_expired() {
            return this.expires != 0 && SystemClock.elapsedRealtime() > this.expires;
        }

        public String name() {
            ProxyList.Item item = this.proxy;
            if (item != null) {
                return item.a();
            }
            return null;
        }

        public void new_connection(Intent intent, String str, String str2, String str3, String str4, boolean z, ProxyList proxyList, boolean z2) {
            if (z2) {
                return;
            }
            ProxyList.Item item = proxyList.a(str2) ? null : (ProxyList.Item) proxyList.e.get(str2);
            if (item == null) {
                reset();
                return;
            }
            this.proxy = item;
            this.profile_name = str;
            this.connect_intent = intent;
            this.allow_creds_dialog = z;
            this.n_retries = 0;
            this.expires = SystemClock.elapsedRealtime() + 120000;
            if (this.explicit_creds) {
                return;
            }
            if (str3 == null || str4 == null) {
                this.proxy_username = item.g;
                this.proxy_password = item.d;
            } else {
                this.proxy_username = str3;
                this.proxy_password = str4;
            }
        }

        public boolean should_launch_creds_dialog() {
            return this.proxy != null && this.allow_creds_dialog;
        }

        public Intent submit_proxy_creds(String str, String str2, String str3, boolean z, ProxyList proxyList) {
            ProxyList.Item item = this.proxy;
            if (item == null || !item.a().equals(str) || str2 == null || str3 == null) {
                return null;
            }
            this.proxy_username = str2;
            this.proxy_password = str3;
            this.explicit_creds = true;
            if (z) {
                ProxyList.Item item2 = this.proxy;
                item2.g = str2;
                item2.d = str3;
                item2.f = z;
                proxyList.c(item2);
                proxyList.d();
            }
            this.n_retries++;
            return this.connect_intent;
        }

        private ProxyContext() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class ProfileList extends ArrayList<Profile> {
        public ProfileList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidate_epki_alias(String str) {
            Iterator<Profile> it = iterator();
            while (it.hasNext()) {
                it.next().invalidate_epki_alias(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void load_profiles(String str) throws IOException {
            String[] strArrFileList;
            boolean z;
            String str2;
            String str3;
            int i = 0;
            if (str.equals("bundled")) {
                strArrFileList = OpenVPNService.this.getResources().getAssets().list(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                z = false;
            } else {
                if (!str.equals("imported")) {
                    throw new InternalError();
                }
                strArrFileList = OpenVPNService.this.fileList();
                z = true;
            }
            int length = strArrFileList.length;
            while (i < length) {
                String str4 = strArrFileList[i];
                if (ProfileFN.has_ovpn_ext(str4)) {
                    try {
                        str2 = OpenVPNService.this.read_file(str, str4);
                    } catch (IOException unused) {
                        str2 = null;
                    }
                    try {
                        ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
                        clientAPI_Config.setContent(OpenVPNService.sanitizeOpenVpn3Profile(str2));
                        ClientAPI_EvalConfig clientAPI_EvalConfigEval_config_static = ClientAPI_OpenVPNClient.eval_config_static(clientAPI_Config);
                        if (clientAPI_EvalConfigEval_config_static.getError()) {
                            clientAPI_EvalConfigEval_config_static.getMessage();
                            str3 = str;
                        } else {
                            str3 = str;
                            add(OpenVPNService.this.new Profile(str3, str4, z, clientAPI_EvalConfigEval_config_static));
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                } else {
                    str3 = str;
                }
                i++;
                str = str3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sort() {
            Collections.sort(this, new CustomComparator(this, 0));
        }

        public void forget_certs() {
            OpenVPNService.this.jellyBeanHackPurge();
            Iterator<Profile> it = iterator();
            while (it.hasNext()) {
                it.next().forget_cert();
            }
        }

        public Profile get_profile_by_name(String str) {
            if (str == null) {
                return null;
            }
            for (Profile profile : this) {
                if (str.equals(profile.name)) {
                    return profile;
                }
            }
            return null;
        }

        public String[] profile_names() {
            String[] strArr = new String[size()];
            for (int i = 0; i < size(); i++) {
                strArr[i] = get(i).name;
            }
            return strArr;
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public class CustomComparator implements Comparator<Profile> {
            private CustomComparator() {
            }

            @Override // java.util.Comparator
            public int compare(Profile profile, Profile profile2) {
                return profile.name.compareTo(profile2.name);
            }

            public /* synthetic */ CustomComparator(ProfileList profileList, int i) {
                this();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class TunBuilder extends VpnService.Builder implements OpenVPNClientThread.TunBuilder {
        private TunBuilder() {
            super(OpenVPNService.this);
        }

        private void log_error(String str, Exception exc) {
            String string = exc.toString();
            StringBuilder sb = new StringBuilder("BUILDER_ERROR: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_add_address(String str, int i, String str2, boolean z, boolean z2) {
            try {
                String.format("BUILDER: add_address %s/%d %s ipv6=%b net30=%b", str, Integer.valueOf(i), str2, Boolean.valueOf(z), Boolean.valueOf(z2));
                addAddress(str, i);
                return true;
            } catch (Exception e) {
                log_error("tun_builder_add_address", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_add_dns_server(String str, boolean z) {
            try {
                StringBuilder sb = new StringBuilder("BUILDER: add_dns_server ");
                sb.append(str);
                sb.append(" ipv6=");
                sb.append(z);
                addDnsServer(str);
                return true;
            } catch (Exception e) {
                log_error("tun_builder_add_dns_server", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_add_route(String str, int i, boolean z) {
            try {
                String.format("BUILDER: add_route %s/%d ipv6=%b", str, Integer.valueOf(i), Boolean.valueOf(z));
                addRoute(str, i);
                return true;
            } catch (Exception e) {
                log_error("tun_builder_add_route", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_add_search_domain(String str) {
            try {
                new StringBuilder("BUILDER: add_search_domain ").append(str);
                addSearchDomain(str);
                return true;
            } catch (Exception e) {
                log_error("tun_builder_add_search_domain", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public int tun_builder_establish() {
            try {
                PendingIntent pendingIntentE = OpenVPNService.e(OpenVPNService.this);
                if (pendingIntentE != null) {
                    setConfigureIntent(pendingIntentE);
                }
                return establish().detachFd();
            } catch (Exception e) {
                this.log_error("tun_builder_establish", e);
                return -1;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_exclude_route(String str, int i, boolean z) {
            try {
                String.format("BUILDER: exclude_route %s/%d ipv6=%b", str, Integer.valueOf(i), Boolean.valueOf(z));
                if (Build.VERSION.SDK_INT >= 33) {
                    excludeRoute(new IpPrefix(InetAddress.getByName(str), i));
                }
                return true;
            } catch (Exception e) {
                log_error("tun_builder_exclude_route", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_reroute_gw(boolean z, boolean z2, long j) {
            try {
                String.format("BUILDER: reroute_gw ipv4=%b ipv6=%b flags=%d", Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j));
                if ((j & 65536) != 0) {
                    return true;
                }
                if (z) {
                    addRoute("0.0.0.0", 0);
                }
                if (!z2) {
                    return true;
                }
                addRoute("::", 0);
                return true;
            } catch (Exception e) {
                log_error("tun_builder_add_route", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_set_mtu(int i) {
            try {
                String.format("BUILDER: set_mtu %d", Integer.valueOf(i));
                setMtu(i);
                return true;
            } catch (Exception e) {
                log_error("tun_builder_set_mtu", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_set_remote_address(String str, boolean z) {
            try {
                StringBuilder sb = new StringBuilder("BUILDER: set_remote_address ");
                sb.append(str);
                sb.append(" ipv6=");
                sb.append(z);
                return true;
            } catch (Exception e) {
                log_error("tun_builder_set_remote_address", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public boolean tun_builder_set_session_name(String str) {
            try {
                new StringBuilder("BUILDER: set_session_name ").append(str);
                setSession(OpenVPNService.this.getString(R.string.app));
                if (!new ConfigUtil(OpenVPNService.this.getApplicationContext()).isUDP().booleanValue()) {
                    return true;
                }
                addDisallowedApplication(OpenVPNService.this.getPackageName());
                return true;
            } catch (Exception e) {
                log_error("tun_builder_set_session_name", e);
                return false;
            }
        }

        @Override // net.openvpn.openvpn.OpenVPNClientThread.TunBuilder
        public void tun_builder_teardown(boolean z) {
            try {
                new StringBuilder("BUILDER: teardown disconnect=").append(z);
            } catch (Exception e) {
                log_error("tun_builder_teardown", e);
            }
        }

        public /* synthetic */ TunBuilder(OpenVPNService openVPNService, int i) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class DynamicChallenge {
        public Challenge challenge;
        public String cookie;
        public long expires;

        private DynamicChallenge() {
            this.challenge = new Challenge();
        }

        public long expire_delay() {
            return this.expires - SystemClock.elapsedRealtime();
        }

        public boolean is_expired() {
            return SystemClock.elapsedRealtime() > this.expires;
        }

        public String toString() {
            return this.challenge.toString() + "/" + this.cookie + "/" + this.expires;
        }

        public /* synthetic */ DynamicChallenge(int i) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class MergedProfile extends Profile {
        public String profile_content;

        public /* synthetic */ MergedProfile(OpenVPNService openVPNService, String str, ClientAPI_EvalConfig clientAPI_EvalConfig) {
            this("imported", str, false, clientAPI_EvalConfig);
        }

        private MergedProfile(String str, String str2, boolean z, ClientAPI_EvalConfig clientAPI_EvalConfig) {
            super(str, str2, z, clientAPI_EvalConfig);
        }
    }

    public void jellyBeanHackPurge() {
    }

    private void gen_event(int i2, String str, String str2, String str3) {
        gen_event(i2, str, str2, str3, null);
    }

    private void gen_event(int i2, String str, String str2) {
        gen_event(i2, str, str2, null, null);
    }

    public static void log_message(String str) {
        LogMsg logMsg = new LogMsg();
        logMsg.line = str;
        log_message(logMsg);
    }
}
