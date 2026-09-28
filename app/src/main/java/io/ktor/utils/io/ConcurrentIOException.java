package io.ktor.utils.io;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/ConcurrentIOException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "taskName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConcurrentIOException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentIOException(String str, Throwable th) {
        super("Concurrent " + str + " attempts", th);
        str.getClass();
    }

    public /* synthetic */ ConcurrentIOException(String str, Throwable th, int i, xu xuVar) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
