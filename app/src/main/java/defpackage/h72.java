package defpackage;

import com.google.android.gms.internal.measurement.zzbz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h72 extends zzbz {
    public String a;
    public byte b;
    public int c;
    public int d;

    public final q72 a() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            return new q72(this.a, this.c, this.d);
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
