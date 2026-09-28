package com.android.volley.toolbox;

import com.android.volley.Cache;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class NoCache implements Cache {
    @Override // com.android.volley.Cache
    public final Cache.Entry get(String str) {
        return null;
    }

    @Override // com.android.volley.Cache
    public final void clear() {
    }

    @Override // com.android.volley.Cache
    public final void initialize() {
    }

    @Override // com.android.volley.Cache
    public final void remove(String str) {
    }

    @Override // com.android.volley.Cache
    public final void invalidate(String str, boolean z) {
    }

    @Override // com.android.volley.Cache
    public final void put(String str, Cache.Entry entry) {
    }
}
