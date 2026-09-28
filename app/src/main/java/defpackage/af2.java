package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class af2 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final te2 b = new te2();

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        u7.p("Method must be call on main thread.");
    }
}
