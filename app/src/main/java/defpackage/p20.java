package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener;
import androidx.core.view.h;
import com.google.android.material.search.SearchBar;
import com.google.android.material.textfield.b;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p20 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ p20(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) view2;
                AccessibilityManager accessibilityManager = bVar.t;
                if (bVar.u != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = h.a;
                    if (bVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new s1(bVar.u));
                    }
                    break;
                }
                break;
            case 1:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = h.a;
                an1.c(view2);
                break;
            default:
                SearchBar searchBar = (SearchBar) view2;
                searchBar.k0.addTouchExplorationStateChangeListener(new s1(searchBar.l0));
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) view2;
                AccessibilityManagerCompat$TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener = bVar.u;
                if (accessibilityManagerCompat$TouchExplorationStateChangeListener != null && (accessibilityManager = bVar.t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new s1(accessibilityManagerCompat$TouchExplorationStateChangeListener));
                    break;
                }
                break;
            case 1:
                break;
            default:
                SearchBar searchBar = (SearchBar) view2;
                searchBar.k0.removeTouchExplorationStateChangeListener(new s1(searchBar.l0));
                break;
        }
    }

    private final void a(View view) {
    }
}
