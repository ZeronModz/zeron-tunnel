package defpackage;

import androidx.appcompat.widget.SearchView;
import com.v2ray.ang.adapter.NetworkAdapter;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.viewmodel.NetworkList;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.g;

 
 
public final class pd0 implements SearchView.OnQueryTextListener {
    public final   HomeFragment a;
    public final   NetworkAdapter b;

    public pd0(HomeFragment homeFragment, NetworkAdapter networkAdapter) {
        this.a = homeFragment;
        this.b = networkAdapter;
    }

     
     
     
     
     
     
    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        List arrayList;
        HomeFragment homeFragment = this.a;
        if (str == null || g.B(str)) {
            List list = homeFragment.H0;
            if (list == null) {
                yg0.N("networkList");
                throw null;
            }
            arrayList = list;
        } else {
            List list2 = homeFragment.H0;
            if (list2 == null) {
                yg0.N("networkList");
                throw null;
            }
            arrayList = new ArrayList();
            for (Object obj : list2) {
                if (g.o(((NetworkList) obj).getName(), str, true)) {
                    arrayList.add(obj);
                }
            }
        }
        this.b.f.b(arrayList);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
