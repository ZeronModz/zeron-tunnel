package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzday;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcr;
import com.google.android.gms.internal.ads.zzdfw;
import com.google.android.gms.internal.ads.zzens;
import com.google.android.gms.internal.ads.zzfgg;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzguf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jg2 implements zzens {
    public final zzfjc a;
    public final tt2 b;
    public final zzdce c;
    public final zzdcr d;
    public final zzfgg e;
    public final zzday f;
    public final zzdfw g;
    public final xh2 h;
    public final qi2 i;
    public final dh2 j;
    public final jm2 k;

    public jg2(zzcwe zzcweVar) {
        this.a = zzcweVar.a;
        this.b = zzcweVar.b;
        this.c = zzcweVar.c;
        this.d = zzcweVar.d;
        this.e = zzcweVar.e;
        this.f = zzcweVar.f;
        this.g = zzcweVar.g;
        this.h = zzcweVar.h;
        this.i = zzcweVar.i;
        this.j = zzcweVar.j;
        this.k = zzcweVar.k;
    }

    public void a() {
        this.d.zzg();
        this.h.zza(this);
    }

    public final void b() {
        jm2 jm2Var;
        zzguf zzgufVar = this.b.C0;
        if (zzgufVar == null || zzgufVar.isEmpty() || (jm2Var = this.k) == null) {
            return;
        }
        if (!((Boolean) zzbd.zzc().a(p32.Q8)).booleanValue() || zzgufVar.isEmpty()) {
            return;
        }
        j23 j23VarListIterator = zzgufVar.listIterator(0);
        while (true) {
            q13 q13Var = (q13) j23VarListIterator;
            if (!q13Var.hasNext()) {
                return;
            }
            km2 km2Var = (km2) q13Var.next();
            int[] iArr = km2Var.b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    jm2Var.a(1, km2Var.a, zzt.zzk().currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzens
    public final void zzm() {
        this.i.zzi();
    }
}
