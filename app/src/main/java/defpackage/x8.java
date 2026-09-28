package defpackage;

import com.google.android.gms.internal.ads.zzccq;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x8 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public x8(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                break;
            case 2:
                this.b = new AtomicInteger(0);
                break;
            case 3:
                this.b = new AtomicInteger(0);
                break;
            case 4:
                this.b = new AtomicInteger(1);
                break;
            case 5:
            default:
                this.b = new AtomicInteger(0);
                break;
            case 6:
                this.b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(new w2(runnable, 1));
                Locale locale = Locale.US;
                thread.setName("CameraX-camerax_audio_" + atomicInteger.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-core_camera_" + atomicInteger.getAndIncrement());
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread3;
            case 3:
                Thread thread4 = new Thread(runnable);
                Locale locale3 = Locale.US;
                thread4.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
                return thread4;
            case 4:
                return new Thread(runnable, "ModernAsyncTask #" + atomicInteger.getAndIncrement());
            case 5:
                int andIncrement = atomicInteger.getAndIncrement();
                return new Thread(runnable, vh.i(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            default:
                int andIncrement2 = atomicInteger.getAndIncrement();
                return new Thread(runnable, vh.i(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
        }
    }

    public x8(zzccq zzccqVar) {
        this.a = 5;
        this.b = new AtomicInteger(1);
    }
}
