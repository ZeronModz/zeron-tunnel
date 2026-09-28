package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ClearCacheRequest extends Request<Object> {
    public final Cache m;
    public final Runnable n;

    public ClearCacheRequest(Cache cache, Runnable runnable) {
        super(0, null, null);
        this.m = cache;
        this.n = runnable;
    }

    @Override // com.android.volley.Request
    public final Request.Priority i() {
        return Request.Priority.IMMEDIATE;
    }

    @Override // com.android.volley.Request
    public final boolean k() {
        this.m.clear();
        Runnable runnable = this.n;
        if (runnable == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(runnable);
        return true;
    }

    @Override // com.android.volley.Request
    public final com.android.volley.a n(NetworkResponse networkResponse) {
        return null;
    }

    @Override // com.android.volley.Request
    public final void b(Object obj) {
    }
}
