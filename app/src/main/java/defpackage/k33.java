package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.z;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k33 extends k7 implements Runnable {
    public static final /* synthetic */ int j = 0;
    public ListenableFuture h;
    public Object i;

    public k33(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.h = listenableFuture;
        this.i = obj;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final void e() {
        m(this.h);
        this.h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final String f() {
        String strT;
        ListenableFuture listenableFuture = this.h;
        Object obj = this.i;
        String strF = super.f();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strT = vh.t(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strT = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (obj == null) {
            if (strF != null) {
                return strT.concat(strF);
            }
            return null;
        }
        int length = strT.length();
        String string2 = obj.toString();
        return hz.x(new StringBuilder(string2.length() + length + 10 + 1), strT, "function=[", string2, "]");
    }

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.h;
        Object obj = this.i;
        if (((this.a instanceof b33) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.h = null;
        if (listenableFuture.isCancelled()) {
            l(listenableFuture);
            return;
        }
        try {
            try {
                Object objS = s(obj, z.n0(listenableFuture));
                this.i = null;
                r(objS);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    d(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e) {
            d(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            d(e2.getCause());
        } catch (Exception e3) {
            d(e3);
        }
    }

    public abstract Object s(Object obj, Object obj2);
}
