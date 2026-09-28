package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcit;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcgw b;

    public /* synthetic */ cb2(zzcgw zzcgwVar, int i) {
        this.a = i;
        this.b = zzcgwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcgw zzcgwVar = this.b;
        switch (i) {
            case 0:
                zzcfs zzcfsVar = zzcgwVar.g;
                if (zzcfsVar != null) {
                    zzcfsVar.zzb();
                }
                break;
            case 1:
                zzcfs zzcfsVar2 = zzcgwVar.g;
                if (zzcfsVar2 != null) {
                    zzcfsVar2.zzk();
                }
                break;
            case 2:
                zzcfs zzcfsVar3 = zzcgwVar.g;
                if (zzcfsVar3 != null) {
                    zzcfsVar3.zze();
                }
                break;
            case 3:
                zzcfs zzcfsVar4 = zzcgwVar.g;
                if (zzcfsVar4 != null) {
                    zzcfsVar4.zzc();
                }
                break;
            case 4:
                zzcfs zzcfsVar5 = zzcgwVar.g;
                if (zzcfsVar5 != null) {
                    zzcfsVar5.zzd();
                }
                break;
            case 5:
                zzcfs zzcfsVar6 = zzcgwVar.g;
                if (zzcfsVar6 != null) {
                    zzcfsVar6.zza();
                }
                break;
            case 6:
                zzcfs zzcfsVar7 = zzcgwVar.g;
                if (zzcfsVar7 != null) {
                    zzcfsVar7.zzh();
                }
                break;
            default:
                zzcgi zzcgiVar = zzcgwVar.b;
                float f = zzcgiVar.c ? zzcgiVar.e ? 0.0f : zzcgiVar.f : 0.0f;
                zzcit zzcitVar = zzcgwVar.i;
                if (zzcitVar == null) {
                    zzo.zzi("Trying to set volume before player is initialized.");
                } else {
                    try {
                        rd rdVar = zzcitVar.i;
                        if (rdVar != null) {
                            rdVar.zzB(f);
                        }
                    } catch (IOException e) {
                        zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                        return;
                    }
                }
                break;
        }
    }
}
