package defpackage;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qs extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CursorAdapter cursorAdapter = (CursorAdapter) obj;
                cursorAdapter.a = true;
                cursorAdapter.notifyDataSetChanged();
                break;
            case 1:
                ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
                if (listPopupWindow.z.isShowing()) {
                    listPopupWindow.show();
                }
                break;
            case 2:
                ((TabLayout) obj).i();
                break;
            default:
                ((ViewPager) obj).e();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CursorAdapter cursorAdapter = (CursorAdapter) obj;
                cursorAdapter.a = false;
                cursorAdapter.notifyDataSetInvalidated();
                break;
            case 1:
                ((ListPopupWindow) obj).dismiss();
                break;
            case 2:
                ((TabLayout) obj).i();
                break;
            default:
                ((ViewPager) obj).e();
                break;
        }
    }
}
