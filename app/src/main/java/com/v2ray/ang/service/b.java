package com.v2ray.ang.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.ConfigResult;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import defpackage.bx0;
import defpackage.cu0;
import defpackage.dm1;
import defpackage.hv;
import defpackage.k5;
import defpackage.lv;
import defpackage.oy;
import defpackage.qf3;
import defpackage.ul1;
import defpackage.zq0;
import defpackage.zr;
import go.Seq;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.text.Regex;
import kotlin.text.g;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.c;
import libv2ray.CoreCallbackHandler;
import libv2ray.CoreController;
import libv2ray.Libv2ray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final CoreController a;
    public static final V2RayServiceManager$ReceiveMessageHandler b;
    public static ProfileItem c;
    public static SoftReference d;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.v2ray.ang.service.V2RayServiceManager$ReceiveMessageHandler] */
    static {
        CoreController coreControllerNewCoreController = Libv2ray.newCoreController(new CoreCallbackHandler() { // from class: com.v2ray.ang.service.V2RayServiceManager$CoreCallback
            @Override // libv2ray.CoreCallbackHandler
            public final long onEmitStatus(long j, String str) {
                return 0L;
            }

            @Override // libv2ray.CoreCallbackHandler
            public final long shutdown() {
                ServiceControl serviceControl;
                CoreController coreController = b.a;
                SoftReference softReference = b.d;
                if (softReference == null || (serviceControl = (ServiceControl) softReference.get()) == null) {
                    return -1L;
                }
                try {
                    serviceControl.stopService();
                    return 0L;
                } catch (Exception unused) {
                    return -1L;
                }
            }

            @Override // libv2ray.CoreCallbackHandler
            public final long startup() {
                return 0L;
            }
        });
        coreControllerNewCoreController.getClass();
        a = coreControllerNewCoreController;
        b = new BroadcastReceiver() { // from class: com.v2ray.ang.service.V2RayServiceManager$ReceiveMessageHandler
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) throws InterruptedException {
                ServiceControl serviceControl;
                CoreController coreController = b.a;
                SoftReference softReference = b.d;
                if (softReference == null || (serviceControl = (ServiceControl) softReference.get()) == null) {
                    return;
                }
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    try {
                        if (b.a.getIsRunning()) {
                            Service service = serviceControl.getService();
                            service.getClass();
                            Intent intent2 = new Intent();
                            intent2.setAction("com.v2ray.ang.action.activity");
                            intent2.setPackage("dev.zeron.tunnel");
                            intent2.putExtra("key", 11);
                            intent2.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            service.sendBroadcast(intent2);
                        } else {
                            Service service2 = serviceControl.getService();
                            service2.getClass();
                            Intent intent3 = new Intent();
                            intent3.setAction("com.v2ray.ang.action.activity");
                            intent3.setPackage("dev.zeron.tunnel");
                            intent3.putExtra("key", 12);
                            intent3.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            service2.sendBroadcast(intent3);
                        }
                    } catch (Exception unused) {
                    }
                } else if ((numValueOf == null || numValueOf.intValue() != 2) && (numValueOf == null || numValueOf.intValue() != 3)) {
                    if (numValueOf != null && numValueOf.intValue() == 4) {
                        serviceControl.stopService();
                    } else if (numValueOf != null && numValueOf.intValue() == 5) {
                        serviceControl.stopService();
                        Thread.sleep(500L);
                        b.d(serviceControl.getService(), null);
                    } else if (numValueOf != null && numValueOf.intValue() == 6 && b.a.getIsRunning()) {
                        lv lvVar = oy.a;
                        c.d(zr.a(hv.c), null, null, new V2RayServiceManager$measureV2rayDelay$1(null), 3);
                    }
                }
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != -2128145023) {
                        if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                            CoreController coreController2 = b.a;
                            Job job = cu0.b;
                            if (job != null) {
                                job.cancel((CancellationException) null);
                            }
                            lv lvVar2 = oy.a;
                            cu0.b = c.d(zr.a(hv.c), null, null, new NotificationService$startSpeedNotification$1(null), 3);
                            return;
                        }
                        return;
                    }
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        ProfileItem profileItem = b.c;
                        Job job2 = cu0.b;
                        if (job2 != null) {
                            job2.cancel((CancellationException) null);
                            cu0.b = null;
                            cu0.d(0L, profileItem != null ? profileItem.getRemarks() : null, 0L);
                        }
                    }
                }
            }
        };
    }

    public static void a(SoftReference softReference) {
        Service service;
        d = softReference;
        ServiceControl serviceControl = (ServiceControl) softReference.get();
        Seq.setContext((serviceControl == null || (service = serviceControl.getService()) == null) ? null : service.getApplicationContext());
        Regex regex = ul1.a;
        ServiceControl serviceControl2 = (ServiceControl) softReference.get();
        Libv2ray.initCoreEnv(ul1.E(serviceControl2 != null ? serviceControl2.getService() : null), ul1.i());
    }

    public static void b(Context context) {
        ProfileItem profileItemE;
        if (a.getIsRunning()) {
            return;
        }
        Lazy lazy = zq0.a;
        String strX = zq0.x();
        if (strX == null || (profileItemE = zq0.e(strX)) == null) {
            return;
        }
        if (profileItemE.getConfigType() != EConfigType.CUSTOM) {
            Regex regex = ul1.a;
            if (!ul1.w(profileItemE.getServer()) && !ul1.r(profileItemE.getServer())) {
                return;
            }
        }
        if (zq0.z().b("pref_proxy_sharing_enabled", false)) {
            qf3.K(context, R.string.toast_warning_pref_proxysharing_short);
        } else {
            qf3.K(context, R.string.toast_services_start);
        }
        String strD = zq0.z().d("pref_mode");
        if (strD == null) {
            strD = "VPN";
        }
        Intent intent = strD.equals("VPN") ? new Intent(context.getApplicationContext(), (Class<?>) V2RayVpnService.class) : new Intent(context.getApplicationContext(), (Class<?>) V2RayProxyOnlyService.class);
        if (Build.VERSION.SDK_INT > 25) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static boolean c() {
        ProfileItem profileItemE;
        ConfigResult configResult;
        ServiceControl serviceControl;
        CoreController coreController = a;
        if (!coreController.getIsRunning()) {
            SoftReference softReference = d;
            Service service = (softReference == null || (serviceControl = (ServiceControl) softReference.get()) == null) ? null : serviceControl.getService();
            if (service != null) {
                Lazy lazy = zq0.a;
                String strX = zq0.x();
                if (strX != null && (profileItemE = zq0.e(strX)) != null) {
                    try {
                        ProfileItem profileItemE2 = zq0.e(strX);
                        configResult = profileItemE2 == null ? new ConfigResult(false, null, null, null, 14, null) : profileItemE2.getConfigType() == EConfigType.CUSTOM ? dm1.g(strX) : dm1.h(service, strX, profileItemE2);
                    } catch (Exception unused) {
                        configResult = new ConfigResult(false, null, null, null, 14, null);
                    }
                    if (configResult.getStatus()) {
                        try {
                            IntentFilter intentFilter = new IntentFilter("com.v2ray.ang.action.service");
                            intentFilter.addAction("android.intent.action.SCREEN_ON");
                            intentFilter.addAction("android.intent.action.SCREEN_OFF");
                            intentFilter.addAction("android.intent.action.USER_PRESENT");
                            V2RayServiceManager$ReceiveMessageHandler v2RayServiceManager$ReceiveMessageHandler = b;
                            Regex regex = ul1.a;
                            k5.B(service, v2RayServiceManager$ReceiveMessageHandler, intentFilter, Build.VERSION.SDK_INT >= 33 ? 2 : 4);
                            c = profileItemE;
                            String remarks = profileItemE.getRemarks();
                            remarks.getClass();
                            if (g.o(remarks, "MMTunnelCore", false)) {
                                Lazy lazy2 = zq0.a;
                                String strD = zq0.u().d("NurTsikenConfig");
                                if (strD == null) {
                                    strD = "[]";
                                }
                                coreController.startLoop(strD);
                            } else {
                                configResult.getContent();
                                coreController.startLoop(configResult.getContent());
                            }
                            if (!coreController.getIsRunning()) {
                                try {
                                    Intent intent = new Intent();
                                    intent.setAction("com.v2ray.ang.action.activity");
                                    intent.setPackage("dev.zeron.tunnel");
                                    intent.putExtra("key", 32);
                                    intent.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                    service.sendBroadcast(intent);
                                } catch (Exception unused2) {
                                }
                                cu0.a();
                                return false;
                            }
                            try {
                                Intent intent2 = new Intent();
                                intent2.setAction("com.v2ray.ang.action.activity");
                                intent2.setPackage("dev.zeron.tunnel");
                                intent2.putExtra("key", 31);
                                intent2.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                service.sendBroadcast(intent2);
                            } catch (Exception unused3) {
                            }
                            cu0.c();
                            Job job = cu0.b;
                            if (job != null) {
                                job.cancel((CancellationException) null);
                            }
                            lv lvVar = oy.a;
                            cu0.b = c.d(zr.a(hv.c), null, null, new NotificationService$startSpeedNotification$1(null), 3);
                            Lazy lazy3 = bx0.a;
                            Integer socksPort = configResult.getSocksPort();
                            if (socksPort == null) {
                                return true;
                            }
                            try {
                                if (profileItemE.getConfigType() != EConfigType.HYSTERIA2) {
                                    return true;
                                }
                                ((ProcessService) bx0.a.getValue()).a(service, bx0.a(service, bx0.b(service, profileItemE, socksPort.intValue())));
                                return true;
                            } catch (Exception unused4) {
                                return true;
                            }
                        } catch (Exception unused5) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void d(Context context, String str) {
        context.getClass();
        if (str != null) {
            Lazy lazy = zq0.a;
            zq0.v().i("SELECTED_SERVER", str);
        }
        b(context);
    }

    public static void e(Context context) {
        Lazy lazy = zq0.a;
        String strX = zq0.x();
        if (strX == null || strX.length() == 0) {
            qf3.K(context, R.string.app_tile_first_use);
        } else {
            b(context);
        }
    }

    public static void f() {
        Process process;
        ServiceControl serviceControl;
        SoftReference softReference = d;
        Service service = (softReference == null || (serviceControl = (ServiceControl) softReference.get()) == null) ? null : serviceControl.getService();
        if (service == null) {
            return;
        }
        if (a.getIsRunning()) {
            lv lvVar = oy.a;
            c.d(zr.a(hv.c), null, null, new V2RayServiceManager$stopCoreLoop$1(null), 3);
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.v2ray.ang.action.activity");
            intent.setPackage("dev.zeron.tunnel");
            intent.putExtra("key", 41);
            intent.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            service.sendBroadcast(intent);
        } catch (Exception unused) {
        }
        cu0.a();
        try {
            service.unregisterReceiver(b);
        } catch (Exception unused2) {
        }
        try {
            ProcessService processService = (ProcessService) bx0.a.getValue();
            if (processService == null || (process = processService.a) == null) {
                return;
            }
            process.destroy();
        } catch (Exception unused3) {
        }
    }

    public static void g(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.v2ray.ang.action.service");
            intent.setPackage("dev.zeron.tunnel");
            intent.putExtra("key", 4);
            intent.putExtra("content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            context.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }
}
