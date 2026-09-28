package defpackage;

import android.view.View;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ql(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new w2(carouselLayoutManager, 17));
                }
                break;
            default:
                PreviewView previewView = (PreviewView) obj;
                PreviewView.ImplementationMode implementationMode = PreviewView.p;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    previewView.b();
                    previewView.a(true);
                }
                break;
        }
    }
}
