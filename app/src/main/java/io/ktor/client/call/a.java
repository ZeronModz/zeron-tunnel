package io.ktor.client.call;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.call.HttpClientCall r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.client.call.SavedCallKt$save$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.call.SavedCallKt$save$1 r0 = (io.ktor.client.call.SavedCallKt$save$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.call.SavedCallKt$save$1 r0 = new io.ktor.client.call.SavedCallKt$save$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.client.call.HttpClientCall r4 = (io.ktor.client.call.HttpClientCall) r4
            kotlin.d.b(r5)
            goto L48
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L32:
            kotlin.d.b(r5)
            io.ktor.client.statement.HttpResponse r5 = r4.d()
            io.ktor.utils.io.ByteReadChannel r5 = r5.getG()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = io.ktor.utils.io.c.s(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlinx.io.Source r5 = (kotlinx.io.Source) r5
            byte[] r5 = defpackage.mc2.B(r5)
            io.ktor.client.call.SavedHttpCall r0 = new io.ktor.client.call.SavedHttpCall
            io.ktor.client.HttpClient r1 = r4.a
            io.ktor.client.request.HttpRequest r2 = r4.c()
            io.ktor.client.statement.HttpResponse r4 = r4.d()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.a.a(io.ktor.client.call.HttpClientCall, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
