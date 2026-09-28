package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w02 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final m12 f;

    public w02(r rVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        m12 m12Var;
        yg0.j(str2);
        yg0.j(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            m mVar = rVar.f;
            r.h(mVar);
            mVar.i.b(m.e(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            m12Var = new m12(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    m mVar2 = rVar.f;
                    r.h(mVar2);
                    mVar2.f.a("Param name can't be null");
                    it.remove();
                } else {
                    h0 h0Var = rVar.i;
                    r.f(h0Var);
                    Object objH = h0Var.h(bundle2.get(next), next);
                    if (objH == null) {
                        m mVar3 = rVar.f;
                        r.h(mVar3);
                        mVar3.i.b(rVar.j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        h0 h0Var2 = rVar.i;
                        r.f(h0Var2);
                        h0Var2.p(bundle2, next, objH);
                    }
                }
            }
            m12Var = new m12(bundle2);
        }
        this.f = m12Var;
    }

    public final w02 a(r rVar, long j) {
        return new w02(rVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String string = this.f.a.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        hz.H(sb, "Event{appId='", str, "', name='", str2);
        return vh.t(sb, "', params=", string, "}");
    }

    public w02(r rVar, String str, String str2, String str3, long j, long j2, m12 m12Var) {
        yg0.j(str2);
        yg0.j(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            m mVar = rVar.f;
            r.h(mVar);
            mVar.i.c("Event created with reverse previous/current timestamps. appId, name", m.e(str2), m.e(str3));
        }
        this.f = m12Var;
    }
}
