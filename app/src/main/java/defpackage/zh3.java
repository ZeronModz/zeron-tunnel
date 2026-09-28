package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh3 {
    public static final eh2 a;
    public static final eh2 b;
    public static volatile zzad c;
    public static final Object d;
    public static Context e;

    static {
        new eh2(ef3.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new eh2(ef3.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new eh2(ef3.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new eh2(ef3.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        a = new eh2(ef3.d("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        b = new eh2(ef3.d("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        d = new Object();
    }

    public static synchronized void a(Context context) {
        if (e == null) {
            if (context != null) {
                e = context.getApplicationContext();
            }
        }
    }

    public static void b() {
        zzad ev1Var;
        if (c != null) {
            return;
        }
        yg0.m(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = a.c(e, a.e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = mv1.b;
                    if (iBinderB == null) {
                        ev1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        ev1Var = iInterfaceQueryLocalInterface instanceof zzad ? (zzad) iInterfaceQueryLocalInterface : new ev1(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    c = ev1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ll3 c(String str, sf3 sf3Var, boolean z, boolean z2) {
        try {
            b();
            yg0.m(e);
            try {
                return c.zze(new qk3(str, sf3Var, z, z2), new com.google.android.gms.dynamic.a(e.getPackageManager())) ? ll3.c : new gl3(new hg3(z, str, sf3Var));
            } catch (RemoteException e2) {
                return ll3.c("module call", e2);
            }
        } catch (DynamiteModule$LoadingException e3) {
            return ll3.c("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
