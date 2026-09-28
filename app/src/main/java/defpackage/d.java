package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, BitArray bitArray) {
        super(bitArray);
        this.c = i;
    }

    @Override // defpackage.x
    public final String b() throws NotFoundException {
        int i = this.c;
        Object obj = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                if (((BitArray) obj).b < 48) {
                    throw NotFoundException.getNotFoundInstance();
                }
                StringBuilder sb = new StringBuilder();
                c(8, sb);
                int iC = b.c(48, 2, bVar.a);
                sb.append("(392");
                sb.append(iC);
                sb.append(')');
                sb.append(bVar.b(50, null).c);
                return sb.toString();
            case 1:
                b bVar2 = (b) obj2;
                BitArray bitArray = bVar2.a;
                if (((BitArray) obj).b < 48) {
                    throw NotFoundException.getNotFoundInstance();
                }
                StringBuilder sb2 = new StringBuilder();
                c(8, sb2);
                int iC2 = b.c(48, 2, bitArray);
                sb2.append("(393");
                sb2.append(iC2);
                sb2.append(')');
                int iC3 = b.c(50, 10, bitArray);
                if (iC3 / 100 == 0) {
                    sb2.append('0');
                }
                if (iC3 / 10 == 0) {
                    sb2.append('0');
                }
                sb2.append(iC3);
                sb2.append(bVar2.b(60, null).c);
                return sb2.toString();
            default:
                StringBuilder sbY = hz.y("(01)");
                int length = sbY.length();
                b bVar3 = (b) obj2;
                sbY.append(b.c(4, 4, bVar3.a));
                d(sbY, 8, length);
                return bVar3.a(48, sbY);
        }
    }
}
