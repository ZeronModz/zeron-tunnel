package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s20 extends t20 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s20(int i, Object obj, Object obj2) {
        super(obj, obj2);
        this.c = i;
    }

    @Override // defpackage.t20
    public final boolean a() {
        switch (this.c) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.t20
    public final Object b() {
        switch (this.c) {
            case 0:
                return this.a;
            default:
                throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }
    }

    @Override // defpackage.t20
    public final Object c() {
        switch (this.c) {
            case 0:
                return this.b;
            default:
                throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }
    }

    public final boolean equals(Object obj) {
        int i = this.c;
        Object obj2 = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                if (obj != this) {
                    if (obj instanceof t20) {
                        t20 t20Var = (t20) obj;
                        if (true != t20Var.a() || !obj2.equals(t20Var.b()) || !obj3.equals(t20Var.c())) {
                        }
                    }
                }
                break;
            default:
                if (obj != this) {
                    if (obj instanceof t20) {
                        t20 t20Var2 = (t20) obj;
                        Object obj4 = t20Var2.b;
                        Object obj5 = t20Var2.a;
                        if (!t20Var2.a()) {
                            if (obj2.equals(obj5)) {
                                break;
                            } else if (!obj2.equals(obj4) || !obj3.equals(obj5)) {
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        Object obj = this.b;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                return Arrays.hashCode(new Object[]{obj2, obj});
            default:
                return obj.hashCode() + obj2.hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.c;
        Object obj = this.b;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                Object[] objArr = {obj2, obj};
                cn0.p(0, 2, 2);
                cn0.o(0, 2);
                return new ph0(objArr, 2);
            default:
                Object[] objArr2 = {obj2, obj};
                cn0.p(0, 2, 2);
                cn0.o(0, 2);
                return new ph0(objArr2, 2);
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                StringBuilder sb = new StringBuilder("<");
                sb.append(this.a);
                sb.append(" -> ");
                return vh.k(this.b, ">", sb);
            default:
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(this.a);
                sb2.append(", ");
                return vh.k(this.b, "]", sb2);
        }
    }
}
