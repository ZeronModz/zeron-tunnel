package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {
    public static final a0 d = new a0();
    public final Runnable a;
    public final Executor b;
    public a0 c;

    public a0() {
        this.a = null;
        this.b = null;
    }

    public a0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
