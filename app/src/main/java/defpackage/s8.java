package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s8 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public s8() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Handler handler = this.b;
        switch (i) {
            case 0:
                handler.post(runnable);
                break;
            case 1:
                handler.post(runnable);
                break;
            default:
                handler.post(runnable);
                break;
        }
    }

    public /* synthetic */ s8(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }
}
