package io.ktor.client.statement;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(io.ktor.client.statement.HttpResponse r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.client.statement.ReadersKt$readBytes$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.statement.ReadersKt$readBytes$1 r0 = (io.ktor.client.statement.ReadersKt$readBytes$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.ReadersKt$readBytes$1 r0 = new io.ktor.client.statement.ReadersKt$readBytes$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            byte[] r4 = (byte[]) r4
            kotlin.d.b(r5)
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L32:
            kotlin.d.b(r5)
            r5 = 0
            byte[] r2 = new byte[r5]
            io.ktor.utils.io.ByteReadChannel r4 = r4.a()
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r4 = io.ktor.utils.io.c.n(r4, r2, r5, r0)
            if (r4 != r1) goto L47
            return r1
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.b.a(io.ktor.client.statement.HttpResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
