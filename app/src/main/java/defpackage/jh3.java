package defpackage;

import com.google.android.gms.internal.ads.zzgup;
import com.google.android.gms.internal.ads.zzmr;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jh3 {
    public static final jh3 b = new jh3(new zzmr());
    public final zzgup a;

    public jh3(zzmr zzmrVar) {
        this.a = zzmrVar.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jh3) && this.a.equals(((jh3) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
