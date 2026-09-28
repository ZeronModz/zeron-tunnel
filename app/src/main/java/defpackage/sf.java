package defpackage;

import io.ktor.utils.io.jvm.javaio.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okio.Buffer;
import okio.RealBufferedSource;
import okio.Segment;
import okio.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class sf extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Closeable b;

    public /* synthetic */ sf(Closeable closeable, int i) {
        this.a = i;
        this.b = closeable;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.a;
        Closeable closeable = this.b;
        switch (i) {
            case 0:
                return (int) Math.min(((Buffer) closeable).b, 2147483647L);
            case 1:
                return ((a) closeable).available();
            default:
                RealBufferedSource realBufferedSource = (RealBufferedSource) closeable;
                if (!realBufferedSource.c) {
                    return (int) Math.min(realBufferedSource.b.b, 2147483647L);
                }
                p60.f("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.a;
        Closeable closeable = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                super.close();
                ((a) closeable).close();
                break;
            default:
                ((RealBufferedSource) closeable).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.a;
        Closeable closeable = this.b;
        switch (i) {
            case 0:
                Buffer buffer = (Buffer) closeable;
                if (buffer.b > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            case 1:
                return ((a) closeable).read();
            default:
                RealBufferedSource realBufferedSource = (RealBufferedSource) closeable;
                Buffer buffer2 = realBufferedSource.b;
                if (realBufferedSource.c) {
                    p60.f("closed");
                    return 0;
                }
                if (buffer2.b == 0 && realBufferedSource.a.read(buffer2, 8192L) == -1) {
                    return -1;
                }
                return buffer2.readByte() & 255;
        }
    }

    public String toString() {
        int i = this.a;
        Closeable closeable = this.b;
        switch (i) {
            case 0:
                return ((Buffer) closeable) + ".inputStream()";
            case 1:
            default:
                return super.toString();
            case 2:
                return ((RealBufferedSource) closeable) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.a) {
            case 2:
                outputStream.getClass();
                RealBufferedSource realBufferedSource = (RealBufferedSource) this.b;
                Buffer buffer = realBufferedSource.b;
                if (realBufferedSource.c) {
                    p60.f("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (buffer.b == 0 && realBufferedSource.a.read(buffer, 8192L) == -1) {
                        return j;
                    }
                    long j2 = buffer.b;
                    j += j2;
                    b.b(j2, 0L, j2);
                    Segment segment = buffer.a;
                    while (j2 > 0) {
                        segment.getClass();
                        int iMin = (int) Math.min(j2, segment.c - segment.b);
                        outputStream.write(segment.a, segment.b, iMin);
                        int i = segment.b + iMin;
                        segment.b = i;
                        long j3 = iMin;
                        buffer.b -= j3;
                        j2 -= j3;
                        if (i == segment.c) {
                            Segment segmentA = segment.a();
                            buffer.a = segmentA;
                            x51.a(segment);
                            segment = segmentA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        Closeable closeable = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((Buffer) closeable).read(bArr, i, i2);
            case 1:
                return ((a) closeable).read(bArr, i, i2);
            default:
                RealBufferedSource realBufferedSource = (RealBufferedSource) closeable;
                Buffer buffer = realBufferedSource.b;
                if (!realBufferedSource.c) {
                    b.b(bArr.length, i, i2);
                    if (buffer.b == 0 && realBufferedSource.a.read(buffer, 8192L) == -1) {
                        return -1;
                    }
                    return buffer.read(bArr, i, i2);
                }
                p60.f("closed");
                return 0;
        }
    }
}
