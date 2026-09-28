package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.DropWhileSequence;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.TakeWhileSequence;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yz implements Iterator, KMappedMarker {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ Sequence e;

    public yz(FilteringSequence filteringSequence) {
        this.a = 1;
        this.e = filteringSequence;
        this.b = filteringSequence.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        FilteringSequence filteringSequence = (FilteringSequence) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) filteringSequence.c.invoke(next)).booleanValue() != filteringSequence.b);
        this.d = next;
        this.c = 1;
    }

    public void b() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((TakeWhileSequence) this.e).b.invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    public void c() {
        Object next;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((DropWhileSequence) this.e).b.invoke(next)).booleanValue());
        this.d = next;
        this.c = 1;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            FlatteningSequence flatteningSequence = (FlatteningSequence) this.e;
            it = (Iterator) flatteningSequence.c.invoke(flatteningSequence.b.invoke(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    c();
                }
                return this.c == 1 || this.b.hasNext();
            case 1:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            case 2:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return d();
            default:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    c();
                }
                if (this.c == 1) {
                    Object obj = this.d;
                    this.d = null;
                    this.c = 0;
                }
                break;
            case 1:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    p60.m();
                } else {
                    Object obj2 = this.d;
                    this.d = null;
                    this.c = -1;
                }
                break;
            case 2:
                int i = this.c;
                if (i == 2) {
                    p60.m();
                } else if (i == 0 && !d()) {
                    p60.m();
                } else {
                    this.c = 0;
                    Iterator it = (Iterator) this.d;
                    it.getClass();
                }
                break;
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    p60.m();
                } else {
                    Object obj3 = this.d;
                    this.d = null;
                    this.c = -1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yz(FlatteningSequence flatteningSequence) {
        this.a = 2;
        this.e = flatteningSequence;
        this.b = flatteningSequence.a.iterator();
    }

    public yz(TakeWhileSequence takeWhileSequence) {
        this.a = 3;
        this.e = takeWhileSequence;
        this.b = takeWhileSequence.a.iterator();
        this.c = -1;
    }

    public yz(DropWhileSequence dropWhileSequence) {
        this.a = 0;
        this.e = dropWhileSequence;
        this.b = dropWhileSequence.a.iterator();
        this.c = -1;
    }
}
