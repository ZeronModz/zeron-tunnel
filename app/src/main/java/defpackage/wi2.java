package defpackage;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wi2 implements zzr, zza {
    public final ml2 a;
    public final ut2 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public wi2(ml2 ml2Var, ut2 ut2Var) {
        this.a = ml2Var;
        this.b = ut2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        ml2 ml2Var = this.a;
        if (ml2Var.b.get()) {
            ml2Var.a.zzg();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        if (this.c.getAndSet(true)) {
            return;
        }
        ml2 ml2Var = this.a;
        if (ml2Var.b.getAndSet(false)) {
            ml2Var.a.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i) {
        if (this.c.getAndSet(true)) {
            return;
        }
        ml2 ml2Var = this.a;
        if (ml2Var.b.getAndSet(false)) {
            ml2Var.a.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        String str = this.b.b;
        boolean zW = if3.W(str);
        ml2 ml2Var = this.a;
        if (zW) {
            ml2Var.getClass();
        } else {
            if (!ml2Var.c.get() || ml2Var.b.getAndSet(true)) {
                return;
            }
            ml2Var.a.zzb(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
