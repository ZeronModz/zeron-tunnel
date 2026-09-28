package defpackage;

import com.google.common.hash.d;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tp0 extends s {
    public final MessageDigest q;
    public final int r;
    public boolean s;

    public tp0(MessageDigest messageDigest, int i) {
        this.q = messageDigest;
        this.r = i;
    }

    @Override // defpackage.s
    public final void P(byte b) {
        cn0.s("Cannot re-use a Hasher after calling hash() on it", !this.s);
        this.q.update(b);
    }

    @Override // defpackage.s
    public final void R(ByteBuffer byteBuffer) {
        cn0.s("Cannot re-use a Hasher after calling hash() on it", !this.s);
        this.q.update(byteBuffer);
    }

    @Override // defpackage.s
    public final void S(byte[] bArr, int i, int i2) {
        cn0.s("Cannot re-use a Hasher after calling hash() on it", !this.s);
        this.q.update(bArr, i, i2);
    }

    @Override // com.google.common.hash.Hasher
    public final d hash() {
        cn0.s("Cannot re-use a Hasher after calling hash() on it", !this.s);
        this.s = true;
        MessageDigest messageDigest = this.q;
        int digestLength = messageDigest.getDigestLength();
        int i = this.r;
        return i == digestLength ? d.fromBytesNoCopy(messageDigest.digest()) : d.fromBytesNoCopy(Arrays.copyOf(messageDigest.digest(), i));
    }
}
