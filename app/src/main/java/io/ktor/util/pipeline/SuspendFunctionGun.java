package io.ktor.util.pipeline;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.u7;
import defpackage.uc1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bh\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012O\u0010\r\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\b\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/util/pipeline/SuspendFunctionGun;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "initial", "context", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lmk1;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuspendFunctionGun<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    public final List b;
    public final uc1 c;
    public Object d;
    public final Continuation[] e;
    public int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendFunctionGun(TSubject tsubject, TContext tcontext, List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super mk1>, ? extends Object>> list) {
        super(tcontext);
        tsubject.getClass();
        tcontext.getClass();
        list.getClass();
        this.b = list;
        this.c = new uc1(this);
        this.d = tsubject;
        this.e = new Continuation[list.size()];
        this.f = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        this.g = 0;
        if (this.b.size() == 0) {
            return obj;
        }
        obj.getClass();
        this.d = obj;
        if (this.f < 0) {
            return d(continuationImpl);
        }
        u7.p("Already started");
        return null;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final void b() {
        this.g = this.b.size();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getD() {
        return this.d;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final Object d(Continuation continuation) {
        Object obj;
        if (this.g == this.b.size()) {
            obj = this.d;
        } else {
            Continuation continuationC = a.c(continuation);
            int i = this.f + 1;
            this.f = i;
            Continuation[] continuationArr = this.e;
            continuationArr[i] = continuationC;
            if (f(true)) {
                int i2 = this.f;
                if (i2 < 0) {
                    u7.p("No more continuations to resume");
                    return null;
                }
                this.f = i2 - 1;
                continuationArr[i2] = null;
                obj = this.d;
            } else {
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
            continuation.getClass();
        }
        return obj;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final Object e(Object obj, Continuation continuation) {
        obj.getClass();
        this.d = obj;
        return d(continuation);
    }

    public final boolean f(boolean z) {
        Function3 function3;
        Object obj;
        uc1 uc1Var;
        do {
            int i = this.g;
            List list = this.b;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                Result.Companion companion = Result.INSTANCE;
                g(Result.m36constructorimpl(this.d));
                return false;
            }
            this.g = i + 1;
            function3 = (Function3) list.get(i);
            try {
                obj = this.d;
                uc1Var = this.c;
                function3.getClass();
                obj.getClass();
                uc1Var.getClass();
                TypeIntrinsics.c(3, function3);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                g(Result.m36constructorimpl(new Result.Failure(th)));
                return false;
            }
        } while (function3.invoke(this, obj, uc1Var) != CoroutineSingletons.COROUTINE_SUSPENDED);
        return false;
    }

    public final void g(Object obj) {
        int i = this.f;
        if (i < 0) {
            u7.p("No more continuations to resume");
            return;
        }
        Continuation[] continuationArr = this.e;
        Continuation continuation = continuationArr[i];
        continuation.getClass();
        int i2 = this.f;
        this.f = i2 - 1;
        continuationArr[i2] = null;
        if (!Result.m42isFailureimpl(obj)) {
            continuation.resumeWith(obj);
            return;
        }
        Throwable thM39exceptionOrNullimpl = Result.m39exceptionOrNullimpl(obj);
        thM39exceptionOrNullimpl.getClass();
        try {
            thM39exceptionOrNullimpl.getCause();
        } catch (Throwable unused) {
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m36constructorimpl(new Result.Failure(thM39exceptionOrNullimpl)));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getB() {
        return this.c.getD();
    }
}
