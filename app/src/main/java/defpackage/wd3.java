package defpackage;

import android.os.Binder;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.measurement.internal.g0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class wd3 {
    public static int a(int i, int i2) {
        return String.valueOf(i).length() + i2;
    }

    public static int b(int i, int i2, int i3) {
        return u0.t(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return u0.t(i) + i2 + i3 + i4;
    }

    public static void d(g0 g0Var) {
        g0Var.zzaW().a();
        g0Var.g0();
    }

    public static boolean e(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static Object f(ic3 ic3Var) {
        try {
            return ic3Var.mo10zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return ic3Var.mo10zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
