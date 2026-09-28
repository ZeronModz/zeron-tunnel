package defpackage;

import com.google.common.io.LittleEndianDataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wg {
    public static final /* synthetic */ int a = 0;

    static {
        new ug(0);
    }

    public static void a(LittleEndianDataInputStream littleEndianDataInputStream, byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i2 < 0) {
            u7.i(hz.p(i2, "len (", ") cannot be negative"));
            return;
        }
        cn0.p(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = littleEndianDataInputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            } else {
                i3 += i4;
            }
        }
        if (i3 != i2) {
            throw new EOFException(vh.h(i3, "reached end of stream after reading ", i2, " bytes; ", " bytes expected"));
        }
    }
}
