package io.ktor.util.pipeline;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.utils.io.KtorDsl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TSubject", "TContext", "Lkotlinx/coroutines/CoroutineScope;", "context", "<init>", "(Ljava/lang/Object;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PipelineContext<TSubject, TContext> implements CoroutineScope {
    public final Object a;

    public PipelineContext(TContext tcontext) {
        tcontext.getClass();
        this.a = tcontext;
    }

    public abstract Object a(Object obj, ContinuationImpl continuationImpl);

    public abstract void b();

    public abstract Object c();

    public abstract Object d(Continuation continuation);

    public abstract Object e(Object obj, Continuation continuation);
}
