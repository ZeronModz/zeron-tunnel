package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ki extends MediatorLiveData {
    public LiveData m;
    public final Object n;

    public ki(Object obj) {
        this.n = obj;
    }

    @Override // androidx.lifecycle.LiveData
    public final Object d() {
        LiveData liveData = this.m;
        return liveData == null ? this.n : liveData.d();
    }

    @Override // androidx.lifecycle.MediatorLiveData
    public final void l(LiveData liveData, Observer observer) {
        throw new UnsupportedOperationException();
    }

    public final void m(MutableLiveData mutableLiveData) {
        dp0 dp0Var;
        LiveData liveData = this.m;
        if (liveData != null && (dp0Var = (dp0) this.l.b(liveData)) != null) {
            dp0Var.a.j(dp0Var);
        }
        this.m = mutableLiveData;
        super.l(mutableLiveData, new a4(this, 6));
    }
}
