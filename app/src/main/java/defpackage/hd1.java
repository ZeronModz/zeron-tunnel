package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 implements ExecutionListener {
    public static final /* synthetic */ int l = 0;
    public final Context a;
    public final TaskExecutor b;
    public final WorkTimer c;
    public final Processor d;
    public final WorkManagerImpl e;
    public final uo f;
    public final ArrayList g;
    public Intent h;
    public SystemAlarmService i;
    public final StartStopTokens j;
    public final WorkLauncher k;

    static {
        Logger.b("SystemAlarmDispatcher");
    }

    public hd1(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.a = applicationContext;
        int i = ba1.a;
        StartStopTokens.Companion.getClass();
        StartStopTokens startStopTokensA = a.a(true);
        this.j = startStopTokensA;
        WorkManagerImpl workManagerImplD = WorkManagerImpl.d(systemAlarmService);
        this.e = workManagerImplD;
        this.f = new uo(applicationContext, workManagerImplD.c.d, startStopTokensA);
        this.c = new WorkTimer(workManagerImplD.c.g);
        Processor processor = workManagerImplD.g;
        this.d = processor;
        TaskExecutor taskExecutor = workManagerImplD.e;
        this.b = taskExecutor;
        this.k = new WorkLauncherImpl(processor, taskExecutor);
        processor.a(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        u7.p("Needs to be invoked on the main thread.");
    }

    public final void a(int i, Intent intent) {
        Logger loggerA = Logger.a();
        intent.toString();
        loggerA.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.a().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && c()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            try {
                boolean zIsEmpty = this.g.isEmpty();
                this.g.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        b();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        b();
        PowerManager.WakeLock wakeLockA = mp1.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.e.executeOnTaskThread(new g6(this, 25));
        } finally {
            wakeLockA.release();
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
        Executor mainThreadExecutor = this.b.getMainThreadExecutor();
        int i = uo.f;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        uo.d(intent, workGenerationalId);
        mainThreadExecutor.execute(new f7(this, intent, 0, 4));
    }
}
