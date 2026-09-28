package io.ktor.util.pipeline;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import io.ktor.utils.io.KtorDsl;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bp\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012O\u0010\f\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n¢\u0006\u0002\b\u000b0\u0006\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/util/pipeline/DebugPipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "context", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lmk1;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "subject", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebugPipelineContext<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    public final List b;
    public final CoroutineContext c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPipelineContext(TContext tcontext, List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super mk1>, ? extends Object>> list, TSubject tsubject, CoroutineContext coroutineContext) {
        super(tcontext);
        tcontext.getClass();
        list.getClass();
        tsubject.getClass();
        coroutineContext.getClass();
        this.b = list;
        this.c = coroutineContext;
        this.d = tsubject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        this.e = 0;
        obj.getClass();
        this.d = obj;
        return d(continuationImpl);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final void b() {
        this.e = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getD() {
        return this.d;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final Object d(Continuation continuation) {
        int i = this.e;
        if (i < 0) {
            return this.d;
        }
        if (i < this.b.size()) {
            return f(continuation);
        }
        this.e = -1;
        return this.d;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final Object e(Object obj, Continuation continuation) {
        obj.getClass();
        this.d = obj;
        return d(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = (io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = new io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L28
            java.lang.Object r6 = r0.L$0
            io.ktor.util.pipeline.DebugPipelineContext r6 = (io.ktor.util.pipeline.DebugPipelineContext) r6
            goto L2f
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L2f:
            kotlin.d.b(r7)
        L32:
            int r7 = r6.e
            r2 = -1
            if (r7 != r2) goto L38
            goto L42
        L38:
            java.util.List r4 = r6.b
            int r5 = r4.size()
            if (r7 < r5) goto L45
            r6.e = r2
        L42:
            java.lang.Object r6 = r6.d
            return r6
        L45:
            java.lang.Object r2 = r4.get(r7)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            int r7 = r7 + 1
            r6.e = r7
            java.lang.Object r7 = r6.d
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r2.invoke(r6, r7, r0)
            if (r7 != r1) goto L32
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.DebugPipelineContext.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getC() {
        return this.c;
    }
}
