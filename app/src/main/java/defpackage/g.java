package defpackage;

import com.google.zxing.oned.rss.expanded.decoders.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends f {
    public abstract void e(int i, StringBuilder sb);

    public abstract int f(int i);

    public final void g(StringBuilder sb, int i, int i2) {
        int iC = b.c(i, i2, ((b) this.b).a);
        e(iC, sb);
        int iF = f(iC);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iF / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iF);
    }
}
