package io.ktor.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/serialization/WebsocketConverterNotFoundException;", "Lio/ktor/serialization/WebsocketContentConvertException;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "message", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-serialization"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebsocketConverterNotFoundException extends WebsocketContentConvertException {
    public /* synthetic */ WebsocketConverterNotFoundException(String str, Throwable th, int i, xu xuVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketConverterNotFoundException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}
