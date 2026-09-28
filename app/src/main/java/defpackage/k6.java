package defpackage;

import android.view.Window;
import androidx.appcompat.app.k;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 implements MenuPresenter.Callback {
    public final /* synthetic */ k a;

    public k6(k kVar) {
        this.a = kVar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        this.a.q(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        Window.Callback callback = this.a.l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuBuilder);
        return true;
    }
}
