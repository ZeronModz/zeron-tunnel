package io.ktor.utils.io;

import defpackage.if3;
import defpackage.ly;
import defpackage.mk1;
import defpackage.t;
import defpackage.yg;
import defpackage.zk;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final yg a = new yg();

    public static final void a(ByteWriteChannel byteWriteChannel, Throwable th) throws Throwable {
        byteWriteChannel.getClass();
        if (th == null) {
            b(new ByteWriteChannelOperationsKt$close$1(byteWriteChannel));
        } else {
            byteWriteChannel.cancel(th);
        }
    }

    public static final void b(Function1 function1) throws Throwable {
        yg ygVar = a;
        try {
            Continuation continuationC = kotlin.coroutines.intrinsics.a.c(kotlin.coroutines.intrinsics.a.a(function1, ygVar));
            Result.Companion companion = Result.INSTANCE;
            ly.a(Result.m36constructorimpl(mk1.a), continuationC);
        } catch (Throwable th) {
            zk.a(th, ygVar);
            throw null;
        }
    }

    public static final Object c(ByteWriteChannel byteWriteChannel, byte b, ContinuationImpl continuationImpl) {
        byteWriteChannel.getWriteBuffer().writeByte(b);
        Object objH = c.h(byteWriteChannel, continuationImpl);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : mk1.a;
    }

    public static final Object d(ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, ContinuationImpl continuationImpl) {
        byteWriteChannel.getWriteBuffer().write(bArr, i, i2);
        Object objH = c.h(byteWriteChannel, continuationImpl);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : mk1.a;
    }

    public static final Object e(ByteWriteChannel byteWriteChannel, int i, ContinuationImpl continuationImpl) {
        byteWriteChannel.getWriteBuffer().writeInt(i);
        Object objH = c.h(byteWriteChannel, continuationImpl);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : mk1.a;
    }

    public static final Object f(ByteWriteChannel byteWriteChannel, long j, ContinuationImpl continuationImpl) {
        byteWriteChannel.getWriteBuffer().writeLong(j);
        Object objH = c.h(byteWriteChannel, continuationImpl);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : mk1.a;
    }

    public static final Object g(ByteWriteChannel byteWriteChannel, Source source, ContinuationImpl continuationImpl) {
        byteWriteChannel.getWriteBuffer().transferFrom(source);
        Object objH = c.h(byteWriteChannel, continuationImpl);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : mk1.a;
    }

    public static final Object h(ByteChannel byteChannel, String str, Continuation continuation) {
        if3.P(byteChannel.getWriteBuffer(), str);
        Object objH = c.h(byteChannel, (ContinuationImpl) continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : mk1.a;
    }

    public static final WriterJob i(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2) {
        coroutineScope.getClass();
        coroutineContext.getClass();
        ByteChannel byteChannel = new ByteChannel(false, 1, null);
        Job jobD = kotlinx.coroutines.c.d(coroutineScope, coroutineContext, null, new ByteWriteChannelOperationsKt$writer$job$1(function2, byteChannel, null), 2);
        jobD.invokeOnCompletion(new t(byteChannel, 1));
        return new WriterJob(byteChannel, jobD);
    }

    public static /* synthetic */ WriterJob j(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return i(coroutineScope, coroutineContext, function2);
    }
}
