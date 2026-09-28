package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ib {
    public static final ib c = new ib(b01.g, 0);
    public final b01 a;
    public final int b;

    public ib(b01 b01Var, int i) {
        if (b01Var == null) {
            io0.e("Null fallbackQuality");
            throw null;
        }
        this.a = b01Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return this.a.equals(ibVar.a) && this.b == ibVar.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return hz.q(this.b, "}", sb);
    }
}
