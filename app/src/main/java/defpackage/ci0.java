package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci0 {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.b("SystemJobScheduler");
    }

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? w1.b(jobScheduler) : jobScheduler;
    }
}
