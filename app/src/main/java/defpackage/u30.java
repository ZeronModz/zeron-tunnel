package defpackage;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u30 extends BackgroundPriorityRunnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) obj;
                try {
                    Logger logger = Logger.b;
                    logger.a(3);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        logger.a(3);
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Logger logger2 = Logger.b;
                    Locale locale = Locale.US;
                    logger2.a(3);
                    executorService.shutdownNow();
                }
                break;
        }
    }
}
