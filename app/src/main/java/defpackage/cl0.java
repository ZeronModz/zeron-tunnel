package defpackage;

import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListPopupWindow b;

    public /* synthetic */ cl0(ListPopupWindow listPopupWindow, int i) {
        this.a = i;
        this.b = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListPopupWindow listPopupWindow = this.b;
        switch (i) {
            case 0:
                vz vzVar = listPopupWindow.c;
                if (vzVar != null) {
                    vzVar.setListSelectionHidden(true);
                    vzVar.requestLayout();
                }
                break;
            default:
                vz vzVar2 = listPopupWindow.c;
                if (vzVar2 != null && vzVar2.isAttachedToWindow() && listPopupWindow.c.getCount() > listPopupWindow.c.getChildCount() && listPopupWindow.c.getChildCount() <= listPopupWindow.m) {
                    listPopupWindow.z.setInputMethodMode(2);
                    listPopupWindow.show();
                    break;
                }
                break;
        }
    }
}
