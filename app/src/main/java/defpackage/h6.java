package defpackage;

import androidx.appcompat.app.k;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h6 implements ContentFrameLayout.OnAttachListener {
    public final /* synthetic */ k a;

    public h6(k kVar) {
        this.a = kVar;
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public final void onDetachedFromWindow() {
        k kVar = this.a;
        DecorContentParent decorContentParent = kVar.r;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (kVar.w != null) {
            kVar.l.getDecorView().removeCallbacks(kVar.x);
            if (kVar.w.isShowing()) {
                try {
                    kVar.w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            kVar.w = null;
        }
        jo1 jo1Var = kVar.y;
        if (jo1Var != null) {
            jo1Var.b();
        }
        MenuBuilder menuBuilder = kVar.A(0).h;
        if (menuBuilder != null) {
            menuBuilder.c(true);
        }
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public final void onAttachedFromWindow() {
    }
}
