package io.ktor.client.plugins.cache.storage;

import defpackage.mk1;
import defpackage.yg0;
import defpackage.yq0;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnlimitedStorage implements CacheStorage {
    public final ConcurrentMap a = new ConcurrentMap(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final Object find(Url url, Map map, Continuation continuation) {
        for (Object obj : (Set) this.a.a(new yq0(21), url)) {
            CachedResponseData cachedResponseData = (CachedResponseData) obj;
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (!yg0.a(cachedResponseData.h.get(str), (String) entry.getValue())) {
                        break;
                    }
                }
            }
            return obj;
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final Object findAll(Url url, Continuation continuation) {
        Set set = (Set) this.a.a.get(url);
        return set == null ? EmptySet.INSTANCE : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final Object store(Url url, CachedResponseData cachedResponseData, Continuation continuation) {
        Set set = (Set) this.a.a(new yq0(22), url);
        if (!set.add(cachedResponseData)) {
            set.remove(cachedResponseData);
            set.add(cachedResponseData);
        }
        return mk1.a;
    }
}
