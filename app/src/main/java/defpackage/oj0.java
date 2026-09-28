package defpackage;

import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class oj0 {
    public final float a;
    public final List b;
    public final int c;
    public final int d;

    public oj0(float f, ArrayList arrayList, int i, int i2) {
        this.a = f;
        this.b = DesugarCollections.unmodifiableList(arrayList);
        this.c = i;
        this.d = i2;
    }

    public final nj0 a() {
        return (nj0) this.b.get(this.c);
    }

    public final nj0 b() {
        return (nj0) this.b.get(0);
    }

    public final nj0 c() {
        return (nj0) this.b.get(this.d);
    }

    public final nj0 d() {
        return (nj0) this.b.get(r1.size() - 1);
    }
}
