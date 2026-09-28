package coil3.intercept;

import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.fetch.FetchResult;
import coil3.fetch.SourceFetchResult;
import coil3.intercept.EngineInterceptor;
import coil3.request.ImageRequest;
import coil3.request.Options;
import defpackage.mk1;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.ExecuteResult>, Object> {
    final /* synthetic */ Ref$ObjectRef<ComponentRegistry> $components;
    final /* synthetic */ EventListener $eventListener;
    final /* synthetic */ Ref$ObjectRef<FetchResult> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Ref$ObjectRef<Options> $options;
    final /* synthetic */ ImageRequest $request;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref$ObjectRef<FetchResult> ref$ObjectRef, Ref$ObjectRef<ComponentRegistry> ref$ObjectRef2, ImageRequest imageRequest, Object obj, Ref$ObjectRef<Options> ref$ObjectRef3, EventListener eventListener, Continuation<? super EngineInterceptor$execute$executeResult$1> continuation) {
        super(2, continuation);
        this.this$0 = engineInterceptor;
        this.$fetchResult = ref$ObjectRef;
        this.$components = ref$ObjectRef2;
        this.$request = imageRequest;
        this.$mappedData = obj;
        this.$options = ref$ObjectRef3;
        this.$eventListener = eventListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EngineInterceptor.ExecuteResult> continuation) {
        return ((EngineInterceptor$execute$executeResult$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                d.b(obj);
                return obj;
            }
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        EngineInterceptor engineInterceptor = this.this$0;
        SourceFetchResult sourceFetchResult = (SourceFetchResult) this.$fetchResult.element;
        ComponentRegistry componentRegistry = this.$components.element;
        ImageRequest imageRequest = this.$request;
        Object obj2 = this.$mappedData;
        Options options = this.$options.element;
        EventListener eventListener = this.$eventListener;
        this.label = 1;
        int i2 = EngineInterceptor.f;
        Object objA = engineInterceptor.a(sourceFetchResult, componentRegistry, imageRequest, obj2, options, eventListener, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
