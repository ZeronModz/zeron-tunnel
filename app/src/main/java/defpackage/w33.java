package defpackage;

import com.google.android.gms.ads.nonagon.signalgeneration.zzj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w33 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzj b;

    public /* synthetic */ w33(zzj zzjVar, int i) {
        this.a = i;
        this.b = zzjVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzj zzjVar = this.b;
        switch (i) {
            case 0:
                zzjVar.zzb();
                break;
            default:
                zzjVar.zza();
                break;
        }
    }
}
