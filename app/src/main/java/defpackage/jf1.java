package defpackage;

import android.view.MenuItem;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jf1 implements Toolbar.OnMenuItemClickListener {
    public final /* synthetic */ m a;

    public jf1(m mVar) {
        this.a = mVar;
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.b.onMenuItemSelected(0, menuItem);
    }
}
