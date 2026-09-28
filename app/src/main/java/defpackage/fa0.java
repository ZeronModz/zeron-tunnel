package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends ViewModel {
    public static final ea0 g = new ea0();
    public final boolean d;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public boolean e = false;
    public boolean f = false;

    public fa0(boolean z) {
        this.d = z;
    }

    public final void a(String str) {
        HashMap map = this.b;
        fa0 fa0Var = (fa0) map.get(str);
        if (fa0Var != null) {
            fa0Var.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.c;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            map2.remove(str);
        }
    }

    public final void b(Fragment fragment) {
        if (this.f) {
            FragmentManager.H(2);
        } else {
            if (this.a.remove(fragment.f) == null || !FragmentManager.H(2)) {
                return;
            }
            fragment.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fa0.class == obj.getClass()) {
            fa0 fa0Var = (fa0) obj;
            if (this.a.equals(fa0Var.a) && this.b.equals(fa0Var.b) && this.c.equals(fa0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (FragmentManager.H(3)) {
            toString();
        }
        this.e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
