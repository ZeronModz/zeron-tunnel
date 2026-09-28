package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbdy;
import com.google.android.gms.internal.ads.zzbfl;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s12 implements zzbdy {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public s12(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.b = zzbflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z) {
        switch (this.a) {
            case 0:
                zzbfl zzbflVar = (zzbfl) this.b;
                if (!z) {
                    zzbflVar.d();
                } else {
                    zzbflVar.e();
                }
                break;
            case 1:
                if (((Boolean) zzbd.zzc().a(p32.z)).booleanValue()) {
                    ((ov2) this.b).c(z);
                }
                break;
            default:
                if (((Boolean) zzbd.zzc().a(p32.z)).booleanValue()) {
                    ((tv2) this.b).d(z);
                }
                break;
        }
    }

    public s12(ov2 ov2Var) {
        Objects.requireNonNull(ov2Var);
        this.b = ov2Var;
    }

    public s12(tv2 tv2Var) {
        Objects.requireNonNull(tv2Var);
        this.b = tv2Var;
    }
}
