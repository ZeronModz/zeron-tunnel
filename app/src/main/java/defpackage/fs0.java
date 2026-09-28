package defpackage;

import java.util.Comparator;
import java.util.c;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fs0 implements Comparator, java.util.Comparator {
    public static final fs0 b = new fs0(0);
    public static final fs0 c = new fs0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fs0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator, java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }

    @Override // java.util.Comparator, java.util.Comparator
    public /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i = this.a;
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i = this.a;
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i = this.a;
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i = this.a;
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function) {
        int i = this.a;
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        int i = this.a;
        return c.z(this, Comparator.CC.comparing(function, comparator));
    }
}
