package defpackage;

import android.os.Build;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x20 {
    public static final void a(WorkDatabase workDatabase, Configuration configuration, WorkContinuationImpl workContinuationImpl) {
        int i;
        workDatabase.getClass();
        configuration.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList arrayListB = c.B(workContinuationImpl);
        int i2 = 0;
        while (!arrayListB.isEmpty()) {
            WorkContinuationImpl workContinuationImpl2 = (WorkContinuationImpl) c.H(arrayListB);
            List list = workContinuationImpl2.d;
            list.getClass();
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((WorkRequest) it.next()).b.j.b() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i2 += i;
            List list2 = workContinuationImpl2.g;
            if (list2 != null) {
                arrayListB.addAll(list2);
            }
        }
        if (i2 == 0) {
            return;
        }
        int iCountNonFinishedContentUriTriggerWorkers = workDatabase.w().countNonFinishedContentUriTriggerWorkers();
        int i3 = configuration.k;
        if (iCountNonFinishedContentUriTriggerWorkers + i2 <= i3) {
            return;
        }
        u7.r(hz.q(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", vh.u(i3, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", iCountNonFinishedContentUriTriggerWorkers, ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
    }

    public static final WorkSpec b(List list, WorkSpec workSpec) {
        WorkSpec workSpecB;
        list.getClass();
        boolean zB = workSpec.e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zB2 = workSpec.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zB3 = workSpec.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!zB && zB2 && zB3) {
            String str = workSpec.c;
            Data.Builder builder = new Data.Builder();
            Data data = workSpec.e;
            data.getClass();
            builder.b(data.a);
            builder.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            workSpecB = WorkSpec.b(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", builder.a(), 0, 0L, 0, 0, 0L, 0, 16777195);
        } else {
            workSpecB = workSpec;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return workSpecB;
        }
        Constraints constraints = workSpecB.j;
        String str2 = workSpecB.c;
        if (yg0.a(str2, ConstraintTrackingWorker.class.getName())) {
            return workSpecB;
        }
        if (!constraints.e && !constraints.f) {
            return workSpecB;
        }
        Data.Builder builder2 = new Data.Builder();
        Data data2 = workSpecB.e;
        data2.getClass();
        builder2.b(data2.a);
        builder2.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
        return WorkSpec.b(workSpecB, null, null, ConstraintTrackingWorker.class.getName(), builder2.a(), 0, 0L, 0, 0, 0L, 0, 16777195);
    }
}
