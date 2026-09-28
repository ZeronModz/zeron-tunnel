package defpackage;

import com.google.android.gms.internal.ads.zzgyk;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ta2 extends zzgyk {
    public final /* synthetic */ int a = 0;
    public final Executor b;

    public ta2(ExecutorService executorService) {
        executorService.getClass();
        this.b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.b).awaitTermination(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.execute(runnable);
                break;
            default:
                ((ExecutorService) this.b).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.b).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.b).isTerminated();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.b).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.b).shutdownNow();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.b;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return hz.x(new StringBuilder(vh.b(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, "[", strValueOf, "]");
            default:
                return super.toString();
        }
    }
}
