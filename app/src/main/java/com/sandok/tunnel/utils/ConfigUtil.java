package com.sandok.tunnel.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.Hometab;
import defpackage.p60;
import defpackage.ul1;
import kotlin.text.Regex;
import libv2ray.Libv2ray;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigUtil {
    public static final int DIRECT_WITH_PAYLOAD = 1;
    public static final int HTTP_PROXY = 2;
    public static final int MODE_UDP = 6;
    public static final int MODE_V2RAY = 7;
    public static final int OVPN_DIRECT_TCP = 0;
    public static final int OVPN_DIRECT_UDP = 8;
    public static final int SSL_DIRECT = 3;
    public static final int SSL_DIRECT_WITH_PAYLOAD = 4;
    public static final int SSL_HTTP_PROXY = 5;
    private static ConfigUtil instance;
    private SharedPreferences.Editor editor;
    private SharedPreferences prefs;

    public ConfigUtil(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.prefs = defaultSharedPreferences;
        this.editor = defaultSharedPreferences.edit();
    }

    public static ConfigUtil getInstance(Context context) {
        ConfigUtil configUtil = instance;
        if (configUtil != null) {
            return configUtil;
        }
        ConfigUtil configUtil2 = new ConfigUtil(context);
        instance = configUtil2;
        return configUtil2;
    }

    public static String hide(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(Marker.ANY_MARKER);
        }
        return sb.toString();
    }

    public String getNetworkSelectedName() {
        return this.prefs.getString("NETWORK_SELECTED_NAME", "Select Tweaks");
    }

    public String getPayload() {
        try {
            String string = this.prefs.getString("HTTP_PAYLOAD", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            Hometab.n.getClass();
            return Hometab.Companion.a(string);
        } catch (Exception e) {
            p60.l(e);
            return null;
        }
    }

    public String getProxy() {
        try {
            String string = this.prefs.getString("PROXY_HOST", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            Hometab.n.getClass();
            return Hometab.Companion.a(string);
        } catch (Exception e) {
            p60.l(e);
            return null;
        }
    }

    public String getProxyPort() {
        return this.prefs.getString("PROXY_PORT", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public String getSSHHost() {
        String string = this.prefs.getString("SSH_HOST", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        Hometab.n.getClass();
        return Hometab.Companion.a(string);
    }

    public String getSSHPortString() {
        return this.prefs.getString("SSH_PORT", "443");
    }

    public String getSSLPort() {
        return this.prefs.getString("SSL_PORT", "443");
    }

    public String getServerSelectedName() {
        return this.prefs.getString("SERVER_SELECTED_NAME", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public String getSni() {
        try {
            String string = this.prefs.getString("SNI", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            Hometab.n.getClass();
            return Hometab.Companion.a(string);
        } catch (Exception e) {
            p60.l(e);
            return null;
        }
    }

    public int getTunnelType() {
        return this.prefs.getInt("TUNNEL_TYPE", 0);
    }

    public Boolean isUDP() {
        return Boolean.valueOf(this.prefs.getBoolean("isUDPSet", false));
    }

    public void setNetworkSelectedName(String str) {
        this.editor.putString("NETWORK_SELECTED_NAME", str).apply();
    }

    public void setPayload(String str) throws Exception {
        SharedPreferences.Editor editor = this.editor;
        Regex regex = ul1.a;
        str.getClass();
        try {
            String strEo = Libv2ray.eo(str);
            strEo.getClass();
            str = strEo;
        } catch (Throwable unused) {
        }
        editor.putString("HTTP_PAYLOAD", str).apply();
    }

    public void setProxy(String str) {
        SharedPreferences.Editor editor = this.editor;
        Regex regex = ul1.a;
        str.getClass();
        try {
            String strEo = Libv2ray.eo(str);
            strEo.getClass();
            str = strEo;
        } catch (Throwable unused) {
        }
        editor.putString("PROXY_HOST", str).apply();
    }

    public void setProxyPort(String str) {
        this.editor.putString("PROXY_PORT", str).apply();
    }

    public void setSSHHost(String str) {
        try {
            SharedPreferences.Editor editor = this.editor;
            Regex regex = ul1.a;
            str.getClass();
            try {
                String strEo = Libv2ray.eo(str);
                strEo.getClass();
                str = strEo;
            } catch (Throwable unused) {
            }
            editor.putString("SSH_HOST", str).apply();
        } catch (Exception e) {
            p60.l(e);
        }
    }

    public void setSSHPortString(String str) {
        this.editor.putString("SSH_PORT", str).apply();
    }

    public void setSSLPort(String str) {
        this.editor.putString("SSL_PORT", str).apply();
    }

    public void setServerSelectedName(String str) {
        this.editor.putString("SERVER_SELECTED_NAME", str).apply();
    }

    public void setSni(String str) {
        try {
            SharedPreferences.Editor editor = this.editor;
            Regex regex = ul1.a;
            str.getClass();
            try {
                String strEo = Libv2ray.eo(str);
                strEo.getClass();
                str = strEo;
            } catch (Throwable unused) {
            }
            editor.putString("SNI", str).apply();
        } catch (Exception e) {
            p60.l(e);
        }
    }

    public void setTunnelType(int i) {
        this.editor.putInt("TUNNEL_TYPE", i).apply();
    }

    public void setUdp(boolean z) {
        this.editor.putBoolean("isUDPSet", z).apply();
    }
}
