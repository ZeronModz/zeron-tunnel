package defpackage;

import okio.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qp1 {
    public static void a(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        long j;
        unsafeCursor.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.e;
            int i2 = unsafeCursor.f;
            int i3 = unsafeCursor.g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = unsafeCursor.d;
            Buffer buffer = unsafeCursor.a;
            buffer.getClass();
            if (j2 == buffer.b) {
                u7.p("no more bytes");
                return;
            }
            j = unsafeCursor.d;
        } while (unsafeCursor.b(j == -1 ? 0L : j + ((long) (unsafeCursor.g - unsafeCursor.f))) != -1);
    }
}
