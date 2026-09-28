package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg0 {
    public long[] a;
    public int b = 0;

    public cg0(int i) {
        this.a = new long[i];
    }

    public final void a(int i) {
        int i2 = this.b + i;
        long[] jArr = this.a;
        if (i2 > jArr.length) {
            int length = jArr.length;
            if (i2 < 0) {
                u7.g("cannot store more than MAX_VALUE elements");
                return;
            }
            int iHighestOneBit = length + (length >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                iHighestOneBit = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(jArr, iHighestOneBit);
        }
    }
}
