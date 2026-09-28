package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzgah;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mx2 extends kx2 {
    public static mx2 i;

    public static final mx2 f(Context context) {
        mx2 mx2Var;
        synchronized (mx2.class) {
            try {
                mx2Var = i;
                if (mx2Var == null) {
                    mx2Var = new mx2(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                    i = mx2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mx2Var;
    }

    public final zzgah g(long j, boolean z) {
        synchronized (mx2.class) {
            try {
                if (this.g.g()) {
                    return a(z, null, null, j);
                }
                return new zzgah();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (mx2.class) {
            try {
                mo2 mo2Var = this.f;
                if (((SharedPreferences) mo2Var.c).contains(this.a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
