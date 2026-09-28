package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jk0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ jk0(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                ((LineNumbersEditText) this.b).c(editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                ((LineNumbersEditText) this.b).d(i, i2, i3, charSequence);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
        View view = this.b;
        switch (i4) {
            case 0:
                ((LineNumbersEditText) view).e(i, i2, i3, charSequence);
                break;
            case 1:
                SearchView searchView = (SearchView) view;
                Editable text = searchView.p.getText();
                searchView.c0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.s(!zIsEmpty);
                if (searchView.a0 && !searchView.Q && zIsEmpty) {
                    searchView.u.setVisibility(8);
                    i = 0;
                }
                searchView.w.setVisibility(i);
                searchView.o();
                searchView.r();
                if (searchView.K != null && !TextUtils.equals(charSequence, searchView.b0)) {
                    searchView.K.onQueryTextChange(charSequence.toString());
                }
                searchView.b0 = charSequence.toString();
                break;
            default:
                ((com.google.android.material.search.SearchView) view).k.setVisibility(charSequence.length() > 0 ? 0 : 8);
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
