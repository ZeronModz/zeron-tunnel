package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h3 implements ViewBinding {
    public final RelativeLayout a;
    public final ImageView b;
    public final ImageView c;
    public final RecyclerView d;

    public h3(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, RecyclerView recyclerView) {
        this.a = relativeLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
