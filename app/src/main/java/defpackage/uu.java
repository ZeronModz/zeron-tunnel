package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uu extends vu {
    public final int c;
    public final int d;

    public uu(int i, int i2, int i3) throws FormatException {
        super(i, 0);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.c = i2;
        this.d = i3;
    }
}
