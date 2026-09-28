package defpackage;

import com.google.common.hash.Hasher;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p1 extends k02 {
    public final ByteBuffer p;
    public final int q;
    public final int r;

    public p1(int i, int i2) {
        cn0.e(i2 % i == 0);
        this.p = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.q = i2;
        this.r = i;
    }

    public abstract d P();

    public final void Q() {
        ByteBuffer byteBuffer = this.p;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.r) {
            S(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void R() {
        if (this.p.remaining() < 8) {
            Q();
        }
    }

    public abstract void S(ByteBuffer byteBuffer);

    public abstract void T(ByteBuffer byteBuffer);

    public final void U(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.p;
        if (iRemaining <= byteBuffer2.remaining()) {
            byteBuffer2.put(byteBuffer);
            R();
            return;
        }
        int iPosition = this.q - byteBuffer2.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer2.put(byteBuffer.get());
        }
        Q();
        while (byteBuffer.remaining() >= this.r) {
            S(byteBuffer);
        }
        byteBuffer2.put(byteBuffer);
    }

    @Override // com.google.common.hash.Hasher
    public final d hash() {
        Q();
        ByteBuffer byteBuffer = this.p;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            T(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return P();
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putByte(byte b) {
        this.p.put(b);
        R();
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBytes(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            U(byteBuffer);
            return this;
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putChar(char c) {
        this.p.putChar(c);
        R();
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putInt(int i) {
        this.p.putInt(i);
        R();
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putLong(long j) {
        this.p.putLong(j);
        R();
        return this;
    }

    @Override // defpackage.k02, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putShort(short s) {
        this.p.putShort(s);
        R();
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final /* bridge */ /* synthetic */ PrimitiveSink putByte(byte b) {
        putByte(b);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final /* bridge */ /* synthetic */ PrimitiveSink putChar(char c) {
        putChar(c);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final /* bridge */ /* synthetic */ PrimitiveSink putInt(int i) {
        putInt(i);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final /* bridge */ /* synthetic */ PrimitiveSink putLong(long j) {
        putLong(j);
        return this;
    }

    @Override // defpackage.k02, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final /* bridge */ /* synthetic */ PrimitiveSink putShort(short s) {
        putShort(s);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr, int i, int i2) {
        putBytes(bArr, i, i2);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBytes(byte[] bArr, int i, int i2) {
        U(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final /* bridge */ /* synthetic */ PrimitiveSink putBytes(ByteBuffer byteBuffer) {
        putBytes(byteBuffer);
        return this;
    }
}
