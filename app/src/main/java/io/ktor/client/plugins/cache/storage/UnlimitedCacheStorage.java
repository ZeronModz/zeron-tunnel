package io.ktor.client.plugins.cache.storage;

import defpackage.yg0;
import defpackage.yq0;
import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnlimitedCacheStorage extends HttpCacheStorage {
    public static final /* synthetic */ int d = 0;
    public final ConcurrentMap c = new ConcurrentMap(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final HttpCacheEntry a(Url url, Map map) {
        Object next;
        url.getClass();
        Iterator it = ((Set) this.c.a(new yq0(20), url)).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HttpCacheEntry httpCacheEntry = (HttpCacheEntry) next;
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (!yg0.a(httpCacheEntry.b.get(str), (String) entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (HttpCacheEntry) next;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final Set b(Url url) {
        url.getClass();
        Set set = (Set) this.c.a.get(url);
        return set == null ? EmptySet.INSTANCE : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final void c(Url url, HttpCacheEntry httpCacheEntry) {
        url.getClass();
        httpCacheEntry.getClass();
        Set set = (Set) this.c.a(new yq0(19), url);
        if (set.add(httpCacheEntry)) {
            return;
        }
        set.remove(httpCacheEntry);
        set.add(httpCacheEntry);
    }
}
