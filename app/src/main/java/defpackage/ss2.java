package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ss2 {
    public static volatile ss2 g;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile zzcr f;

    public ss2(Context context, Bundle bundle) {
        v30 v30Var = new v30(this);
        int i = 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), v30Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        this.c = new ArrayList();
        try {
            if (kf2.D(context, mc2.K(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, ss2.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new jk2(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new r50(this, i));
    }

    public static ss2 e(Context context, Bundle bundle) {
        yg0.m(context);
        if (g == null) {
            synchronized (ss2.class) {
                try {
                    if (g == null) {
                        g = new ss2(context, bundle);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final Map a(String str, String str2, boolean z) {
        zzco zzcoVar = new zzco();
        c(new en2(this, str, str2, z, zzcoVar));
        Bundle bundleB = zzcoVar.b(5000L);
        if (bundleB == null || bundleB.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleB.size());
        for (String str3 : bundleB.keySet()) {
            Object obj = bundleB.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        zzco zzcoVar = new zzco();
        c(new jk2(this, str, zzcoVar));
        Integer num = (Integer) zzco.c(Integer.class, zzcoVar.b(10000L));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(sq2 sq2Var) {
        this.a.execute(sq2Var);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (!z && z2) {
            c(new li2(this, exc));
        }
    }

    public final void f(zzjq zzjqVar) {
        yg0.m(zzjqVar);
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (zzjqVar.equals(((Pair) arrayList.get(i)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ar2 ar2Var = new ar2(zzjqVar);
            arrayList.add(new Pair(zzjqVar, ar2Var));
            if (this.f != null) {
                try {
                    this.f.registerOnMeasurementEventListener(ar2Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            c(new aq2(this, ar2Var, 0));
        }
    }

    public final List g(String str, String str2) {
        zzco zzcoVar = new zzco();
        c(new hi2(this, str, str2, zzcoVar));
        List list = (List) zzco.c(List.class, zzcoVar.b(5000L));
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
