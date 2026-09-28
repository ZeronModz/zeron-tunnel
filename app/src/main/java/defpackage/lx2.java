package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzgah;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lx2 extends kx2 {
    public static lx2 i;

    public static final lx2 f(Context context) {
        lx2 lx2Var;
        synchronized (lx2.class) {
            try {
                lx2Var = i;
                if (lx2Var == null) {
                    lx2Var = new lx2(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                    i = lx2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lx2Var;
    }

    public final zzgah g(long j, boolean z) {
        zzgah zzgahVarA;
        synchronized (lx2.class) {
            zzgahVarA = a(z, null, null, j);
        }
        return zzgahVarA;
    }

    public final void h() {
        synchronized (lx2.class) {
            c(false);
        }
    }
}
