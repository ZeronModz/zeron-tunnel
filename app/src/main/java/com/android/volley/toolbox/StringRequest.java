package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response$ErrorListener;
import com.android.volley.Response$Listener;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class StringRequest extends Request<String> {
    public final Object m;
    public final Response$Listener n;

    public StringRequest(int i, String str, Response$Listener<String> response$Listener, Response$ErrorListener response$ErrorListener) {
        super(i, str, response$ErrorListener);
        this.m = new Object();
        this.n = response$Listener;
    }

    @Override // com.android.volley.Request
    public final void b(Object obj) {
        Response$Listener response$Listener;
        String str = (String) obj;
        synchronized (this.m) {
            response$Listener = this.n;
        }
        if (response$Listener != null) {
            response$Listener.onResponse(str);
        }
    }

    @Override // com.android.volley.Request
    public final com.android.volley.a n(NetworkResponse networkResponse) {
        String str;
        byte[] bArr = networkResponse.a;
        try {
            str = new String(bArr, HttpHeaderParser.b("ISO-8859-1", networkResponse.b));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new com.android.volley.a(str, HttpHeaderParser.a(networkResponse));
    }

    public StringRequest(String str, Response$Listener<String> response$Listener, Response$ErrorListener response$ErrorListener) {
        this(0, str, response$Listener, response$ErrorListener);
    }
}
