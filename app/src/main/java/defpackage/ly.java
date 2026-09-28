package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ly {
    public static final Symbol a = new Symbol("UNDEFINED");
    public static final Symbol b = new Symbol("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x006f, DONT_GENERATE, TryCatch #2 {all -> 0x006f, blocks: (B:16:0x004b, B:18:0x0059, B:20:0x005f, B:31:0x0091, B:23:0x0071, B:25:0x007f, B:28:0x0088, B:30:0x008e, B:36:0x009e, B:39:0x00a7, B:38:0x00a4, B:26:0x0083), top: B:52:0x004b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto Lb2
            kotlinx.coroutines.internal.DispatchedContinuation r11 = (kotlinx.coroutines.internal.DispatchedContinuation) r11
            kotlinx.coroutines.CoroutineDispatcher r0 = r11.d
            kotlin.coroutines.Continuation r1 = r11.e
            java.lang.Throwable r2 = kotlin.Result.m39exceptionOrNullimpl(r10)
            r3 = 0
            if (r2 != 0) goto L13
            r4 = r10
            goto L1a
        L13:
            kotlinx.coroutines.CompletedExceptionally r4 = new kotlinx.coroutines.CompletedExceptionally
            r5 = 0
            r6 = 2
            r4.<init>(r2, r5, r6, r3)
        L1a:
            kotlin.coroutines.CoroutineContext r2 = r1.getD()
            boolean r2 = c(r0, r2)
            r5 = 1
            if (r2 == 0) goto L31
            r11.f = r4
            r11.c = r5
            kotlin.coroutines.CoroutineContext r10 = r1.getD()
            b(r0, r10, r11)
            return
        L31:
            kotlinx.coroutines.EventLoop r0 = defpackage.me1.a()
            long r6 = r0.c
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L48
            r11.f = r4
            r11.c = r5
            r0.f(r11)
            goto Lac
        L48:
            r0.g(r5)
            kotlin.coroutines.CoroutineContext r2 = r1.getD()     // Catch: java.lang.Throwable -> L6f
            ai0 r4 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L6f
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L6f
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            boolean r4 = r2.isActive()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L71
            java.util.concurrent.CancellationException r10 = r2.getCancellationException()     // Catch: java.lang.Throwable -> L6f
            kotlin.Result$Failure r10 = kotlin.d.a(r10)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r10 = kotlin.Result.m36constructorimpl(r10)     // Catch: java.lang.Throwable -> L6f
            r11.resumeWith(r10)     // Catch: java.lang.Throwable -> L6f
            goto L91
        L6f:
            r10 = move-exception
            goto La8
        L71:
            java.lang.Object r2 = r11.g     // Catch: java.lang.Throwable -> L6f
            kotlin.coroutines.CoroutineContext r4 = r1.getD()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = kotlinx.coroutines.internal.c.c(r4, r2)     // Catch: java.lang.Throwable -> L6f
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.c.a     // Catch: java.lang.Throwable -> L6f
            if (r2 == r6) goto L83
            kotlinx.coroutines.UndispatchedCoroutine r3 = kotlinx.coroutines.d.c(r1, r4, r2)     // Catch: java.lang.Throwable -> L6f
        L83:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L8e
            boolean r10 = r3.N()     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L91
        L8e:
            kotlinx.coroutines.internal.c.a(r4, r2)     // Catch: java.lang.Throwable -> L6f
        L91:
            boolean r10 = r0.i()     // Catch: java.lang.Throwable -> L6f
            if (r10 != 0) goto L91
        L97:
            r0.e(r5)
            goto Lac
        L9b:
            r10 = move-exception
            if (r3 == 0) goto La4
            boolean r1 = r3.N()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto La7
        La4:
            kotlinx.coroutines.internal.c.a(r4, r2)     // Catch: java.lang.Throwable -> L6f
        La7:
            throw r10     // Catch: java.lang.Throwable -> L6f
        La8:
            r11.e(r10)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r10 = move-exception
            r0.e(r5)
            throw r10
        Lb2:
            r11.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly.a(java.lang.Object, kotlin.coroutines.Continuation):void");
    }

    public static final void b(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            coroutineDispatcher.a(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean c(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) throws DispatchException {
        try {
            return coroutineDispatcher.c(coroutineContext);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }
}
