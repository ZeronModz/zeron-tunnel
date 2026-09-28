package defpackage;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 extends zabw {
    public final WeakReference a;

    public ss1(zabe zabeVar) {
        this.a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        zabe zabeVar = (zabe) this.a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.c(zabeVar);
    }
}
