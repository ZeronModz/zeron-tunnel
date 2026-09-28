package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.multiprocess.RemoteWorkManagerClient;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w21 {
    public static w21 a(Context context) {
        WorkManagerImpl workManagerImplD = WorkManagerImpl.d(context);
        if (workManagerImplD.k == null) {
            synchronized (WorkManagerImpl.p) {
                try {
                    if (workManagerImplD.k == null) {
                        try {
                            oi oiVar = RemoteWorkManagerClient.i;
                            workManagerImplD.k = (w21) RemoteWorkManagerClient.class.getConstructor(Context.class, WorkManagerImpl.class).newInstance(workManagerImplD.b, workManagerImplD);
                        } catch (Throwable unused) {
                            Logger.a().getClass();
                        }
                        if (workManagerImplD.k == null && !TextUtils.isEmpty(workManagerImplD.c.h)) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } finally {
                }
            }
        }
        w21 w21Var = workManagerImplD.k;
        if (w21Var != null) {
            return w21Var;
        }
        u7.p("Unable to initialize RemoteWorkManager");
        return null;
    }
}
