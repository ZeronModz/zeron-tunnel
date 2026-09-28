package defpackage;

import com.google.android.gms.internal.ads.k7;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c43 extends k7 {
    public ListenableFuture h;
    public ScheduledFuture i;

    @Override // com.google.android.gms.internal.ads.f7
    public final void e() {
        m(this.h);
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final String f() {
        ListenableFuture listenableFuture = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        String strT = vh.t(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                int length = strT.length();
                StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
                sb.append(strT);
                sb.append(", remaining delay=[");
                sb.append(delay);
                sb.append(" ms]");
                return sb.toString();
            }
        }
        return strT;
    }
}
