package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ dt d;

    public bt(dt dtVar, int i, int i2, Bundle bundle) {
        this.d = dtVar;
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.d(this.a, this.b, this.c);
    }
}
