package defpackage;

import android.os.SystemClock;
import androidx.camera.camera2.internal.n;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gi {
    public final long a;
    public long b = -1;
    public final /* synthetic */ n c;

    public gi(n nVar, long j) {
        this.c = nVar;
        this.a = j;
    }

    public final int a() {
        if (!this.c.c()) {
            return TypedValues.TransitionType.TYPE_DURATION;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.b;
        if (j == -1) {
            this.b = jUptimeMillis;
            j = jUptimeMillis;
        }
        long j2 = jUptimeMillis - j;
        if (j2 <= 120000) {
            return 1000;
        }
        return j2 <= 300000 ? 2000 : 4000;
    }

    public final int b() {
        boolean zC = this.c.c();
        long j = this.a;
        if (zC) {
            if (j > 0) {
                return Math.min((int) j, 1800000);
            }
            return 1800000;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }
}
