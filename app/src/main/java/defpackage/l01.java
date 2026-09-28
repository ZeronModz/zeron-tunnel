package defpackage;

import com.google.android.gms.internal.ads.zzbee;
import com.google.zxing.ResultPoint;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l01 {
    public static final l01 d;
    public final /* synthetic */ int a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new l01(i, i, 0);
    }

    public l01(zzbee zzbeeVar, int i, int i2) {
        this.a = 6;
        this.b = i;
        this.c = i2;
    }

    public ResultPoint a() {
        return new ResultPoint(this.b, this.c);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(l01.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return hz.q(this.c, "]", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("<");
                sb2.append(this.b);
                sb2.append(' ');
                return vh.o(sb2, this.c, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l01(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
