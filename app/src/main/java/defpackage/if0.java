package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class if0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageFilterView b;

    public /* synthetic */ if0(ImageFilterView imageFilterView, int i) {
        this.a = i;
        this.b = imageFilterView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        ImageFilterView imageFilterView = this.b;
        switch (i) {
            case 0:
                outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), (Math.min(r9, r10) * imageFilterView.i) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.j);
                break;
        }
    }
}
