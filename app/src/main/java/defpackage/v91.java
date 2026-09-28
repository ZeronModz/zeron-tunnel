package defpackage;

import _COROUTINE.ArtificialStackFrames;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v91 {
    public static final /* synthetic */ int a = 0;

    static {
        Object objD;
        Object objD2;
        new ArtificialStackFrames();
        mc2.c("_BOUNDARY", new Exception());
        try {
            Result.Companion companion = Result.INSTANCE;
            objD = Result.m36constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objD = vh.d(th);
        }
        if (Result.m39exceptionOrNullimpl(objD) != null) {
            objD = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objD2 = Result.m36constructorimpl(v91.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objD2 = vh.d(th2);
        }
        if (Result.m39exceptionOrNullimpl(objD2) != null) {
            objD2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
