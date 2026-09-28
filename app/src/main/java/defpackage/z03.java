package defpackage;

import com.google.android.gms.internal.ads.zzgpr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z03 extends zzgpr {
    public int a;
    public String b;
    public int c;
    public byte d;

    public final a13 a() {
        if (this.d == 3) {
            return new a13(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.d & 2) == 0) {
            sb.append(" uiMode");
        }
        u7.p("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
