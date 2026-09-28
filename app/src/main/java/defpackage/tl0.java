package defpackage;

import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.ViewModel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class tl0 extends ViewModel {
    public static final sl0 b = new sl0();
    public final SparseArrayCompat a = new SparseArrayCompat();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        SparseArrayCompat sparseArrayCompat = this.a;
        if (sparseArrayCompat.d() > 0) {
            sparseArrayCompat.e(0).getClass();
            u7.q();
            return;
        }
        int i = sparseArrayCompat.d;
        Object[] objArr = sparseArrayCompat.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        sparseArrayCompat.d = 0;
        sparseArrayCompat.a = false;
    }
}
