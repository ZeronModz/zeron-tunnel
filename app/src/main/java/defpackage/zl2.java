package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzdxa;
import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnv;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zl2 implements zzfnv {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public zl2(zzbgd zzbgdVar, Map map) {
        this.b = map;
        this.c = zzbgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
        int i = this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        switch (this.a) {
            case 0:
                Map map = (Map) this.b;
                if (map.containsKey(zzfnoVar)) {
                    ((zzbgd) this.c).b(((zzdxa) map.get(zzfnoVar)).a);
                    return;
                }
                return;
            default:
                if (((Boolean) zzbd.zzc().a(p32.f7)).booleanValue()) {
                    if (zzfno.RENDERER == zzfnoVar) {
                        zzehr zzehrVar = (zzehr) this.b;
                        long jElapsedRealtime = zzt.zzk().elapsedRealtime();
                        synchronized (zzehrVar) {
                            synchronized (zzehrVar.i) {
                                zzehrVar.d = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    if (zzfno.PRELOADED_LOADER == zzfnoVar || zzfno.SERVER_TRANSACTION == zzfnoVar) {
                        zzehr zzehrVar2 = (zzehr) this.b;
                        zzehrVar2.a(zzt.zzk().elapsedRealtime());
                        so2 so2Var = (so2) this.c;
                        ((zzehn) so2Var.b).a(new an(so2Var, zzehrVar2.b(), 2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        switch (this.a) {
            case 0:
                Map map = (Map) this.b;
                if (map.containsKey(zzfnoVar)) {
                    ((zzbgd) this.c).b(((zzdxa) map.get(zzfnoVar)).c);
                    return;
                }
                return;
            default:
                if (((Boolean) zzbd.zzc().a(p32.f7)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
                    zzehr zzehrVar = (zzehr) this.b;
                    if (zzehrVar.e() != 0) {
                        long jElapsedRealtime = zzt.zzk().elapsedRealtime() - zzehrVar.e();
                        synchronized (zzehrVar) {
                            synchronized (zzehrVar.j) {
                                zzehrVar.e = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        switch (this.a) {
            case 0:
                Map map = (Map) this.b;
                if (map.containsKey(zzfnoVar)) {
                    ((zzbgd) this.c).b(((zzdxa) map.get(zzfnoVar)).b);
                    return;
                }
                return;
            default:
                if (((Boolean) zzbd.zzc().a(p32.f7)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
                    zzehr zzehrVar = (zzehr) this.b;
                    if (zzehrVar.e() != 0) {
                        long jElapsedRealtime = zzt.zzk().elapsedRealtime() - zzehrVar.e();
                        synchronized (zzehrVar) {
                            synchronized (zzehrVar.j) {
                                zzehrVar.e = jElapsedRealtime;
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zl2(zzehr zzehrVar, so2 so2Var) {
        this.b = zzehrVar;
        this.c = so2Var;
    }

    private final void a(zzfno zzfnoVar, String str) {
    }

    private final void b(zzfno zzfnoVar, String str) {
    }
}
