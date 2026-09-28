package defpackage;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ug extends OutputStream {
    public final /* synthetic */ int a;

    public /* synthetic */ ug(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
        }
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                cn0.p(i, i2 + i, bArr.length);
                break;
            default:
                bArr.getClass();
                n8.I0(i, i2 + i, bArr.length);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                break;
            default:
                bArr.getClass();
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
    }
}
