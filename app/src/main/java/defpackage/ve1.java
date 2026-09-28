package defpackage;

import android.os.SystemClock;
import com.google.firebase.sessions.Time;
import com.google.firebase.sessions.TimeProvider;
import kotlin.time.Duration$Companion;
import kotlin.time.DurationUnit;
import kotlin.time.a;
import kotlin.time.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ve1 implements TimeProvider {
    public static final ve1 a = new ve1();

    @Override // com.google.firebase.sessions.TimeProvider
    public final Time currentTime() {
        return new Time(System.currentTimeMillis());
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc */
    public final long mo13elapsedRealtimeUwyO8pc() {
        Duration$Companion duration$Companion = a.b;
        return b.k(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
    }
}
