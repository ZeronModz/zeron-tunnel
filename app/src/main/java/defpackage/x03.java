package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzgpp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x03 extends zzgpp {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    public final y03 a() {
        IBinder iBinder;
        if (this.g == 31 && (iBinder = this.a) != null) {
            return new y03(iBinder, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        u7.p("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
