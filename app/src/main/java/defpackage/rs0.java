package defpackage;

import androidx.collection.SparseArrayCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rs0 implements Iterator {
    public int a = -1;
    public boolean b = false;
    public final /* synthetic */ NavGraph c;

    public rs0(NavGraph navGraph) {
        this.c = navGraph;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.c.i.d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            p60.m();
            return null;
        }
        this.b = true;
        SparseArrayCompat sparseArrayCompat = this.c.i;
        int i = this.a + 1;
        this.a = i;
        return (NavDestination) sparseArrayCompat.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        SparseArrayCompat sparseArrayCompat = this.c.i;
        if (!this.b) {
            u7.p("You must call next() before you can remove an element");
            return;
        }
        ((NavDestination) sparseArrayCompat.e(this.a)).b = null;
        int i = this.a;
        Object[] objArr = sparseArrayCompat.c;
        Object obj = objArr[i];
        Object obj2 = mc2.e;
        if (obj != obj2) {
            objArr[i] = obj2;
            sparseArrayCompat.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
