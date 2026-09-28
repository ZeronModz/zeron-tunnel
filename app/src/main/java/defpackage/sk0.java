package defpackage;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.y2;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class sk0 implements Iterator {
    public final HashSet a;
    public uk0 b;
    public uk0 c;
    public int d;
    public final /* synthetic */ LinkedListMultimap e;

    public sk0(LinkedListMultimap linkedListMultimap) {
        this.e = linkedListMultimap;
        this.a = new HashSet(y2.a(linkedListMultimap.keySet().size()));
        this.b = linkedListMultimap.head;
        this.d = linkedListMultimap.modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e.modCount == this.d) {
            return this.b != null;
        }
        u7.d();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        uk0 uk0Var;
        if (this.e.modCount != this.d) {
            u7.d();
            return null;
        }
        uk0 uk0Var2 = this.b;
        if (uk0Var2 == null) {
            p60.m();
            return null;
        }
        this.c = uk0Var2;
        Object obj = uk0Var2.a;
        HashSet hashSet = this.a;
        hashSet.add(obj);
        do {
            uk0Var = this.b.c;
            this.b = uk0Var;
            if (uk0Var == null) {
                break;
            }
        } while (!hashSet.add(uk0Var.a));
        return this.c.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        LinkedListMultimap linkedListMultimap = this.e;
        if (linkedListMultimap.modCount != this.d) {
            u7.d();
            return;
        }
        cn0.s("no calls to next() since the last call to remove()", this.c != null);
        linkedListMultimap.removeAllNodes(this.c.a);
        this.c = null;
        this.d = linkedListMultimap.modCount;
    }
}
