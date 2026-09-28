package defpackage;

import com.google.common.collect.x0;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v80 extends x0 implements ConcurrentMap, java.util.concurrent.ConcurrentMap {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.concurrent.ConcurrentMap, java.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.concurrent.ConcurrentMap, java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.concurrent.ConcurrentMap, java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // com.google.common.collect.x0, defpackage.e90
    public abstract java.util.concurrent.ConcurrentMap delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.concurrent.ConcurrentMap, java.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.concurrent.ConcurrentMap, java.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.concurrent.ConcurrentMap, java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.Map
    @CheckForNull
    public Object putIfAbsent(Object obj, Object obj2) {
        return delegate().putIfAbsent(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.Map
    @CheckForNull
    public Object replace(Object obj, Object obj2) {
        return delegate().replace(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.concurrent.ConcurrentMap, java.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return delegate().replace(obj, obj2, obj3);
    }
}
