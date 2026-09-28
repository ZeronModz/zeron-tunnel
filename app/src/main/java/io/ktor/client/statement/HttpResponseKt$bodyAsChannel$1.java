package io.ktor.client.statement;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.io0;
import defpackage.u7;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {123}, m = "bodyAsChannel", n = {}, s = {})
final class HttpResponseKt$bodyAsChannel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpResponseKt$bodyAsChannel$1(Continuation<? super HttpResponseKt$bodyAsChannel$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        if ((i & AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            this.label = i - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        } else {
            this = new HttpResponseKt$bodyAsChannel$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            d.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj2);
        if (obj2 != null) {
            return (ByteReadChannel) obj2;
        }
        io0.e("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
        return null;
    }
}
