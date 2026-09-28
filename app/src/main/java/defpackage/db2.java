package defpackage;

import com.google.android.gms.internal.ads.zzijs;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class db2 implements zzijs {
    public final ByteBuffer a;

    public db2(ByteBuffer byteBuffer) {
        this.a = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final int zza(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final long zzb() {
        return this.a.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final long zzc() {
        return this.a.position();
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final void zzd(long j) {
        this.a.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final ByteBuffer zze(long j, long j2) {
        ByteBuffer byteBuffer = this.a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j2);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
