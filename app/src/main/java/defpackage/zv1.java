package defpackage;

import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzrb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zv1(Object obj, String str, long j, long j2, int i) {
        this.a = i;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                zzadl zzadlVar = (zzadl) obj;
                zzadlVar.getClass();
                String str = wt2.a;
                zzadlVar.b.zzc(this.b, this.c, this.d);
                break;
            default:
                zzrb zzrbVar = (zzrb) obj;
                zzrbVar.getClass();
                String str2 = wt2.a;
                zzrbVar.b.zzm(this.b, this.c, this.d);
                break;
        }
    }
}
