package defpackage;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.ads.zzcjl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcjl b;

    public /* synthetic */ yb2(zzcjl zzcjlVar, int i) {
        this.a = i;
        this.b = zzcjlVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzcjl zzcjlVar = this.b;
        switch (i) {
            case 0:
                zzcjlVar.destroy();
                break;
            case 1:
                zzcjlVar.destroy();
                break;
            case 2:
                zzcjlVar.onPause();
                break;
            case 3:
                zzcjlVar.onResume();
                break;
            case 4:
                zzcjlVar.destroy();
                break;
            case 5:
                zzcjlVar.zze("onSdkImpression", new ArrayMap());
                break;
            case 6:
                zzcjlVar.destroy();
                break;
            default:
                zzcjlVar.zzav();
                break;
        }
    }
}
