package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 {
    public final Executor a;
    public final EventStore b;
    public final WorkScheduler c;
    public final SynchronizationGuard d;

    public kr1(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.a = executor;
        this.b = eventStore;
        this.c = workScheduler;
        this.d = synchronizationGuard;
    }
}
