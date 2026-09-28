package defpackage;

import androidx.camera.camera2.internal.VideoUsageControl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wm1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoUsageControl b;

    public /* synthetic */ wm1(VideoUsageControl videoUsageControl, int i) {
        this.a = i;
        this.b = videoUsageControl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        VideoUsageControl videoUsageControl = this.b;
        switch (i) {
            case 0:
                videoUsageControl.getClass();
                if (videoUsageControl.b.decrementAndGet() >= 0) {
                    km0.a("VideoUsageControl");
                } else {
                    km0.g("VideoUsageControl");
                }
                break;
            default:
                videoUsageControl.getClass();
                videoUsageControl.b.incrementAndGet();
                km0.a("VideoUsageControl");
                break;
        }
    }
}
