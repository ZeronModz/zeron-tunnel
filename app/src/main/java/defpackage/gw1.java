package defpackage;

import com.google.android.gms.ads.internal.util.zzat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gw1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzat b;

    public /* synthetic */ gw1(zzat zzatVar, int i) {
        this.a = i;
        this.b = zzatVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzat zzatVar = this.b;
        switch (i) {
            case 0:
                zzatVar.zzn();
                break;
            case 1:
                zzatVar.zzo();
                break;
            case 2:
                zzatVar.zzp();
                break;
            case 3:
                zzatVar.zzq();
                break;
            case 4:
                zzatVar.zzr();
                break;
            case 5:
                zzatVar.zzl();
                break;
            default:
                zzatVar.zzg();
                break;
        }
    }
}
