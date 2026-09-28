package defpackage;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzghb;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cz2 extends zzghb {
    public final /* synthetic */ int f;
    public final Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz2(vz1 vz1Var, zzgfx zzgfxVar, Context context, f6 f6Var, int i) {
        super("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", vz1Var, zzgfxVar, f6Var.a(115));
        this.f = i;
        switch (i) {
            case 1:
                super("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", vz1Var, zzgfxVar, f6Var.a(119));
                this.g = context;
                break;
            default:
                this.g = context;
                break;
        }
    }

    private final void b(Method method, vz1 vz1Var) {
        int i = 1;
        Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this.g);
        objArr.getClass();
        synchronized (vz1Var) {
            try {
                long jIntValue = ((Integer) objArr[0]).intValue();
                vz1Var.d();
                ((b1) vz1Var.b).T(jIntValue);
                long jIntValue2 = ((Integer) objArr[1]).intValue();
                vz1Var.d();
                ((b1) vz1Var.b).z0(jIntValue2);
                long jIntValue3 = ((Integer) objArr[2]).intValue();
                vz1Var.d();
                ((b1) vz1Var.b).A0(jIntValue3);
                long jIntValue4 = ((Integer) objArr[3]).intValue();
                vz1Var.d();
                ((b1) vz1Var.b).g0(jIntValue4);
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    vz1Var.d();
                    ((b1) vz1Var.b).k0(3);
                } else {
                    int i2 = true != bool.booleanValue() ? 1 : 2;
                    vz1Var.d();
                    ((b1) vz1Var.b).k0(i2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    vz1Var.g(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i = 2;
                    }
                    vz1Var.g(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void a(Method method, vz1 vz1Var) {
        switch (this.f) {
            case 0:
                b(method, vz1Var);
                return;
            default:
                Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this.g);
                objArr.getClass();
                synchronized (vz1Var) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).y0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).U(jLongValue2);
                    break;
                }
                return;
        }
    }
}
