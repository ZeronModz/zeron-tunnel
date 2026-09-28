package defpackage;

import android.media.MediaCodec;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lg0 implements InputBuffer {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final oh d;
    public final b e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public lg0(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        jx0.e(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            atomicReference.set(bVar);
            bVar.a = "Terminate InputBuffer";
        } catch (Exception e) {
            ohVar.a(e);
        }
        this.d = ohVar;
        b bVar2 = (b) atomicReference.get();
        bVar2.getClass();
        this.e = bVar2;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final boolean cancel() {
        b bVar = this.e;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            bVar.b(null);
        } catch (IllegalStateException e) {
            bVar.d(e);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final ByteBuffer getByteBuffer() {
        if (!this.f.get()) {
            return this.c;
        }
        u7.p("The buffer is submitted or canceled.");
        return null;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final ListenableFuture getTerminationFuture() {
        return xg0.p(this.d);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final void setEndOfStream(boolean z) {
        if (this.f.get()) {
            u7.p("The buffer is submitted or canceled.");
        } else {
            this.h = z;
        }
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final void setPresentationTimeUs(long j) {
        if (this.f.get()) {
            u7.p("The buffer is submitted or canceled.");
        } else {
            jx0.a(j >= 0);
            this.g = j;
        }
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final boolean submit() {
        b bVar = this.e;
        ByteBuffer byteBuffer = this.c;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
            bVar.b(null);
            return true;
        } catch (IllegalStateException e) {
            bVar.d(e);
            return false;
        }
    }
}
