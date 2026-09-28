package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class sd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj3 b;
    public final /* synthetic */ zzjd c;

    public /* synthetic */ sd3(zzjd zzjdVar, wj3 wj3Var, int i) {
        this.a = i;
        this.b = wj3Var;
        this.c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        wj3 wj3Var = this.b;
        zzjd zzjdVar = this.c;
        switch (i) {
            case 0:
                g0 g0Var = zzjdVar.a;
                g0Var.w();
                g0Var.T(wj3Var);
                break;
            case 1:
                g0 g0Var2 = zzjdVar.a;
                g0Var2.w();
                if (g0Var2.y != null) {
                    ArrayList arrayList = new ArrayList();
                    g0Var2.z = arrayList;
                    arrayList.addAll(g0Var2.y);
                }
                e eVar = g0Var2.c;
                g0.P(eVar);
                r rVar = eVar.a;
                String str = wj3Var.a;
                yg0.m(str);
                yg0.j(str);
                eVar.a();
                eVar.b();
                try {
                    SQLiteDatabase sQLiteDatabaseP = eVar.P();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseP.delete("apps", "app_id=?", strArr) + sQLiteDatabaseP.delete("events", "app_id=?", strArr) + sQLiteDatabaseP.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseP.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseP.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseP.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseP.delete("queue", "app_id=?", strArr) + sQLiteDatabaseP.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseP.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseP.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseP.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseP.delete("upload_queue", "app_id=?", strArr);
                    ((zzpp) zzpo.b.a.get()).zza();
                    if (rVar.d.k(null, l.i1)) {
                        iDelete += sQLiteDatabaseP.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        m mVar = rVar.f;
                        r.h(mVar);
                        mVar.n.c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e) {
                    m mVar2 = rVar.f;
                    r.h(mVar2);
                    mVar2.f.c("Error resetting analytics data. appId, error", m.e(str), e);
                }
                if (wj3Var.h) {
                    g0Var2.T(wj3Var);
                }
                break;
            default:
                g0 g0Var3 = zzjdVar.a;
                g0Var3.w();
                g0Var3.i0(wj3Var);
                break;
        }
    }
}
