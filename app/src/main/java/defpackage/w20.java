package defpackage;

import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w20 {
    static {
        Logger.b("EnqueueRunnable");
    }

    public static void a(WorkContinuationImpl workContinuationImpl) {
        WorkManagerImpl workManagerImpl = workContinuationImpl.a;
        if (WorkContinuationImpl.b(workContinuationImpl, new HashSet())) {
            io0.n("WorkContinuation has cycles (", workContinuationImpl, ")");
            return;
        }
        WorkDatabase workDatabase = workManagerImpl.d;
        Configuration configuration = workManagerImpl.c;
        workDatabase.c();
        try {
            x20.a(workDatabase, configuration, workContinuationImpl);
            boolean zB = b(workContinuationImpl);
            workDatabase.o();
            if (zB) {
                e51.b(configuration, workManagerImpl.d, workManagerImpl.f);
            }
        } finally {
            workDatabase.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(androidx.work.impl.WorkContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w20.b(androidx.work.impl.WorkContinuationImpl):boolean");
    }
}
