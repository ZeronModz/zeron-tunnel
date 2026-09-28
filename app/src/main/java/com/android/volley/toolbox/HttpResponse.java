package com.android.volley.toolbox;

import com.android.volley.Header;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpResponse {
    public final int a;
    public final List b;
    public final int c;
    public final InputStream d;
    public final byte[] e;

    public HttpResponse(int i, List<Header> list, byte[] bArr) {
        this.a = i;
        this.b = list;
        this.c = bArr.length;
        this.e = bArr;
        this.d = null;
    }

    public HttpResponse(int i, List<Header> list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
        this.e = null;
    }

    public HttpResponse(int i, List<Header> list) {
        this(i, list, -1, null);
    }
}
