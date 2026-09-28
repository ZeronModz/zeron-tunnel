package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d33 {
    public static final d33 d = new d33();
    public final Runnable a;
    public final Executor b;
    public d33 c;

    public d33() {
        this.a = null;
        this.b = null;
    }

    public d33(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
