package defpackage;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ns0 extends ViewModel {
    public static final ms0 b = new ms0();
    public final HashMap a = new HashMap();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        HashMap map = this.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).a();
        }
        map.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
