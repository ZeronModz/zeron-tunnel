package io.ktor.client.call;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.m8;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.client.HttpClient;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/client/request/HttpResponseData;", "responseData", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/request/HttpResponseData;)V", "Companion", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class HttpClientCall implements CoroutineScope {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final AttributeKey e;
    public static final /* synthetic */ long f;
    public final HttpClient a;
    public HttpRequest b;
    public HttpResponse c;
    private volatile /* synthetic */ int received;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/call/HttpClientCall$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/util/AttributeKey;", "CustomResponse", "Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        TypeReference typeReferenceB = null;
        new Companion(null);
        ClassReference classReferenceA = Reflection.a(Object.class);
        try {
            typeReferenceB = Reflection.b(Object.class);
        } catch (Throwable unused) {
        }
        e = new AttributeKey("CustomResponse", new TypeInfo(classReferenceA, typeReferenceB));
        d = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
        f = m8.a.objectFieldOffset(HttpClientCall.class.getDeclaredField("received"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InternalAPI
    public HttpClientCall(HttpClient httpClient, HttpRequestData httpRequestData, HttpResponseData httpResponseData) {
        this(httpClient);
        httpClient.getClass();
        httpRequestData.getClass();
        httpResponseData.getClass();
        this.b = new DefaultHttpRequest(this, httpRequestData);
        this.c = new DefaultHttpResponse(this, httpResponseData);
        Object obj = httpResponseData.e;
        if (obj instanceof ByteReadChannel) {
            return;
        }
        getAttributes().put(e, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        if (r15 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:35:0x0096, B:45:0x00ab, B:47:0x00b7, B:38:0x009d, B:39:0x00a2), top: B:67:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002f, B:55:0x00de, B:59:0x00ed, B:62:0x00fd, B:63:0x0110), top: B:68:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.ktor.util.reflect.TypeInfo r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.HttpClientCall.a(io.ktor.util.reflect.TypeInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public boolean getH() {
        return false;
    }

    public final HttpRequest c() {
        HttpRequest httpRequest = this.b;
        if (httpRequest != null) {
            return httpRequest;
        }
        yg0.N("request");
        throw null;
    }

    public final HttpResponse d() {
        HttpResponse httpResponse = this.c;
        if (httpResponse != null) {
            return httpResponse;
        }
        yg0.N("response");
        throw null;
    }

    public Object e() {
        return d().getG();
    }

    public final Attributes getAttributes() {
        return c().getF();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getB() {
        return d().getB();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getC() + ", " + d().getC() + ']';
    }

    public HttpClientCall(HttpClient httpClient) {
        httpClient.getClass();
        this.a = httpClient;
        this.received = 0;
    }
}
