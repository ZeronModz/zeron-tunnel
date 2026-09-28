package defpackage;

import com.google.android.gms.internal.ads.zzcfs;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wa2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcfs b;

    public /* synthetic */ wa2(zzcfs zzcfsVar, int i) {
        this.a = i;
        this.b = zzcfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzcfs zzcfsVar = this.b;
        switch (i) {
            case 0:
                zzcfsVar.c("surfaceCreated", new String[0]);
                break;
            case 1:
                zzcfsVar.c("surfaceDestroyed", new String[0]);
                break;
            default:
                zzcfsVar.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}
