package io.ktor.client.plugins;

import defpackage.mk1;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "response", "Lmk1;", "<anonymous>", "(Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {40, 46}, m = "invokeSuspend", n = {"response", "statusCode", "response", "exceptionResponse", "statusCode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
final class DefaultResponseValidationKt$addDefaultResponseValidation$1$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super mk1>, Object> {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public DefaultResponseValidationKt$addDefaultResponseValidation$1$1(Continuation<? super DefaultResponseValidationKt$addDefaultResponseValidation$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        DefaultResponseValidationKt$addDefaultResponseValidation$1$1 defaultResponseValidationKt$addDefaultResponseValidation$1$1 = new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(continuation);
        defaultResponseValidationKt$addDefaultResponseValidation$1$1.L$0 = obj;
        return defaultResponseValidationKt$addDefaultResponseValidation$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HttpResponse httpResponse, Continuation<? super mk1> continuation) {
        return ((DefaultResponseValidationKt$addDefaultResponseValidation$1$1) create(httpResponse, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(8:6|54|7|29|33|(2:38|(1:(1:47)(1:46))(1:42))(1:37)|48|49)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(1:50)(3:21|(0)|27)))|24|52|25|(6:28|29|33|(2:38|(1:(2:44|47)(0))(0))(0)|48|49)|27) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        r10 = r11;
        r0 = r1;
        r1 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
