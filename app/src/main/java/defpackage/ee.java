package defpackage;

import coil3.request.RequestDelegate;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ee implements RequestDelegate {
    public final Job a;

    @Override // coil3.request.RequestDelegate
    public final Object awaitStarted(Continuation continuation) {
        return mk1.a;
    }

    @Override // coil3.request.RequestDelegate
    public final void dispose() {
        this.a.cancel((CancellationException) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ee) {
            return yg0.a(this.a, ((ee) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ')';
    }

    @Override // coil3.request.RequestDelegate
    public final void assertActive() {
    }

    @Override // coil3.request.RequestDelegate
    public final void complete() {
    }

    @Override // coil3.request.RequestDelegate
    public final void start() {
    }
}
