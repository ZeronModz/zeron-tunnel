package defpackage;

import com.google.common.collect.i3;
import com.google.common.collect.m3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lu0 extends i3 {
    public final Object a;
    public int b;
    public final /* synthetic */ m3 c;

    public lu0(m3 m3Var, int i) {
        this.c = m3Var;
        this.a = m3Var.a[i];
        this.b = i;
    }

    @Override // com.google.common.collect.Multiset.Entry
    public final int getCount() {
        int i = this.b;
        Object obj = this.a;
        m3 m3Var = this.c;
        if (i == -1 || i >= m3Var.c || !cn0.y(obj, m3Var.a[i])) {
            this.b = m3Var.e(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return m3Var.b[i2];
    }

    @Override // com.google.common.collect.Multiset.Entry
    public final Object getElement() {
        return this.a;
    }
}
