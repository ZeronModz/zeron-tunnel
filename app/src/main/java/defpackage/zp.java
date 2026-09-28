package defpackage;

import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zp extends LiveData {
    public final /* synthetic */ ComputableLiveData l;

    public zp(ComputableLiveData computableLiveData) {
        this.l = computableLiveData;
    }

    @Override // androidx.lifecycle.LiveData
    public final void g() {
        ComputableLiveData computableLiveData = this.l;
        computableLiveData.a.execute(computableLiveData.e);
    }
}
