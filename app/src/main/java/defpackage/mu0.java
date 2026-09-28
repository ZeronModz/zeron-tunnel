package defpackage;

import com.google.common.collect.m3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class mu0 extends m3 {
    public transient long[] i;
    public transient int j;
    public transient int k;

    @Override // com.google.common.collect.m3
    public final void a() {
        super.a();
        this.j = -2;
        this.k = -2;
    }

    @Override // com.google.common.collect.m3
    public final int c() {
        int i = this.j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.m3
    public final void f(int i) {
        super.f(i);
        this.j = -2;
        this.k = -2;
        long[] jArr = new long[i];
        this.i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.m3
    public final void g(int i, Object obj, int i2, int i3) {
        super.g(i, obj, i2, i3);
        p(this.k, i);
        p(i, -2);
    }

    @Override // com.google.common.collect.m3
    public final void h(int i) {
        int i2 = this.c - 1;
        long j = this.i[i];
        p((int) (j >>> 32), (int) j);
        if (i < i2) {
            p((int) (this.i[i2] >>> 32), i);
            p(i, (int) this.i[i2]);
        }
        super.h(i);
    }

    @Override // com.google.common.collect.m3
    public final int i(int i) {
        int i2 = (int) this.i[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.common.collect.m3
    public final int j(int i, int i2) {
        return i == this.c ? i2 : i;
    }

    @Override // com.google.common.collect.m3
    public final void n(int i) {
        super.n(i);
        long[] jArr = this.i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public final void p(int i, int i2) {
        if (i == -2) {
            this.j = i2;
        } else {
            long[] jArr = this.i;
            jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.k = i;
        } else {
            long[] jArr2 = this.i;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
        }
    }
}
