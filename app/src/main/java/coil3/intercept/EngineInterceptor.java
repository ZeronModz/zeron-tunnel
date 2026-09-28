package coil3.intercept;

import coil3.EventListener;
import coil3.Image;
import coil3.ImageLoader;
import coil3.graphics.DataSource;
import coil3.intercept.Interceptor;
import coil3.memory.MemoryCache;
import coil3.memory.MemoryCacheService;
import coil3.request.ImageRequest;
import coil3.request.Options;
import coil3.request.RequestService;
import coil3.request.SuccessResult;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mk1;
import defpackage.u7;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcoil3/intercept/EngineInterceptor;", "Lcoil3/intercept/Interceptor;", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/util/SystemCallbacks;", "systemCallbacks", "Lcoil3/request/RequestService;", "requestService", "Lcoil3/util/Logger;", "logger", "<init>", "(Lcoil3/ImageLoader;Lcoil3/util/SystemCallbacks;Lcoil3/request/RequestService;Lcoil3/util/Logger;)V", "ExecuteResult", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EngineInterceptor implements Interceptor {
    public static final /* synthetic */ int f = 0;
    public final ImageLoader a;
    public final SystemCallbacks b;
    public final RequestService c;
    public final Logger d;
    public final MemoryCacheService e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/intercept/EngineInterceptor$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcoil3/intercept/EngineInterceptor$ExecuteResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/Image;", "image", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isSampled", "Lcoil3/decode/DataSource;", "dataSource", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "diskCacheKey", "<init>", "(Lcoil3/Image;ZLcoil3/decode/DataSource;Ljava/lang/String;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExecuteResult {
        public final Image a;
        public final boolean b;
        public final DataSource c;
        public final String d;

        public ExecuteResult(Image image, boolean z, DataSource dataSource, String str) {
            this.a = image;
            this.b = z;
            this.c = dataSource;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            return yg0.a(this.a, executeResult.a) && this.b == executeResult.b && this.c == executeResult.c && yg0.a(this.d, executeResult.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExecuteResult(image=");
            sb.append(this.a);
            sb.append(", isSampled=");
            sb.append(this.b);
            sb.append(", dataSource=");
            sb.append(this.c);
            sb.append(", diskCacheKey=");
            return vh.q(sb, this.d, ')');
        }
    }

    /* JADX INFO: renamed from: coil3.intercept.EngineInterceptor$intercept$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0}, l = {75}, m = "intercept", n = {"chain"}, s = {"L$0"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return EngineInterceptor.this.intercept(null, this);
        }
    }

    /* JADX INFO: renamed from: coil3.intercept.EngineInterceptor$intercept$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SuccessResult>, Object> {
        final /* synthetic */ MemoryCache.Key $cacheKey;
        final /* synthetic */ Interceptor.Chain $chain;
        final /* synthetic */ EventListener $eventListener;
        final /* synthetic */ Object $mappedData;
        final /* synthetic */ Options $options;
        final /* synthetic */ ImageRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.$mappedData = obj;
            this.$options = options;
            this.$eventListener = eventListener;
            this.$cacheKey = key;
            this.$chain = chain;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return EngineInterceptor.this.new AnonymousClass2(this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SuccessResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AnonymousClass2 anonymousClass2;
            boolean z;
            MemoryCache memoryCache;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                d.b(obj);
                EngineInterceptor engineInterceptor = EngineInterceptor.this;
                ImageRequest imageRequest = this.$request;
                Object obj2 = this.$mappedData;
                Options options = this.$options;
                EventListener eventListener = this.$eventListener;
                this.label = 1;
                int i2 = EngineInterceptor.f;
                anonymousClass2 = this;
                obj = engineInterceptor.b(imageRequest, obj2, options, eventListener, anonymousClass2);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d.b(obj);
                anonymousClass2 = this;
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            EngineInterceptor.this.b.registerMemoryPressureCallbacks();
            MemoryCacheService memoryCacheService = EngineInterceptor.this.e;
            MemoryCache.Key key = anonymousClass2.$cacheKey;
            ImageRequest imageRequest2 = anonymousClass2.$request;
            memoryCacheService.getClass();
            if (key == null || !imageRequest2.n.getWriteEnabled() || !executeResult.a.getB() || (memoryCache = memoryCacheService.a.getMemoryCache()) == null) {
                z = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(executeResult.b));
                String str = executeResult.d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                memoryCache.set(key, new MemoryCache.Value(executeResult.a, linkedHashMap));
                z = true;
            }
            Image image = executeResult.a;
            ImageRequest imageRequest3 = anonymousClass2.$request;
            DataSource dataSource = executeResult.c;
            MemoryCache.Key key2 = z ? anonymousClass2.$cacheKey : null;
            String str2 = executeResult.d;
            boolean z2 = executeResult.b;
            Interceptor.Chain chain = anonymousClass2.$chain;
            return new SuccessResult(image, imageRequest3, dataSource, key2, str2, z2, (chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).g);
        }
    }

    static {
        new Companion(null);
    }

    public EngineInterceptor(ImageLoader imageLoader, SystemCallbacks systemCallbacks, RequestService requestService, Logger logger) {
        this.a = imageLoader;
        this.b = systemCallbacks;
        this.c = requestService;
        this.d = logger;
        this.e = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00be -> B:26:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(coil3.fetch.SourceFetchResult r9, coil3.ComponentRegistry r10, coil3.request.ImageRequest r11, java.lang.Object r12, coil3.request.Options r13, coil3.EventListener r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.a(coil3.fetch.SourceFetchResult, coil3.ComponentRegistry, coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c3, code lost:
    
        if (r1 == r7) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [coil3.intercept.EngineInterceptor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [coil3.intercept.EngineInterceptor] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, coil3.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil3.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, coil3.request.Options] */
    /* JADX WARN: Type inference failed for: r23v0, types: [coil3.intercept.EngineInterceptor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0, types: [T, coil3.request.Options] */
    /* JADX WARN: Type inference failed for: r2v0, types: [coil3.request.ImageRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(coil3.request.ImageRequest r24, java.lang.Object r25, coil3.request.Options r26, coil3.EventListener r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.b(coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cb -> B:28:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(coil3.ComponentRegistry r10, coil3.request.ImageRequest r11, java.lang.Object r12, coil3.request.Options r13, coil3.EventListener r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.c(coil3.ComponentRegistry, coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // coil3.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object intercept(coil3.intercept.Interceptor.Chain r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.intercept(coil3.intercept.Interceptor$Chain, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
