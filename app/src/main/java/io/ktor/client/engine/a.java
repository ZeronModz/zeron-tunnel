package io.ktor.client.engine;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(io.ktor.client.engine.HttpClientEngine r8, io.ktor.client.request.HttpRequestData r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = (io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            kotlin.d.b(r10)
            return r10
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            return r5
        L31:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            io.ktor.client.request.HttpRequestData r9 = (io.ktor.client.request.HttpRequestData) r9
            java.lang.Object r8 = r0.L$0
            io.ktor.client.engine.HttpClientEngine r8 = (io.ktor.client.engine.HttpClientEngine) r8
            kotlin.d.b(r10)
            goto L81
        L3e:
            kotlin.d.b(r10)
            kotlinx.coroutines.Job r10 = r9.e
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            kotlinx.coroutines.CoroutineName r2 = defpackage.he0.a
            kotlinx.coroutines.JobImpl r2 = new kotlinx.coroutines.JobImpl
            r2.<init>(r10)
            kotlin.coroutines.CoroutineContext r10 = r8.getE()
            kotlin.coroutines.CoroutineContext r10 = r10.plus(r2)
            kotlinx.coroutines.CoroutineName r6 = defpackage.he0.a
            kotlin.coroutines.CoroutineContext r10 = r10.plus(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getB()
            ai0 r7 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r7)
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            if (r6 != 0) goto L6d
            goto L7e
        L6d:
            io.ktor.client.engine.UtilsKt$attachToUserJob$cleanupHandler$1 r7 = new io.ktor.client.engine.UtilsKt$attachToUserJob$cleanupHandler$1
            r7.<init>()
            kotlinx.coroutines.DisposableHandle r4 = r6.invokeOnCompletion(r4, r4, r7)
            io.ktor.client.engine.UtilsKt$attachToUserJob$2 r6 = new io.ktor.client.engine.UtilsKt$attachToUserJob$2
            r6.<init>()
            r2.invokeOnCompletion(r6)
        L7e:
            if (r10 != r1) goto L81
            goto La1
        L81:
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
            io.ktor.client.engine.KtorCallContextElement r2 = new io.ktor.client.engine.KtorCallContextElement
            r2.<init>(r10)
            kotlin.coroutines.CoroutineContext r10 = r10.plus(r2)
            io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2 r2 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2
            r2.<init>(r8, r9, r5)
            kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.c.b(r8, r10, r2, r3)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r8.await(r0)
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.a.a(io.ktor.client.engine.HttpClientEngine, io.ktor.client.request.HttpRequestData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
