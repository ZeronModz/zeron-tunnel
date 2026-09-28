package com.v2ray.ang.service;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.tencent.mmkv.MMKV;
import com.v2ray.ang.AppConfig;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.RulesetItem;
import com.v2ray.ang.dto.V2rayConfig;
import com.v2ray.ang.service.V2RayVpnService;
import com.v2ray.ang.util.MyContextWrapper;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelConstants;
import defpackage.aj0;
import defpackage.bm1;
import defpackage.cu0;
import defpackage.he1;
import defpackage.hv;
import defpackage.hz;
import defpackage.l71;
import defpackage.lv;
import defpackage.oy;
import defpackage.ul1;
import defpackage.xu;
import defpackage.yg0;
import defpackage.yq0;
import defpackage.zq0;
import defpackage.zr;
import java.util.Objects;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlin.text.g;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/service/V2RayVpnService;", "Landroid/net/VpnService;", "Lcom/v2ray/ang/service/ServiceControl;", "<init>", "()V", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class V2RayVpnService extends VpnService implements ServiceControl {
    public static final /* synthetic */ int h = 0;
    public ParcelFileDescriptor a;
    public boolean b;
    public Process c;
    public final Lazy d = c.b(new yq0(25));
    public final Lazy e;
    public final Lazy f;
    public PowerManager.WakeLock g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/v2ray/ang/service/V2RayVpnService$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "VPN_MTU", "I", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PRIVATE_VLAN4_CLIENT", "Ljava/lang/String;", "PRIVATE_VLAN4_ROUTER", "PRIVATE_VLAN6_CLIENT", "PRIVATE_VLAN6_ROUTER", "TUN2SOCKS", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public V2RayVpnService() {
        final int i = 0;
        this.e = c.b(new Function0(this) { // from class: am1
            public final /* synthetic */ V2RayVpnService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                V2RayVpnService v2RayVpnService = this.b;
                switch (i2) {
                    case 0:
                        int i3 = V2RayVpnService.h;
                        Object systemService = v2RayVpnService.getSystemService("connectivity");
                        systemService.getClass();
                        return (ConnectivityManager) systemService;
                    default:
                        int i4 = V2RayVpnService.h;
                        return new bm1(v2RayVpnService);
                }
            }
        });
        final int i2 = 1;
        this.f = c.b(new Function0(this) { // from class: am1
            public final /* synthetic */ V2RayVpnService b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                V2RayVpnService v2RayVpnService = this.b;
                switch (i22) {
                    case 0:
                        int i3 = V2RayVpnService.h;
                        Object systemService = v2RayVpnService.getSystemService("connectivity");
                        systemService.getClass();
                        return (ConnectivityManager) systemService;
                    default:
                        int i4 = V2RayVpnService.h;
                        return new bm1(v2RayVpnService);
                }
            }
        });
    }

    public final void a() {
        Regex regex = ul1.a;
        Lazy lazy = zq0.a;
        ArrayList arrayListJ = kotlin.collections.c.j(new File(getApplicationContext().getApplicationInfo().nativeLibraryDir, "libtun2socks.so").getAbsolutePath(), "--netif-ipaddr", "10.10.14.2", "--netif-netmask", "255.255.255.252", "--socks-server-addr", hz.o(ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port")), "127.0.0.1:"), "--tunmtu", "1500", "--sock-path", "sock_path", "--enable-udprelay", "--loglevel", "notice");
        if (zq0.z().b("pref_prefer_ipv6", false)) {
            arrayListJ.add("--netif-ip6addr");
            arrayListJ.add("fc00::10:10:14:2");
        }
        if (zq0.z().b("pref_local_dns_enabled", false)) {
            int iY = ul1.y(Integer.parseInt("10853"), zq0.z().d("pref_local_dns_port"));
            arrayListJ.add("--dnsgw");
            arrayListJ.add("127.0.0.1:" + iY);
        }
        arrayListJ.toString();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(arrayListJ);
            processBuilder.redirectErrorStream(true);
            Process processStart = processBuilder.directory(getApplicationContext().getFilesDir()).start();
            processStart.getClass();
            this.c = processStart;
            new Thread(new he1(this, 2)).start();
            Process process = this.c;
            if (process == null) {
                yg0.N("process");
                throw null;
            }
            Objects.toString(process);
            b();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ContextWrapper contextWrapperA;
        if (context != null) {
            MyContextWrapper.Companion companion = MyContextWrapper.a;
            Locale localeB = l71.b();
            companion.getClass();
            contextWrapperA = MyContextWrapper.Companion.a(context, localeB);
        } else {
            contextWrapperA = null;
        }
        super.attachBaseContext(contextWrapperA);
    }

    public final void b() {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor == null) {
            yg0.N("mInterface");
            throw null;
        }
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        String absolutePath = new File(getApplicationContext().getFilesDir(), "sock_path").getAbsolutePath();
        lv lvVar = oy.a;
        kotlinx.coroutines.c.d(zr.a(hv.c), null, null, new V2RayVpnService$sendFd$1(absolutePath, fileDescriptor, null), 3);
    }

    public final void c() throws PackageManager.NameNotFoundException {
        String strX;
        ProfileItem profileItemE;
        Boolean boolValueOf;
        boolean zA;
        List<String> ip;
        boolean z;
        ArrayList<String> ip2;
        ParcelFileDescriptor parcelFileDescriptor;
        VpnService.Builder builderAddDisallowedApplication;
        if (VpnService.prepare(this) != null) {
            return;
        }
        VpnService.Builder builder = new VpnService.Builder(this);
        builder.setMtu(TunnelConstants.VPN_INTERFACE_MTU);
        builder.addAddress("10.10.14.1", 30);
        Lazy lazy = zq0.a;
        String strD = zq0.z().d("pref_vpn_bypass_lan");
        if (strD == null) {
            strD = "0";
        }
        if (strD.equals("1")) {
            zA = true;
            break;
        }
        if (strD.equals("2") || (strX = zq0.x()) == null || (profileItemE = zq0.e(strX)) == null) {
            zA = false;
        } else if (profileItemE.getConfigType() == EConfigType.CUSTOM) {
            String strD2 = ((MMKV) zq0.c.getValue()).d(strX);
            if (strD2 != null) {
                ArrayList<V2rayConfig.RoutingBean.RulesBean> rules = ((V2rayConfig) aj0.a(V2rayConfig.class, strD2)).getRouting().getRules();
                ArrayList<V2rayConfig.RoutingBean.RulesBean> arrayList = new ArrayList();
                for (Object obj : rules) {
                    if (yg0.a(((V2rayConfig.RoutingBean.RulesBean) obj).getOutboundTag(), "direct")) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (V2rayConfig.RoutingBean.RulesBean rulesBean : arrayList) {
                        ArrayList<String> domain = rulesBean.getDomain();
                        if ((domain != null && domain.contains("geosite:private")) || ((ip2 = rulesBean.getIp()) != null && ip2.contains("geoip:private"))) {
                            zA = true;
                            break;
                        }
                    }
                }
            }
            zA = false;
        } else {
            ArrayList arrayListC = zq0.c();
            if (arrayListC != null) {
                ArrayList<RulesetItem> arrayList2 = new ArrayList();
                for (Object obj2 : arrayListC) {
                    RulesetItem rulesetItem = (RulesetItem) obj2;
                    if (rulesetItem.getEnabled() && yg0.a(rulesetItem.getOutboundTag(), "direct")) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    z = false;
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    for (RulesetItem rulesetItem2 : arrayList2) {
                        List<String> domain2 = rulesetItem2.getDomain();
                        if ((domain2 != null && domain2.contains("geosite:private")) || ((ip = rulesetItem2.getIp()) != null && ip.contains("geoip:private"))) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    boolValueOf = Boolean.valueOf(z);
                }
            } else {
                boolValueOf = null;
            }
            zA = yg0.a(boolValueOf, Boolean.TRUE);
        }
        if (zA) {
            AppConfig.a.getClass();
            Iterator it = AppConfig.h.iterator();
            while (it.hasNext()) {
                List listP = g.P(new char[]{'/'}, (String) it.next());
                builder.addRoute((String) listP.get(0), Integer.parseInt((String) listP.get(1)));
            }
        } else {
            builder.addRoute("0.0.0.0", 0).getClass();
        }
        Lazy lazy2 = zq0.a;
        if (zq0.z().b("pref_prefer_ipv6", false)) {
            builder.addAddress("fc00::10:10:14:1", 126);
            if (zA) {
                builder.addRoute("2000::", 3);
            } else {
                builder.addRoute("::", 0);
            }
        }
        String strD3 = zq0.z().d("pref_vpn_dns");
        if (strD3 == null) {
            strD3 = "1.1.1.1";
        }
        List listO = g.O(strD3, new String[]{","}, 6);
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj3 : listO) {
            Regex regex = ul1.a;
            if (ul1.u((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        for (String str : arrayList3) {
            Regex regex2 = ul1.a;
            if (ul1.u(str)) {
                builder.addDnsServer(str);
            }
        }
        CoreController coreController = b.a;
        ProfileItem profileItem = b.c;
        String remarks = profileItem != null ? profileItem.getRemarks() : null;
        if (remarks == null) {
            remarks = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        builder.setSession(remarks);
        Lazy lazy3 = zq0.a;
        if (zq0.z().b("pref_per_app_proxy", false)) {
            Set<String> setF = zq0.z().f("pref_per_app_proxy_set", null);
            boolean zB = zq0.z().b("pref_bypass_apps", false);
            if (zB) {
                if (setF != null) {
                    setF.add("dev.zeron.tunnel");
                }
            } else if (setF != null) {
                setF.remove("dev.zeron.tunnel");
            }
            if (setF != null) {
                for (String str2 : setF) {
                    if (zB) {
                        try {
                            builderAddDisallowedApplication = builder.addDisallowedApplication(str2);
                        } catch (PackageManager.NameNotFoundException e) {
                            e.getLocalizedMessage();
                        }
                    } else {
                        builderAddDisallowedApplication = builder.addAllowedApplication(str2);
                    }
                    builderAddDisallowedApplication.getClass();
                }
            }
        } else {
            builder.addDisallowedApplication("dev.zeron.tunnel");
        }
        try {
            parcelFileDescriptor = this.a;
        } catch (Exception unused) {
        }
        if (parcelFileDescriptor == null) {
            yg0.N("mInterface");
            throw null;
        }
        parcelFileDescriptor.close();
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setMetered(false);
            Lazy lazy4 = zq0.a;
            if (zq0.z().b("pref_append_http_proxy", false)) {
                Regex regex3 = ul1.a;
                builder.setHttpProxy(ProxyInfo.buildDirectProxy("127.0.0.1", ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port"))));
            }
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorEstablish = builder.establish();
            parcelFileDescriptorEstablish.getClass();
            this.a = parcelFileDescriptorEstablish;
            this.b = true;
            a();
        } catch (Exception unused2) {
            d(true);
        }
    }

    public final void d(boolean z) {
        Process process;
        this.b = false;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                ((ConnectivityManager) this.e.getValue()).unregisterNetworkCallback((bm1) this.f.getValue());
            } catch (Exception unused) {
            }
        }
        try {
            process = this.c;
        } catch (Exception unused2) {
        }
        if (process == null) {
            yg0.N("process");
            throw null;
        }
        process.destroy();
        CoreController coreController = b.a;
        b.f();
        if (z) {
            stopSelf();
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.a;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                } else {
                    yg0.N("mInterface");
                    throw null;
                }
            } catch (Exception unused3) {
            }
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Object systemService = getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "V2Ray::VpnWakeLock");
        this.g = wakeLockNewWakeLock;
        if (wakeLockNewWakeLock != null) {
            wakeLockNewWakeLock.acquire();
        }
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        CoreController coreController = b.a;
        b.a(new SoftReference(this));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        cu0.a();
        PowerManager.WakeLock wakeLock = this.g;
        if (wakeLock != null) {
            wakeLock.release();
        }
        this.g = null;
    }

    @Override // android.net.VpnService
    public final void onRevoke() throws PackageManager.NameNotFoundException {
        if (this.b) {
            d(false);
            c();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws PackageManager.NameNotFoundException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Lazy lazy = zq0.a;
        zq0.u().h(jElapsedRealtime, "v2rayTime");
        CoreController coreController = b.a;
        if (!b.c()) {
            return 1;
        }
        c();
        return 1;
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final void startService() throws PackageManager.NameNotFoundException {
        c();
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final void stopService() {
        d(true);
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final boolean vpnProtect(int i) {
        return protect(i);
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final Service getService() {
        return this;
    }
}
