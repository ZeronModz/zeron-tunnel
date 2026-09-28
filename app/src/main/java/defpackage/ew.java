package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ew implements OnConstraintsStateChangedListener, WorkTimer.TimeLimitExceededListener {
    public final Context a;
    public final int b;
    public final WorkGenerationalId c;
    public final hd1 d;
    public final WorkConstraintsTracker e;
    public final Object f;
    public int g;
    public final SerialExecutor h;
    public final Executor i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final StartStopToken l;
    public final CoroutineDispatcher m;
    public volatile Job n;

    static {
        Logger.b("DelayMetCommandHandler");
    }

    public ew(Context context, int i, hd1 hd1Var, StartStopToken startStopToken) {
        this.a = context;
        this.b = i;
        this.d = hd1Var;
        this.c = startStopToken.a;
        this.l = startStopToken;
        Trackers trackers = hd1Var.e.l;
        TaskExecutor taskExecutor = hd1Var.b;
        this.h = taskExecutor.getSerialTaskExecutor();
        this.i = taskExecutor.getMainThreadExecutor();
        this.m = taskExecutor.getTaskCoroutineDispatcher();
        this.e = new WorkConstraintsTracker(trackers);
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    public final void a() {
        synchronized (this.f) {
            try {
                if (this.n != null) {
                    this.n.cancel((CancellationException) null);
                }
                this.d.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger loggerA = Logger.a();
                    Objects.toString(this.j);
                    this.c.toString();
                    loggerA.getClass();
                    this.j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        String str = this.c.a;
        Context context = this.a;
        StringBuilder sbZ = hz.z(str, " (");
        sbZ.append(this.b);
        sbZ.append(")");
        this.j = mp1.a(context, sbZ.toString());
        Logger loggerA = Logger.a();
        Objects.toString(this.j);
        loggerA.getClass();
        this.j.acquire();
        WorkSpec workSpec = this.d.e.d.w().getWorkSpec(str);
        if (workSpec == null) {
            this.h.execute(new dw(this, 0));
            return;
        }
        boolean zC = workSpec.c();
        this.k = zC;
        if (zC) {
            this.n = b.a(this.e, workSpec, this.m, this);
        } else {
            Logger.a().getClass();
            this.h.execute(new dw(this, 1));
        }
    }

    public final void c(boolean z) {
        Logger loggerA = Logger.a();
        WorkGenerationalId workGenerationalId = this.c;
        workGenerationalId.toString();
        loggerA.getClass();
        a();
        int i = this.b;
        hd1 hd1Var = this.d;
        Executor executor = this.i;
        Context context = this.a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            uo.d(intent, workGenerationalId);
            executor.execute(new f7(hd1Var, intent, i, 4));
        }
        if (this.k) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new f7(hd1Var, intent2, i, 4));
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        boolean z = constraintsState instanceof ar;
        SerialExecutor serialExecutor = this.h;
        if (z) {
            serialExecutor.execute(new dw(this, 1));
        } else {
            serialExecutor.execute(new dw(this, 0));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public final void onTimeLimitExceeded(WorkGenerationalId workGenerationalId) {
        Logger loggerA = Logger.a();
        Objects.toString(workGenerationalId);
        loggerA.getClass();
        this.h.execute(new dw(this, 0));
    }
}
