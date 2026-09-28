package defpackage;

import android.view.ViewTreeObserver;
import coil3.size.RealViewSizeResolver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ko1 implements Function1 {
    public final /* synthetic */ RealViewSizeResolver a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ lo1 c;

    public ko1(RealViewSizeResolver realViewSizeResolver, ViewTreeObserver viewTreeObserver, lo1 lo1Var) {
        this.a = realViewSizeResolver;
        this.b = viewTreeObserver;
        this.c = lo1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.b;
        boolean zIsAlive = viewTreeObserver.isAlive();
        lo1 lo1Var = this.c;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(lo1Var);
        } else {
            this.a.a.getViewTreeObserver().removeOnPreDrawListener(lo1Var);
        }
        return mk1.a;
    }
}
