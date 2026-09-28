package defpackage;

import _COROUTINE.ArtificialStackFrames;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lu {
    public static final ConcurrentWeakMap a;
    public static final Function1 b;
    public static final ConcurrentWeakMap c;

    static {
        Object objD;
        new ArtificialStackFrames();
        mc2.c("_CREATION", new Exception());
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        a = new ConcurrentWeakMap(false, 1, null);
        new AtomicInteger(0);
        new AtomicLong(0L);
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            objNewInstance.getClass();
            TypeIntrinsics.c(1, objNewInstance);
            objD = Result.m36constructorimpl((Function1) objNewInstance);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objD = vh.d(th);
        }
        b = (Function1) (Result.m42isFailureimpl(objD) ? null : objD);
        c = new ConcurrentWeakMap(true);
    }

    public static boolean a(DebugProbesImpl$CoroutineOwner debugProbesImpl$CoroutineOwner) {
        Job job;
        CoroutineContext coroutineContext = (CoroutineContext) debugProbesImpl$CoroutineOwner.b.c.get();
        if (coroutineContext == null || (job = (Job) coroutineContext.get(Job.Key)) == null || !job.isCompleted()) {
            return false;
        }
        a.remove(debugProbesImpl$CoroutineOwner);
        return true;
    }
}
