package defpackage;

import android.graphics.drawable.Animatable;
import androidx.vectordrawable.graphics.drawable.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 extends j03 {
    public final /* synthetic */ int q;
    public final Animatable r;

    public /* synthetic */ x4(Animatable animatable, int i) {
        this.q = i;
        this.r = animatable;
    }

    @Override // defpackage.j03
    public final void u() {
        switch (this.q) {
            case 0:
                this.r.start();
                break;
            default:
                ((c) this.r).start();
                break;
        }
    }

    @Override // defpackage.j03
    public final void w() {
        switch (this.q) {
            case 0:
                this.r.stop();
                break;
            default:
                ((c) this.r).stop();
                break;
        }
    }
}
