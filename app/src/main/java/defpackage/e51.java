package defpackage;

import android.os.Build;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e51 {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.b("Schedulers");
    }

    public static void a(WorkSpecDao workSpecDao, Clock clock, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.markWorkSpecScheduled(((WorkSpec) it.next()).a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(Configuration configuration, WorkDatabase workDatabase, List list) {
        List<WorkSpec> eligibleWorkForSchedulingWithContentUris;
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDaoW = workDatabase.w();
        workDatabase.c();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                eligibleWorkForSchedulingWithContentUris = workSpecDaoW.getEligibleWorkForSchedulingWithContentUris();
                a(workSpecDaoW, configuration.d, eligibleWorkForSchedulingWithContentUris);
            } else {
                eligibleWorkForSchedulingWithContentUris = null;
            }
            List<WorkSpec> eligibleWorkForScheduling = workSpecDaoW.getEligibleWorkForScheduling(configuration.l);
            a(workSpecDaoW, configuration.d, eligibleWorkForScheduling);
            if (eligibleWorkForSchedulingWithContentUris != null) {
                eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
            }
            List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDaoW.getAllEligibleWorkSpecsForScheduling(200);
            workDatabase.o();
            workDatabase.f();
            if (eligibleWorkForScheduling.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[eligibleWorkForScheduling.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Scheduler scheduler = (Scheduler) it.next();
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(workSpecArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler2 = (Scheduler) it2.next();
                    if (!scheduler2.hasLimitedSchedulingSlots()) {
                        scheduler2.schedule(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
