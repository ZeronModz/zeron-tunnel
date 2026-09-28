package coil3.request;

import coil3.request.ImageRequest;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil3/request/ImageRequest$Builder$listener$5", "Lcoil3/request/ImageRequest$Listener;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
public final class ImageRequest$Builder$listener$5 implements ImageRequest.Listener {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;

    public ImageRequest$Builder$listener$5(Function1<? super ImageRequest, mk1> function1, Function1<? super ImageRequest, mk1> function12, Function2<? super ImageRequest, ? super ErrorResult, mk1> function2, Function2<? super ImageRequest, ? super SuccessResult, mk1> function22) {
        this.a = function1;
        this.b = function12;
        this.c = function2;
        this.d = function22;
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onCancel(ImageRequest imageRequest) {
        this.b.invoke(imageRequest);
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        this.c.invoke(imageRequest, errorResult);
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onStart(ImageRequest imageRequest) {
        this.a.invoke(imageRequest);
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
        this.d.invoke(imageRequest, successResult);
    }
}
