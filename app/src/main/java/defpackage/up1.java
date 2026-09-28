package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 extends p5 {
    @Override // defpackage.q5
    public final boolean b() {
        if (!super.b() || !vp1.b("MULTI_PROCESS")) {
            return false;
        }
        int i = sp1.a;
        if (vp1.h.b()) {
            return xp1.a.getStatics().isMultiProcessEnabled();
        }
        throw vp1.a();
    }
}
