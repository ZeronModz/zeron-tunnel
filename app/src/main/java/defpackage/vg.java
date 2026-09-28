package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vg extends FilterInputStream {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(InputStream inputStream, long j) {
        super(inputStream);
        this.a = 3;
        this.c = -1L;
        inputStream.getClass();
        n8.b0("limit must be non-negative", j >= 0);
        this.b = j;
    }

    private final synchronized void a(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.c = this.b;
    }

    private final synchronized void b(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.c = this.b;
    }

    private final synchronized void c() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.b = this.c;
    }

    private final synchronized void d() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.b = this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        long jMin;
        switch (this.a) {
            case 0:
                jMin = Math.min(((FilterInputStream) this).in.available(), this.b);
                break;
            case 3:
                jMin = Math.min(((FilterInputStream) this).in.available(), this.b);
                break;
            default:
                return super.available();
        }
        return (int) jMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 0:
                a(i);
                break;
            case 3:
                b(i);
                break;
            default:
                super.mark(i);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                long j = this.b;
                if (j == 0) {
                    return -1;
                }
                int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (i3 != -1) {
                    this.b -= (long) i3;
                }
                return i3;
            case 1:
                int i4 = super.read(bArr, i, i2);
                if (i4 != -1) {
                    this.c += (long) i4;
                }
                return i4;
            case 2:
                int i5 = super.read(bArr, i, i2);
                if (i5 != -1) {
                    this.c += (long) i5;
                }
                return i5;
            default:
                long j2 = this.b;
                if (j2 == 0) {
                    return -1;
                }
                int i6 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j2));
                if (i6 != -1) {
                    this.b -= (long) i6;
                }
                return i6;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.a) {
            case 0:
                c();
                break;
            case 3:
                d();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.a) {
            case 0:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= jSkip;
                return jSkip;
            case 3:
                long jSkip2 = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= jSkip2;
                return jSkip2;
            default:
                return super.skip(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg(BufferedInputStream bufferedInputStream, long j, int i) {
        super(bufferedInputStream);
        this.a = i;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(InputStream inputStream) {
        super(inputStream);
        this.a = 0;
        this.c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                if (this.b == 0) {
                    return -1;
                }
                int i = ((FilterInputStream) this).in.read();
                if (i != -1) {
                    this.b--;
                }
                return i;
            case 1:
                int i2 = super.read();
                if (i2 != -1) {
                    this.c++;
                }
                return i2;
            case 2:
                int i3 = super.read();
                if (i3 != -1) {
                    this.c++;
                }
                return i3;
            default:
                if (this.b == 0) {
                    return -1;
                }
                int i4 = ((FilterInputStream) this).in.read();
                if (i4 != -1) {
                    this.b--;
                }
                return i4;
        }
    }
}
