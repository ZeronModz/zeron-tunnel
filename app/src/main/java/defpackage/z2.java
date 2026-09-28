package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import dev.zeron.tunnel.R;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z2 implements ViewBinding {
    public final RelativeLayout a;
    public final RecyclerView b;
    public final SwipeRefreshLayout c;

    public z2(RelativeLayout relativeLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = relativeLayout;
        this.b = recyclerView;
        this.c = swipeRefreshLayout;
    }

    public static z2 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_logcat, (ViewGroup) null, false);
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
        if (recyclerView != null) {
            i = R.id.refreshLayout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) l02.n(R.id.refreshLayout, viewInflate);
            if (swipeRefreshLayout != null) {
                return new z2((RelativeLayout) viewInflate, recyclerView, swipeRefreshLayout);
            }
        }
        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
