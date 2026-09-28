package defpackage;

import com.google.android.gms.internal.ads.zzfxp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uw2 extends zzfxp {
    public String a;
    public byte b;
    public int c;
    public int d;

    public final vw2 a() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            return new vw2(this.a, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        u7.p("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
