package defpackage;

import android.util.Range;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fd extends tm1 {
    public d01 a;
    public Range b;
    public Range c;
    public Integer d;

    public final gd a() {
        String strConcat = this.a == null ? " qualitySelector" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (this.b == null) {
            strConcat = strConcat.concat(" frameRate");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (this.d == null) {
            strConcat = strConcat.concat(" aspectRatio");
        }
        if (strConcat.isEmpty()) {
            return new gd(this.a, this.b, this.c, this.d.intValue());
        }
        u7.p("Missing required properties:".concat(strConcat));
        return null;
    }
}
