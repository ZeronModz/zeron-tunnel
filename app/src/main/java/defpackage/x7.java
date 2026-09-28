package defpackage;

import android.os.Looper;
import androidx.arch.core.executor.DefaultTaskExecutor;
import androidx.arch.core.executor.TaskExecutor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x7 extends TaskExecutor {
    public static volatile x7 b;
    public static final s3 c = new s3(1);
    public final DefaultTaskExecutor a = new DefaultTaskExecutor();

    public static x7 a() {
        if (b != null) {
            return b;
        }
        synchronized (x7.class) {
            try {
                if (b == null) {
                    b = new x7();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void b(Runnable runnable) {
        DefaultTaskExecutor defaultTaskExecutor = this.a;
        if (defaultTaskExecutor.c == null) {
            synchronized (defaultTaskExecutor.a) {
                try {
                    if (defaultTaskExecutor.c == null) {
                        defaultTaskExecutor.c = DefaultTaskExecutor.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        defaultTaskExecutor.c.post(runnable);
    }
}
