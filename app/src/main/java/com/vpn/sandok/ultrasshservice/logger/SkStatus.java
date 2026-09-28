package com.vpn.sandok.ultrasshservice.logger;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ec1;
import defpackage.hz;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SkStatus {
    static final int MAXLOGENTRIES = 1000;
    public static final String SSH_AGUARDANDO_REDE = "AGUARDANDO";
    public static final String SSH_AUTENTICANDO = "AUTENTICANDO";
    public static final String SSH_CONECTADO = "CONECTADO";
    public static final String SSH_CONECTANDO = "CONECTANDO";
    public static final String SSH_DESCONECTADO = "DESCONECTADO";
    public static final String SSH_INICIANDO = "INICIANDO";
    public static final String SSH_PARANDO = "PARANDO";
    public static final String SSH_RECONECTANDO = "RECONECTANDO";
    private static ConnectionStatus mLastLevel = ConnectionStatus.LEVEL_NOTCONNECTED;
    private static String mLaststatemsg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private static String mLaststate = "NOPROCESS";
    private static int mLastStateresid = R.string.state_noprocess;
    private static Intent mLastIntent = null;
    static final byte[] oficialkey = {93, -72, 88, 103, -128, 115, -1, -47, 120, 113, 98, -56, 12, -56, 52, -62, 95, -2, -114, 95};
    static final byte[] oficialdebugkey = {-41, 73, 58, 102, -81, -27, -120, 45, -56, -3, 53, -49, 119, -97, -20, -80, 65, 68, -72, -22};
    private static final LinkedList<LogItem> logbuffer = new LinkedList<>();
    private static Vector<LogListener> logListener = new Vector<>();
    private static Vector<StateListener> stateListener = new Vector<>();

    /* JADX INFO: renamed from: com.vpn.sandok.ultrasshservice.logger.SkStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vpn$sandok$ultrasshservice$logger$ConnectionStatus;

        static {
            int[] iArr = new int[ConnectionStatus.values().length];
            $SwitchMap$com$vpn$sandok$ultrasshservice$logger$ConnectionStatus = iArr;
            try {
                iArr[ConnectionStatus.LEVEL_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum LogLevel {
        INFO(2),
        ERROR(-2),
        WARNING(1),
        VERBOSE(3),
        DEBUG(4);

        protected int mValue;

        LogLevel(int i) {
            this.mValue = i;
        }

        public static LogLevel getEnumByValue(int i) {
            if (i == -2) {
                return ERROR;
            }
            if (i == 1) {
                return WARNING;
            }
            if (i == 2) {
                return INFO;
            }
            if (i == 3) {
                return VERBOSE;
            }
            if (i != 4) {
                return null;
            }
            return DEBUG;
        }

        public int getInt() {
            return this.mValue;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface LogListener {
        void newLog(LogItem logItem);

        void onClear();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface StateListener {
        void updateState(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent);
    }

    static {
        logInformation();
    }

    public static synchronized String CopyLogs() {
        return logbuffer.toString();
    }

    public static synchronized void addLogListener(LogListener logListener2) {
        if (!logListener.contains(logListener2)) {
            logListener.add(logListener2);
        }
    }

    public static synchronized void addStateListener(StateListener stateListener2) {
        if (!stateListener.contains(stateListener2)) {
            stateListener.add(stateListener2);
            String str = mLaststate;
            if (str != null) {
                stateListener2.updateState(str, mLaststatemsg, mLastStateresid, mLastLevel, mLastIntent);
            }
        }
    }

    public static synchronized void clearLog() {
        logbuffer.clear();
        logInformation();
        Iterator<LogListener> it = logListener.iterator();
        while (it.hasNext()) {
            it.next().onClear();
        }
    }

    public static String getLastCleanLogMessage(Context context) {
        String strConcat = mLaststatemsg;
        if (AnonymousClass1.$SwitchMap$com$vpn$sandok$ultrasshservice$logger$ConnectionStatus[mLastLevel.ordinal()] == 1) {
            String[] strArrSplit = mLaststatemsg.split(",");
            if (strArrSplit.length >= 7) {
                Locale locale = Locale.US;
                strConcat = strArrSplit[1] + " " + strArrSplit[6];
            }
        }
        while (strConcat.endsWith(",")) {
            strConcat = strConcat.substring(0, strConcat.length() - 1);
        }
        String str = mLaststate;
        if (str.equals("NOPROCESS")) {
            return strConcat;
        }
        int i = mLastStateresid;
        if (i == R.string.state_waitconnectretry) {
            return context.getString(R.string.state_waitconnectretry, mLaststatemsg);
        }
        String string = context.getString(i);
        if (mLastStateresid == R.string.unknown_state) {
            strConcat = str.concat(strConcat);
        }
        if (strConcat.length() > 0) {
            string = hz.t(string, ": ");
        }
        return hz.t(string, strConcat);
    }

    public static String getLastState() {
        return mLaststate;
    }

    private static ConnectionStatus getLevel(String str) {
        String[] strArr = {SSH_INICIANDO, SSH_CONECTANDO, SSH_AGUARDANDO_REDE, SSH_RECONECTANDO, "RESOLVE", "TCP_CONNECT"};
        String[] strArr2 = {SSH_AUTENTICANDO, "GET_CONFIG", "ASSIGN_IP", "ADD_ROUTES", "AUTH_PENDING"};
        String[] strArr3 = {SSH_CONECTADO};
        String[] strArr4 = {SSH_DESCONECTADO};
        for (int i = 0; i < 6; i++) {
            if (str.equals(strArr[i])) {
                return ConnectionStatus.LEVEL_CONNECTING_NO_SERVER_REPLY_YET;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (str.equals(strArr2[i2])) {
                return ConnectionStatus.LEVEL_CONNECTING_SERVER_REPLIED;
            }
        }
        return str.equals(strArr3[0]) ? ConnectionStatus.LEVEL_CONNECTED : str.equals(strArr4[0]) ? ConnectionStatus.LEVEL_NOTCONNECTED : ConnectionStatus.UNKNOWN_LEVEL;
    }

    public static int getLocalizedState(String str) {
        str.getClass();
        switch (str) {
            case "AGUARDANDO":
                return R.string.state_nonetwork;
            case "RECONECTANDO":
                return R.string.state_reconnecting;
            case "AUTH_PENDING":
                return R.string.state_auth_pending;
            case "DESCONECTADO":
                return R.string.state_disconnected;
            case "GET_CONFIG":
                return R.string.state_get_config;
            case "ASSIGN_IP":
                return R.string.state_assign_ip;
            case "PARANDO":
                return R.string.state_stopping;
            case "AUTENTICANDO":
                return R.string.state_auth;
            case "TCP_CONNECT":
                return R.string.state_tcp_connect;
            case "CONECTANDO":
                return R.string.state_connecting;
            case "ADD_ROUTES":
                return R.string.state_add_routes;
            case "RESOLVE":
                return R.string.state_resolve;
            case "CONECTADO":
                return R.string.state_connected;
            case "INICIANDO":
                return R.string.state_starting;
            default:
                return R.string.unknown_state;
        }
    }

    public static synchronized LogItem[] getlogbuffer() {
        LinkedList<LogItem> linkedList;
        linkedList = logbuffer;
        return (LogItem[]) linkedList.toArray(new LogItem[linkedList.size()]);
    }

    public static boolean isTunnelActive() {
        return (mLastLevel == ConnectionStatus.LEVEL_AUTH_FAILED || mLastLevel == ConnectionStatus.LEVEL_NOTCONNECTED) ? false : true;
    }

    public static void logDebug(String str) {
        newLogItem(new LogItem(LogLevel.DEBUG, str));
    }

    public static void logError(String str) {
        newLogItem(new LogItem(LogLevel.ERROR, str));
    }

    public static void logException(LogLevel logLevel, String str, Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        newLogItem(str != null ? new LogItem(logLevel, ec1.L(str, ": ", exc.getMessage(), ", ", stringWriter.toString())) : new LogItem(logLevel, hz.v("Erro: ", exc.getMessage(), ", ", stringWriter.toString())));
    }

    public static void logInfo(String str) {
        newLogItem(new LogItem(LogLevel.INFO, str));
    }

    private static void logInformation() {
        logInfo(R.string.mobile_info, Build.MODEL, Build.BOARD, Build.BRAND, Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE);
        logInfo(R.string.app_mobile_info, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static void logWarning(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.WARNING, i, objArr));
    }

    public static synchronized void newLogItem(LogItem logItem, boolean z) {
        LinkedList<LogItem> linkedList;
        try {
            if (z) {
                linkedList = logbuffer;
                linkedList.addFirst(logItem);
            } else {
                linkedList = logbuffer;
                linkedList.addLast(logItem);
            }
            if (linkedList.size() > 1500) {
                while (true) {
                    LinkedList<LogItem> linkedList2 = logbuffer;
                    if (linkedList2.size() <= 1000) {
                        break;
                    } else {
                        linkedList2.removeFirst();
                    }
                }
            }
            Iterator<LogListener> it = logListener.iterator();
            while (it.hasNext()) {
                it.next().newLog(logItem);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void removeLogListener(LogListener logListener2) {
        if (logListener.contains(logListener2)) {
            logListener.remove(logListener2);
        }
    }

    public static synchronized void removeStateListener(StateListener stateListener2) {
        if (stateListener.contains(stateListener2)) {
            stateListener.remove(stateListener2);
        }
    }

    public static synchronized void updateStateString(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
        if (mLastLevel == ConnectionStatus.LEVEL_CONNECTED && str.equals(SSH_AUTENTICANDO)) {
            newLogItem(new LogItem(LogLevel.DEBUG, "Ignoring SocksHttp Status in CONNECTED state (" + str + "->" + connectionStatus.toString() + "): " + str2));
            return;
        }
        mLaststate = str;
        mLaststatemsg = str2;
        mLastStateresid = i;
        mLastLevel = connectionStatus;
        mLastIntent = intent;
        Iterator<StateListener> it = stateListener.iterator();
        while (it.hasNext()) {
            String str3 = str;
            String str4 = str2;
            int i2 = i;
            ConnectionStatus connectionStatus2 = connectionStatus;
            Intent intent2 = intent;
            it.next().updateState(str3, str4, i2, connectionStatus2, intent2);
            str = str3;
            str2 = str4;
            i = i2;
            connectionStatus = connectionStatus2;
            intent = intent2;
        }
    }

    public static void logDebug(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.DEBUG, i, objArr));
    }

    public static void logError(int i) {
        newLogItem(new LogItem(LogLevel.ERROR, i));
    }

    public static void logInfo(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.INFO, i, objArr));
    }

    public static void logWarning(String str) {
        newLogItem(new LogItem(LogLevel.WARNING, str));
    }

    public static void logError(int i, Object... objArr) {
        newLogItem(new LogItem(LogLevel.ERROR, i, objArr));
    }

    public static void logException(String str, Exception exc) {
        logException(LogLevel.ERROR, str, exc);
    }

    public static void logException(Exception exc) {
        logException(LogLevel.ERROR, null, exc);
    }

    public static void newLogItem(LogItem logItem) {
        newLogItem(logItem, false);
    }

    public static synchronized void updateStateString(String str, String str2, int i, ConnectionStatus connectionStatus) {
        updateStateString(str, str2, i, connectionStatus, null);
    }

    public static void updateStateString(String str, String str2) {
        updateStateString(str, str2, getLocalizedState(str), getLevel(str));
    }
}
