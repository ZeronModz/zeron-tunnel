package kotlinx.io;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.s31;
import defpackage.xu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlinx/io/RefCountingCopyTracker;", "Lkotlinx/io/SegmentCopyTracker;", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "a", "I", "copyCount", "Companion", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefCountingCopyTracker extends SegmentCopyTracker {
    public static final AtomicIntegerFieldUpdater b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile int copyCount;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/io/RefCountingCopyTracker$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
        b = AtomicIntegerFieldUpdater.newUpdater(RefCountingCopyTracker.class, "a");
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public final void a() {
        b.incrementAndGet(this);
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public final boolean b() {
        return this.copyCount > 0;
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public final boolean c() {
        if (this.copyCount == 0) {
            return false;
        }
        int iDecrementAndGet = b.decrementAndGet(this);
        if (iDecrementAndGet >= 0) {
            return true;
        }
        if (iDecrementAndGet == -1) {
            this.copyCount = 0;
            return false;
        }
        s31.d(iDecrementAndGet + 1, "Shared copies count is negative: ");
        return false;
    }
}
