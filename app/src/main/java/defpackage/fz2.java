package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzghb;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fz2 extends zzghb {
    public static volatile Long g;
    public static final Object h = new Object();
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz2(String str, String str2, vz1 vz1Var, zzgfx zzgfxVar, r03 r03Var, int i) {
        super(str, str2, vz1Var, zzgfxVar, r03Var);
        this.f = i;
    }

    private final void b(Method method, vz1 vz1Var) {
        if (g == null) {
            synchronized (h) {
                try {
                    if (g == null) {
                        Long l = (Long) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null);
                        if (l == null) {
                            throw null;
                        }
                        g = l;
                    }
                } finally {
                }
            }
        }
        synchronized (vz1Var) {
            try {
                if (g != null) {
                    long jLongValue = g.longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).I0(jLongValue);
                }
            } finally {
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
                synchronized (vz1Var) {
                    vz1Var.d();
                    ((b1) vz1Var.b).w0("E");
                    vz1Var.d();
                    ((b1) vz1Var.b).H(0L);
                    vz1Var.d();
                    ((b1) vz1Var.b).a0("D");
                    break;
                }
                Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null);
                objArr.getClass();
                synchronized (vz1Var) {
                    String str = (String) objArr[0];
                    vz1Var.d();
                    ((b1) vz1Var.b).w0(str);
                    long jLongValue = ((Long) objArr[1]).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).H(jLongValue);
                    String str2 = (String) objArr[2];
                    vz1Var.d();
                    ((b1) vz1Var.b).a0(str2);
                    break;
                }
                return;
        }
    }
}
