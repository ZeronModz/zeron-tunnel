package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gh0 implements ViewBinding {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final LinearLayout d;
    public final LinearLayout e;

    public gh0(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = linearLayout2;
        this.e = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
