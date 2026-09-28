package defpackage;

import com.google.android.gms.internal.ads.zzfez;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfez b;

    public /* synthetic */ jt2(zzfez zzfezVar, int i) {
        this.a = i;
        this.b = zzfezVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzfez zzfezVar = this.b;
        switch (i) {
            case 0:
                zzfezVar.a.e().execute(new jt2(zzfezVar, 1));
                break;
            default:
                zzfezVar.a(5);
                break;
        }
    }
}
