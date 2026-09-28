package io.ktor.http.content;

import defpackage.hv;
import defpackage.lv;
import defpackage.mk1;
import defpackage.o0;
import defpackage.oy;
import defpackage.yg0;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Lazy a = c.b(new o0(3));

    public static final Object a(Function1 function1, SuspendLambda suspendLambda) {
        boolean zA = false;
        try {
            Method method = (Method) a.getValue();
            if (method != null) {
                zA = yg0.a(method.invoke(null, null), Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
        mk1 mk1Var = mk1.a;
        if (zA) {
            Object objInvoke = function1.invoke(suspendLambda);
            if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objInvoke;
            }
        } else {
            lv lvVar = oy.a;
            Object objE = kotlinx.coroutines.c.e(hv.c, new BlockingBridgeKt$withBlockingAndRedispatch$2(function1, null), suspendLambda);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objE != coroutineSingletons) {
                objE = mk1Var;
            }
            if (objE == coroutineSingletons) {
                return objE;
            }
        }
        return mk1Var;
    }
}
