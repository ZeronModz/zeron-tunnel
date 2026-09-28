package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 {
    public final us0 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public hs0(us0 us0Var, boolean z, Object obj, boolean z2) {
        if (!us0Var.a && z) {
            u7.r(us0Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            io0.f("Argument with type ", us0Var.b(), " has null value but is not nullable.");
            throw null;
        }
        this.a = us0Var;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hs0.class != obj.getClass()) {
            return false;
        }
        hs0 hs0Var = (hs0) obj;
        if (this.b != hs0Var.b || this.c != hs0Var.c || !this.a.equals(hs0Var.a)) {
            return false;
        }
        Object obj2 = hs0Var.d;
        Object obj3 = this.d;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
