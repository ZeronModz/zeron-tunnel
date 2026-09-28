package defpackage;

import com.google.android.gms.internal.ads.zzdeg;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ai2 implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public /* synthetic */ ai2(zzdeg zzdegVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(zzdegVar);
                break;
            default:
                this.b = new WeakReference(zzdegVar);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                zzdeg zzdegVar = (zzdeg) weakReference.get();
                if (zzdegVar != null) {
                    zzdegVar.i(wh2.s);
                }
                break;
            default:
                zzdeg zzdegVar2 = (zzdeg) weakReference.get();
                if (zzdegVar2 != null) {
                    zzdegVar2.i(wh2.r);
                }
                break;
        }
    }
}
