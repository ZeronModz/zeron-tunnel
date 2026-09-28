package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Cache;
import defpackage.h4;
import defpackage.hz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Request<T> implements Comparable<Request<T>> {
    public final b a;
    public final int b;
    public final String c;
    public final int d;
    public final Object e;
    public final Response$ErrorListener f;
    public final boolean g;
    public final boolean h;
    public boolean i;
    public DefaultRetryPolicy j;
    public Cache.Entry k;
    public NetworkRequestCompleteListener l;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface Method {
        public static final int DELETE = 3;
        public static final int DEPRECATED_GET_OR_POST = -1;
        public static final int GET = 0;
        public static final int HEAD = 4;
        public static final int OPTIONS = 5;
        public static final int PATCH = 7;
        public static final int POST = 1;
        public static final int PUT = 2;
        public static final int TRACE = 6;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface NetworkRequestCompleteListener {
        void onNoUsableResponseReceived(Request<?> request);

        void onResponseReceived(Request<?> request, a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public Request(int i, String str, Response$ErrorListener response$ErrorListener) {
        Uri uri;
        String host;
        this.a = b.c ? new b() : null;
        this.e = new Object();
        this.g = true;
        int iHashCode = 0;
        this.h = false;
        this.i = false;
        this.k = null;
        this.b = i;
        this.c = str;
        this.f = response$ErrorListener;
        this.j = new DefaultRetryPolicy();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.d = iHashCode;
    }

    public final void a(String str) {
        if (b.c) {
            this.a.a(Thread.currentThread().getId(), str);
        }
    }

    public abstract void b(Object obj);

    public final void c(String str) {
        if (b.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new h4(this, str, id, 1));
                return;
            }
            b bVar = this.a;
            bVar.a(id, str);
            bVar.b(toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Priority priorityI = i();
        Priority priorityI2 = ((Request) obj).i();
        if (priorityI != priorityI2) {
            return priorityI2.ordinal() - priorityI.ordinal();
        }
        throw null;
    }

    public byte[] d() {
        return null;
    }

    public String e() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final String f() {
        String str = this.c;
        int i = this.b;
        if (i == 0 || i == -1) {
            return str;
        }
        return Integer.toString(i) + '-' + str;
    }

    public byte[] g() {
        return null;
    }

    public String h() {
        return e();
    }

    public Priority i() {
        return Priority.NORMAL;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.e) {
            z = this.i;
        }
        return z;
    }

    public boolean k() {
        boolean z;
        synchronized (this.e) {
            z = this.h;
        }
        return z;
    }

    public final void l() {
        NetworkRequestCompleteListener networkRequestCompleteListener;
        synchronized (this.e) {
            networkRequestCompleteListener = this.l;
        }
        if (networkRequestCompleteListener != null) {
            networkRequestCompleteListener.onNoUsableResponseReceived(this);
        }
    }

    public final void m(a aVar) {
        NetworkRequestCompleteListener networkRequestCompleteListener;
        synchronized (this.e) {
            networkRequestCompleteListener = this.l;
        }
        if (networkRequestCompleteListener != null) {
            networkRequestCompleteListener.onResponseReceived(this, aVar);
        }
    }

    public abstract a n(NetworkResponse networkResponse);

    public final void o(c cVar) {
        synchronized (this.e) {
            this.l = cVar;
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.d);
        StringBuilder sb = new StringBuilder(k() ? "[X] " : "[ ] ");
        hz.H(sb, this.c, " ", str, " ");
        sb.append(i());
        sb.append(" null");
        return sb.toString();
    }

    @Deprecated
    public Request(String str, Response$ErrorListener response$ErrorListener) {
        this(-1, str, response$ErrorListener);
    }
}
