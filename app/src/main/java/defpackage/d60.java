package defpackage;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d60 implements Runnable {
    public static final Logger a = Logger.getLogger(d60.class.getName());

    static {
        Constructor constructor;
        try {
            constructor = Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            constructor = null;
        }
        if (constructor == null) {
            try {
                Thread.class.getDeclaredField("inheritableThreadLocals").setAccessible(true);
            } catch (Throwable unused2) {
                a.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            }
        }
    }
}
