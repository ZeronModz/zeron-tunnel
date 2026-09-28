package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import defpackage.q8;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncHttpStack extends BaseHttpStack {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface OnRequestComplete {
        void onAuthError(AuthFailureError authFailureError);

        void onError(IOException iOException);

        void onSuccess(HttpResponse httpResponse);
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public final HttpResponse a(Request request, Map map) throws InterruptedIOException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        b();
        try {
            countDownLatch.await();
            ((q8) atomicReference.get()).getClass();
            Object obj = null;
            obj.getClass();
            throw null;
        } catch (InterruptedException e) {
            VolleyLog.a("while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(e.toString());
        }
    }

    public abstract void b();
}
