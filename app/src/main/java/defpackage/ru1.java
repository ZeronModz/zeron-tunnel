package defpackage;

import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ru1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zzd d;

    public /* synthetic */ ru1(zzd zzdVar, String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        String str = this.b;
        zzd zzdVar = this.d;
        switch (i) {
            case 0:
                zzdVar.a();
                yg0.j(str);
                ArrayMap arrayMap = zzdVar.c;
                if (arrayMap.isEmpty()) {
                    zzdVar.d = j;
                }
                Integer num = (Integer) arrayMap.get(str);
                if (num != null) {
                    arrayMap.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (arrayMap.c < 100) {
                    arrayMap.put(str, 1);
                    zzdVar.b.put(str, Long.valueOf(j));
                } else {
                    m mVar = zzdVar.a.f;
                    r.h(mVar);
                    mVar.i.a("Too many ads visible");
                }
                break;
            default:
                zzdVar.a();
                yg0.j(str);
                ArrayMap arrayMap2 = zzdVar.c;
                Integer num2 = (Integer) arrayMap2.get(str);
                r rVar = zzdVar.a;
                if (num2 == null) {
                    m mVar2 = rVar.f;
                    r.h(mVar2);
                    mVar2.f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    zzmb zzmbVar = rVar.l;
                    m mVar3 = rVar.f;
                    r.g(zzmbVar);
                    zzlu zzluVarG = zzmbVar.g(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        arrayMap2.put(str, Integer.valueOf(iIntValue));
                    } else {
                        arrayMap2.remove(str);
                        ArrayMap arrayMap3 = zzdVar.b;
                        Long l = (Long) arrayMap3.get(str);
                        if (l == null) {
                            r.h(mVar3);
                            mVar3.f.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            arrayMap3.remove(str);
                            zzdVar.f(str, jLongValue, zzluVarG);
                        }
                        if (arrayMap2.isEmpty()) {
                            long j2 = zzdVar.d;
                            if (j2 != 0) {
                                zzdVar.e(j - j2, zzluVarG);
                                zzdVar.d = 0L;
                            } else {
                                r.h(mVar3);
                                mVar3.f.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
