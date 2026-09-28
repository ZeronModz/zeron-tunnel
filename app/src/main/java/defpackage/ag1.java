package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ag1 {
    public static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(int i, String str) {
        Trace.setCounter(str, i);
    }
}
