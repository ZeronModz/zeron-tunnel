package com.trilead.ssh2.log;

import com.trilead.ssh2.DebugLogger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Logger {
    public static boolean enabled = false;
    public static DebugLogger logger;
    private String className;

    public Logger(Class cls) {
        this.className = cls.getName();
    }

    public static final Logger getLogger(Class cls) {
        return new Logger(cls);
    }

    public final boolean isEnabled() {
        return enabled;
    }

    public final void log(int i, String str, Throwable th) {
        log(i, str + ", " + th);
    }

    public final void log(int i, String str) {
        DebugLogger debugLogger;
        if (enabled && (debugLogger = logger) != null) {
            debugLogger.log(i, this.className, str);
        }
    }
}
