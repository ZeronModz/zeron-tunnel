package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzclj;
import com.google.android.gms.internal.ads.zzdrp;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk2 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ tt2 c;
    public final /* synthetic */ ut2 d;
    public final /* synthetic */ zzb e;
    public final /* synthetic */ zzcce f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object i;

    public /* synthetic */ mk2(Object obj, zzr zzrVar, tt2 tt2Var, ut2 ut2Var, zzb zzbVar, zzcce zzcceVar, String str, String str2, int i) {
        this.a = i;
        this.i = obj;
        this.b = zzrVar;
        this.c = tt2Var;
        this.d = ut2Var;
        this.e = zzbVar;
        this.f = zzcceVar;
        this.g = str;
        this.h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        jm2 jm2Var;
        int i = this.a;
        int i2 = 5;
        String str = this.h;
        String str2 = this.g;
        zzcce zzcceVar = this.f;
        zzb zzbVar = this.e;
        ut2 ut2Var = this.d;
        tt2 tt2Var = this.c;
        zzr zzrVar = this.b;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                zzdrp zzdrpVar = (zzdrp) obj2;
                zzcjl zzcjlVarA = zzdrpVar.j.a(zzrVar, tt2Var, ut2Var);
                w12 w12Var = new w12(zzcjlVarA);
                zzdtn zzdtnVar = zzdrpVar.l.a;
                zzclj zzcljVarZzP = zzcjlVarA.zzP();
                l32 l32Var = p32.ff;
                zzcljVarZzP.zzab(zzdtnVar, zzdtnVar, zzdtnVar, zzdtnVar, zzdtnVar, false, null, !((Boolean) zzbd.zzc().a(l32Var)).booleanValue() ? new zzb(zzdrpVar.a, null, null) : zzbVar, null, true != ((Boolean) zzbd.zzc().a(l32Var)).booleanValue() ? null : zzcceVar, zzdrpVar.o, zzdrpVar.n, zzdrpVar.m, null, zzdtnVar, null, null, null, null, null, null, null);
                zzcjlVarA.zzab("/getNativeAdViewSignals", f62.n);
                zzcjlVarA.zzab("/getNativeClickMeta", f62.o);
                if (((Boolean) zzbd.zzc().a(p32.P8)).booleanValue()) {
                    if (((Boolean) zzbd.zzc().a(p32.R8)).booleanValue() && (jm2Var = zzdrpVar.s) != null) {
                        zzcjlVarA.zzab("/onDeviceStorageEvent", new zzbop(jm2Var));
                    }
                }
                zzcjlVarA.zzP().zzS(true);
                zzcjlVarA.zzP().zzG(new uh2(w12Var, i2));
                zzcjlVarA.zzau(str2, str, null);
                return w12Var;
            default:
                zzdsh zzdshVar = (zzdsh) obj2;
                zzcjl zzcjlVarA2 = zzdshVar.c.a(zzrVar, tt2Var, ut2Var);
                w12 w12Var2 = new w12(zzcjlVarA2);
                int i3 = 0;
                if (zzdshVar.a.b != null) {
                    zzdshVar.a(zzcjlVarA2, zzbVar, zzcceVar);
                    zzcjlVarA2.zzaf(new jc2(5, 0, 0));
                } else {
                    zzdtn zzdtnVar2 = zzdshVar.d.a;
                    zzclj zzcljVarZzP2 = zzcjlVarA2.zzP();
                    l32 l32Var2 = p32.ff;
                    zzcljVarZzP2.zzab(zzdtnVar2, zzdtnVar2, zzdtnVar2, zzdtnVar2, zzdtnVar2, false, null, !((Boolean) zzbd.zzc().a(l32Var2)).booleanValue() ? new zzb(zzdshVar.e, null, null) : zzbVar, null, true != ((Boolean) zzbd.zzc().a(l32Var2)).booleanValue() ? null : zzcceVar, zzdshVar.h, zzdshVar.g, zzdshVar.f, null, zzdtnVar2, null, null, null, null, zzdshVar.j, null, null);
                    zzdsh.b(zzcjlVarA2);
                }
                zzcjlVarA2.zzP().zzG(new tk2(zzdshVar, zzcjlVarA2, w12Var2, i3));
                zzcjlVarA2.zzau(str2, str, null);
                return w12Var2;
        }
    }
}
