package com.vpn.sandok.ultrasshservice.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.vpn.sandok.ultrasshservice.util.securepreferences.SecurePreferences;
import com.vpn.sandok.ultrasshservice.util.securepreferences.model.SecurityConfig;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Settings implements SettingsConstants {
    private static SecurityConfig minimumConfig = new SecurityConfig.Builder("fubgf777gf6").build();
    private Context mContext;
    private SharedPreferences mPrefs;
    private SecurePreferences mPrefsPrivate;

    public Settings(Context context) {
        this.mContext = context;
        this.mPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        this.mPrefsPrivate = SecurePreferences.getInstance(this.mContext, "SecureData", minimumConfig);
    }

    public static void clearSettings(Context context) {
        SharedPreferences.Editor editorEdit = SecurePreferences.getInstance(context, "SecureData", minimumConfig).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public static void setDefaultConfig(Context context) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putBoolean(SettingsConstants.DNSFORWARD_KEY, false);
        editorEdit.putBoolean(SettingsConstants.VIBRATE, false);
        editorEdit.putString(SettingsConstants.DNSRESOLVER_KEY, "8.8.8.8");
        editorEdit.putString(SettingsConstants.DNSRESOLVER_KEY2, "8.8.4.4");
        editorEdit.putBoolean(SettingsConstants.UDPFORWARD_KEY, true);
        editorEdit.putString(SettingsConstants.UDPRESOLVER_KEY, "127.0.0.1:7300");
        editorEdit.putString(SettingsConstants.MODO_NOTURNO_KEY, "off");
        editorEdit.putString(SettingsConstants.PINGER_KEY, "3");
        editorEdit.putString(SettingsConstants.MAXIMO_THREADS_KEY, "8th");
        editorEdit.remove(SettingsConstants.MODO_DEBUG_KEY);
        editorEdit.remove(SettingsConstants.AUTO_CLEAR_LOGS_KEY);
        editorEdit.remove(SettingsConstants.FILTER_APPS);
        editorEdit.remove(SettingsConstants.FILTER_BYPASS_MODE);
        editorEdit.remove(SettingsConstants.FILTER_APPS_LIST);
        editorEdit.remove(SettingsConstants.TETHERING_SUBNET);
        editorEdit.remove(SettingsConstants.DISABLE_DELAY_KEY);
        editorEdit.commit();
    }

    public boolean getAutoClearLog() {
        return this.mPrefs.getBoolean(SettingsConstants.AUTO_CLEAR_LOGS_KEY, true);
    }

    public boolean getBypass() {
        return this.mPrefs.getBoolean(SettingsConstants.BYPASS_KEY, false);
    }

    public String[] getFilterApps() {
        String string = this.mPrefs.getString(SettingsConstants.FILTER_APPS_LIST, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        return string.isEmpty() ? new String[0] : string.split("\n");
    }

    public String getIdioma() {
        return this.mPrefs.getString(SettingsConstants.IDIOMA_KEY, "default");
    }

    public boolean getIsDisabledDelaySSH() {
        return this.mPrefs.getBoolean(SettingsConstants.DISABLE_DELAY_KEY, false);
    }

    public boolean getIsFilterApps() {
        return this.mPrefs.getBoolean(SettingsConstants.FILTER_APPS, false);
    }

    public boolean getIsFilterBypassMode() {
        return this.mPrefs.getBoolean(SettingsConstants.FILTER_BYPASS_MODE, false);
    }

    public boolean getIsTetheringSubnet() {
        return this.mPrefs.getBoolean(SettingsConstants.TETHERING_SUBNET, false);
    }

    public int getMaximoThreadsSocks() {
        String str = "8th";
        String string = this.mPrefs.getString(SettingsConstants.MAXIMO_THREADS_KEY, "8th");
        if (string != null && !string.isEmpty()) {
            str = string;
        }
        return Integer.parseInt(str.replace("th", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    public String getMensagemConfigExportar() {
        return this.mPrefs.getString(SettingsConstants.CONFIG_MENSAGEM_EXPORTAR_KEY, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public boolean getModoDebug() {
        return this.mPrefs.getBoolean(SettingsConstants.MODO_DEBUG_KEY, false);
    }

    public String getModoNoturno() {
        return this.mPrefs.getString(SettingsConstants.MODO_NOTURNO_KEY, "off");
    }

    public SecurePreferences getPrefsPrivate() {
        return this.mPrefsPrivate;
    }

    public String getPrivString(String str) {
        str.getClass();
        return this.mPrefsPrivate.getString(str, !str.equals(SettingsConstants.PORTA_LOCAL_KEY) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "1080");
    }

    public String getSSHKeypath() {
        return this.mPrefs.getString(SettingsConstants.KEYPATH_KEY, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public int getSSHPinger() {
        String str = "3";
        String string = this.mPrefs.getString(SettingsConstants.PINGER_KEY, "3");
        if (string != null && !string.isEmpty()) {
            str = string;
        }
        return Integer.parseInt(str);
    }

    public boolean getVpnDnsForward() {
        return this.mPrefs.getBoolean(SettingsConstants.DNSFORWARD_KEY, true);
    }

    public String getVpnDnsResolver() {
        return this.mPrefs.getString(SettingsConstants.DNSRESOLVER_KEY, "8.8.8.8");
    }

    public String getVpnDnsResolver2() {
        return this.mPrefs.getString(SettingsConstants.DNSRESOLVER_KEY2, "8.8.4.4");
    }

    public boolean getVpnUdpForward() {
        return this.mPrefs.getBoolean(SettingsConstants.UDPFORWARD_KEY, true);
    }

    public String getVpnUdpResolver() {
        return this.mPrefs.getString(SettingsConstants.UDPRESOLVER_KEY, "127.0.0.1:7300");
    }

    public void setBypass(boolean z) {
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putBoolean(SettingsConstants.BYPASS_KEY, z);
        editorEdit.commit();
    }

    public void setIdioma(String str) {
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putString(SettingsConstants.IDIOMA_KEY, str);
        editorEdit.commit();
    }

    public void setMensagemConfigExportar(String str) {
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putString(SettingsConstants.CONFIG_MENSAGEM_EXPORTAR_KEY, str);
        editorEdit.commit();
    }

    public void setModoDebug(boolean z) {
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putBoolean(SettingsConstants.MODO_DEBUG_KEY, z);
        editorEdit.commit();
    }

    public void setModoNoturno(String str) {
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putString(SettingsConstants.MODO_NOTURNO_KEY, str);
        editorEdit.commit();
    }

    public void setVpnDnsForward(boolean z) {
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putBoolean(SettingsConstants.DNSFORWARD_KEY, z);
        editorEdit.commit();
    }

    public void setVpnDnsResolver(String str) {
        if (str == null || str.isEmpty()) {
            str = "8.8.8.8";
        }
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putString(SettingsConstants.DNSRESOLVER_KEY, str);
        editorEdit.commit();
    }

    public void setVpnDnsResolver2(String str) {
        if (str == null || str.isEmpty()) {
            str = "8.8.4.4";
        }
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putString(SettingsConstants.DNSRESOLVER_KEY2, str);
        editorEdit.commit();
    }

    public void setVpnUdpForward(boolean z) {
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putBoolean(SettingsConstants.UDPFORWARD_KEY, z);
        editorEdit.commit();
    }

    public void setVpnUdpResolver(String str) {
        if (str == null || str.isEmpty()) {
            str = "127.0.0.1:7300";
        }
        SharedPreferences.Editor editorEdit = this.mPrefs.edit();
        editorEdit.putString(SettingsConstants.UDPRESOLVER_KEY, str);
        editorEdit.commit();
    }
}
