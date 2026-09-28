package defpackage;

import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sc0 implements Executor {
    public static volatile sc0 c;
    public final /* synthetic */ int a;
    public final Object b;

    public sc0(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new zzf(Looper.getMainLooper());
                break;
            default:
                this.b = Executors.newSingleThreadExecutor(new rc0(0));
                break;
        }
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (sc0.class) {
            try {
                if (c == null) {
                    c = new sc0(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                return;
            case 1:
                ((Executor) obj).execute(new s41(runnable, 0));
                return;
            default:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((zzf) obj).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    zzt.zzc();
                    zzs.zzR(zzt.zzh().e, th);
                    throw th;
                }
        }
    }

    public sc0(ExecutorService executorService) {
        this.a = 1;
        this.b = executorService;
    }
}
