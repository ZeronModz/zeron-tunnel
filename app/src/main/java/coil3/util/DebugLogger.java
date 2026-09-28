package coil3.util;

import coil3.util.Logger;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/util/DebugLogger;", "Lcoil3/util/Logger;", "Lcoil3/util/Logger$Level;", "minLevel", "<init>", "(Lcoil3/util/Logger$Level;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugLogger implements Logger {
    public Logger.Level a;

    public /* synthetic */ DebugLogger(Logger.Level level, int i, xu xuVar) {
        this((i & 1) != 0 ? Logger.Level.Debug : level);
    }

    @Override // coil3.util.Logger
    /* JADX INFO: renamed from: getMinLevel, reason: from getter */
    public final Logger.Level getA() {
        return this.a;
    }

    @Override // coil3.util.Logger
    public final void log(String str, Logger.Level level, String str2, Throwable th) {
        if (str2 != null) {
            f.c(level, str, str2);
        }
        if (th != null) {
            f.c(level, str, kotlin.b.b(th));
        }
    }

    @Override // coil3.util.Logger
    public final void setMinLevel(Logger.Level level) {
        this.a = level;
    }

    public DebugLogger(Logger.Level level) {
        this.a = level;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebugLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
