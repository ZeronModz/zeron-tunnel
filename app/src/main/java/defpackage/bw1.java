package defpackage;

import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzin;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzadl b;
    public final /* synthetic */ zzin c;

    public /* synthetic */ bw1(zzadl zzadlVar, zzin zzinVar, int i) {
        this.a = i;
        this.b = zzadlVar;
        this.c = zzinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zzadl zzadlVar = this.b;
                zzin zzinVar = this.c;
                synchronized (zzinVar) {
                }
                String str = wt2.a;
                zzadlVar.b.zzi(zzinVar);
                break;
            default:
                zzadl zzadlVar2 = this.b;
                zzin zzinVar2 = this.c;
                zzadlVar2.getClass();
                String str2 = wt2.a;
                zzadlVar2.b.zzb(zzinVar2);
                break;
        }
    }
}
