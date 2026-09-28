package defpackage;

import android.widget.AbsListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ListPopupWindow a;

    public dl0(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ListPopupWindow listPopupWindow = this.a;
        cl0 cl0Var = listPopupWindow.r;
        PopupWindow popupWindow = listPopupWindow.z;
        if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
            return;
        }
        listPopupWindow.v.removeCallbacks(cl0Var);
        cl0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
