package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements ViewBinding {
    public final ScrollView a;
    public final SwitchCompat b;
    public final EditText c;
    public final EditText d;
    public final EditText e;
    public final EditText f;
    public final EditText g;
    public final EditText h;
    public final Spinner i;

    public e3(ScrollView scrollView, SwitchCompat switchCompat, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, Spinner spinner) {
        this.a = scrollView;
        this.b = switchCompat;
        this.c = editText;
        this.d = editText2;
        this.e = editText3;
        this.f = editText4;
        this.g = editText5;
        this.h = editText6;
        this.i = spinner;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
