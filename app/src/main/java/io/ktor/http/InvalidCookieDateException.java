package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import defpackage.vh;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/InvalidCookieDateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InvalidCookieDateException extends IllegalStateException {
    public InvalidCookieDateException(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("Failed to parse date string: \"");
        sb.append(str);
        sb.append("\". Reason: \"");
        super(vh.q(sb, str2, '\"'));
    }
}
