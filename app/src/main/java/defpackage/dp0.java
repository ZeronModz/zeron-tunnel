package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 implements Observer {
    public final LiveData a;
    public final Observer b;
    public int c = -1;

    public dp0(LiveData liveData, Observer observer) {
        this.a = liveData;
        this.b = observer;
    }

    public final void a() {
        this.a.f(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.onChanged(obj);
        }
    }
}
