package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u70 extends v70 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.c = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            default:
                f8 f8Var = new f8(this, ((Iterable[]) obj).length, 2);
                qh0 qh0Var = new qh0();
                qh0Var.b = ph0.d;
                qh0Var.c = f8Var;
                return qh0Var;
        }
    }

    public u70(Iterable[] iterableArr) {
        this.c = iterableArr;
    }
}
