package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j13 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ m f;

    public j13(m mVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f;
        f63 f63Var = mVar.a.e;
        r.f(f63Var);
        if (!f63Var.b) {
            Log.println(6, mVar.g(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (mVar.c == 0) {
            b bVar = mVar.a.d;
            if (bVar.e == null) {
                synchronized (bVar) {
                    try {
                        if (bVar.e == null) {
                            r rVar = bVar.a;
                            ApplicationInfo applicationInfo = rVar.a.getApplicationInfo();
                            String strJ = j5.j();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                bVar.e = Boolean.valueOf(str != null && str.equals(strJ));
                            }
                            if (bVar.e == null) {
                                bVar.e = Boolean.TRUE;
                                m mVar2 = rVar.f;
                                r.h(mVar2);
                                mVar2.f.a("My process not in the list of running processes");
                            }
                        }
                    } finally {
                    }
                }
            }
            if (bVar.e.booleanValue()) {
                mVar.c = 'C';
            } else {
                mVar.c = 'c';
            }
        }
        long j = mVar.d;
        if (j < 0) {
            mVar.a.d.f();
            j = 133005;
            mVar.d = 133005L;
        }
        int i = this.a;
        char c = mVar.c;
        String str2 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        char cCharAt = "01VDIWEA?".charAt(i);
        String strH = m.h(true, str2, obj, obj2, obj3);
        StringBuilder sb = new StringBuilder(vh.b(String.valueOf(cCharAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + strH.length());
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strH);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = str2.substring(0, 1024);
        }
        an anVar = f63Var.e;
        if (anVar != null) {
            f63 f63Var2 = (f63) anVar.c;
            f63Var2.a();
            if (((f63) anVar.c).e().getLong("health_monitor:start", 0L) == 0) {
                anVar.i();
            }
            long j2 = f63Var2.e().getLong("health_monitor:count", 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor editorEdit = f63Var2.e().edit();
                editorEdit.putString("health_monitor:value", string);
                editorEdit.putLong("health_monitor:count", 1L);
                editorEdit.apply();
                return;
            }
            h0 h0Var = f63Var2.a.i;
            r.f(h0Var);
            long jNextLong = h0Var.Y().nextLong() & Long.MAX_VALUE;
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor editorEdit2 = f63Var2.e().edit();
            if (jNextLong < j4) {
                editorEdit2.putString("health_monitor:value", string);
            }
            editorEdit2.putLong("health_monitor:count", j3);
            editorEdit2.apply();
        }
    }
}
