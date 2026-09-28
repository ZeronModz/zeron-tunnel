package defpackage;

import android.media.MediaCodec;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b20 implements EncodedData {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer d;
    public final oh e;
    public final b f;
    public final AtomicBoolean g = new AtomicBoolean(false);

    public b20(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.d = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            atomicReference.set(bVar);
            bVar.a = "Data closed";
        } catch (Exception e) {
            ohVar.a(e);
        }
        this.e = ohVar;
        b bVar2 = (b) atomicReference.get();
        bVar2.getClass();
        this.f = bVar2;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public final void close() {
        b bVar = this.f;
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.a.releaseOutputBuffer(this.c, false);
            bVar.b(null);
        } catch (IllegalStateException e) {
            bVar.d(e);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final MediaCodec.BufferInfo getBufferInfo() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final ByteBuffer getByteBuffer() {
        if (this.g.get()) {
            u7.p("encoded data is closed.");
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.d;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final ListenableFuture getClosedFuture() {
        return xg0.p(this.e);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long getPresentationTimeUs() {
        return this.b.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final boolean isKeyFrame() {
        return (this.b.flags & 1) != 0;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long size() {
        return this.b.size;
    }
}
