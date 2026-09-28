package defpackage;

import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgw;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class va2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zzcfk d;

    public /* synthetic */ va2(zzcfk zzcfkVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = zzcfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        zzcfk zzcfkVar = this.d;
        switch (i) {
            case 0:
                zzcfs zzcfsVar = ((zzcfi) zzcfkVar).q;
                if (zzcfsVar != null) {
                    zzcfsVar.zzj(i3, i2);
                }
                break;
            default:
                zzcfs zzcfsVar2 = ((zzcgw) zzcfkVar).g;
                if (zzcfsVar2 != null) {
                    zzcfsVar2.zzj(i3, i2);
                }
                break;
        }
    }
}
