package io.ktor.util.date;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/util/date/InvalidDateStringException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "at", "pattern", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InvalidDateStringException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidDateStringException(String str, int i, String str2) {
        super("Failed to parse date string: \"" + str + "\" at index " + i + ". Pattern: \"" + str2 + '\"');
        str.getClass();
        str2.getClass();
    }
}
