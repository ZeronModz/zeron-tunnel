package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.z;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a33 extends k7 implements Runnable {
    public static final /* synthetic */ int k = 0;
    public ListenableFuture h;
    public Class i;
    public Object j;

    public a33(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.h = listenableFuture;
        this.i = cls;
        this.j = obj;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final void e() {
        m(this.h);
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final String f() {
        String strT;
        ListenableFuture listenableFuture = this.h;
        Class cls = this.i;
        Object obj = this.j;
        String strF = super.f();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strT = vh.t(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strT = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (cls == null || obj == null) {
            if (strF != null) {
                return strT.concat(strF);
            }
            return null;
        }
        int length = strT.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        hz.H(sb, strT, "exceptionType=[", string2, "], fallback=[");
        return vh.s(sb, string3, "]");
    }

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.h;
        Class cls = this.i;
        Object obj = this.j;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.a instanceof b33)) {
            return;
        }
        this.h = null;
        try {
            th = listenableFuture instanceof g7 ? ((g7) listenableFuture).b() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                hz.H(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objN0 = th == null ? z.n0(listenableFuture) : null;
        if (th == null) {
            c(objN0);
            return;
        }
        if (!cls.isInstance(th)) {
            l(listenableFuture);
            return;
        }
        try {
            Object objS = s(obj, th);
            this.i = null;
            this.j = null;
            r(objS);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                d(th2);
            } finally {
                this.i = null;
                this.j = null;
            }
        }
    }

    public abstract Object s(Object obj, Throwable th);
}
