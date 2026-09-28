package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rc0 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ rc0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 1:
                return new j31(runnable, "fonts-androidx");
            default:
                String str = wt2.a;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}
