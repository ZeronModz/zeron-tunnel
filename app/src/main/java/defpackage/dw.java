package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.g;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ew b;

    public /* synthetic */ dw(ew ewVar, int i) {
        this.a = i;
        this.b = ewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ew ewVar = this.b;
        switch (i) {
            case 0:
                int i2 = ewVar.b;
                Executor executor = ewVar.i;
                Context context = ewVar.a;
                hd1 hd1Var = ewVar.d;
                WorkGenerationalId workGenerationalId = ewVar.c;
                if (ewVar.g >= 2) {
                    Logger.a().getClass();
                    return;
                }
                ewVar.g = 2;
                Logger.a().getClass();
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                uo.d(intent, workGenerationalId);
                executor.execute(new f7(hd1Var, intent, i2, 4));
                if (!hd1Var.d.f(workGenerationalId.a)) {
                    Logger.a().getClass();
                    return;
                }
                Logger.a().getClass();
                Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                uo.d(intent2, workGenerationalId);
                executor.execute(new f7(hd1Var, intent2, i2, 4));
                return;
            default:
                if (ewVar.g != 0) {
                    Logger loggerA = Logger.a();
                    ewVar.c.toString();
                    loggerA.getClass();
                    return;
                }
                ewVar.g = 1;
                Logger loggerA2 = Logger.a();
                ewVar.c.toString();
                loggerA2.getClass();
                if (!ewVar.d.d.h(ewVar.l, null)) {
                    ewVar.a();
                    return;
                }
                WorkTimer workTimer = ewVar.d.c;
                WorkGenerationalId workGenerationalId2 = ewVar.c;
                synchronized (workTimer.d) {
                    Logger loggerA3 = Logger.a();
                    int i3 = WorkTimer.e;
                    workGenerationalId2.toString();
                    loggerA3.getClass();
                    workTimer.a(workGenerationalId2);
                    g gVar = new g(workTimer, workGenerationalId2);
                    workTimer.b.put(workGenerationalId2, gVar);
                    workTimer.c.put(workGenerationalId2, ewVar);
                    workTimer.a.scheduleWithDelay(600000L, gVar);
                    break;
                }
                return;
        }
    }
}
