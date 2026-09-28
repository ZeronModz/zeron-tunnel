package defpackage;

import com.google.android.material.color.utilities.TemperatureCache;
import java.util.function.Function$CC;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hq implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((xg) obj2).invoke(obj);
            default:
                return (Double) ((HashMap) ((TemperatureCache) obj2).d()).get((nc0) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
