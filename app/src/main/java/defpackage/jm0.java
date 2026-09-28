package defpackage;

import androidx.appcompat.widget.SearchView;
import com.v2ray.ang.ui.LogcatActivity;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jm0 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ LogcatActivity a;

    public jm0(LogcatActivity logcatActivity) {
        this.a = logcatActivity;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        int i = LogcatActivity.g;
        this.a.h(str);
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
