package defpackage;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomTrackingLiveData;
import androidx.room.k;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoomTrackingLiveData b;

    public /* synthetic */ z31(RoomTrackingLiveData roomTrackingLiveData, int i) {
        this.a = i;
        this.b = roomTrackingLiveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Executor executor;
        int i = this.a;
        RoomTrackingLiveData roomTrackingLiveData = this.b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = roomTrackingLiveData.q;
                AtomicBoolean atomicBoolean2 = roomTrackingLiveData.r;
                if (roomTrackingLiveData.s.compareAndSet(false, true)) {
                    InvalidationTracker invalidationTracker = roomTrackingLiveData.l.e;
                    k kVar = roomTrackingLiveData.p;
                    invalidationTracker.getClass();
                    kVar.getClass();
                    invalidationTracker.a(new InvalidationTracker.WeakObserver(invalidationTracker, kVar));
                }
                do {
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        z = false;
                        Object objCall = null;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    objCall = roomTrackingLiveData.o.call();
                                    z = true;
                                } catch (Exception e) {
                                    throw new RuntimeException("Exception while computing database live data.", e);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z) {
                            roomTrackingLiveData.i(objCall);
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                boolean z2 = roomTrackingLiveData.c > 0;
                if (roomTrackingLiveData.q.compareAndSet(false, true) && z2) {
                    boolean z3 = roomTrackingLiveData.n;
                    RoomDatabase roomDatabase = roomTrackingLiveData.l;
                    if (z3) {
                        executor = roomDatabase.c;
                        if (executor == null) {
                            yg0.N("internalTransactionExecutor");
                            throw null;
                        }
                    } else {
                        executor = roomDatabase.b;
                        if (executor == null) {
                            yg0.N("internalQueryExecutor");
                            throw null;
                        }
                    }
                    executor.execute(roomTrackingLiveData.t);
                    return;
                }
                return;
        }
    }
}
