package defpackage;

import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfs;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ua2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcfi b;

    public /* synthetic */ ua2(zzcfi zzcfiVar, int i) {
        this.a = i;
        this.b = zzcfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcfi zzcfiVar = this.b;
        switch (i) {
            case 0:
                zzcfs zzcfsVar = zzcfiVar.q;
                if (zzcfsVar != null) {
                    zzcfsVar.zze();
                }
                break;
            case 1:
                zzcfs zzcfsVar2 = zzcfiVar.q;
                if (zzcfsVar2 != null) {
                    zzcfsVar2.zza();
                }
                break;
            case 2:
                zzcfs zzcfsVar3 = zzcfiVar.q;
                if (zzcfsVar3 != null) {
                    zzcfsVar3.zzd();
                    zzcfiVar.q.zzh();
                }
                break;
            case 3:
                zzcfs zzcfsVar4 = zzcfiVar.q;
                if (zzcfsVar4 != null) {
                    if (!zzcfiVar.r) {
                        zzcfsVar4.zzk();
                        zzcfiVar.r = true;
                    }
                    zzcfiVar.q.zzc();
                }
                break;
            default:
                zzcfs zzcfsVar5 = zzcfiVar.q;
                if (zzcfsVar5 != null) {
                    zzcfsVar5.zzd();
                }
                break;
        }
    }
}
