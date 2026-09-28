package defpackage;

import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcja;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcja b;

    public /* synthetic */ rb2(zzcja zzcjaVar, int i) {
        this.a = i;
        this.b = zzcjaVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzcja zzcjaVar = this.b;
        switch (i) {
            case 0:
                zzcfs zzcfsVar = zzcjaVar.e;
                if (zzcfsVar != null) {
                    if (!zzcjaVar.f) {
                        zzcfsVar.zzk();
                        zzcjaVar.f = true;
                    }
                    zzcjaVar.e.zzc();
                }
                break;
            case 1:
                zzcfs zzcfsVar2 = zzcjaVar.e;
                if (zzcfsVar2 != null) {
                    zzcfsVar2.zzd();
                }
                break;
            default:
                zzcfs zzcfsVar3 = zzcjaVar.e;
                if (zzcfsVar3 != null) {
                    zzcfsVar3.zzb();
                }
                break;
        }
    }
}
