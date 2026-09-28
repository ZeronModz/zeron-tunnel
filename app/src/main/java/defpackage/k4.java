package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k4 {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.b("Alarms");
    }

    public static void a(Context context, WorkGenerationalId workGenerationalId, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = uo.f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        uo.d(intent, workGenerationalId);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger loggerA = Logger.a();
        workGenerationalId.toString();
        loggerA.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, long j) {
        SystemIdInfoDao systemIdInfoDaoT = workDatabase.t();
        SystemIdInfo systemIdInfo = systemIdInfoDaoT.getSystemIdInfo(workGenerationalId);
        if (systemIdInfo != null) {
            int i = systemIdInfo.c;
            a(context, workGenerationalId, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i2 = uo.f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            uo.d(intent, workGenerationalId);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        Object objM = idGenerator.a.m(new k60(idGenerator, 1));
        objM.getClass();
        int iIntValue = ((Number) objM).intValue();
        systemIdInfoDaoT.insertSystemIdInfo(new SystemIdInfo(workGenerationalId.a, workGenerationalId.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i3 = uo.f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        uo.d(intent2, workGenerationalId);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
