package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 extends AbstractList implements RandomAccess {
    public final /* synthetic */ int a;
    public final LazyStringArrayList b;

    public /* synthetic */ uj0(LazyStringArrayList lazyStringArrayList, int i) {
        this.a = i;
        this.b = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                int i3 = LazyStringArrayList.c;
                lazyStringArrayList.c(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                break;
            default:
                int i4 = LazyStringArrayList.c;
                lazyStringArrayList.b(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                return lazyStringArrayList.getByteArray(i);
            default:
                return lazyStringArrayList.getByteString(i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                String strF = lazyStringArrayList.f(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.d(strF);
            default:
                String strF2 = lazyStringArrayList.f(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.e(strF2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                int i3 = LazyStringArrayList.c;
                lazyStringArrayList.a();
                Object obj2 = lazyStringArrayList.b.set(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.d(obj2);
            default:
                int i4 = LazyStringArrayList.c;
                lazyStringArrayList.a();
                Object obj3 = lazyStringArrayList.b.set(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.e(obj3);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i) {
        }
        return lazyStringArrayList.b.size();
    }
}
