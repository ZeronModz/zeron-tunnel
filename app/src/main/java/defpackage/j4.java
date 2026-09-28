package defpackage;

import android.os.Process;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.v2ray.ang.ui.HomeFragment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ j4(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
            case 2:
                return;
            default:
                int i2 = HomeFragment.f2;
                Process.killProcess(Process.myPid());
                System.exit(1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
