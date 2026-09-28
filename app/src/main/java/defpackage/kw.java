package defpackage;

import com.google.firebase.components.Preconditions;
import com.google.firebase.components.Qualified;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kw {
    public final Qualified a;
    public final int b;
    public final int c;

    public kw(Qualified qualified, int i, int i2) {
        Preconditions.a(qualified, "Null dependency anInterface.");
        this.a = qualified;
        this.b = i;
        this.c = i2;
    }

    public static kw a(Qualified qualified) {
        return new kw(qualified, 1, 0);
    }

    public static kw b(Class cls) {
        return new kw(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        return this.a.equals(kwVar.a) && this.b == kwVar.b && this.c == kwVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                u7.g(hz.o(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return vh.s(sb, str, "}");
    }

    public kw(int i, int i2, Class cls) {
        this(Qualified.a(cls), i, i2);
    }
}
