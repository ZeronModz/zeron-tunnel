package defpackage;

import android.os.SystemClock;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g31 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final Transport h;
    public final OnDemandCounter i;
    public int j;
    public long k;

    public g31(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        double d = settings.d;
        double d2 = settings.e;
        long j = ((long) settings.f) * 1000;
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = transport;
        this.i = onDemandCounter;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource taskCompletionSource) {
        Logger.b.a(3);
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        this.h.schedule(new cb(crashlyticsReportWithSessionId.a(), Priority.HIGHEST, null), new TransportScheduleCallback() { // from class: f31
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) throws Throwable {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.c(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new ez0(6, this.a, countDownLatch)).start();
                    ExecutorService executorService = vl1.a;
                    boolean z3 = false;
                    try {
                        long jNanoTime = 2000000000;
                        long jNanoTime2 = System.nanoTime() + 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                jNanoTime = jNanoTime2 - System.nanoTime();
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                taskCompletionSource2.d(crashlyticsReportWithSessionId);
            }
        });
    }
}
