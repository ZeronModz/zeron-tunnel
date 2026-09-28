package defpackage;

import com.google.common.hash.d;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l81 extends p1 {
    public final int s;
    public final int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public l81(int i, int i2, long j, long j2) {
        super(8, 8);
        this.y = 0L;
        this.z = 0L;
        this.s = i;
        this.t = i2;
        this.u = 8317987319222330741L ^ j;
        this.v = 7237128888997146477L ^ j2;
        this.w = 7816392313619706465L ^ j;
        this.x = 8387220255154660723L ^ j2;
    }

    @Override // defpackage.p1
    public final d P() {
        long j = this.z ^ (this.y << 56);
        this.z = j;
        this.x ^= j;
        V(this.s);
        this.u = j ^ this.u;
        this.w ^= 255;
        V(this.t);
        return d.fromLong(((this.u ^ this.v) ^ this.w) ^ this.x);
    }

    @Override // defpackage.p1
    public final void S(ByteBuffer byteBuffer) {
        this.y += 8;
        long j = byteBuffer.getLong();
        this.x ^= j;
        V(this.s);
        this.u = j ^ this.u;
    }

    @Override // defpackage.p1
    public final void T(ByteBuffer byteBuffer) {
        this.y += (long) byteBuffer.remaining();
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            this.z ^= (((long) byteBuffer.get()) & 255) << i;
            i += 8;
        }
    }

    public final void V(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            long j = this.u;
            long j2 = this.v;
            this.u = j + j2;
            this.w += this.x;
            this.v = Long.rotateLeft(j2, 13);
            long jRotateLeft = Long.rotateLeft(this.x, 16);
            long j3 = this.v;
            long j4 = this.u;
            this.v = j3 ^ j4;
            this.x = jRotateLeft ^ this.w;
            long jRotateLeft2 = Long.rotateLeft(j4, 32);
            long j5 = this.w;
            long j6 = this.v;
            this.w = j5 + j6;
            this.u = jRotateLeft2 + this.x;
            this.v = Long.rotateLeft(j6, 17);
            long jRotateLeft3 = Long.rotateLeft(this.x, 21);
            long j7 = this.v;
            long j8 = this.w;
            this.v = j7 ^ j8;
            this.x = jRotateLeft3 ^ this.u;
            this.w = Long.rotateLeft(j8, 32);
        }
    }
}
