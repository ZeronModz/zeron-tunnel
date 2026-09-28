package defpackage;

import com.google.common.collect.x2;
import java.util.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ln0 extends on0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Map d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln0(int i, Map map) {
        super(0);
        this.c = i;
        this.d = map;
    }

    @Override // defpackage.on0
    public final Map a() {
        int i = this.c;
        Map map = this.d;
        switch (i) {
            case 0:
                return (mn0) map;
            case 1:
                return (nn0) map;
            case 2:
                return (pn0) map;
            default:
                return (yr0) map;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.c;
        Map map = this.d;
        switch (i) {
            case 0:
                mn0 mn0Var = (mn0) map;
                Set set = mn0Var.d;
                return new x2(set.iterator(), mn0Var.e);
            case 1:
                return ((nn0) map).a();
            case 2:
                return ((pn0) map).a();
            default:
                Set setKeySet = ((yr0) map).d.keySet();
                return new x2(setKeySet.iterator(), new b1(this, 25));
        }
    }

    @Override // defpackage.on0, defpackage.f71, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.c) {
            case 3:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                yr0 yr0Var = (yr0) this.d;
                yr0Var.d.keySet().remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }
}
