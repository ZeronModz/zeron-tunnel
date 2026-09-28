package defpackage;

import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.zzjl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzjl b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ w e;

    public /* synthetic */ cg3(w wVar, zzjl zzjlVar, long j, boolean z, int i) {
        this.a = i;
        this.b = zzjlVar;
        this.c = j;
        this.d = z;
        this.e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.d;
        zzjl zzjlVar = this.b;
        w wVar = this.e;
        switch (i) {
            case 0:
                wVar.e(zzjlVar);
                wVar.t(zzjlVar, j, z);
                break;
            default:
                wVar.e(zzjlVar);
                wVar.t(zzjlVar, j, z);
                break;
        }
    }
}
