package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.Clock;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uo implements ExecutionListener {
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final Clock d;
    public final StartStopTokens e;

    static {
        Logger.b("CommandHandler");
    }

    public uo(Context context, Clock clock, StartStopTokens startStopTokens) {
        this.a = context;
        this.d = clock;
        this.e = startStopTokens;
    }

    public static WorkGenerationalId c(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId.b);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public final void b(Intent intent, int i, hd1 hd1Var) {
        List<StartStopToken> listRemove;
        String action = intent.getAction();
        int i2 = 4;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger loggerA = Logger.a();
            intent.toString();
            loggerA.getClass();
            Context context = this.a;
            zq zqVar = new zq(context, this.d, i, hd1Var);
            List<WorkSpec> scheduledWork = hd1Var.e.d.w().getScheduledWork();
            int i3 = vq.a;
            Iterator<WorkSpec> it = scheduledWork.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                Constraints constraints = it.next().j;
                z |= constraints.e;
                z2 |= constraints.c;
                z3 |= constraints.f;
                z4 |= constraints.a != NetworkType.NOT_REQUIRED;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i4 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList<WorkSpec> arrayList = new ArrayList(scheduledWork.size());
            long jCurrentTimeMillis = zqVar.a.currentTimeMillis();
            for (WorkSpec workSpec : scheduledWork) {
                if (jCurrentTimeMillis >= workSpec.a() && (!workSpec.c() || zqVar.c.a(workSpec))) {
                    arrayList.add(workSpec);
                }
            }
            for (WorkSpec workSpec2 : arrayList) {
                String str = workSpec2.a;
                WorkGenerationalId workGenerationalIdW = if3.w(workSpec2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, workGenerationalIdW);
                Logger loggerA2 = Logger.a();
                int i5 = zq.d;
                loggerA2.getClass();
                hd1Var.b.getMainThreadExecutor().execute(new f7(hd1Var, intent3, zqVar.b, i2));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger loggerA3 = Logger.a();
            intent.toString();
            loggerA3.getClass();
            hd1Var.e.g();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            Logger.a().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.a;
            WorkGenerationalId workGenerationalIdC = c(intent);
            Logger loggerA4 = Logger.a();
            workGenerationalIdC.toString();
            loggerA4.getClass();
            WorkDatabase workDatabase = hd1Var.e.d;
            workDatabase.c();
            try {
                WorkSpec workSpec3 = workDatabase.w().getWorkSpec(workGenerationalIdC.a);
                if (workSpec3 == null) {
                    Logger loggerA5 = Logger.a();
                    workGenerationalIdC.toString();
                    loggerA5.getClass();
                    return;
                }
                if (workSpec3.b.isFinished()) {
                    Logger loggerA6 = Logger.a();
                    workGenerationalIdC.toString();
                    loggerA6.getClass();
                    return;
                }
                long jA = workSpec3.a();
                if (workSpec3.c()) {
                    Logger loggerA7 = Logger.a();
                    workGenerationalIdC.toString();
                    loggerA7.getClass();
                    k4.b(context2, workDatabase, workGenerationalIdC, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    hd1Var.b.getMainThreadExecutor().execute(new f7(hd1Var, intent4, i, i2));
                } else {
                    Logger loggerA8 = Logger.a();
                    workGenerationalIdC.toString();
                    loggerA8.getClass();
                    k4.b(context2, workDatabase, workGenerationalIdC, jA);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.c) {
                try {
                    WorkGenerationalId workGenerationalIdC2 = c(intent);
                    Logger loggerA9 = Logger.a();
                    workGenerationalIdC2.toString();
                    loggerA9.getClass();
                    if (this.b.containsKey(workGenerationalIdC2)) {
                        Logger loggerA10 = Logger.a();
                        workGenerationalIdC2.toString();
                        loggerA10.getClass();
                    } else {
                        ew ewVar = new ew(this.a, i, hd1Var, this.e.tokenFor(workGenerationalIdC2));
                        this.b.put(workGenerationalIdC2, ewVar);
                        ewVar.b();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                Logger loggerA11 = Logger.a();
                intent.toString();
                loggerA11.getClass();
                return;
            } else {
                WorkGenerationalId workGenerationalIdC3 = c(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                Logger loggerA12 = Logger.a();
                intent.toString();
                loggerA12.getClass();
                onExecuted(workGenerationalIdC3, z5);
                return;
            }
        }
        StartStopTokens startStopTokens = this.e;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i6 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            StartStopToken startStopTokenRemove = startStopTokens.remove(new WorkGenerationalId(string, i6));
            listRemove = arrayList2;
            if (startStopTokenRemove != null) {
                arrayList2.add(startStopTokenRemove);
                listRemove = arrayList2;
            }
        } else {
            listRemove = startStopTokens.remove(string);
        }
        for (StartStopToken startStopToken : listRemove) {
            Logger.a().getClass();
            hd1Var.k.stopWork(startStopToken);
            Context context3 = this.a;
            WorkDatabase workDatabase2 = hd1Var.e.d;
            WorkGenerationalId workGenerationalId = startStopToken.a;
            int i7 = k4.a;
            SystemIdInfoDao systemIdInfoDaoT = workDatabase2.t();
            SystemIdInfo systemIdInfo = systemIdInfoDaoT.getSystemIdInfo(workGenerationalId);
            if (systemIdInfo != null) {
                k4.a(context3, workGenerationalId, systemIdInfo.c);
                Logger loggerA13 = Logger.a();
                workGenerationalId.toString();
                loggerA13.getClass();
                systemIdInfoDaoT.removeSystemIdInfo(workGenerationalId);
            }
            hd1Var.onExecuted(startStopToken.a, false);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.c) {
            try {
                ew ewVar = (ew) this.b.remove(workGenerationalId);
                this.e.remove(workGenerationalId);
                if (ewVar != null) {
                    ewVar.c(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
