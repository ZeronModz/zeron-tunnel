package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends g {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, BitArray bitArray) {
        super(bitArray);
        this.c = i;
    }

    @Override // defpackage.x
    public final String b() throws NotFoundException {
        if (((BitArray) this.a).b != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        c(5, sb);
        g(sb, 45, 15);
        return sb.toString();
    }

    @Override // defpackage.g
    public final void e(int i, StringBuilder sb) {
        switch (this.c) {
            case 0:
                sb.append("(3103)");
                break;
            default:
                if (i >= 10000) {
                    sb.append("(3203)");
                } else {
                    sb.append("(3202)");
                }
                break;
        }
    }

    @Override // defpackage.g
    public final int f(int i) {
        switch (this.c) {
            case 0:
                return i;
            default:
                return i < 10000 ? i : i - 10000;
        }
    }
}
