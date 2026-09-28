package defpackage;

import junit.framework.TestCase;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ae1 extends TestCase {
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae1(String str) {
        super("warning");
        this.k = str;
    }

    @Override // junit.framework.TestCase
    public final void f0() {
        yg0.t(this.k);
        throw null;
    }
}
