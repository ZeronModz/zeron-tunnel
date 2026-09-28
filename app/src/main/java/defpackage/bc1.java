package defpackage;

import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bc1 implements Supplier {
    public static final ac1 c = new ac1();
    public volatile Supplier a;
    public Object b;

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Supplier supplier = this.a;
        ac1 ac1Var = c;
        if (supplier != ac1Var) {
            synchronized (this) {
                try {
                    if (this.a != ac1Var) {
                        Object obj = this.a.get();
                        this.b = obj;
                        this.a = ac1Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object objK = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (objK == c) {
            objK = vh.k(this.b, ">", new StringBuilder("<supplier that returned "));
        }
        return vh.k(objK, ")", sb);
    }
}
