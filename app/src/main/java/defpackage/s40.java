package defpackage;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s40 {
    public final DataCharacter a;
    public final DataCharacter b;
    public final FinderPattern c;

    public s40(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern) {
        this.a = dataCharacter;
        this.b = dataCharacter2;
        this.c = finderPattern;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s40)) {
            return false;
        }
        s40 s40Var = (s40) obj;
        return Objects.equals(this.a, s40Var.a) && Objects.equals(this.b, s40Var.b) && Objects.equals(this.c, s40Var.c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) ^ (Objects.hashCode(this.a) ^ Objects.hashCode(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.a);
        sb.append(" , ");
        sb.append(this.b);
        sb.append(" : ");
        FinderPattern finderPattern = this.c;
        return vh.k(finderPattern == null ? "null" : Integer.valueOf(finderPattern.a), " ]", sb);
    }
}
