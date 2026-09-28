package defpackage;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 extends rv1 implements Choreographer.FrameCallback {
    @Override // defpackage.rv1
    public final void a() {
        long refreshRate;
        this.b.registerDisplayListener(this, wt2.n());
        this.a.postFrameCallback(this);
        Display display = this.b.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            ii2.K("Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.d = refreshRate;
    }

    @Override // defpackage.rv1
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.a.postFrameCallback(this);
            Display display = this.b.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                ii2.K("Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.d = refreshRate;
        }
    }
}
