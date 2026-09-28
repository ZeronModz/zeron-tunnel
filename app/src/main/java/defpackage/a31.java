package defpackage;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import androidx.work.multiprocess.RemoteForegroundUpdater;
import androidx.work.multiprocess.RemoteProgressUpdater;
import androidx.work.multiprocess.RemoteWorkerService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a31 {
    public static final Object e = new Object();
    public static volatile a31 f;
    public final Configuration a;
    public final TaskExecutor b;
    public final RemoteProgressUpdater c;
    public final RemoteForegroundUpdater d;

    /* JADX WARN: Multi-variable type inference failed */
    public a31(RemoteWorkerService remoteWorkerService) {
        Configuration configuration;
        WorkManagerImpl workManagerImplC = WorkManagerImpl.c();
        if (workManagerImplC != null) {
            this.a = workManagerImplC.c;
            this.b = workManagerImplC.e;
        } else {
            Context applicationContext = remoteWorkerService.getApplicationContext();
            if (applicationContext instanceof Configuration.Provider) {
                configuration = ((Configuration.Provider) applicationContext).getWorkManagerConfiguration();
                this.a = configuration;
            } else {
                Configuration.Builder builder = new Configuration.Builder();
                String packageName = applicationContext.getPackageName();
                packageName.getClass();
                builder.g = packageName;
                configuration = new Configuration(builder);
                this.a = configuration;
            }
            this.b = new WorkManagerTaskExecutor(configuration.c);
        }
        this.c = new RemoteProgressUpdater();
        this.d = new RemoteForegroundUpdater();
    }
}
