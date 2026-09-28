package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class uf0 extends if3 {
    public Object[] g;
    public int h;
    public boolean i;

    public uf0(int i) {
        n8.e(i, "initialCapacity");
        this.g = new Object[i];
        this.h = 0;
    }

    public final uf0 c0(Object... objArr) {
        int length = objArr.length;
        yg0.g(objArr, length);
        e0(this.h + length);
        System.arraycopy(objArr, 0, this.g, this.h, length);
        this.h += length;
        return this;
    }

    public final void d0(Object obj) {
        obj.getClass();
        e0(this.h + 1);
        Object[] objArr = this.g;
        int i = this.h;
        this.h = i + 1;
        objArr[i] = obj;
    }

    public final void e0(int i) {
        Object[] objArr = this.g;
        if (objArr.length < i) {
            this.g = Arrays.copyOf(objArr, if3.u(objArr.length, i));
            this.i = false;
        } else if (this.i) {
            this.g = (Object[]) objArr.clone();
            this.i = false;
        }
    }
}
