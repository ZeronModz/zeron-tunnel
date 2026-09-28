package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w90 implements MenuProvider {
    public final /* synthetic */ FragmentManager a;

    public w90(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // androidx.core.view.MenuProvider
    public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        this.a.j();
    }

    @Override // androidx.core.view.MenuProvider
    public final void onMenuClosed(Menu menu) {
        this.a.p();
    }

    @Override // androidx.core.view.MenuProvider
    public final boolean onMenuItemSelected(MenuItem menuItem) {
        return this.a.o();
    }

    @Override // androidx.core.view.MenuProvider
    public final void onPrepareMenu(Menu menu) {
        this.a.s();
    }
}
