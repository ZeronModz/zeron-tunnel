package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i3 implements ViewBinding {
    public final ScrollView a;
    public final SwitchCompat b;
    public final SwitchCompat c;
    public final SwitchCompat d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public final EditText h;
    public final EditText i;

    public i3(ScrollView scrollView, SwitchCompat switchCompat, SwitchCompat switchCompat2, SwitchCompat switchCompat3, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        this.a = scrollView;
        this.b = switchCompat;
        this.c = switchCompat2;
        this.d = switchCompat3;
        this.e = editText;
        this.f = editText2;
        this.g = editText3;
        this.h = editText4;
        this.i = editText5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
