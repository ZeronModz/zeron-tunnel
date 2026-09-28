package defpackage;

import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ov1 implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public final Iterator c;

    public /* synthetic */ ov1(Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b.hasNext()) {
                    return true;
                }
                return this.c.hasNext();
            default:
                return this.b.hasNext() || this.c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.c;
        Iterator it2 = this.b;
        switch (i) {
            case 0:
                if (it2.hasNext()) {
                    return new zzas(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new zzas((String) it.next());
                }
                p60.m();
                return null;
            default:
                return it2.hasNext() ? it2.next() : it.next();
        }
    }

    public ov1(zzae zzaeVar, Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }
}
