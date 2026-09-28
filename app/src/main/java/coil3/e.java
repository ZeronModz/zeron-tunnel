package coil3;

import android.graphics.Bitmap;
import android.os.Looper;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.OneShotDisposable;
import coil3.request.ViewTargetDisposable;
import coil3.request.ViewTargetRequestManager;
import coil3.target.Target;
import coil3.target.ViewTarget;
import defpackage.kf2;
import defpackage.yg0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Disposable a(ImageRequest imageRequest, Deferred deferred) {
        Target target = imageRequest.c;
        if (!(target instanceof ViewTarget)) {
            return new OneShotDisposable(deferred);
        }
        ViewTargetRequestManager viewTargetRequestManagerI = kf2.i(((ViewTarget) target).getView());
        synchronized (viewTargetRequestManagerI) {
            ViewTargetDisposable viewTargetDisposable = viewTargetRequestManagerI.b;
            if (viewTargetDisposable != null) {
                Bitmap.Config[] configArr = coil3.util.f.a;
                if (yg0.a(Looper.myLooper(), Looper.getMainLooper()) && viewTargetRequestManagerI.e) {
                    viewTargetRequestManagerI.e = false;
                    viewTargetDisposable.b = deferred;
                    return viewTargetDisposable;
                }
            }
            Job job = viewTargetRequestManagerI.c;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            viewTargetRequestManagerI.c = null;
            ViewTargetDisposable viewTargetDisposable2 = new ViewTargetDisposable(viewTargetRequestManagerI.a, deferred);
            viewTargetRequestManagerI.b = viewTargetDisposable2;
            return viewTargetDisposable2;
        }
    }
}
