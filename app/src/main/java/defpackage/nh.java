package defpackage;

import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nh extends n1 {
    public final /* synthetic */ oh h;

    public nh(oh ohVar) {
        this.h = ohVar;
    }

    @Override // defpackage.n1
    public final String g() {
        b bVar = (b) this.h.a.get();
        if (bVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return vh.k(bVar.a, "]", new StringBuilder("tag=["));
    }
}
