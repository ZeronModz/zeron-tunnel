package io.ktor.client.plugins.api;

import com.trilead.ssh2.sftp.Packet;
import defpackage.du0;
import defpackage.io0;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", i = {0, 0}, l = {Packet.SSH_FXP_ATTRS, 112}, m = "invokeSuspend", n = {"$this$intercept", "typeInfo"}, s = {"L$0", "L$1"})
final class TransformResponseBodyHook$install$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function5<TransformResponseBodyContext, HttpResponse, ByteReadChannel, TypeInfo, Continuation<Object>, Object> $handler;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformResponseBodyHook$install$1(Function5<? super TransformResponseBodyContext, ? super HttpResponse, ? super ByteReadChannel, ? super TypeInfo, ? super Continuation<Object>, ? extends Object> function5, Continuation<? super TransformResponseBodyHook$install$1> continuation) {
        super(3, continuation);
        this.$handler = function5;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super mk1> continuation) {
        TransformResponseBodyHook$install$1 transformResponseBodyHook$install$1 = new TransformResponseBodyHook$install$1(this.$handler, continuation);
        transformResponseBodyHook$install$1.L$0 = pipelineContext;
        return transformResponseBodyHook$install$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TransformResponseBodyHook$install$1 transformResponseBodyHook$install$1;
        PipelineContext pipelineContext;
        TypeInfo typeInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        mk1 mk1Var = mk1.a;
        if (i == 0) {
            kotlin.d.b(obj);
            PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
            HttpResponseContainer httpResponseContainer = (HttpResponseContainer) pipelineContext2.getD();
            TypeInfo typeInfo2 = httpResponseContainer.a;
            Object obj2 = httpResponseContainer.b;
            if (obj2 instanceof ByteReadChannel) {
                Function5<TransformResponseBodyContext, HttpResponse, ByteReadChannel, TypeInfo, Continuation<Object>, Object> function5 = this.$handler;
                TransformResponseBodyContext transformResponseBodyContext = new TransformResponseBodyContext();
                HttpResponse httpResponseD = ((HttpClientCall) pipelineContext2.a).d();
                this.L$0 = pipelineContext2;
                this.L$1 = typeInfo2;
                this.label = 1;
                transformResponseBodyHook$install$1 = this;
                Object objInvoke = function5.invoke(transformResponseBodyContext, httpResponseD, (ByteReadChannel) obj2, typeInfo2, transformResponseBodyHook$install$1);
                if (objInvoke != coroutineSingletons) {
                    pipelineContext = pipelineContext2;
                    typeInfo = typeInfo2;
                    obj = objInvoke;
                }
                return coroutineSingletons;
            }
            return mk1Var;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.d.b(obj);
                return mk1Var;
            }
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        typeInfo = (TypeInfo) this.L$1;
        pipelineContext = (PipelineContext) this.L$0;
        kotlin.d.b(obj);
        transformResponseBodyHook$install$1 = this;
        if (obj != null) {
            if (!(obj instanceof du0) && !typeInfo.a.isInstance(obj)) {
                io0.g("transformResponseBody returned ", obj, " but expected value of type ", typeInfo);
                return null;
            }
            HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, obj);
            transformResponseBodyHook$install$1.L$0 = null;
            transformResponseBodyHook$install$1.L$1 = null;
            transformResponseBodyHook$install$1.label = 2;
            if (pipelineContext.e(httpResponseContainer2, transformResponseBodyHook$install$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return mk1Var;
    }
}
