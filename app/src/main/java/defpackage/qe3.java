package defpackage;

import com.google.android.gms.internal.ads.zzijx;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qe3 implements Iterator {
    public int a = 0;
    public final /* synthetic */ zzijx b;

    public qe3(zzijx zzijxVar) {
        this.b = zzijxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        zzijx zzijxVar = this.b;
        return i < zzijxVar.a.size() || zzijxVar.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        zzijx zzijxVar = this.b;
        List list = zzijxVar.a;
        if (i >= list.size()) {
            list.add(zzijxVar.b.next());
            return next();
        }
        int i2 = this.a;
        this.a = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
