package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.activity.e;
import androidx.activity.f;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ProducerScope a;
    public final /* synthetic */ View b;
    public final /* synthetic */ f c;
    public final /* synthetic */ e d;

    public qw0(ProducerScope producerScope, View view, f fVar, e eVar) {
        this.a = producerScope;
        this.b = view;
        this.c = fVar;
        this.d = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        Rect rect = new Rect();
        View view2 = this.b;
        view2.getGlobalVisibleRect(rect);
        this.a.mo56trySendJP2dKIU(rect);
        view2.getViewTreeObserver().addOnScrollChangedListener(this.c);
        view2.addOnLayoutChangeListener(this.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        view.getViewTreeObserver().removeOnScrollChangedListener(this.c);
        view.removeOnLayoutChangeListener(this.d);
    }
}
