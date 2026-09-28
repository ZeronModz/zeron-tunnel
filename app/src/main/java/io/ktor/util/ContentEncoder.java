package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/util/ContentEncoder;", "Lio/ktor/util/Encoder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "contentLength", "predictCompressedLength", "(J)Ljava/lang/Long;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getName", "()Ljava/lang/String;", "name", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ContentEncoder extends Encoder {
    String getName();

    Long predictCompressedLength(long contentLength);
}
