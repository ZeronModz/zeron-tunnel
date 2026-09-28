package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f3 implements ViewBinding {
    public final RelativeLayout a;
    public final LinearLayout b;
    public final RecyclerView c;
    public final TextView d;

    public f3(RelativeLayout relativeLayout, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.a = relativeLayout;
        this.b = linearLayout;
        this.c = recyclerView;
        this.d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
