package io.ktor.http.content;

import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lio/ktor/http/content/PartData;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.http.content.MultipartKt$asFlow$1", f = "Multipart.kt", i = {0, 1}, l = {112, 113}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
final class MultipartKt$asFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super PartData>, Continuation<? super mk1>, Object> {
    final /* synthetic */ MultiPartData $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$asFlow$1(MultiPartData multiPartData, Continuation<? super MultipartKt$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = multiPartData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        MultipartKt$asFlow$1 multipartKt$asFlow$1 = new MultipartKt$asFlow$1(this.$this_asFlow, continuation);
        multipartKt$asFlow$1.L$0 = obj;
        return multipartKt$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super PartData> flowCollector, Continuation<? super mk1> continuation) {
        return ((MultipartKt$asFlow$1) create(flowCollector, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004a -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.d.b(r6)
        L13:
            r6 = r1
            goto L2b
        L15:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            r5 = 0
            return r5
        L1c:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.d.b(r6)
            goto L3b
        L24:
            kotlin.d.b(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
        L2b:
            io.ktor.http.content.MultiPartData r1 = r5.$this_asFlow
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r1 = r1.readPart(r5)
            if (r1 != r0) goto L38
            goto L4c
        L38:
            r4 = r1
            r1 = r6
            r6 = r4
        L3b:
            io.ktor.http.content.PartData r6 = (io.ktor.http.content.PartData) r6
            if (r6 != 0) goto L42
            mk1 r5 = defpackage.mk1.a
            return r5
        L42:
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L13
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
