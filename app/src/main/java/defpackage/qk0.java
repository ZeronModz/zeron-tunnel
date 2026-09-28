package defpackage;

import com.google.common.collect.LinkedListMultimap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class qk0 extends f71 {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public qk0(Map map) {
        super(0);
        map.getClass();
        this.c = map;
    }

    public Map a() {
        return (Map) this.c;
    }

    @Override // defpackage.f71, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.b) {
            case 1:
                a().clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                return ((LinkedListMultimap) this.c).containsKey(obj);
            default:
                return a().containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.b) {
            case 1:
                return a().isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.b) {
            case 0:
                return new sk0((LinkedListMultimap) this.c);
            default:
                return new in0(a().entrySet().iterator(), 0);
        }
    }

    @Override // defpackage.f71, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.b) {
            case 0:
                return !((LinkedListMultimap) this.c).removeAll(obj).isEmpty();
            default:
                if (!contains(obj)) {
                    return false;
                }
                a().remove(obj);
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.b) {
            case 0:
                return ((LinkedListMultimap) this.c).keyToKeyList.size();
            default:
                return a().size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(LinkedListMultimap linkedListMultimap) {
        super(0);
        this.c = linkedListMultimap;
    }
}
