package defpackage;

import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.camera.video.internal.encoder.e;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ b c;

    public /* synthetic */ h20(e eVar, b bVar, int i) {
        this.a = i;
        this.b = eVar;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.c;
        final e eVar = this.b;
        switch (i) {
            case 0:
                EncoderImpl encoderImpl = eVar.d;
                BufferProvider.State state = eVar.b;
                if (state == BufferProvider.State.ACTIVE) {
                    final ListenableFuture listenableFutureA = encoderImpl.a();
                    xg0.r(listenableFutureA, bVar);
                    final int i2 = 0;
                    bVar.a(new Runnable() { // from class: i20
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            ListenableFuture listenableFuture = listenableFutureA;
                            e eVar2 = eVar;
                            switch (i3) {
                                case 0:
                                    if (!listenableFuture.cancel(true)) {
                                        jx0.g(null, listenableFuture.isDone());
                                        try {
                                            ((InputBuffer) listenableFuture.get()).cancel();
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            String str = eVar2.d.a;
                                            e.toString();
                                            km0.g(str);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    eVar2.c.remove(listenableFuture);
                                    break;
                            }
                        }
                    }, fy.b());
                    eVar.c.add(listenableFutureA);
                    final int i3 = 1;
                    listenableFutureA.addListener(new Runnable() { // from class: i20
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            ListenableFuture listenableFuture = listenableFutureA;
                            e eVar2 = eVar;
                            switch (i32) {
                                case 0:
                                    if (!listenableFuture.cancel(true)) {
                                        jx0.g(null, listenableFuture.isDone());
                                        try {
                                            ((InputBuffer) listenableFuture.get()).cancel();
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            String str = eVar2.d.a;
                                            e.toString();
                                            km0.g(str);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    eVar2.c.remove(listenableFuture);
                                    break;
                            }
                        }
                    }, encoderImpl.h);
                } else if (state != BufferProvider.State.INACTIVE) {
                    bVar.d(new IllegalStateException("Unknown state: " + eVar.b));
                } else {
                    bVar.d(new IllegalStateException("BufferProvider is not active."));
                }
                break;
            default:
                bVar.b(eVar.b);
                break;
        }
    }
}
