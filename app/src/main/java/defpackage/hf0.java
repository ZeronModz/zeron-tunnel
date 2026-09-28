package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageFilterButton b;

    public /* synthetic */ hf0(ImageFilterButton imageFilterButton, int i) {
        this.a = i;
        this.b = imageFilterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        ImageFilterButton imageFilterButton = this.b;
        switch (i) {
            case 0:
                outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), (Math.min(r9, r10) * imageFilterButton.f) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.g);
                break;
        }
    }
}
