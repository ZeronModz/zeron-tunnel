package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y82 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;
    public final /* synthetic */ z82 c;

    public /* synthetic */ y82(z82 z82Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.a = i;
        this.b = uncaughtExceptionHandler;
        this.c = z82Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.a;
        z82 z82Var = this.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        switch (i) {
            case 0:
                try {
                    try {
                        z82Var.e(th);
                        break;
                    } catch (Throwable unused) {
                        zzo.zzf("AdMob exception reporter failed reporting the exception.");
                        break;
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                try {
                    try {
                        z82Var.e(th);
                    } finally {
                    }
                    break;
                } catch (Throwable unused2) {
                    zzo.zzf("AdMob exception reporter failed reporting the exception.");
                    break;
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
