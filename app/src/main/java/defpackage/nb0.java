package defpackage;

import android.adservices.topics.GetTopicsRequest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb0 {
    public static GetTopicsRequest a(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest getTopicsRequest) {
        getTopicsRequest.getClass();
        GetTopicsRequest getTopicsRequestBuild = n3.b().setAdsSdkName(getTopicsRequest.a).setShouldRecordObservation(getTopicsRequest.b).build();
        getTopicsRequestBuild.getClass();
        return getTopicsRequestBuild;
    }

    public static GetTopicsRequest b(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest getTopicsRequest) {
        getTopicsRequest.getClass();
        GetTopicsRequest getTopicsRequestBuild = n3.b().setAdsSdkName(getTopicsRequest.a).build();
        getTopicsRequestBuild.getClass();
        return getTopicsRequestBuild;
    }
}
