package io.ktor.client.plugins;

import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final Logger a;
    public static final ClientPlugin b;
    public static final AttributeKey c;

    static {
        TypeReference typeReferenceB;
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.HttpCallValidator");
        logger.getClass();
        a = logger;
        b = io.ktor.client.plugins.api.a.a("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new c(3));
        ClassReference classReferenceA = Reflection.a(Boolean.class);
        try {
            typeReferenceB = Reflection.b(Boolean.TYPE);
        } catch (Throwable unused) {
            typeReferenceB = null;
        }
        c = new AttributeKey("ExpectSuccessAttributeKey", new TypeInfo(classReferenceA, typeReferenceB));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r10.invoke(r8, r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r6 = r9;
        r9 = r8;
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r7, java.lang.Throwable r8, io.ktor.client.request.HttpRequest r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L2e
            if (r2 != r4) goto L28
            goto L2e
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r3
        L2e:
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$1
            io.ktor.client.request.HttpRequest r8 = (io.ktor.client.request.HttpRequest) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.d.b(r10)
            goto L8a
        L3e:
            kotlin.d.b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "Processing exception "
            r10.<init>(r2)
            r10.append(r8)
            java.lang.String r2 = " for request "
            r10.append(r2)
            io.ktor.http.Url r2 = r9.getC()
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            org.slf4j.Logger r2 = io.ktor.client.plugins.i.a
            r2.trace(r10)
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto La9
            java.lang.Object r10 = r7.next()
            io.ktor.client.plugins.HandlerWrapper r10 = (io.ktor.client.plugins.HandlerWrapper) r10
            boolean r2 = r10 instanceof io.ktor.client.plugins.ExceptionHandlerWrapper
            if (r2 == 0) goto L8e
            io.ktor.client.plugins.ExceptionHandlerWrapper r10 = (io.ktor.client.plugins.ExceptionHandlerWrapper) r10
            kotlin.jvm.functions.Function2 r10 = r10.a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r5
            java.lang.Object r10 = r10.invoke(r8, r0)
            if (r10 != r1) goto L87
            goto La4
        L87:
            r6 = r9
            r9 = r8
            r8 = r6
        L8a:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L64
        L8e:
            boolean r2 = r10 instanceof io.ktor.client.plugins.RequestExceptionHandlerWrapper
            if (r2 == 0) goto La5
            io.ktor.client.plugins.RequestExceptionHandlerWrapper r10 = (io.ktor.client.plugins.RequestExceptionHandlerWrapper) r10
            kotlin.jvm.functions.Function3 r10 = r10.a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r8, r9, r0)
            if (r10 != r1) goto L87
        La4:
            return r1
        La5:
            defpackage.p60.b()
            return r3
        La9:
            mk1 r7 = defpackage.mk1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.i.a(java.util.List, java.lang.Throwable, io.ktor.client.request.HttpRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r4, io.ktor.client.statement.HttpResponse r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$0
            io.ktor.client.statement.HttpResponse r5 = (io.ktor.client.statement.HttpResponse) r5
            kotlin.d.b(r6)
            goto L5c
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L36:
            kotlin.d.b(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Validating response for request "
            r6.<init>(r2)
            io.ktor.client.call.HttpClientCall r2 = r5.getA()
            io.ktor.client.request.HttpRequest r2 = r2.c()
            io.ktor.http.Url r2 = r2.getC()
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            org.slf4j.Logger r2 = io.ktor.client.plugins.i.a
            r2.trace(r6)
            java.util.Iterator r4 = r4.iterator()
        L5c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r6 = r4.next()
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L5c
            return r1
        L75:
            mk1 r4 = defpackage.mk1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.i.b(java.util.List, io.ktor.client.statement.HttpResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
