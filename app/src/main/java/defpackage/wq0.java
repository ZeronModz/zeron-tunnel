package defpackage;

import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.encoder.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wq0 {
    public final Mode a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ c e;

    public wq0(c cVar, Mode mode, int i, int i2, int i3) {
        this.e = cVar;
        this.a = mode;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        Mode mode = this.a;
        Mode mode2 = Mode.BYTE;
        int i = this.d;
        if (mode != mode2) {
            return i;
        }
        r60 r60Var = this.e.c;
        ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) r60Var.c;
        String str = (String) r60Var.b;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(eCIEncoderSet.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Mode mode = this.a;
        sb.append(mode);
        sb.append('(');
        Mode mode2 = Mode.ECI;
        r60 r60Var = this.e.c;
        if (mode == mode2) {
            ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) r60Var.c;
            sb.append(eCIEncoderSet.a[this.c].charset().displayName());
        } else {
            String str = (String) r60Var.b;
            int i = this.d;
            int i2 = this.b;
            String strSubstring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                if (strSubstring.charAt(i3) < ' ' || strSubstring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(strSubstring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
