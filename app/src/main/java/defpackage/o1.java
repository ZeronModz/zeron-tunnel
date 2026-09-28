package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o1 extends pk1 {
    public Object a;

    public o1(Object obj) {
        this.a = obj;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.a;
        if (obj != null) {
            this.a = a(obj);
            return obj;
        }
        p60.m();
        return null;
    }
}
