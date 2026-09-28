package defpackage;

import kotlin.time.Clock;
import kotlin.time.Instant;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class th0 implements Clock {
    @Override // kotlin.time.Clock
    public final Instant now() {
        Instant.Companion companion = Instant.INSTANCE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        companion.getClass();
        long j = jCurrentTimeMillis / 1000;
        if ((jCurrentTimeMillis ^ 1000) < 0 && j * 1000 != jCurrentTimeMillis) {
            j--;
        }
        long j2 = jCurrentTimeMillis % 1000;
        return j < -31557014167219200L ? Instant.MIN : j > 31556889864403199L ? Instant.MAX : Instant.Companion.a((int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000), j);
    }
}
