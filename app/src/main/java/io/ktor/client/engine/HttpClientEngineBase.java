package io.ktor.client.engine;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.m8;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.util.CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/HttpClientEngine;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "engineName", "<init>", "(Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HttpClientEngineBase implements HttpClientEngine {
    public static final /* synthetic */ long d = m8.a.objectFieldOffset(HttpClientEngineBase.class.getDeclaredField("closed"));
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final Lazy b;
    public final Lazy c;
    private volatile /* synthetic */ int closed;

    public HttpClientEngineBase(String str) {
        str.getClass();
        this.a = str;
        final int i = 0;
        this.closed = 0;
        this.b = kotlin.c.b(new Function0(this) { // from class: fe0
            public final /* synthetic */ HttpClientEngineBase b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HttpClientEngineBase httpClientEngineBase = this.b;
                switch (i2) {
                    case 0:
                        int i3 = HttpClientEngineBase.e;
                        httpClientEngineBase.getConfig().getClass();
                        lv lvVar = oy.a;
                        return hv.c;
                    default:
                        int i4 = HttpClientEngineBase.e;
                        return b.d(new CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key), (JobSupport) a.b(null)).plus(httpClientEngineBase.getDispatcher()).plus(new CoroutineName(httpClientEngineBase.a.concat("-context")));
                }
            }
        });
        final int i2 = 1;
        this.c = kotlin.c.b(new Function0(this) { // from class: fe0
            public final /* synthetic */ HttpClientEngineBase b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HttpClientEngineBase httpClientEngineBase = this.b;
                switch (i22) {
                    case 0:
                        int i3 = HttpClientEngineBase.e;
                        httpClientEngineBase.getConfig().getClass();
                        lv lvVar = oy.a;
                        return hv.c;
                    default:
                        int i4 = HttpClientEngineBase.e;
                        return b.d(new CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key), (JobSupport) a.b(null)).plus(httpClientEngineBase.getDispatcher()).plus(new CoroutineName(httpClientEngineBase.a.concat("-context")));
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (m8.a.compareAndSwapInt(this, d, 0, 1)) {
            CoroutineContext.Element element = getC().get(Job.Key);
            CompletableJob completableJob = element instanceof CompletableJob ? (CompletableJob) element : null;
            if (completableJob == null) {
                return;
            }
            completableJob.complete();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getC() {
        return (CoroutineContext) this.c.getValue();
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public final CoroutineDispatcher getDispatcher() {
        return (CoroutineDispatcher) this.b.getValue();
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    /* JADX INFO: renamed from: getSupportedCapabilities */
    public Set getG() {
        return EmptySet.INSTANCE;
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public final void install(HttpClient httpClient) {
        httpClient.getClass();
        HttpSendPipeline httpSendPipeline = httpClient.g;
        HttpSendPipeline.g.getClass();
        httpSendPipeline.g(HttpSendPipeline.k, new HttpClientEngine.AnonymousClass1(httpClient, this, null));
    }
}
