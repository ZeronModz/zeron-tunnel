package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzarp;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t30 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public t30(zzarp zzarpVar, Handler handler) {
        this.a = 2;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Handler handler = this.b;
        switch (i) {
            case 0:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ t30(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }
}
