package com.vpn.sandok.ultrasshservice;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.c;
import androidx.appcompat.app.AppCompatActivity;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.utils.ConfigUtil;
import com.vpn.sandok.ultrasshservice.config.Settings;
import com.vpn.sandok.ultrasshservice.config.SettingsConstants;
import com.vpn.sandok.ultrasshservice.logger.ConnectionStatus;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerHelper;
import com.vpn.sandok.ultrasshservice.tunnel.TunnelUtils;
import com.vpn.sandok.ultrasshservice.util.securepreferences.SecurePreferences;
import defpackage.n8;
import defpackage.wl0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class LaunchVpn extends AppCompatActivity {
    public static final String CLEARLOG = "clearlogconnect";
    public static final String EXTRA_HIDELOG = "com.vpn.sandok.showNoLogWindow";
    private static final int START_VPN_PROFILE = 71;
    private Settings mConfig;
    private String mTransientAuthPW;
    private boolean mhideLog = false;
    private boolean isMostrarSenha = false;

    private void launchVPN() {
        Intent intentPrepare = VpnService.prepare(this);
        if (intentPrepare == null) {
            onActivityResult(START_VPN_PROFILE, -1, null);
            return;
        }
        SkStatus.updateStateString("USER_VPN_PERMISSION", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.state_user_vpn_permission, ConnectionStatus.LEVEL_WAITING_FOR_USER_INPUT);
        try {
            startActivityForResult(intentPrepare, START_VPN_PROFILE);
        } catch (ActivityNotFoundException unused) {
            SkStatus.logError(R.string.no_vpn_support_image);
            showLogWindow();
        }
    }

    private void showLogWindow() {
        wl0.a(this).c(new Intent("com.vpn.sandok:openLogs"));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == START_VPN_PROFILE) {
            if (i2 != -1) {
                if (i2 == 0) {
                    SkStatus.updateStateString("USER_VPN_PERMISSION_CANCELLED", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.state_user_vpn_permission_cancelled, ConnectionStatus.LEVEL_NOTCONNECTED);
                    if (Build.VERSION.SDK_INT >= 24) {
                        SkStatus.logError(R.string.nought_alwayson_warning);
                    }
                    Toast.makeText(this, "Cancelled", 0).show();
                    finish();
                    return;
                }
                return;
            }
            SecurePreferences prefsPrivate = this.mConfig.getPrefsPrivate();
            if (prefsPrivate.getInt(SettingsConstants.TUNNELTYPE_KEY, 1) == 7) {
                TunnelManagerHelper.startSocksHttp(this);
                finish();
                return;
            }
            if (!TunnelUtils.isNetworkOnline(this)) {
                SkStatus.updateStateString("USER_VPN_PASSWORD_CANCELLED", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.state_user_vpn_password_cancelled, ConnectionStatus.LEVEL_NOTCONNECTED);
                Toast.makeText(this, "Please connect to the internet", 0).show();
                finish();
                return;
            }
            if (prefsPrivate.getInt(SettingsConstants.TUNNELTYPE_KEY, 1) == 2 && (this.mConfig.getPrivString(SettingsConstants.PROXY_IP_KEY).isEmpty() || this.mConfig.getPrivString(SettingsConstants.PROXY_PORTA_KEY).isEmpty())) {
                SkStatus.updateStateString("USER_VPN_PASSWORD_CANCELLED", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.state_user_vpn_password_cancelled, ConnectionStatus.LEVEL_NOTCONNECTED);
                Toast.makeText(this, "Invalid proxy", 0).show();
                finish();
                return;
            }
            if (!prefsPrivate.getBoolean(SettingsConstants.PROXY_USAR_DEFAULT_PAYLOAD, true) && ConfigUtil.getInstance(this).getPayload().isEmpty()) {
                SkStatus.updateStateString("USER_VPN_PASSWORD_CANCELLED", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.state_user_vpn_password_cancelled, ConnectionStatus.LEVEL_NOTCONNECTED);
                Toast.makeText(this, "Payload cannot be empty", 0).show();
                finish();
                return;
            }
            if (ConfigUtil.getInstance(this).getSSHHost().isEmpty() || this.mConfig.getPrivString(SettingsConstants.SERVIDOR_PORTA_KEY).isEmpty()) {
                SkStatus.updateStateString("USER_VPN_PASSWORD_CANCELLED", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.state_user_vpn_password_cancelled, ConnectionStatus.LEVEL_NOTCONNECTED);
                Toast.makeText(this, "Configure correctly to start", 0).show();
                finish();
            } else {
                if (this.mConfig.getPrivString(SettingsConstants.USUARIO_KEY).isEmpty() || (this.mConfig.getPrivString(SettingsConstants.SENHA_KEY).isEmpty() && ((str = this.mTransientAuthPW) == null || str.isEmpty()))) {
                    SkStatus.updateStateString("USER_VPN_PASSWORD", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, R.string.state_user_vpn_password, ConnectionStatus.LEVEL_WAITING_FOR_USER_INPUT);
                    Toast.makeText(this, "Waiting for user VPN password", 0).show();
                    this.mConfig.getPrivString(SettingsConstants.USUARIO_KEY);
                    finish();
                    return;
                }
                if (!this.mhideLog) {
                    showLogWindow();
                }
                TunnelManagerHelper.startSocksHttp(this);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.launchvpn);
        n8.c(this);
        this.mConfig = new Settings(this);
        startVpnFromIntent();
    }

    public void startVpnFromIntent() {
        Intent intent = getIntent();
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            if (this.mConfig.getAutoClearLog()) {
                SkStatus.clearLog();
            }
            this.mhideLog = intent.getBooleanExtra(EXTRA_HIDELOG, false);
            launchVPN();
        }
    }
}
