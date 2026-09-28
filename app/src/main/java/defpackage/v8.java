package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v8 {
    public final ma a() {
        la laVar = (la) this;
        String strConcat = laVar.a == null ? " mimeType" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (laVar.c == null) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (laVar.d == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (laVar.e == null) {
            strConcat = strConcat.concat(" sampleRate");
        }
        if (laVar.f == null) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (!strConcat.isEmpty()) {
            u7.p("Missing required properties:".concat(strConcat));
            return null;
        }
        String str = laVar.a;
        int iIntValue = laVar.b.intValue();
        ma maVar = new ma(str, iIntValue, laVar.c, laVar.d.intValue(), laVar.e.intValue(), laVar.f.intValue());
        if (!Objects.equals(str, "audio/mp4a-latm") || iIntValue != -1) {
            return maVar;
        }
        u7.r("Encoder mime set to AAC, but no AAC profile was provided.");
        return null;
    }
}
