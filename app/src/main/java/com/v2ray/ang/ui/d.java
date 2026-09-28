package com.v2ray.ang.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.service.OpenVPNService;
import com.sandok.tunnel.utils.ConfigUtil;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.viewmodel.ConfigData;
import defpackage.i5;
import defpackage.qf3;
import defpackage.yg0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements HomeFragment.EpkiPost {
    public final /* synthetic */ HomeFragment a;

    public d(HomeFragment homeFragment) {
        this.a = homeFragment;
    }

    @Override // com.v2ray.ang.ui.HomeFragment.EpkiPost
    public final void post_dispatch(String str) {
        HomeFragment homeFragment = this.a;
        if (homeFragment.o()) {
            if (homeFragment.x0) {
                ConfigData configValue = homeFragment.e0().getConfigValue();
                String defOVPNPass = configValue != null ? configValue.getDefOVPNPass() : null;
                if (defOVPNPass == null) {
                    return;
                }
                homeFragment.y0 = HomeFragment.d0();
                homeFragment.z0 = defOVPNPass;
            } else {
                Hometab.Companion companion = Hometab.n;
                String str2 = homeFragment.y0;
                if (str2 == null) {
                    str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                companion.getClass();
                homeFragment.y0 = Hometab.Companion.a(str2);
                String str3 = homeFragment.z0;
                if (str3 == null) {
                    str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                homeFragment.z0 = Hometab.Companion.a(str3);
            }
            String str4 = homeFragment.q0;
            if (str4 == null) {
                str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            ConfigUtil configUtil = homeFragment.U0;
            if (configUtil == null) {
                yg0.N("configUtil");
                throw null;
            }
            String sSHHost = configUtil.getSSHHost();
            String str5 = homeFragment.y0;
            String str6 = homeFragment.z0;
            Context contextF = homeFragment.f();
            if (contextF == null) {
                return;
            }
            Intent intentPutExtra = new Intent(contextF, (Class<?>) OpenVPNService.class).setAction(OpenVPNService.ACTION_CONNECT).putExtra("net.openvpn.openvpn.PROFILE", str4).putExtra("net.openvpn.openvpn.GUI_VERSION", "0.0").putExtra("net.openvpn.openvpn.PROXY_NAME", "proxy_name").putExtra("net.openvpn.openvpn.PROXY_USERNAME", (String) null).putExtra("net.openvpn.openvpn.PROXY_PASSWORD", (String) null).putExtra("net.openvpn.openvpn.PROXY_ALLOW_CREDS_DIALOG", true).putExtra("net.openvpn.openvpn.SERVER", sSHHost).putExtra("net.openvpn.openvpn.PROTO", "adaptive").putExtra("net.openvpn.openvpn.IPv6", "default").putExtra("net.openvpn.openvpn.CONN_TIMEOUT", "60").putExtra("net.openvpn.openvpn.USERNAME", str5).putExtra("net.openvpn.openvpn.PASSWORD", str6).putExtra("net.openvpn.openvpn.CACHE_PASSWORD", false).putExtra("net.openvpn.openvpn.PK_PASSWORD", str6).putExtra("net.openvpn.openvpn.RESPONSE", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).putExtra("net.openvpn.openvpn.EPKI_ALIAS", str).putExtra("net.openvpn.openvpn.COMPRESSION_MODE", "yes");
            intentPutExtra.getClass();
            try {
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    contextF.startService(intentPutExtra);
                } else if (i >= 26) {
                    i5.C(contextF, intentPutExtra);
                } else {
                    contextF.startService(intentPutExtra);
                }
            } catch (Exception e) {
                e.getMessage();
                Context contextF2 = homeFragment.f();
                if (contextF2 != null) {
                    qf3.L(contextF2, "Failed to start VPN service");
                }
            }
        }
    }
}
