package defpackage;

import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.encoder.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uq0 {
    public final Mode a;
    public final int b;
    public final int c;
    public final int d;
    public final uq0 e;
    public final int f;

    public uq0(r60 r60Var, Mode mode, int i, int i2, int i3, uq0 uq0Var, jm1 jm1Var) {
        this.a = mode;
        this.b = i;
        Mode mode2 = Mode.BYTE;
        int i4 = (mode == mode2 || uq0Var == null) ? i2 : uq0Var.c;
        this.c = i4;
        this.d = i3;
        this.e = uq0Var;
        boolean z = false;
        int characterCountBits = uq0Var != null ? uq0Var.f : 0;
        if ((mode == mode2 && uq0Var == null && i4 != 0) || (uq0Var != null && i4 != uq0Var.c)) {
            z = true;
        }
        characterCountBits = (uq0Var == null || mode != uq0Var.a || z) ? characterCountBits + mode.getCharacterCountBits(jm1Var) + 4 : characterCountBits;
        int i5 = b.b[mode.ordinal()];
        if (i5 == 1) {
            characterCountBits += 13;
        } else if (i5 == 2) {
            characterCountBits += i3 == 1 ? 6 : 11;
        } else if (i5 == 3) {
            characterCountBits += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        } else if (i5 == 4) {
            characterCountBits += ((String) r60Var.b).substring(i, i3 + i).getBytes(((ECIEncoderSet) r60Var.c).a[i2].charset()).length * 8;
            if (z) {
                characterCountBits += 12;
            }
        }
        this.f = characterCountBits;
    }
}
