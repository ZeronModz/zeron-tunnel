package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {
    public final String c;
    public final String d;

    public e(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.c = str2;
        this.d = str;
    }

    @Override // defpackage.x
    public final String b() throws NotFoundException {
        if (((BitArray) this.a).b != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        c(8, sb);
        g(sb, 48, 20);
        int iC = b.c(68, 16, ((b) this.b).a);
        if (iC != 38400) {
            sb.append('(');
            sb.append(this.c);
            sb.append(')');
            int i = iC % 32;
            int i2 = iC / 32;
            int i3 = (i2 % 12) + 1;
            int i4 = i2 / 12;
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i3);
            if (i / 10 == 0) {
                sb.append('0');
            }
            sb.append(i);
        }
        return sb.toString();
    }

    @Override // defpackage.g
    public final void e(int i, StringBuilder sb) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // defpackage.g
    public final int f(int i) {
        return i % 100000;
    }
}
