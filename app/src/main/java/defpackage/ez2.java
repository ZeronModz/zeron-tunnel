package defpackage;

import android.net.NetworkCapabilities;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzghb;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ez2 extends zzghb {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public ez2(vz1 vz1Var, zzgfx zzgfxVar, k5 k5Var, f6 f6Var) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", vz1Var, zzgfxVar, f6Var.a(116));
        this.g = k5Var;
    }

    private final void b(Method method, vz1 vz1Var) {
        Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, ((k5) this.g).zzb());
        objArr.getClass();
        synchronized (vz1Var) {
            String str = (String) objArr[0];
            vz1Var.d();
            ((b1) vz1Var.b).x0(str);
            String str2 = (String) objArr[1];
            vz1Var.d();
            ((b1) vz1Var.b).f0(str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void a(Method method, vz1 vz1Var) {
        switch (this.f) {
            case 0:
                b(method, vz1Var);
                return;
            default:
                Map map = (Map) this.g;
                Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr.getClass();
                synchronized (vz1Var) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    vz1Var.d();
                    ((b1) vz1Var.b).B0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    if (jLongValue2 >= 0) {
                        vz1Var.d();
                        ((b1) vz1Var.b).b0(jLongValue2);
                    }
                    long jLongValue3 = ((Long) objArr[2]).longValue();
                    if (jLongValue3 >= 0) {
                        vz1Var.d();
                        ((b1) vz1Var.b).c0(jLongValue3);
                    }
                    break;
                }
                return;
        }
    }

    public ez2(vz1 vz1Var, zzgfx zzgfxVar, Map map, f6 f6Var) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", vz1Var, zzgfxVar, f6Var.a(118));
        this.g = map;
    }
}
