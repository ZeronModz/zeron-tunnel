package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf extends FloatingActionButton.OnVisibilityChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public gf(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
    public final void a(FloatingActionButton floatingActionButton) {
        int i = BottomAppBar.u0;
        floatingActionButton.setTranslationX(this.b.D(this.a));
        floatingActionButton.l(new ff(), true);
    }
}
