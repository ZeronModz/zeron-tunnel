package defpackage;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb0 implements CallbackToFutureAdapter$Resolver, AsyncFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListenableFuture b;

    public /* synthetic */ bb0(int i, ListenableFuture listenableFuture) {
        this.a = i;
        this.b = listenableFuture;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i = this.a;
        ListenableFuture listenableFuture = this.b;
        switch (i) {
            case 1:
                return ((CameraCapturePipeline) listenableFuture.get()).invokePreCapture();
            default:
                return ((CameraCapturePipeline) listenableFuture.get()).invokePostCapture();
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        rv rvVar = new rv(1, bVar);
        fy fyVarB = fy.b();
        ListenableFuture listenableFuture = this.b;
        listenableFuture.addListener(rvVar, fyVarB);
        return "transformVoidFuture [" + listenableFuture + "]";
    }
}
