package coil3;

import coil3.intercept.RealInterceptorChain;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.size.Size;
import defpackage.mk1;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
final class RealImageLoader$execute$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
    final /* synthetic */ Image $cachedPlaceholder;
    final /* synthetic */ EventListener $eventListener;
    final /* synthetic */ ImageRequest $request;
    final /* synthetic */ Size $size;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(ImageRequest imageRequest, RealImageLoader realImageLoader, Size size, EventListener eventListener, Image image, Continuation<? super RealImageLoader$execute$result$1> continuation) {
        super(2, continuation);
        this.$request = imageRequest;
        this.this$0 = realImageLoader;
        this.$size = size;
        this.$eventListener = eventListener;
        this.$cachedPlaceholder = image;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new RealImageLoader$execute$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$cachedPlaceholder, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageResult> continuation) {
        return ((RealImageLoader$execute$result$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.d.b(obj);
                return obj;
            }
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        ImageRequest imageRequest = this.$request;
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(imageRequest, this.this$0.e.a, 0, imageRequest, this.$size, this.$eventListener, this.$cachedPlaceholder != null);
        this.label = 1;
        Object objProceed = realInterceptorChain.proceed(this);
        return objProceed == coroutineSingletons ? coroutineSingletons : objProceed;
    }
}
