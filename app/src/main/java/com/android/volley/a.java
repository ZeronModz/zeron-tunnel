package com.android.volley;

import com.android.volley.Cache;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Object a;
    public final Cache.Entry b;
    public final VolleyError c;
    public boolean d;

    public a(Object obj, Cache.Entry entry) {
        this.d = false;
        this.a = obj;
        this.b = entry;
        this.c = null;
    }

    public a(VolleyError volleyError) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = volleyError;
    }
}
