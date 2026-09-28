package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 implements ViewBinding {
    public final ScrollView a;
    public final EditText b;
    public final EditText c;

    public m3(ScrollView scrollView, EditText editText, EditText editText2) {
        this.a = scrollView;
        this.b = editText;
        this.c = editText2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
