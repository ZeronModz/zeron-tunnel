package defpackage;

import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuPopupHelper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class np0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ MenuPopupHelper a;

    public np0(MenuPopupHelper menuPopupHelper) {
        this.a = menuPopupHelper;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
