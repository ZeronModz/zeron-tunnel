package io.ktor.utils.io;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.j03;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/CloseToken;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "origin", "<init>", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CloseToken {
    public final Throwable a;

    /* JADX WARN: Multi-variable type inference failed */
    public CloseToken(Throwable th) {
        Throwable iOException;
        if (th == 0) {
            iOException = null;
        } else if (th instanceof CancellationException) {
            if (th instanceof CopyableThrowable) {
                iOException = ((CopyableThrowable) th).createCopy();
            } else {
                String message = ((CancellationException) th).getMessage();
                iOException = j03.a(message == null ? "Channel was cancelled" : message, th);
            }
        } else if ((th instanceof IOException) && (th instanceof CopyableThrowable)) {
            iOException = ((CopyableThrowable) th).createCopy();
        } else {
            String message2 = th.getMessage();
            iOException = new IOException(message2 == null ? "Channel was closed" : message2, th);
        }
        this.a = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a() {
        Throwable th = this.a;
        if (th == 0) {
            return null;
        }
        if (th instanceof IOException) {
            return th instanceof CopyableThrowable ? ((CopyableThrowable) th).createCopy() : new IOException(((IOException) th).getMessage(), th);
        }
        if (!(th instanceof CopyableThrowable)) {
            return j03.a(th.getMessage(), th);
        }
        Throwable thCreateCopy = ((CopyableThrowable) th).createCopy();
        return thCreateCopy == null ? j03.a(th.getMessage(), th) : thCreateCopy;
    }
}
