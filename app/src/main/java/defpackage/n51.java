package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.h;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ n51(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowInsetsControllerCompat windowInsetsControllerCompatI;
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                int i2 = SearchView.D;
                EditText editText = searchView.j;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.z && (windowInsetsControllerCompatI = h.i(editText)) != null) {
                    windowInsetsControllerCompatI.a.e();
                } else {
                    ((InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
            case 1:
                searchView.g();
                break;
            case 2:
                int i3 = SearchView.D;
                EditText editText2 = searchView.j;
                editText2.clearFocus();
                SearchBar searchBar = searchView.t;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                wo1.e(editText2, searchView.z);
                break;
            default:
                searchView.e();
                break;
        }
    }
}
