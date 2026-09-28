package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 1, 1}, l = {130, 135}, m = "readAllParts", n = {"$this$readAllParts", "$this$readAllParts", "parts"}, s = {"L$0", "L$0", "L$1"})
final class MultipartKt$readAllParts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public MultipartKt$readAllParts$1(Continuation<? super MultipartKt$readAllParts$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005b -> B:22:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            r1 = r7 & r0
            if (r1 == 0) goto L11
            int r7 = r7 - r0
            r6.label = r7
            goto L17
        L11:
            io.ktor.http.content.MultipartKt$readAllParts$1 r7 = new io.ktor.http.content.MultipartKt$readAllParts$1
            r7.<init>(r6)
            r6 = r7
        L17:
            java.lang.Object r7 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L67
            r4 = 2
            if (r1 == r3) goto L38
            if (r1 != r4) goto L32
            java.lang.Object r1 = r6.L$1
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r6.L$0
            io.ktor.http.content.MultiPartData r2 = (io.ktor.http.content.MultiPartData) r2
            kotlin.d.b(r7)
            goto L5e
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r2
        L38:
            java.lang.Object r1 = r6.L$0
            io.ktor.http.content.MultiPartData r1 = (io.ktor.http.content.MultiPartData) r1
            kotlin.d.b(r7)
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 != 0) goto L46
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
            return r6
        L46:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
            r5 = r2
            r2 = r1
            r1 = r5
        L51:
            r6.L$0 = r2
            r6.L$1 = r1
            r6.label = r4
            java.lang.Object r7 = r2.readPart(r6)
            if (r7 != r0) goto L5e
            return r0
        L5e:
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 != 0) goto L63
            return r1
        L63:
            r1.add(r7)
            goto L51
        L67:
            kotlin.d.b(r7)
            r6.L$0 = r2
            r6.label = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt$readAllParts$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
