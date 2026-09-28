package defpackage;

import com.google.android.gms.internal.ads.zzdze;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 extends zzdze {
    public long a;
    public int b;
    public byte c;

    public final im2 a() {
        if (this.c == 3) {
            return new im2(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" id");
        }
        if ((this.c & 2) == 0) {
            sb.append(" eventType");
        }
        u7.p("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
