package defpackage;

import androidx.appcompat.widget.SearchView;
import com.v2ray.ang.adapter.ServerAdapter;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.viewmodel.ServerList;
import java.util.ArrayList;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nd0 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ServerAdapter b;

    public nd0(HomeFragment homeFragment, ArrayList arrayList, ServerAdapter serverAdapter) {
        this.a = arrayList;
        this.b = serverAdapter;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        ArrayList arrayList;
        int i = HomeFragment.f2;
        ArrayList arrayList2 = this.a;
        if (str == null || g.B(str)) {
            arrayList = new ArrayList(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (g.o(((ServerList) obj).getName(), str, true)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList3);
        }
        this.b.h.b(arrayList);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
