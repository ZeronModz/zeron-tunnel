package defpackage;

import com.google.android.gms.internal.ads.zzpy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hj3 {
    public static final hj3 d = new zzpy().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ hj3(zzpy zzpyVar) {
        this.a = zzpyVar.a;
        this.b = zzpyVar.b;
        this.c = zzpyVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj3.class != obj.getClass()) {
            return false;
        }
        hj3 hj3Var = (hj3) obj;
        return this.a == hj3Var.a && this.b == hj3Var.b && this.c == hj3Var.c;
    }

    public final int hashCode() {
        int i = (this.a ? 1 : 0) << 2;
        boolean z = this.b;
        return (z ? 1 : 0) + (z ? 1 : 0) + i + (this.c ? 1 : 0);
    }
}
