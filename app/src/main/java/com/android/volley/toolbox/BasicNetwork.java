package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.ClientError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.lt0;
import defpackage.s31;
import defpackage.x3;
import defpackage.y6;
import java.util.DesugarCollections;
import java.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BasicNetwork implements Network {
    public final HttpStack a;
    public final BaseHttpStack b;
    public final ByteArrayPool c;

    @Deprecated
    public BasicNetwork(HttpStack httpStack, ByteArrayPool byteArrayPool) {
        this.a = httpStack;
        this.b = new x3(httpStack);
        this.c = byteArrayPool;
    }

    @Override // com.android.volley.Network
    public final NetworkResponse performRequest(Request request) throws Throwable {
        char c;
        char c2;
        HttpResponse httpResponseA;
        byte[] bArr;
        y6 y6Var;
        Map map;
        int i;
        List listUnmodifiableList;
        byte[] bArrB;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                Cache.Entry entry = request.k;
                if (entry == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e) {
                        e = e;
                        c = 0;
                        c2 = 1;
                        httpResponseA = null;
                        bArr = null;
                    }
                } else {
                    HashMap map2 = new HashMap();
                    String str = entry.b;
                    if (str != null) {
                        map2.put("If-None-Match", str);
                    }
                    long j = entry.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = map2;
                }
                httpResponseA = this.b.a(request, map);
                try {
                    i = httpResponseA.a;
                    listUnmodifiableList = DesugarCollections.unmodifiableList(httpResponseA.b);
                    if (i == 304) {
                        return lt0.a(request, SystemClock.elapsedRealtime() - jElapsedRealtime, listUnmodifiableList);
                    }
                    try {
                        byte[] bArr2 = httpResponseA.e;
                        InputStream byteArrayInputStream = httpResponseA.d;
                        if (byteArrayInputStream == null) {
                            byteArrayInputStream = bArr2 != null ? new ByteArrayInputStream(bArr2) : null;
                        }
                        if (byteArrayInputStream != null) {
                            try {
                                bArrB = lt0.b(byteArrayInputStream, httpResponseA.c, this.c);
                            } catch (IOException e2) {
                                e = e2;
                                c = 0;
                                bArr = null;
                            }
                        } else {
                            bArrB = new byte[0];
                        }
                        bArr = bArrB;
                        try {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (!VolleyLog.a && jElapsedRealtime2 <= 3000) {
                                break;
                            }
                            c2 = 1;
                            try {
                                c = 0;
                                try {
                                    VolleyLog.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, Long.valueOf(jElapsedRealtime2), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i), Integer.valueOf(request.j.b));
                                    break;
                                } catch (IOException e3) {
                                    e = e3;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                c = 0;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            c = 0;
                            c2 = 1;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        c = 0;
                        c2 = 1;
                        bArr = null;
                    }
                    e = e2;
                    c = 0;
                    bArr = null;
                    c2 = 1;
                } catch (IOException e7) {
                    e = e7;
                }
            } catch (IOException e8) {
                e = e8;
            }
            if (e instanceof SocketTimeoutException) {
                y6Var = new y6(25, "socket", new TimeoutError());
            } else {
                if (e instanceof MalformedURLException) {
                    s31.m("Bad URL ", request.c, e);
                    return null;
                }
                if (httpResponseA == null) {
                    request.getClass();
                    throw new NoConnectionError(e);
                }
                int i2 = httpResponseA.a;
                Integer numValueOf = Integer.valueOf(i2);
                String str2 = request.c;
                Object[] objArr = new Object[2];
                objArr[c] = numValueOf;
                objArr[c2] = str2;
                VolleyLog.a("Unexpected response code %d for %s", objArr);
                if (bArr != null) {
                    NetworkResponse networkResponse = new NetworkResponse(i2, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, (List<Header>) DesugarCollections.unmodifiableList(httpResponseA.b));
                    if (i2 != 401 && i2 != 403) {
                        if (i2 < 400 || i2 > 499) {
                            throw new ServerError(networkResponse);
                        }
                        throw new ClientError(networkResponse);
                    }
                    y6Var = new y6(25, "auth", new AuthFailureError(networkResponse));
                } else {
                    y6Var = new y6(25, "network", new NetworkError());
                }
            }
            String str3 = (String) y6Var.b;
            DefaultRetryPolicy defaultRetryPolicy = request.j;
            int i3 = defaultRetryPolicy.a;
            try {
                defaultRetryPolicy.retry((VolleyError) y6Var.c);
                request.a(str3 + "-retry [timeout=" + i3 + "]");
            } catch (VolleyError e9) {
                request.a(str3 + "-timeout-giveup [timeout=" + i3 + "]");
                throw e9;
            }
        }
        if (i < 200 || i > 299) {
            throw new IOException();
        }
        return new NetworkResponse(i, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, (List<Header>) listUnmodifiableList);
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE));
    }

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE));
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.b = baseHttpStack;
        this.c = byteArrayPool;
    }
}
