package defpackage;

import android.os.Handler;
import com.android.volley.Request;
import com.android.volley.b;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzday;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public h4(zzmb zzmbVar, zzlu zzluVar, long j) {
        this.a = 5;
        this.c = zzluVar;
        this.b = j;
        Objects.requireNonNull(zzmbVar);
        this.d = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                d4 d4Var = (d4) obj;
                String strM = ul1.m();
                if (strM != null) {
                    d4Var.accept(strM);
                } else if (System.currentTimeMillis() - j < 15000) {
                    ((Handler) obj2).postDelayed(this, 1000L);
                } else {
                    d4Var.accept(null);
                }
                break;
            case 1:
                Request request = (Request) obj2;
                b bVar = request.a;
                bVar.a(j, (String) obj);
                bVar.b(request.toString());
                break;
            case 2:
                String str = wt2.a;
                ((zzadl) obj).b.zzg(obj2, j);
                break;
            case 3:
                zzary zzaryVar = (zzary) obj2;
                zzaryVar.zzx().a(j, (String) obj);
                zzaryVar.zzx().b(zzaryVar.toString());
                break;
            case 4:
                zzfsa zzfsaVar = (zzfsa) obj2;
                sv2 sv2Var = zzfsaVar.r;
                if (sv2Var != null) {
                    zzea zzeaVar = (zzea) obj;
                    uv2 uv2Var = zzfsaVar.t;
                    sv2Var.g("paa", "pano_ts", this.b, zzfsaVar.e.zzd, zzfsaVar.r(), zzeaVar instanceof zzday ? ((zzday) zzeaVar).d : null, uv2Var, zzfsaVar.f());
                }
                break;
            default:
                zzmb zzmbVar = (zzmb) obj2;
                zzmbVar.e((zzlu) obj, false, j);
                zzmbVar.e = null;
                z zVarJ = zzmbVar.a.j();
                zVarJ.a();
                zVarJ.b();
                zVarJ.o(new qj2(zVarJ, null));
                break;
        }
    }

    public /* synthetic */ h4(Comparable comparable, String str, long j, int i) {
        this.a = i;
        this.d = comparable;
        this.c = str;
        this.b = j;
    }

    public h4(zzfsa zzfsaVar, long j, zzea zzeaVar) {
        this.a = 4;
        this.b = j;
        this.c = zzeaVar;
        this.d = zzfsaVar;
    }

    public /* synthetic */ h4(zzadl zzadlVar, Object obj, long j) {
        this.a = 2;
        this.c = zzadlVar;
        this.d = obj;
        this.b = j;
    }

    public h4(d4 d4Var, long j, Handler handler) {
        this.a = 0;
        this.c = d4Var;
        this.b = j;
        this.d = handler;
    }
}
