package defpackage;

import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.m;
import androidx.appcompat.view.menu.MenuBuilder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 implements MenuBuilder.Callback {
    public final /* synthetic */ m a;

    public lf1(m mVar) {
        this.a = mVar;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder) {
        m mVar = this.a;
        boolean zO = mVar.a.a.o();
        Window.Callback callback = mVar.b;
        if (zO) {
            callback.onPanelClosed(108, menuBuilder);
        } else if (callback.onPreparePanel(0, null, menuBuilder)) {
            callback.onMenuOpened(108, menuBuilder);
        }
    }
}
