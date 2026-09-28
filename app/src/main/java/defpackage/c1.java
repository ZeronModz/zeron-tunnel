package defpackage;

import androidx.collection.ArrayMap;
import com.google.common.graph.AbstractNetwork;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class c1 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((v81) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((qd3) obj2).c((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((ci3) obj2).c((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                ((v81) obj).clear();
                break;
            case 3:
                ((qd3) obj).clear();
                break;
            case 4:
                ((ci3) obj).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d1 d1Var = (d1) obj2;
                AbstractNetwork abstractNetwork = (AbstractNetwork) d1Var.b;
                if (obj instanceof t20) {
                    t20 t20Var = (t20) obj;
                    Object obj3 = t20Var.a;
                    if (t20Var.a() == d1Var.isDirected() && abstractNetwork.nodes().contains(obj3) && abstractNetwork.successors(obj3).contains(t20Var.b)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                Object obj4 = ((v81) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj4 != value) {
                    return obj4 != null && obj4.equals(value);
                }
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj5 = ((qd3) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj5 != value2) {
                    return obj5 != null && obj5.equals(value2);
                }
                return true;
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj6 = ((ci3) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj6 != value3) {
                    return obj6 != null && obj6.equals(value3);
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new nh0(((AbstractNetwork) ((d1) obj).b).edges().iterator(), new b1(this, i2));
            case 1:
                return new c8((ArrayMap) obj);
            case 2:
                return new z81((v81) obj, 0);
            case 3:
                return new z81((qd3) obj, i2);
            default:
                return new z81((ci3) obj, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((v81) obj2).remove(entry.getKey());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((qd3) obj2).remove(entry2.getKey());
                return true;
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((ci3) obj2).remove(entry3.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((AbstractNetwork) ((d1) obj).b).edges().size();
            case 1:
                return ((ArrayMap) obj).c;
            case 2:
                return ((v81) obj).size();
            case 3:
                return ((qd3) obj).size();
            default:
                return ((ci3) obj).size();
        }
    }
}
