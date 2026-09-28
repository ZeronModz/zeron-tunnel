package defpackage;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o51 implements ViewUtils$OnApplyWindowInsetsListener, OnApplyWindowInsetsListener {
    public final /* synthetic */ SearchView a;

    public /* synthetic */ o51(SearchView searchView) {
        this.a = searchView;
    }

    @Override // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        int i = SearchView.D;
        MaterialToolbar materialToolbar = this.a.g;
        boolean zF = wo1.f(materialToolbar);
        materialToolbar.setPadding(windowInsetsCompat.b() + (zF ? viewUtils$RelativePadding.c : viewUtils$RelativePadding.a), viewUtils$RelativePadding.b, windowInsetsCompat.c() + (zF ? viewUtils$RelativePadding.a : viewUtils$RelativePadding.c), viewUtils$RelativePadding.d);
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = SearchView.D;
        this.a.d(windowInsetsCompat);
        return windowInsetsCompat;
    }
}
