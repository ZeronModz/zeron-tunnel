package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzclj;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdcm;
import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzdgj;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzeiu;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class al2 {
    public final zzdbd a;
    public final zzdcm b;
    public final yh2 c;
    public final zzddq d;
    public final zzdgj e;
    public final ri2 f;
    public final zzdxz g;
    public final mv2 h;
    public final zzeiu i;
    public final ve2 j;

    public al2(zzdbd zzdbdVar, zzdcm zzdcmVar, yh2 yh2Var, zzddq zzddqVar, zzdgj zzdgjVar, ri2 ri2Var, zzdxz zzdxzVar, mv2 mv2Var, zzeiu zzeiuVar, ve2 ve2Var) {
        this.a = zzdbdVar;
        this.b = zzdcmVar;
        this.c = yh2Var;
        this.d = zzddqVar;
        this.e = zzdgjVar;
        this.f = ri2Var;
        this.g = zzdxzVar;
        this.h = mv2Var;
        this.i = zzeiuVar;
        this.j = ve2Var;
    }

    public final void a(bl2 bl2Var, zzcjl zzcjlVar) {
        zzdtn zzdtnVar = bl2Var.a;
        zzdcm zzdcmVar = this.b;
        Objects.requireNonNull(zzdcmVar);
        xk2 xk2Var = new xk2(zzdcmVar, 1);
        zzdbd zzdbdVar = this.a;
        yh2 yh2Var = this.c;
        zzddq zzddqVar = this.d;
        zzdgj zzdgjVar = this.e;
        ri2 ri2Var = this.f;
        synchronized (zzdtnVar) {
            zzdtnVar.a(zzdbdVar, yh2Var, zzddqVar, zzdgjVar, xk2Var);
            zzdtnVar.f = ri2Var;
        }
        if (!((Boolean) zzbd.zzc().a(p32.Eb)).booleanValue() || zzcjlVar == null || zzcjlVar.zzP() == null) {
            return;
        }
        zzclj zzcljVarZzP = zzcjlVar.zzP();
        ve2 ve2Var = this.j;
        zzeiu zzeiuVar = this.i;
        zzcljVarZzP.zzd(ve2Var, zzeiuVar, this.h);
        zzcljVarZzP.zze(ve2Var, zzeiuVar, this.g);
    }
}
