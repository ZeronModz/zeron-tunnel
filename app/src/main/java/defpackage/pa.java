package defpackage;

import android.util.Range;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pa extends a9 {
    public Range a;
    public Integer b;
    public Integer c;
    public Range d;
    public Integer e;

    public final qa a() {
        String strConcat = this.a == null ? " bitrate" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (this.d == null) {
            strConcat = strConcat.concat(" sampleRate");
        }
        if (strConcat.isEmpty()) {
            return new qa(this.a, this.b.intValue(), this.c.intValue(), this.d, this.e.intValue());
        }
        u7.p("Missing required properties:".concat(strConcat));
        return null;
    }
}
