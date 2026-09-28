package defpackage;

import androidx.appcompat.widget.SearchView;
import com.v2ray.ang.TabFragment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rd0 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ TabFragment a;
    public final /* synthetic */ TabFragment b;

    public rd0(TabFragment tabFragment, TabFragment tabFragment2) {
        this.a = tabFragment;
        this.b = tabFragment2;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        if (str == null) {
            return true;
        }
        this.a.W(str);
        this.b.W(str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        if (str == null) {
            return true;
        }
        this.a.W(str);
        this.b.W(str);
        return true;
    }
}
