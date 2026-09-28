package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.common.ECIEncoderSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tq0 {
    public final char a;
    public final int b;
    public final tq0 c;
    public final int d;

    public tq0(char c, ECIEncoderSet eCIEncoderSet, int i, tq0 tq0Var, int i2) {
        int length;
        char c2 = c == i2 ? (char) 1000 : c;
        this.a = c2;
        this.b = i;
        this.c = tq0Var;
        if (c2 == 1000) {
            length = 1;
        } else {
            length = (RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + c).getBytes(eCIEncoderSet.a[i].charset()).length;
        }
        length = (tq0Var == null ? 0 : tq0Var.b) != i ? length + 3 : length;
        this.d = tq0Var != null ? length + tq0Var.d : length;
    }
}
