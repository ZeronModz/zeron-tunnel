package defpackage;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.d;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v11 {
    public final SurfaceRequest a;
    public final Timebase b;
    public final int c;
    public boolean d = false;
    public int e = 0;
    public ScheduledFuture f = null;
    public final /* synthetic */ d g;

    public v11(d dVar, SurfaceRequest surfaceRequest, Timebase timebase, int i) {
        this.g = dVar;
        this.a = surfaceRequest;
        this.b = timebase;
        this.c = i;
    }
}
