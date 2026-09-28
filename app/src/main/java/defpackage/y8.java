package defpackage;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y8 {
    public final oa a() {
        na naVar = (na) this;
        String strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.isEmpty()) {
            u7.p("Missing required properties:".concat(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            return null;
        }
        int iIntValue = naVar.a.intValue();
        int iIntValue2 = naVar.b.intValue();
        int iIntValue3 = naVar.c.intValue();
        int iIntValue4 = naVar.d.intValue();
        oa oaVar = new oa(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        if (iIntValue == -1) {
            strConcat = " audioSource";
        }
        if (iIntValue2 <= 0) {
            strConcat = strConcat.concat(" sampleRate");
        }
        if (iIntValue3 <= 0) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (iIntValue4 == -1) {
            strConcat = strConcat.concat(" audioFormat");
        }
        if (strConcat.isEmpty()) {
            return oaVar;
        }
        u7.r("Required settings missing or non-positive:".concat(strConcat));
        return null;
    }
}
