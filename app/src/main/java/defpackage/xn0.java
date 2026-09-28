package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ xn0(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.a;
        View view2 = this.b;
        switch (i2) {
            case 0:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) view2;
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.e;
                Object selectedItem = i < 0 ? !listPopupWindow.z.isShowing() ? null : listPopupWindow.c.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i);
                int i3 = MaterialAutoCompleteTextView.m;
                materialAutoCompleteTextView.c(selectedItem);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !listPopupWindow.z.isShowing() ? null : listPopupWindow.c.getSelectedView();
                        i = !listPopupWindow.z.isShowing() ? -1 : listPopupWindow.c.getSelectedItemPosition();
                        j = !listPopupWindow.z.isShowing() ? Long.MIN_VALUE : listPopupWindow.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(listPopupWindow.c, view, i, j);
                }
                listPopupWindow.dismiss();
                break;
            default:
                ((SearchView) view2).k(i);
                break;
        }
    }
}
