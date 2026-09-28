package defpackage;

import android.os.SystemClock;
import com.google.android.material.progressindicator.a;
import com.google.android.material.progressindicator.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ae(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                if (aVar.e > 0) {
                    aVar.f = SystemClock.uptimeMillis();
                }
                aVar.setVisibility(0);
                break;
            default:
                ((g) aVar.getCurrentDrawable()).c(false, false, true);
                if ((aVar.getProgressDrawable() == null || !aVar.getProgressDrawable().isVisible()) && (aVar.getIndeterminateDrawable() == null || !aVar.getIndeterminateDrawable().isVisible())) {
                    aVar.setVisibility(4);
                }
                aVar.f = -1L;
                break;
        }
    }
}
