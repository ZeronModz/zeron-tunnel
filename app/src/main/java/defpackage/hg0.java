package defpackage;

import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hg0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ hg0(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ImmutableSortedMap.lambda$fromEntries$0(this.b, (Map.Entry) obj, (Map.Entry) obj2);
            default:
                return this.b.compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
        }
    }
}
