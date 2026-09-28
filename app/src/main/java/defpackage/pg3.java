package defpackage;

import com.google.android.gms.internal.ads.zzlk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pg3 {
    public final long a;
    public final float b;
    public final long c;

    public /* synthetic */ pg3(zzlk zzlkVar) {
        this.a = zzlkVar.a;
        this.b = zzlkVar.b;
        this.c = zzlkVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg3)) {
            return false;
        }
        pg3 pg3Var = (pg3) obj;
        return this.a == pg3Var.a && this.b == pg3Var.b && this.c == pg3Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
