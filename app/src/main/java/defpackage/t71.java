package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.shape.ShapeableDelegate;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t71 extends ShapeableDelegate {
    public t71(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new s71(this));
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final void a(FrameLayout frameLayout) {
        frameLayout.setClipToOutline(!this.a);
        if (this.a) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final boolean b() {
        return this.a;
    }
}
