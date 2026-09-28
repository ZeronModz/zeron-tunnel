package coil3.util;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, androidx.lifecycle.LifecycleObserver, c10] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.lifecycle.Lifecycle r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof coil3.util.LifecyclesKt$awaitStarted$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = (coil3.util.LifecyclesKt$awaitStarted$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.util.LifecyclesKt$awaitStarted$1 r0 = new coil3.util.LifecyclesKt$awaitStarted$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            mk1 r3 = defpackage.mk1.a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L33
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L74
        L31:
            r7 = move-exception
            goto L83
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L3a:
            kotlin.d.b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getD()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L4a
            goto L7d
        L4a:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7e
            r0.label = r4     // Catch: java.lang.Throwable -> L7e
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L7e
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.a.c(r0)     // Catch: java.lang.Throwable -> L7e
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L7e
            r2.initCancellability()     // Catch: java.lang.Throwable -> L7e
            c10 r0 = new c10     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7e
            r7.element = r0     // Catch: java.lang.Throwable -> L7e
            r6.a(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r2.m()     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L72
            return r1
        L72:
            r0 = r6
            r6 = r7
        L74:
            T r6 = r6.element
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L7d
            r0.c(r6)
        L7d:
            return r3
        L7e:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L83:
            T r6 = r6.element
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L8c
            r0.c(r6)
        L8c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.c.a(androidx.lifecycle.Lifecycle, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
