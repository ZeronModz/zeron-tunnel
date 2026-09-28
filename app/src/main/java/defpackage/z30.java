package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z30 implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                o40[] o40VarArr = c40.b;
                if (i < 4) {
                }
                break;
            default:
                int i2 = this.b;
                o40[] o40VarArr2 = c40.b;
                if (i2 < 4) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                for (o40 o40Var : c40.c[this.b]) {
                    map.put(o40Var.b, o40Var);
                }
                this.b++;
                return map;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
