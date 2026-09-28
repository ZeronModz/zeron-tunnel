package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rc extends ta1 {
    public Size a;
    public DynamicRange b;
    public Range c;
    public Config d;
    public Boolean e;

    public final sc a() {
        String strConcat = this.a == null ? " resolution" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (this.b == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (this.e == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new sc(this.a, this.b, this.c, this.d, this.e.booleanValue());
        }
        u7.p("Missing required properties:".concat(strConcat));
        return null;
    }
}
