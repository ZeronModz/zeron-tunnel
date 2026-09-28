package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.Response$ErrorListener;
import com.android.volley.Response$Listener;
import com.android.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonRequest<T> extends Request<T> {
    public final Object m;
    public final Response$Listener n;
    public final String o;

    public JsonRequest(int i, String str, String str2, Response$Listener<T> response$Listener, Response$ErrorListener response$ErrorListener) {
        super(i, str, response$ErrorListener);
        this.m = new Object();
        this.n = response$Listener;
        this.o = str2;
    }

    @Override // com.android.volley.Request
    public final void b(Object obj) {
        Response$Listener response$Listener;
        synchronized (this.m) {
            response$Listener = this.n;
        }
        if (response$Listener != null) {
            response$Listener.onResponse(obj);
        }
    }

    @Override // com.android.volley.Request
    public final byte[] d() {
        String str = this.o;
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            VolleyLog.a("Unsupported Encoding while trying to get the bytes of %s using %s", str, "utf-8");
            return null;
        }
    }

    @Override // com.android.volley.Request
    public final String e() {
        return "application/json; charset=utf-8";
    }

    @Override // com.android.volley.Request
    public final byte[] g() {
        return d();
    }

    @Override // com.android.volley.Request
    public final String h() {
        return "application/json; charset=utf-8";
    }

    @Deprecated
    public JsonRequest(String str, String str2, Response$Listener<T> response$Listener, Response$ErrorListener response$ErrorListener) {
        this(-1, str, str2, response$Listener, response$ErrorListener);
    }
}
