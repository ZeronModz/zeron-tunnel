package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xb extends bp0 {
    public final um1 a;
    public final qa b;
    public final int c;

    public xb(um1 um1Var, qa qaVar, int i) {
        this.a = um1Var;
        this.b = qaVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bp0)) {
            return false;
        }
        xb xbVar = (xb) ((bp0) obj);
        return this.a.equals(xbVar.a) && this.b.equals(xbVar.b) && this.c == xbVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return hz.q(this.c, "}", sb);
    }
}
