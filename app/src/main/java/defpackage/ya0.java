package defpackage;

import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ya0 implements CallbackToFutureAdapter$Resolver, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya0(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(final b bVar) {
        int i = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        final long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                final ListenableFuture listenableFuture = (ListenableFuture) obj2;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) obj;
                xg0.r(listenableFuture, bVar);
                if (!listenableFuture.isDone()) {
                    final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: za0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(bVar.d(new TimeoutException("Future[" + listenableFuture + "] is not done within " + j + " ms.")));
                        }
                    }, j, timeUnit);
                    final int i2 = 0;
                    listenableFuture.addListener(new Runnable() { // from class: ab0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                            switch (i3) {
                                case 0:
                                    scheduledFuture.cancel(true);
                                    break;
                                default:
                                    scheduledFuture.cancel(true);
                                    break;
                            }
                        }
                    }, fy.b());
                }
                return "TimeoutFuture[" + listenableFuture + "]";
            default:
                oh ohVar = (oh) obj2;
                jc0 jc0Var = (jc0) obj;
                xg0.r(ohVar, bVar);
                nh nhVar = ohVar.b;
                if (!nhVar.isDone()) {
                    final ScheduledFuture scheduledFutureSchedule2 = jc0Var.schedule(new f20(14, bVar, ohVar), j, timeUnit);
                    final int i3 = 1;
                    nhVar.addListener(new Runnable() { // from class: ab0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            ScheduledFuture scheduledFuture = scheduledFutureSchedule2;
                            switch (i32) {
                                case 0:
                                    scheduledFuture.cancel(true);
                                    break;
                                default:
                                    scheduledFuture.cancel(true);
                                    break;
                            }
                        }
                    }, fy.b());
                }
                return "TimeoutFuture[" + ohVar + "]";
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.c;
        uploader.c.recordNextCallTime((TransportContext) this.d, uploader.g.getTime() + this.b);
        return null;
    }
}
