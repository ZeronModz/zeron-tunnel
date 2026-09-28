package io.ktor.utils.io;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.qg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "min", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "Lmk1;", "cancel", "(Ljava/lang/Throwable;)V", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "Lkotlinx/io/Source;", "getReadBuffer", "()Lkotlinx/io/Source;", "getReadBuffer$annotations", "()V", "readBuffer", "Companion", "qg", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ByteReadChannel {
    public static final qg Companion = qg.a;

    Object awaitContent(int i, Continuation<? super Boolean> continuation);

    void cancel(Throwable cause);

    Throwable getClosedCause();

    Source getReadBuffer();

    boolean isClosedForRead();
}
