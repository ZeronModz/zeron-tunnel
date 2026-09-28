package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.ShareActionProvider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v71 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ ShareActionProvider a;

    public v71(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ShareActionProvider shareActionProvider = this.a;
        p2 p2VarD = p2.d(shareActionProvider.d, shareActionProvider.e);
        menuItem.getItemId();
        p2VarD.b();
        return true;
    }
}
