package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends HttpCacheStorage {
    public static final /* synthetic */ int c = 0;

    static {
        new a();
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final HttpCacheEntry a(Url url, Map map) {
        url.getClass();
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final Set b(Url url) {
        url.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final void c(Url url, HttpCacheEntry httpCacheEntry) {
        url.getClass();
        httpCacheEntry.getClass();
    }
}
