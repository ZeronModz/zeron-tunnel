package defpackage;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzcjc;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcks;
import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcss;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzdpm;
import com.google.android.gms.internal.ads.zzduu;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzeiw;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d62 implements zzboh {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ d62(zzdnb zzdnbVar, View view) {
        this.a = 1;
        this.b = new WeakReference(zzdnbVar);
        if (((Boolean) zzbd.zzc().a(p32.se)).booleanValue()) {
            this.c = new WeakReference(view);
        } else {
            this.c = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        switch (this.a) {
            case 0:
                zzcjl zzcjlVar = (zzcjl) obj;
                f62.b(map, (zzdjm) this.b);
                String str = (String) map.get("u");
                if (str == null) {
                    zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                ve2 ve2Var = (ve2) this.c;
                q33 q33VarQ = q33.q(f62.a(zzcjlVar, str));
                int i = 0;
                e62 e62Var = new e62(ve2Var, str, i);
                ta2 ta2Var = g3.a;
                i33 i33VarZ = z.Z(q33VarQ, e62Var, ta2Var);
                i33VarZ.addListener(new s33(i, i33VarZ, new z52(zzcjlVar)), ta2Var);
                return;
            case 1:
                zzdnb zzdnbVar = (zzdnb) ((WeakReference) this.b).get();
                if (zzdnbVar == null) {
                    return;
                }
                zzdnbVar.g.zza();
                l32 l32Var = p32.se;
                if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
                    View view = (View) ((WeakReference) this.c).get();
                    tt2 tt2Var = zzdnbVar.j;
                    yj2 yj2Var = zzdnbVar.E;
                    yj2Var.getClass();
                    if (!((Boolean) zzbd.zzc().a(l32Var)).booleanValue() || view == null) {
                        return;
                    }
                    String str2 = true != zzab.zza(view) ? "0" : "1";
                    i31 i31VarA = yj2Var.a.a();
                    i31VarA.c("action", "hcp");
                    i31VarA.c("hcp", str2);
                    i31VarA.b(tt2Var);
                    i31VarA.d();
                    return;
                }
                return;
            case 2:
                zzdpm zzdpmVar = (zzdpm) this.b;
                try {
                    zzdpmVar.f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbmj zzbmjVar = (zzbmj) this.c;
                zzdpmVar.e = (String) map.get("id");
                String str3 = (String) map.get("asset_id");
                if (zzbmjVar == null) {
                    zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbmjVar.zze(str3);
                    return;
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                    return;
                }
                break;
            case 3:
                zzduu zzduuVar = (zzduu) this.b;
                zzcjl zzcjlVar2 = (zzcjl) this.c;
                zzcss zzcssVar = zzduuVar.i;
                synchronized (zzcssVar) {
                    zzcssVar.c.add(zzcjlVar2);
                    zzcsn zzcsnVar = zzcssVar.a;
                    zzcjlVar2.zzab("/updateActiveView", zzcsnVar.e);
                    zzcjlVar2.zzab("/untrackActiveViewUnit", zzcsnVar.f);
                }
                return;
            default:
                zzcjc zzcjcVar = (zzcjc) obj;
                String str4 = (String) map.get("u");
                if (str4 == null) {
                    zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                tt2 tt2VarZzC = zzcjcVar.zzC();
                if (tt2VarZzC != null && !tt2VarZzC.i0) {
                    ((mv2) this.b).b(str4, tt2VarZzC.x0, null, null);
                    return;
                }
                ut2 ut2VarZzaC = ((zzcks) zzcjcVar).zzaC();
                if (ut2VarZzaC == null) {
                    zzt.zzh().f("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                } else {
                    zzeiu zzeiuVar = (zzeiu) this.c;
                    zzeiuVar.a(new mo2(2, zzeiuVar, new zzeiw(zzt.zzk().currentTimeMillis(), ut2VarZzaC.b, str4, 2)));
                    return;
                }
        }
    }

    public /* synthetic */ d62(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
