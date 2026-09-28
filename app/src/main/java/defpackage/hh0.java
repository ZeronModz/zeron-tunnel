package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hh0 extends InputStream {
    public final /* synthetic */ int a;
    public Iterator b;
    public ByteBuffer c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public int i;
    public long j;

    public /* synthetic */ hh0(int i) {
        this.a = i;
    }

    public boolean a() {
        this.e++;
        Iterator it = this.b;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.c = byteBuffer;
        this.f = byteBuffer.position();
        if (this.c.hasArray()) {
            this.g = true;
            this.h = this.c.array();
            this.i = this.c.arrayOffset();
            return true;
        }
        this.g = false;
        this.j = dl1.c.a.getLong(this.c, dl1.g);
        this.h = null;
        return true;
    }

    public void b(int i) {
        int i2 = this.f + i;
        this.f = i2;
        if (i2 == this.c.limit()) {
            a();
        }
    }

    public boolean c() {
        ByteBuffer byteBuffer;
        Iterator it = this.b;
        do {
            this.e++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.c = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f = this.c.position();
        if (this.c.hasArray()) {
            this.g = true;
            this.h = this.c.array();
            this.i = this.c.arrayOffset();
            return true;
        }
        this.g = false;
        this.j = vd3.c.a.getLong(this.c, vd3.g);
        this.h = null;
        return true;
    }

    public void d(int i) {
        int i2 = this.f + i;
        this.f = i2;
        if (i2 == this.c.limit()) {
            c();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if (this.e != this.d) {
                    int iLimit = this.c.limit();
                    int i3 = this.f;
                    int i4 = iLimit - i3;
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    if (this.g) {
                        System.arraycopy(this.h, i3 + this.i, bArr, i, i2);
                        b(i2);
                    } else {
                        int iPosition = this.c.position();
                        this.c.position(this.f);
                        this.c.get(bArr, i, i2);
                        this.c.position(iPosition);
                        b(i2);
                    }
                    break;
                }
                break;
            default:
                if (this.e != this.d) {
                    int iLimit2 = this.c.limit();
                    int i5 = this.f;
                    int i6 = iLimit2 - i5;
                    if (i2 > i6) {
                        i2 = i6;
                    }
                    if (this.g) {
                        System.arraycopy(this.h, i5 + this.i, bArr, i, i2);
                        d(i2);
                    } else {
                        int iPosition2 = this.c.position();
                        this.c.position(this.f);
                        this.c.get(bArr, i, i2);
                        this.c.position(iPosition2);
                        d(i2);
                    }
                    break;
                }
                break;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        int iC;
        int iU;
        switch (this.a) {
            case 0:
                if (this.e == this.d) {
                    return -1;
                }
                if (this.g) {
                    iC = this.h[this.f + this.i] & 255;
                    b(1);
                } else {
                    iC = dl1.c.c(((long) this.f) + this.j) & 255;
                    b(1);
                }
                return iC;
            default:
                if (this.e == this.d) {
                    return -1;
                }
                if (this.g) {
                    iU = this.h[this.f + this.i] & 255;
                    d(1);
                } else {
                    iU = vd3.c.u(((long) this.f) + this.j) & 255;
                    d(1);
                }
                return iU;
        }
    }
}
