package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh0 implements ViewBinding {
    public final LinearLayout a;
    public final SwitchCompat b;
    public final TextView c;
    public final ImageView d;
    public final LinearLayout e;
    public final TextView f;
    public final TextView g;

    public eh0(LinearLayout linearLayout, SwitchCompat switchCompat, TextView textView, ImageView imageView, LinearLayout linearLayout2, TextView textView2, TextView textView3) {
        this.a = linearLayout;
        this.b = switchCompat;
        this.c = textView;
        this.d = imageView;
        this.e = linearLayout2;
        this.f = textView2;
        this.g = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
