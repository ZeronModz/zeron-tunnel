package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import okio.Buffer;
import okio.BufferedSink;
import okio.RealBufferedSink;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tf extends OutputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ BufferedSink b;

    public /* synthetic */ tf(BufferedSink bufferedSink, int i) {
        this.a = i;
        this.b = bufferedSink;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((RealBufferedSink) this.b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                break;
            default:
                RealBufferedSink realBufferedSink = (RealBufferedSink) this.b;
                if (!realBufferedSink.c) {
                    realBufferedSink.flush();
                }
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        BufferedSink bufferedSink = this.b;
        switch (i) {
            case 0:
                return ((Buffer) bufferedSink) + ".outputStream()";
            default:
                return ((RealBufferedSink) bufferedSink) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        BufferedSink bufferedSink = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                ((Buffer) bufferedSink).m68write(bArr, i, i2);
                break;
            default:
                RealBufferedSink realBufferedSink = (RealBufferedSink) bufferedSink;
                if (!realBufferedSink.c) {
                    realBufferedSink.b.m68write(bArr, i, i2);
                    realBufferedSink.emitCompleteSegments();
                } else {
                    p60.f("closed");
                }
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.a;
        BufferedSink bufferedSink = this.b;
        switch (i2) {
            case 0:
                ((Buffer) bufferedSink).j(i);
                break;
            default:
                RealBufferedSink realBufferedSink = (RealBufferedSink) bufferedSink;
                if (!realBufferedSink.c) {
                    realBufferedSink.b.j((byte) i);
                    realBufferedSink.emitCompleteSegments();
                } else {
                    p60.f("closed");
                }
                break;
        }
    }
}
