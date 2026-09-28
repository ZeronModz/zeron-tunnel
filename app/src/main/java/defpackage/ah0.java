package defpackage;

import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements Executor {
    public static volatile ah0 c;
    public final /* synthetic */ int a;
    public final Object b;

    public ah0() {
        this.a = 0;
        this.b = Executors.newFixedThreadPool(2, new x8(3));
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (ah0.class) {
            try {
                if (c == null) {
                    c = new ah0();
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
                break;
            case 1:
                ((WorkManagerTaskExecutor) obj).c.post(runnable);
                break;
            default:
                q qVar = ((w) obj).a.g;
                r.h(qVar);
                qVar.j(runnable);
                break;
        }
    }

    public /* synthetic */ ah0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
