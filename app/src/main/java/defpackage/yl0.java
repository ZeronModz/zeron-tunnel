package defpackage;

import com.google.common.cache.h;
import com.google.common.cache.v;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yl0 extends h {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl0(v vVar, int i) {
        super(vVar);
        this.i = i;
    }

    @Override // com.google.common.cache.h, java.util.Iterator
    public Object next() {
        switch (this.i) {
            case 1:
                return c().a;
            case 2:
                return c().b;
            default:
                return super.next();
        }
    }
}
