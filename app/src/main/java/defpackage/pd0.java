package defpackage;

import androidx.appcompat.widget.SearchView;
import com.v2ray.ang.adapter.NetworkAdapter;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.viewmodel.NetworkList;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pd0 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ HomeFragment a;
    public final /* synthetic */ NetworkAdapter b;

    public pd0(HomeFragment homeFragment, NetworkAdapter networkAdapter) {
        this.a = homeFragment;
        this.b = networkAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.recyclerview.widget.AsyncListDiffer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        ?? arrayList;
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
