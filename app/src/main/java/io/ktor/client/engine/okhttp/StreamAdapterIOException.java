package io.ktor.client.engine.okhttp;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/engine/okhttp/StreamAdapterIOException;", "Ljava/io/IOException;", "Lokio/IOException;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "<init>", "(Ljava/lang/Throwable;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamAdapterIOException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamAdapterIOException(Throwable th) {
        super(th);
        th.getClass();
    }
}
