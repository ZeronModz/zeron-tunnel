package defpackage;

import androidx.core.os.CancellationSignal;
import androidx.fragment.app.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ r a;

    public l91(r rVar) {
        this.a = rVar;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        this.a.a();
    }
}
