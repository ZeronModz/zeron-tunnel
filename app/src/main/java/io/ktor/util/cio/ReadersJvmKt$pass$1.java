package io.ktor.util.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.util.cio.ReadersJvmKt", f = "ReadersJvm.kt", i = {0, 0, 0}, l = {17}, m = "pass", n = {"$this$pass", "buffer", "block"}, s = {"L$0", "L$1", "L$2"})
final class ReadersJvmKt$pass$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ReadersJvmKt$pass$1(Continuation<? super ReadersJvmKt$pass$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.result = r6
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r5.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L24
            java.lang.Object r0 = r5.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r2 = r5.L$1
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.lang.Object r4 = r5.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            kotlin.d.b(r6)
            r6 = r2
            r2 = r4
            goto L47
        L24:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            return r2
        L2a:
            kotlin.d.b(r6)
            r6 = r2
            r0 = r6
        L2f:
            boolean r4 = r2.isClosedForRead()
            if (r4 != 0) goto L4e
            r6.clear()
            r5.L$0 = r2
            r5.L$1 = r6
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r4 = io.ktor.utils.io.c.j(r2, r6, r5)
            if (r4 != r1) goto L47
            return r1
        L47:
            r6.flip()
            r0.invoke(r6)
            goto L2f
        L4e:
            java.lang.Throwable r5 = r2.getClosedCause()
            if (r5 != 0) goto L57
            mk1 r5 = defpackage.mk1.a
            return r5
        L57:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.ReadersJvmKt$pass$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
