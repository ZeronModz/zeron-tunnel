package defpackage;

import com.google.android.gms.internal.ads.zzrb;
import com.google.android.gms.internal.ads.zzrd;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzrb b;
    public final /* synthetic */ zzrd c;

    public /* synthetic */ qj3(zzrb zzrbVar, zzrd zzrdVar, int i) {
        this.a = i;
        this.b = zzrbVar;
        this.c = zzrdVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzrd zzrdVar = this.c;
        zzrb zzrbVar = this.b;
        zzrbVar.getClass();
        switch (i) {
            case 0:
                String str = wt2.a;
                zzrbVar.b.zzw(zzrdVar);
                break;
            default:
                String str2 = wt2.a;
                zzrbVar.b.zzv(zzrdVar);
                break;
        }
    }
}
