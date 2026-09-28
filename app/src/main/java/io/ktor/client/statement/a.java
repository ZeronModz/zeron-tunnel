package io.ktor.client.statement;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.statement.HttpResponse r6, java.nio.charset.Charset r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = (io.ktor.client.statement.HttpResponseKt$bodyAsText$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpResponseKt$bodyAsText$1 r0 = new io.ktor.client.statement.HttpResponseKt$bodyAsText$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.L$0
            java.nio.charset.CharsetDecoder r6 = (java.nio.charset.CharsetDecoder) r6
            kotlin.d.b(r8)
            goto L82
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L32:
            kotlin.d.b(r8)
            r6.getClass()
            io.ktor.http.Headers r8 = r6.getH()
            java.util.List r2 = defpackage.le0.a
            java.lang.String r2 = "Content-Type"
            java.lang.String r8 = r8.get(r2)
            if (r8 == 0) goto L50
            io.ktor.http.ContentType$Companion r2 = io.ktor.http.ContentType.f
            r2.getClass()
            io.ktor.http.ContentType r8 = io.ktor.http.ContentType.Companion.a(r8)
            goto L51
        L50:
            r8 = r3
        L51:
            if (r8 == 0) goto L58
            java.nio.charset.Charset r8 = defpackage.w91.h(r8)
            goto L59
        L58:
            r8 = r3
        L59:
            if (r8 != 0) goto L5c
            goto L5d
        L5c:
            r7 = r8
        L5d:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            io.ktor.client.call.HttpClientCall r6 = r6.getA()
            java.lang.Class<kotlinx.io.Source> r8 = kotlinx.io.Source.class
            kotlin.jvm.internal.ClassReference r2 = kotlin.jvm.internal.Reflection.a(r8)
            kotlin.jvm.internal.TypeReference r8 = kotlin.jvm.internal.Reflection.b(r8)     // Catch: java.lang.Throwable -> L70
            goto L71
        L70:
            r8 = r3
        L71:
            io.ktor.util.reflect.TypeInfo r5 = new io.ktor.util.reflect.TypeInfo
            r5.<init>(r2, r8)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.a(r5, r0)
            if (r8 != r1) goto L81
            return r1
        L81:
            r6 = r7
        L82:
            if (r8 == 0) goto L8e
            kotlinx.io.Source r8 = (kotlinx.io.Source) r8
            r6.getClass()
            java.lang.String r6 = defpackage.ii2.f(r6, r8)
            return r6
        L8e:
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.io.Source"
            defpackage.io0.e(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.a.a(io.ktor.client.statement.HttpResponse, java.nio.charset.Charset, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
