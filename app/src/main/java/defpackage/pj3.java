package defpackage;

import com.google.android.gms.internal.ads.zzqk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pj3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final gh2 e;
    public final int f;
    public final int g;

    public /* synthetic */ pj3(zzqk zzqkVar) {
        this.a = zzqkVar.a;
        this.b = zzqkVar.b;
        this.c = zzqkVar.c;
        this.d = zzqkVar.d;
        this.e = zzqkVar.e;
        this.f = zzqkVar.f;
        this.g = zzqkVar.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pj3.class == obj.getClass()) {
            pj3 pj3Var = (pj3) obj;
            if (this.a == pj3Var.a && this.b == pj3Var.b && this.c == pj3Var.c && this.d == pj3Var.d && this.f == pj3Var.f && this.g == pj3Var.g && this.e.equals(pj3Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Integer numValueOf2 = Integer.valueOf(this.b);
        Integer numValueOf3 = Integer.valueOf(this.c);
        Integer numValueOf4 = Integer.valueOf(this.d);
        Integer numValueOf5 = Integer.valueOf(this.f);
        Integer numValueOf6 = Integer.valueOf(this.g);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, numValueOf4, this.e, numValueOf5, numValueOf6, bool, bool);
    }
}
