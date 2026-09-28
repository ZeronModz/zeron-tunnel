package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import com.google.android.gms.internal.ads.zzgyk;
import com.google.common.util.concurrent.AbstractListeningExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SNIHostName;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n0 {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern a() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ SNIHostName b(String str) {
        return new SNIHostName(str);
    }

    public static void c(hw hwVar) {
        if ((Build.VERSION.SDK_INT <= 23 || hwVar != ForkJoinPool.commonPool()) && !hwVar.a.isTerminated()) {
            hwVar.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void d(jc0 jc0Var) {
        if (Build.VERSION.SDK_INT <= 23 || jc0Var != ForkJoinPool.commonPool()) {
            jc0Var.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void e(zzgyk zzgykVar) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || zzgykVar != ForkJoinPool.commonPool()) && !(zIsTerminated = zzgykVar.isTerminated())) {
            zzgykVar.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = zzgykVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        zzgykVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void f(AbstractListeningExecutorService abstractListeningExecutorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || abstractListeningExecutorService != ForkJoinPool.commonPool()) && !(zIsTerminated = abstractListeningExecutorService.isTerminated())) {
            abstractListeningExecutorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = abstractListeningExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        abstractListeningExecutorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void g(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h(sa2 sa2Var) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || sa2Var != ForkJoinPool.commonPool()) && !(zIsTerminated = sa2Var.isTerminated())) {
            sa2Var.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = sa2Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        sa2Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(a43 a43Var) {
        boolean zIsTerminated;
        ExecutorService executorService = (ExecutorService) a43Var.b;
        if ((Build.VERSION.SDK_INT <= 23 || a43Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            a43Var.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        a43Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ SNIHostName j(String str) {
        return new SNIHostName(str);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
