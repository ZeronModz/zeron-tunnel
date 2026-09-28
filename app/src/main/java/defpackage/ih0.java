package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.r1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ih0 extends v70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Iterable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ih0(Iterable iterable, Object obj, int i) {
        this.b = i;
        this.c = iterable;
        this.d = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        Object obj = this.d;
        Iterable iterable = this.c;
        switch (i) {
            case 0:
                Iterator it = iterable.iterator();
                Predicate predicate = (Predicate) obj;
                it.getClass();
                predicate.getClass();
                return new r1(it, predicate);
            default:
                return new nh0(iterable.iterator(), (Function) obj);
        }
    }
}
