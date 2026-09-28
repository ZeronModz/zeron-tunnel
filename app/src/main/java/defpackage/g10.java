package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.support.v4.os.ResultReceiver;
import android.view.View;
import com.google.android.gms.internal.ads.j1;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzftr;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzftv;
import com.google.android.gms.internal.ads.zzftw;
import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfuq;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfuu;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfuw;
import com.google.android.gms.internal.ads.zzfux;
import java.util.DesugarCollections;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g10 implements Runnable {
    public static final /* synthetic */ g10 b = new g10(5);
    public static final /* synthetic */ g10 c = new g10(10);
    public static final /* synthetic */ g10 d = new g10(14);
    public final /* synthetic */ int a;

    public g10(ResultReceiver resultReceiver, int i, Bundle bundle) {
        this.a = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        KeyguardManager keyguardManager;
        switch (this.a) {
            case 0:
                try {
                    Method method = bg1.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (b10.k != null) {
                        b10.a().c();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = bg1.b;
                    Trace.endSection();
                    throw th;
                }
            case 1:
            case 2:
                return;
            case 3:
                try {
                    j1.b = MessageDigest.getInstance("MD5");
                    countDownLatch = j1.e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = j1.e;
                } catch (Throwable th2) {
                    j1.e.countDown();
                    throw th2;
                }
                countDownLatch.countDown();
                return;
            case 4:
                return;
            case 5:
                List list = zzcbz.l;
                xg0.I("Pinged SB successfully.");
                return;
            case 6:
                Looper.myLooper().quit();
                return;
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                xf3.i.incrementAndGet();
                return;
            case 11:
                hw2 hw2Var = hw2.f;
                zzfuk zzfukVar = hw2Var.d;
                zzful zzfulVar = hw2Var.e;
                zzfuu zzfuuVar = zzfulVar.b;
                hw2Var.b.clear();
                for (zv2 zv2Var : DesugarCollections.unmodifiableCollection(dw2.c.b)) {
                }
                System.nanoTime();
                zzfukVar.a();
                HashMap map = zzfukVar.g;
                HashMap map2 = zzfukVar.c;
                HashSet<String> hashSet = zzfukVar.f;
                zzftu zzftuVar = hw2Var.c;
                long jNanoTime = System.nanoTime();
                zzftv zzftvVar = zzftuVar.b;
                View view = null;
                if (hashSet.size() > 0) {
                    for (String str : hashSet) {
                        JSONObject jSONObjectZza = zzftvVar.zza(view);
                        View view2 = (View) map2.get(str);
                        zzftw zzftwVar = zzftuVar.a;
                        HashMap map3 = map;
                        String str2 = (String) map.get(str);
                        if (str2 != null) {
                            JSONObject jSONObjectZza2 = zzftwVar.zza(view2);
                            try {
                                jSONObjectZza2.put("adSessionId", str);
                                break;
                            } catch (JSONException unused2) {
                            }
                            try {
                                jSONObjectZza2.put("notVisibleReason", str2);
                                break;
                            } catch (JSONException unused3) {
                            }
                            fw2.c(jSONObjectZza, jSONObjectZza2);
                        }
                        fw2.d(jSONObjectZza);
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(str);
                        zzfuw zzfuwVar = new zzfuw(zzfulVar, hashSet2, jSONObjectZza, jNanoTime);
                        zzful zzfulVar2 = zzfulVar;
                        zzfuuVar.getClass();
                        zzfuwVar.a = zzfuuVar;
                        ArrayDeque arrayDeque = zzfuuVar.b;
                        arrayDeque.add(zzfuwVar);
                        if (zzfuuVar.c == null) {
                            zzfut zzfutVar = (zzfut) arrayDeque.poll();
                            zzfuuVar.c = zzfutVar;
                            if (zzfutVar != null) {
                                zzfutVar.executeOnExecutor(zzfuuVar.a, new Object[0]);
                            }
                        }
                        view = null;
                        zzfulVar = zzfulVar2;
                        map = map3;
                    }
                }
                HashMap map4 = map;
                View view3 = view;
                zzful zzfulVar3 = zzfulVar;
                HashSet hashSet3 = zzfukVar.e;
                if (hashSet3.size() > 0) {
                    JSONObject jSONObjectZza3 = zzftvVar.zza(view3);
                    zzftvVar.zzb(null, jSONObjectZza3, hw2Var, true, false);
                    fw2.d(jSONObjectZza3);
                    zzfux zzfuxVar = new zzfux(zzfulVar3, hashSet3, jSONObjectZza3, jNanoTime);
                    zzfuuVar.getClass();
                    zzfuxVar.a = zzfuuVar;
                    ArrayDeque arrayDeque2 = zzfuuVar.b;
                    arrayDeque2.add(zzfuxVar);
                    if (zzfuuVar.c == null) {
                        zzfut zzfutVar2 = (zzfut) arrayDeque2.poll();
                        zzfuuVar.c = zzfutVar2;
                        if (zzfutVar2 != null) {
                            zzfutVar2.executeOnExecutor(zzfuuVar.a, new Object[0]);
                        }
                    }
                } else {
                    zzfuv zzfuvVar = new zzfuv(zzfulVar3);
                    zzfuuVar.getClass();
                    zzfuvVar.a = zzfuuVar;
                    ArrayDeque arrayDeque3 = zzfuuVar.b;
                    arrayDeque3.add(zzfuvVar);
                    if (zzfuuVar.c == null) {
                        zzfut zzfutVar3 = (zzfut) arrayDeque3.poll();
                        zzfuuVar.c = zzfutVar3;
                        if (zzfutVar3 != null) {
                            zzfutVar3.executeOnExecutor(zzfuuVar.a, new Object[0]);
                        }
                    }
                }
                zzfukVar.a.clear();
                zzfukVar.b.clear();
                map2.clear();
                zzfukVar.d.clear();
                hashSet3.clear();
                hashSet.clear();
                map4.clear();
                zzfukVar.j = false;
                zzfukVar.h.clear();
                System.nanoTime();
                ArrayList<zzfuq> arrayList = hw2Var.a;
                if (arrayList.size() > 0) {
                    for (zzfuq zzfuqVar : arrayList) {
                        zzfuqVar.zzb();
                        if (zzfuqVar instanceof zzfup) {
                            ((zzfup) zzfuqVar).zza();
                        }
                    }
                }
                zzftr zzftrVar = zzftr.d;
                Context context = (Context) zzftrVar.a.get();
                if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
                zzftrVar.a(zzftrVar.b, zIsDeviceLocked);
                zzftrVar.c = zIsDeviceLocked;
                return;
            case 12:
                Handler handler = hw2.h;
                if (handler != null) {
                    handler.post(hw2.i);
                    hw2.h.postDelayed(hw2.j, 200L);
                    return;
                }
                return;
            case 13:
                return;
            default:
                xf3.i.incrementAndGet();
                return;
        }
    }

    public /* synthetic */ g10(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void f() {
    }

    private final void g() {
    }
}
