package defpackage;

import android.view.ViewTreeObserver;
import coil3.size.RealViewSizeResolver;
import coil3.size.Size;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ RealViewSizeResolver b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ CancellableContinuationImpl d;

    public lo1(RealViewSizeResolver realViewSizeResolver, ViewTreeObserver viewTreeObserver, CancellableContinuationImpl cancellableContinuationImpl) {
        this.b = realViewSizeResolver;
        this.c = viewTreeObserver;
        this.d = cancellableContinuationImpl;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RealViewSizeResolver realViewSizeResolver = this.b;
        Size sizeB = ec1.B(realViewSizeResolver);
        if (sizeB != null) {
            ViewTreeObserver viewTreeObserver = this.c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                realViewSizeResolver.a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.a) {
                this.a = true;
                this.d.resumeWith(Result.m36constructorimpl(sizeB));
            }
        }
        return true;
    }
}
