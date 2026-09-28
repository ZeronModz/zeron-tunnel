package defpackage;

import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzrb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzrb b;
    public final /* synthetic */ zzin c;

    public /* synthetic */ tj3(zzrb zzrbVar, zzin zzinVar, int i) {
        this.a = i;
        this.b = zzrbVar;
        this.c = zzinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zzrb zzrbVar = this.b;
                zzin zzinVar = this.c;
                synchronized (zzinVar) {
                }
                String str = wt2.a;
                zzrbVar.b.zzr(zzinVar);
                break;
            default:
                zzrb zzrbVar2 = this.b;
                zzin zzinVar2 = this.c;
                zzrbVar2.getClass();
                String str2 = wt2.a;
                zzrbVar2.b.zzl(zzinVar2);
                break;
        }
    }
}
