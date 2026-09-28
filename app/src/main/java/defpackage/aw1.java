package defpackage;

import com.google.android.gms.internal.ads.zzadl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aw1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zzadl b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ aw1(zzadl zzadlVar, int i, long j) {
        this.b = zzadlVar;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        int i2 = this.d;
        long j = this.c;
        zzadl zzadlVar = this.b;
        zzadlVar.getClass();
        switch (i) {
            case 0:
                String str = wt2.a;
                zzadlVar.b.zze(i2, j);
                break;
            default:
                String str2 = wt2.a;
                zzadlVar.b.zzj(j, i2);
                break;
        }
    }

    public /* synthetic */ aw1(zzadl zzadlVar, long j, int i) {
        this.b = zzadlVar;
        this.c = j;
        this.d = i;
    }
}
