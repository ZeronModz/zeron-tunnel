package defpackage;

import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vk0 implements ListIterator {
    public int a;
    public uk0 b;
    public uk0 c;
    public uk0 d;
    public int e;
    public final /* synthetic */ LinkedListMultimap f;

    public vk0(LinkedListMultimap linkedListMultimap, int i) {
        this.f = linkedListMultimap;
        this.e = linkedListMultimap.modCount;
        int size = linkedListMultimap.size();
        cn0.o(i, size);
        if (i < size / 2) {
            this.b = linkedListMultimap.head;
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                a();
                uk0 uk0Var = this.b;
                if (uk0Var == null) {
                    p60.m();
                    throw null;
                }
                this.c = uk0Var;
                this.d = uk0Var;
                this.b = uk0Var.c;
                this.a++;
                i = i2;
            }
        } else {
            this.d = linkedListMultimap.tail;
            this.a = size;
            while (true) {
                int i3 = i + 1;
                if (i >= size) {
                    break;
                }
                a();
                uk0 uk0Var2 = this.d;
                if (uk0Var2 == null) {
                    p60.m();
                    throw null;
                }
                this.c = uk0Var2;
                this.b = uk0Var2;
                this.d = uk0Var2.d;
                this.a--;
                i = i3;
            }
        }
        this.c = null;
    }

    public final void a() {
        if (this.f.modCount == this.e) {
            return;
        }
        u7.d();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return this.d != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        uk0 uk0Var = this.b;
        if (uk0Var == null) {
            p60.m();
            return null;
        }
        this.c = uk0Var;
        this.d = uk0Var;
        this.b = uk0Var.c;
        this.a++;
        return uk0Var;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        uk0 uk0Var = this.d;
        if (uk0Var == null) {
            p60.m();
            return null;
        }
        this.c = uk0Var;
        this.b = uk0Var;
        this.d = uk0Var.d;
        this.a--;
        return uk0Var;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        cn0.s("no calls to next() since the last call to remove()", this.c != null);
        uk0 uk0Var = this.c;
        if (uk0Var != this.b) {
            this.d = uk0Var.d;
            this.a--;
        } else {
            this.b = uk0Var.c;
        }
        LinkedListMultimap linkedListMultimap = this.f;
        linkedListMultimap.removeNode(uk0Var);
        this.c = null;
        this.e = linkedListMultimap.modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
