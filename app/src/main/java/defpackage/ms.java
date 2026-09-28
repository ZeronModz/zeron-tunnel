package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.b;
import com.google.firebase.crashlytics.internal.common.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ms implements Executor {
    public final ExecutorService a;
    public final Object b = new Object();
    public Task c = b.e(null);

    public ms(ExecutorService executorService) {
        this.a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskG;
        synchronized (this.b) {
            taskG = this.c.g(this.a, new b1(runnable, 14));
            this.c = taskG;
        }
        return taskG;
    }

    public final Task b(d dVar) {
        Task taskG;
        synchronized (this.b) {
            taskG = this.c.g(this.a, new b1(dVar, 15));
            this.c = taskG;
        }
        return taskG;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
