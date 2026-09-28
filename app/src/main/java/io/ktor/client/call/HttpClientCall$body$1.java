package io.ktor.client.call;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {}, l = {109}, m = "body", n = {}, s = {})
final class HttpClientCall$body$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClientCall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientCall$body$1(HttpClientCall httpClientCall, Continuation<? super HttpClientCall$body$1> continuation) {
        super(continuation);
        this.this$0 = httpClientCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        HttpClientCall httpClientCall = this.this$0;
        httpClientCall.getClass();
        int i = this.label;
        if ((i & AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            this.label = i - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        } else {
            this = new HttpClientCall$body$1(httpClientCall, this);
        }
        Object objA = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            d.b(objA);
            this.label = 1;
            objA = httpClientCall.a(null, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(objA);
        }
        objA.getClass();
        return objA;
    }
}
