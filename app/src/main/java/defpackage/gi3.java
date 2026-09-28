package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gi3 extends oi3 {
    public final AlarmManager d;
    public c0 e;
    public Integer f;

    public gi3(g0 g0Var) {
        super(g0Var);
        this.d = (AlarmManager) this.a.a.getSystemService("alarm");
    }

    @Override // defpackage.oi3
    public final void d() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(h());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            f();
        }
    }

    public final void e() {
        b();
        m mVar = this.a.f;
        r.h(mVar);
        mVar.n.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(h());
        }
        c0 c0Var = this.e;
        if (c0Var == null) {
            c0Var = new c0(this, this.b.l, 1);
            this.e = c0Var;
        }
        c0Var.c();
        if (Build.VERSION.SDK_INT >= 24) {
            f();
        }
    }

    public final void f() {
        JobScheduler jobScheduler = (JobScheduler) this.a.a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(g());
        }
    }

    public final int g() {
        Integer numValueOf = this.f;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf("measurement".concat(String.valueOf(this.a.a.getPackageName())).hashCode());
            this.f = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final PendingIntent h() {
        Context context = this.a.a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), za2.a);
    }
}
