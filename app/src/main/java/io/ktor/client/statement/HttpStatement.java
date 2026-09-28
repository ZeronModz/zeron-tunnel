package io.ktor.client.statement;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/statement/HttpStatement;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpStatement {
    public final HttpRequestBuilder a;
    public final HttpClient b;

    public HttpStatement(HttpRequestBuilder httpRequestBuilder, HttpClient httpClient) {
        httpRequestBuilder.getClass();
        httpClient.getClass();
        this.a = httpRequestBuilder;
        this.b = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.ktor.client.statement.HttpResponse r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.statement.HttpStatement$cleanup$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = (io.ktor.client.statement.HttpStatement$cleanup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = new io.ktor.client.statement.HttpStatement$cleanup$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.CompletableJob r5 = (kotlinx.coroutines.CompletableJob) r5
            kotlin.d.b(r4)
            goto L59
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L32:
            kotlin.d.b(r4)
            kotlin.coroutines.CoroutineContext r4 = r5.getB()
            ai0 r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r1)
            r4.getClass()
            kotlinx.coroutines.CompletableJob r4 = (kotlinx.coroutines.CompletableJob) r4
            r4.complete()
            io.ktor.utils.io.ByteReadChannel r5 = r5.getG()     // Catch: java.lang.Throwable -> L4e
            defpackage.j03.e(r5)     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r6) goto L59
            return r6
        L59:
            mk1 r4 = defpackage.mk1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.a(io.ktor.client.statement.HttpResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.client.statement.HttpStatement$fetchResponse$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.statement.HttpStatement$fetchResponse$1 r0 = (io.ktor.client.statement.HttpStatement$fetchResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$fetchResponse$1 r0 = new io.ktor.client.statement.HttpStatement$fetchResponse$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L44
            if (r2 == r5) goto L38
            if (r2 != r4) goto L32
            java.lang.Object r9 = r0.L$0
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            kotlin.d.b(r10)     // Catch: java.util.concurrent.CancellationException -> L95
            return r9
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r9)
            return r3
        L38:
            java.lang.Object r9 = r0.L$1
            io.ktor.client.call.HttpClientCall r9 = (io.ktor.client.call.HttpClientCall) r9
            java.lang.Object r2 = r0.L$0
            io.ktor.client.statement.HttpStatement r2 = (io.ktor.client.statement.HttpStatement) r2
            kotlin.d.b(r10)     // Catch: java.util.concurrent.CancellationException -> L95
            goto L7d
        L44:
            java.lang.Object r9 = r0.L$0
            io.ktor.client.statement.HttpStatement r9 = (io.ktor.client.statement.HttpStatement) r9
            kotlin.d.b(r10)     // Catch: java.util.concurrent.CancellationException -> L95
            goto L6a
        L4c:
            kotlin.d.b(r10)
            io.ktor.client.request.HttpRequestBuilder r10 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.util.concurrent.CancellationException -> L95
            r10.<init>()     // Catch: java.util.concurrent.CancellationException -> L95
            io.ktor.client.request.HttpRequestBuilder r2 = r9.a     // Catch: java.util.concurrent.CancellationException -> L95
            kotlinx.coroutines.Job r7 = r2.e     // Catch: java.util.concurrent.CancellationException -> L95
            r10.e = r7     // Catch: java.util.concurrent.CancellationException -> L95
            r10.d(r2)     // Catch: java.util.concurrent.CancellationException -> L95
            io.ktor.client.HttpClient r2 = r9.b     // Catch: java.util.concurrent.CancellationException -> L95
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L95
            r0.label = r6     // Catch: java.util.concurrent.CancellationException -> L95
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L95
            if (r10 != r1) goto L6a
            goto L93
        L6a:
            io.ktor.client.call.HttpClientCall r10 = (io.ktor.client.call.HttpClientCall) r10     // Catch: java.util.concurrent.CancellationException -> L95
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L95
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> L95
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L95
            java.lang.Object r2 = io.ktor.client.call.a.a(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L95
            if (r2 != r1) goto L79
            goto L93
        L79:
            r8 = r2
            r2 = r9
            r9 = r10
            r10 = r8
        L7d:
            io.ktor.client.call.HttpClientCall r10 = (io.ktor.client.call.HttpClientCall) r10     // Catch: java.util.concurrent.CancellationException -> L95
            io.ktor.client.statement.HttpResponse r10 = r10.d()     // Catch: java.util.concurrent.CancellationException -> L95
            io.ktor.client.statement.HttpResponse r9 = r9.d()     // Catch: java.util.concurrent.CancellationException -> L95
            r0.L$0 = r10     // Catch: java.util.concurrent.CancellationException -> L95
            r0.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> L95
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L95
            java.lang.Object r9 = r2.a(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L95
            if (r9 != r1) goto L94
        L93:
            return r1
        L94:
            return r10
        L95:
            r9 = move-exception
            java.lang.Throwable r9 = defpackage.ay2.w(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1 r0 = (io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1 r0 = new io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            kotlin.d.b(r7)     // Catch: java.util.concurrent.CancellationException -> L5c
            goto L55
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L2e:
            kotlin.d.b(r7)
            io.ktor.client.request.HttpRequestBuilder r7 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.util.concurrent.CancellationException -> L5c
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L5c
            io.ktor.client.request.HttpRequestBuilder r2 = r6.a     // Catch: java.util.concurrent.CancellationException -> L5c
            kotlinx.coroutines.Job r4 = r2.e     // Catch: java.util.concurrent.CancellationException -> L5c
            r7.e = r4     // Catch: java.util.concurrent.CancellationException -> L5c
            r7.d(r2)     // Catch: java.util.concurrent.CancellationException -> L5c
            io.ktor.util.AttributeKey r2 = io.ktor.client.plugins.g.a     // Catch: java.util.concurrent.CancellationException -> L5c
            io.ktor.util.Attributes r2 = r7.f     // Catch: java.util.concurrent.CancellationException -> L5c
            io.ktor.util.AttributeKey r4 = io.ktor.client.plugins.g.a     // Catch: java.util.concurrent.CancellationException -> L5c
            mk1 r5 = defpackage.mk1.a     // Catch: java.util.concurrent.CancellationException -> L5c
            r2.put(r4, r5)     // Catch: java.util.concurrent.CancellationException -> L5c
            io.ktor.client.HttpClient r6 = r6.b     // Catch: java.util.concurrent.CancellationException -> L5c
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L5c
            java.lang.Object r7 = r6.a(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L5c
            if (r7 != r1) goto L55
            return r1
        L55:
            io.ktor.client.call.HttpClientCall r7 = (io.ktor.client.call.HttpClientCall) r7     // Catch: java.util.concurrent.CancellationException -> L5c
            io.ktor.client.statement.HttpResponse r6 = r7.d()     // Catch: java.util.concurrent.CancellationException -> L5c
            return r6
        L5c:
            r6 = move-exception
            java.lang.Throwable r6 = defpackage.ay2.w(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String toString() {
        return "HttpStatement[" + this.a.a + ']';
    }
}
