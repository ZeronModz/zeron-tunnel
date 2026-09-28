package defpackage;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheStats;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u80 extends e90 implements Cache {
    @Override // com.google.common.cache.Cache
    public ConcurrentMap<Object, Object> asMap() {
        return delegate().asMap();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
        delegate().cleanUp();
    }

    @Override // defpackage.e90
    public abstract Cache delegate();

    @Override // com.google.common.cache.Cache
    public Object get(Object obj, Callable<Object> callable) throws ExecutionException {
        return delegate().get(obj, callable);
    }

    @Override // com.google.common.cache.Cache
    public ImmutableMap<Object, Object> getAllPresent(Iterable<? extends Object> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @Override // com.google.common.cache.Cache
    @CheckForNull
    public Object getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(Iterable<? extends Object> iterable) {
        delegate().invalidateAll(iterable);
    }

    @Override // com.google.common.cache.Cache
    public void put(Object obj, Object obj2) {
        delegate().put(obj, obj2);
    }

    @Override // com.google.common.cache.Cache
    public void putAll(Map<Object, Object> map) {
        delegate().putAll(map);
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        return delegate().size();
    }

    @Override // com.google.common.cache.Cache
    public CacheStats stats() {
        return delegate().stats();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        delegate().invalidateAll();
    }
}
