package defpackage;

import androidx.appcompat.app.m;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kf1 implements MenuPresenter.Callback {
    public boolean a;
    public final /* synthetic */ m b;

    public kf1(m mVar) {
        this.b = mVar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.a) {
            return;
        }
        this.a = true;
        m mVar = this.b;
        mVar.a.dismissPopupMenus();
        mVar.b.onPanelClosed(108, menuBuilder);
        this.a = false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        this.b.b.onMenuOpened(108, menuBuilder);
        return true;
    }
}
