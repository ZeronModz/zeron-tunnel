package defpackage;

import com.google.android.gms.internal.ads.e7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z33 extends e7 implements Runnable {
    public final Runnable h;

    public z33(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final String f() {
        String string = this.h.toString();
        return vh.t(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }
}
