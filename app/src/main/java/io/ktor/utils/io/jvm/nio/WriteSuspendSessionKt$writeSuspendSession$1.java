package io.ktor.utils.io.jvm.nio;

import androidx.datastore.preferences.protobuf.x0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0}, l = {43, x0.RUBY_PACKAGE_FIELD_NUMBER, x0.RUBY_PACKAGE_FIELD_NUMBER}, m = "writeSuspendSession", n = {"$this$writeSuspendSession"}, s = {"L$0"})
final class WriteSuspendSessionKt$writeSuspendSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WriteSuspendSessionKt$writeSuspendSession$1(Continuation<? super WriteSuspendSessionKt$writeSuspendSession$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r0.flush(r6) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.result = r7
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 3
            r4 = 1
            if (r0 == 0) goto L42
            r5 = 2
            if (r0 == r4) goto L2a
            if (r0 == r5) goto L26
            if (r0 == r3) goto L1e
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r2
        L1e:
            java.lang.Object r6 = r6.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.d.b(r7)
            goto L5c
        L26:
            kotlin.d.b(r7)
            goto L3c
        L2a:
            java.lang.Object r0 = r6.L$0
            io.ktor.utils.io.ByteWriteChannel r0 = (io.ktor.utils.io.ByteWriteChannel) r0
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L3f
            r6.L$0 = r2
            r6.label = r5
            java.lang.Object r6 = r0.flush(r6)
            if (r6 != r1) goto L3c
            goto L5a
        L3c:
            mk1 r6 = defpackage.mk1.a
            return r6
        L3f:
            r7 = move-exception
            r2 = r0
            goto L50
        L42:
            kotlin.d.b(r7)
            io.ktor.utils.io.jvm.nio.WriteSuspendSession r7 = new io.ktor.utils.io.jvm.nio.WriteSuspendSession     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            r6.L$0 = r2     // Catch: java.lang.Throwable -> L4f
            r6.label = r4     // Catch: java.lang.Throwable -> L4f
            throw r2     // Catch: java.lang.Throwable -> L4f
        L4f:
            r7 = move-exception
        L50:
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r6 = r2.flush(r6)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            r6 = r7
        L5c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
