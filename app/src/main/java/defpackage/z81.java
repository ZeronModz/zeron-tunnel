package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z81 implements Iterator {
    public final /* synthetic */ int a;
    public int b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ z81(AbstractMap abstractMap, int i) {
        this.a = i;
        this.e = abstractMap;
    }

    public Iterator a() {
        Iterator it = this.d;
        if (it != null) {
            return it;
        }
        Iterator it2 = ((v81) this.e).b.entrySet().iterator();
        this.d = it2;
        return it2;
    }

    public Iterator b() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 1:
                Iterator it = this.d;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((qd3) abstractMap).c.entrySet().iterator();
                this.d = it2;
                return it2;
            default:
                Iterator it3 = this.d;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((ci3) abstractMap).c.entrySet().iterator();
                this.d = it4;
                return it4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                v81 v81Var = (v81) abstractMap;
                if (this.b + 1 >= v81Var.a.size()) {
                    if (v81Var.b.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
            case 1:
                qd3 qd3Var = (qd3) abstractMap;
                if (this.b + 1 >= qd3Var.b) {
                    if (qd3Var.c.isEmpty() || !b().hasNext()) {
                    }
                }
                break;
            default:
                ci3 ci3Var = (ci3) abstractMap;
                if (this.b + 1 >= ci3Var.b) {
                    if (ci3Var.c.isEmpty() || !b().hasNext()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                v81 v81Var = (v81) abstractMap;
                if (i2 >= v81Var.a.size()) {
                }
                break;
            case 1:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                qd3 qd3Var = (qd3) abstractMap;
                if (i3 >= qd3Var.b) {
                }
                break;
            default:
                this.c = true;
                int i4 = this.b + 1;
                this.b = i4;
                ci3 ci3Var = (ci3) abstractMap;
                if (i4 >= ci3Var.b) {
                }
                break;
        }
        return (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                v81 v81Var = (v81) abstractMap;
                if (!this.c) {
                    u7.p("remove() was called before next()");
                } else {
                    this.c = false;
                    int i2 = v81.g;
                    v81Var.b();
                    if (this.b >= v81Var.a.size()) {
                        a().remove();
                    } else {
                        int i3 = this.b;
                        this.b = i3 - 1;
                        v81Var.h(i3);
                    }
                }
                break;
            case 1:
                if (!this.c) {
                    u7.p("remove() was called before next()");
                } else {
                    this.c = false;
                    qd3 qd3Var = (qd3) abstractMap;
                    qd3Var.f();
                    int i4 = this.b;
                    if (i4 >= qd3Var.b) {
                        b().remove();
                    } else {
                        this.b = i4 - 1;
                        qd3Var.d(i4);
                    }
                }
                break;
            default:
                if (!this.c) {
                    u7.p("remove() was called before next()");
                } else {
                    this.c = false;
                    ci3 ci3Var = (ci3) abstractMap;
                    ci3Var.f();
                    int i5 = this.b;
                    if (i5 >= ci3Var.b) {
                        b().remove();
                    } else {
                        this.b = i5 - 1;
                        ci3Var.d(i5);
                    }
                }
                break;
        }
    }
}
