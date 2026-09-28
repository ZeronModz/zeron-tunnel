package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 extends rv1 implements Choreographer$VsyncCallback {
    public final Handler e;

    public /* synthetic */ uv1(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = wt2.n();
    }

    @Override // defpackage.rv1
    public final void a() {
        this.b.registerDisplayListener(this, wt2.n());
        this.a.postVsyncCallback(this);
    }

    @Override // defpackage.rv1
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.d = -9223372036854775807L;
        }
        this.e.postDelayed(new Runnable() { // from class: tv1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uv1 uv1Var = this.a;
                uv1Var.a.postVsyncCallback(uv1Var);
            }
        }, 500L);
    }
}
