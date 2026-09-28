package defpackage;

import com.google.android.gms.internal.ads.s1;
import com.google.android.gms.internal.ads.zzaac;
import com.google.android.gms.internal.ads.zzaan;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzpq;
import com.google.android.gms.internal.ads.zzwk;
import com.google.android.gms.internal.ads.zzyn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ob2 implements zzlj {
    public final zzaat a = new zzaat(true, 65536);
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(zzpq zzpqVar) {
        this.f = 0;
        this.g = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        int i;
        this.f = 0;
        for (zzaac zzaacVar : zzaacVarArr) {
            if (zzaacVar != null) {
                int i2 = this.f;
                int i3 = zzaacVar.zza().c;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        s31.c();
                        return;
                    }
                } else {
                    i = 131072000;
                }
                this.f = i2 + i;
            }
        }
        this.a.a(this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzc(zzpq zzpqVar) {
        this.f = 0;
        this.g = false;
        zzaat zzaatVar = this.a;
        synchronized (zzaatVar) {
            zzaatVar.a(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzd(zzpq zzpqVar) {
        this.f = 0;
        this.g = false;
        zzaat zzaatVar = this.a;
        synchronized (zzaatVar) {
            zzaatVar.a(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzaan zze(zzpq zzpqVar) {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzf(zzpq zzpqVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh(zzli zzliVar) {
        int i;
        long j = zzliVar.d;
        boolean z = true;
        char c = j > this.c ? (char) 0 : j < this.b ? (char) 2 : (char) 1;
        zzaat zzaatVar = this.a;
        synchronized (zzaatVar) {
            i = zzaatVar.b * 65536;
        }
        int i2 = this.f;
        if (c != 2 && (c != 1 || !this.g || i >= i2)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzi(zzli zzliVar) {
        long j = zzliVar.f ? this.e : this.d;
        return j <= 0 || zzliVar.d >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzj(zzpq zzpqVar, s1 s1Var, zzwk zzwkVar, long j) {
        ii2.K("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
