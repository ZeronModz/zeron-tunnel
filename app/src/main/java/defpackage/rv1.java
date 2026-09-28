package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rv1 implements DisplayManager.DisplayListener {
    public final Choreographer a;
    public final DisplayManager b;
    public volatile long c = -9223372036854775807L;
    public volatile long d = -9223372036854775807L;

    public /* synthetic */ rv1(Choreographer choreographer, DisplayManager displayManager) {
        this.a = choreographer;
        this.b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
