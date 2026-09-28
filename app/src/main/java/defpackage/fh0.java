package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fh0 implements ViewBinding {
    public final LinearLayout a;
    public final SwitchCompat b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f;

    public fh0(LinearLayout linearLayout, SwitchCompat switchCompat, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = switchCompat;
        this.c = linearLayout2;
        this.d = linearLayout3;
        this.e = textView;
        this.f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
