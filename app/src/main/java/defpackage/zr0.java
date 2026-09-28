package defpackage;

import com.google.common.hash.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zr0 extends p1 {
    public long s;
    public long t;
    public int u;

    @Override // defpackage.p1
    public final d P() {
        long j = this.s;
        long j2 = this.u;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.t;
        long j5 = j3 + j4;
        long j6 = j4 + j5;
        long j7 = (j5 ^ (j5 >>> 33)) * (-49064778989728563L);
        long j8 = (j7 ^ (j7 >>> 33)) * (-4265267296055464877L);
        long j9 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
        long j10 = (j9 ^ (j9 >>> 33)) * (-4265267296055464877L);
        long j11 = j10 ^ (j10 >>> 33);
        long j12 = (j8 ^ (j8 >>> 33)) + j11;
        this.s = j12;
        this.t = j11 + j12;
        return d.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.s).putLong(this.t).array());
    }

    @Override // defpackage.p1
    public final void S(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
        this.s = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.t;
        this.s = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.t = jRotateLeft3;
        this.t = ((Long.rotateLeft(jRotateLeft3, 31) + this.s) * 5) + 944331445;
        this.u += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.p1
    public final void T(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        this.u = byteBuffer.remaining() + this.u;
        long j8 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 2:
                j2 = 0;
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 3:
                j3 = 0;
                j2 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j3;
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 4:
                j4 = 0;
                j3 = (((long) (byteBuffer.get(3) & 255)) << 24) ^ j4;
                j2 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j3;
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 5:
                j5 = 0;
                j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                j3 = (((long) (byteBuffer.get(3) & 255)) << 24) ^ j4;
                j2 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j3;
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 6:
                j6 = 0;
                j5 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j6;
                j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                j3 = (((long) (byteBuffer.get(3) & 255)) << 24) ^ j4;
                j2 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j3;
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 7:
                j6 = ((long) (byteBuffer.get(6) & 255)) << 48;
                j5 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j6;
                j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                j3 = (((long) (byteBuffer.get(3) & 255)) << 24) ^ j4;
                j2 = (((long) (byteBuffer.get(2) & 255)) << 16) ^ j3;
                j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 8:
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 9:
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 10:
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 11:
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 12:
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 13:
                j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 14:
                j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            case 15:
                j8 = ((long) (byteBuffer.get(14) & 255)) << 48;
                j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                j8 ^= (long) (byteBuffer.get(8) & 255);
                j7 = byteBuffer.getLong();
                this.s = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.s;
                this.t ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                break;
            default:
                u7.g("Should never get here.");
                break;
        }
    }
}
