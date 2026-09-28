package defpackage;

import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzcjl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z62 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbro b;
    public final /* synthetic */ String c;

    public /* synthetic */ z62(zzbro zzbroVar, String str, int i) {
        this.a = i;
        this.b = zzbroVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        String str = this.c;
        zzbro zzbroVar = this.b;
        switch (i) {
            case 0:
                zzcjl zzcjlVar = zzbroVar.a;
                if (zzcjlVar != null) {
                    zzcjlVar.loadData(str, "text/html", "UTF-8");
                }
                break;
            default:
                zzcjl zzcjlVar2 = zzbroVar.a;
                if (zzcjlVar2 != null) {
                    zzcjlVar2.zza(str);
                }
                break;
        }
    }
}
