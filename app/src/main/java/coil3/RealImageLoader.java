package coil3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Extras;
import coil3.ImageLoader;
import coil3.disk.DiskCache;
import coil3.fetch.AssetUriFetcher;
import coil3.fetch.BitmapFetcher;
import coil3.fetch.ByteArrayFetcher;
import coil3.fetch.ByteBufferFetcher;
import coil3.fetch.ContentUriFetcher;
import coil3.fetch.DataUriFetcher;
import coil3.fetch.DrawableFetcher;
import coil3.fetch.FileUriFetcher;
import coil3.fetch.JarFileFetcher;
import coil3.fetch.ResourceUriFetcher;
import coil3.graphics.BitmapFactoryDecoder;
import coil3.graphics.ExifOrientationStrategy;
import coil3.graphics.StaticImageDecoder;
import coil3.intercept.EngineInterceptor;
import coil3.key.AndroidResourceUriKeyer;
import coil3.key.FileUriKeyer;
import coil3.key.UriKeyer;
import coil3.map.AndroidUriMapper;
import coil3.map.FileMapper;
import coil3.map.PathMapper;
import coil3.map.ResourceIntMapper;
import coil3.map.StringMapper;
import coil3.memory.MemoryCache;
import coil3.request.AndroidRequestService;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.size.ViewSizeResolver;
import coil3.target.ViewTarget;
import coil3.util.AndroidSystemCallbacks;
import coil3.util.Logger;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.bn0;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.tp;
import defpackage.u7;
import defpackage.yg0;
import defpackage.yq0;
import defpackage.zr;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Semaphore;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lcoil3/RealImageLoader;", "Lcoil3/ImageLoader;", "Lcoil3/RealImageLoader$Options;", "options", "<init>", "(Lcoil3/RealImageLoader$Options;)V", "Lkotlinx/atomicfu/AtomicBoolean;", "shutdown", "Options", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealImageLoader implements ImageLoader {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "f");
    public final Options a;
    public final ContextScope b;
    public final AndroidSystemCallbacks c;
    public final AndroidRequestService d;
    public final ComponentRegistry e;
    public volatile /* synthetic */ int f;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcoil3/RealImageLoader$Options;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/content/Context;", "Lcoil3/PlatformContext;", "application", "Lcoil3/request/ImageRequest$Defaults;", "defaults", "Lkotlin/Lazy;", "Lcoil3/memory/MemoryCache;", "memoryCacheLazy", "Lcoil3/disk/DiskCache;", "diskCacheLazy", "Lcoil3/EventListener$Factory;", "eventListenerFactory", "Lcoil3/ComponentRegistry;", "componentRegistry", "Lcoil3/util/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcoil3/request/ImageRequest$Defaults;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/EventListener$Factory;Lcoil3/ComponentRegistry;Lcoil3/util/Logger;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Options {
        public final Context a;
        public final ImageRequest.Defaults b;
        public final Lazy c;
        public final Lazy d;
        public final EventListener.Factory e;
        public final ComponentRegistry f;
        public final Logger g;

        public Options(Context context, ImageRequest.Defaults defaults, Lazy<? extends MemoryCache> lazy, Lazy<? extends DiskCache> lazy2, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger) {
            this.a = context;
            this.b = defaults;
            this.c = lazy;
            this.d = lazy2;
            this.e = factory;
            this.f = componentRegistry;
            this.g = logger;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            return yg0.a(this.a, options.a) && yg0.a(this.b, options.b) && yg0.a(this.c, options.c) && yg0.a(this.d, options.d) && yg0.a(this.e, options.e) && yg0.a(this.f, options.f) && yg0.a(this.g, options.g);
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            Logger logger = this.g;
            return iHashCode + (logger == null ? 0 : logger.hashCode());
        }

        public final String toString() {
            return "Options(application=" + this.a + ", defaults=" + this.b + ", memoryCacheLazy=" + this.c + ", diskCacheLazy=" + this.d + ", eventListenerFactory=" + this.e + ", componentRegistry=" + this.f + ", logger=" + this.g + ')';
        }
    }

    /* JADX INFO: renamed from: coil3.RealImageLoader$execute$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
        final /* synthetic */ ImageRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RealImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ImageRequest imageRequest, RealImageLoader realImageLoader, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.this$0 = realImageLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.d.b(obj);
                    return obj;
                }
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            lv lvVar = oy.a;
            Deferred<ImageResult> job = e.a(this.$request, kotlinx.coroutines.c.b(coroutineScope, bn0.a.e(), new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2)).getB();
            this.label = 1;
            Object objAwait = job.await(this);
            return objAwait == coroutineSingletons ? coroutineSingletons : objAwait;
        }
    }

    /* JADX INFO: renamed from: coil3.RealImageLoader$execute$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {117, 129, 133}, m = "execute", n = {"this", "requestDelegate", "request", "eventListener", "this", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "this", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
    final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            RealImageLoader realImageLoader = RealImageLoader.this;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RealImageLoader.g;
            return realImageLoader.a(null, 0, this);
        }
    }

    public RealImageLoader(Options options) {
        this.a = options;
        this.b = zr.a(kotlin.coroutines.b.d(new RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, options.g), (JobSupport) kotlinx.coroutines.a.c()));
        AndroidSystemCallbacks androidSystemCallbacks = new AndroidSystemCallbacks(this);
        this.c = androidSystemCallbacks;
        Logger logger = options.g;
        AndroidRequestService androidRequestService = new AndroidRequestService(this, androidSystemCallbacks, logger);
        this.d = androidRequestService;
        ComponentRegistry componentRegistry = options.f;
        componentRegistry.getClass();
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder(componentRegistry);
        Extras.Key key = c.a;
        ImageRequest.Defaults defaults = options.b;
        Extras extras = defaults.n;
        Extras.Key key2 = c.a;
        Object obj = extras.a.get(key2);
        boolean zBooleanValue = ((Boolean) (obj == null ? key2.a : obj)).booleanValue();
        ArrayList arrayList = builder.e;
        if (zBooleanValue) {
            builder.d.add(new yq0(12));
            arrayList.add(new yq0(13));
        }
        builder.b(new AndroidUriMapper(), Reflection.a(android.net.Uri.class));
        builder.b(new ResourceIntMapper(), Reflection.a(Integer.class));
        Pair pair = new Pair(new AndroidResourceUriKeyer(), Reflection.a(Uri.class));
        ArrayList arrayList2 = builder.c;
        arrayList2.add(pair);
        builder.a(new AssetUriFetcher.Factory(), Reflection.a(Uri.class));
        builder.a(new ContentUriFetcher.Factory(), Reflection.a(Uri.class));
        builder.a(new ResourceUriFetcher.Factory(), Reflection.a(Uri.class));
        builder.a(new DrawableFetcher.Factory(), Reflection.a(Drawable.class));
        builder.a(new BitmapFetcher.Factory(), Reflection.a(Bitmap.class));
        Extras.Key key3 = d.a;
        Extras extras2 = defaults.n;
        Extras.Key key4 = d.a;
        Object obj2 = extras2.a.get(key4);
        Semaphore semaphoreA = kotlinx.coroutines.sync.c.a(((Number) (obj2 == null ? key4.a : obj2)).intValue());
        int i = 1;
        if (Build.VERSION.SDK_INT >= 29) {
            Extras extras3 = defaults.n;
            Extras.Key key5 = d.c;
            Object obj3 = extras3.a.get(key5);
            if (((Boolean) (obj3 == null ? key5.a : obj3)).booleanValue()) {
                Extras extras4 = defaults.n;
                Extras.Key key6 = d.b;
                Object obj4 = extras4.a.get(key6);
                ExifOrientationStrategy exifOrientationStrategy = (ExifOrientationStrategy) (obj4 == null ? key6.a : obj4);
                if (yg0.a(exifOrientationStrategy, ExifOrientationStrategy.RESPECT_PERFORMANCE) || yg0.a(exifOrientationStrategy, ExifOrientationStrategy.RESPECT_ALL)) {
                    arrayList.add(new tp(new StaticImageDecoder.Factory(semaphoreA), i));
                }
            }
        }
        Extras extras5 = defaults.n;
        Extras.Key key7 = d.b;
        Object obj5 = extras5.a.get(key7);
        arrayList.add(new tp(new BitmapFactoryDecoder.Factory(semaphoreA, (ExifOrientationStrategy) (obj5 == null ? key7.a : obj5)), i));
        builder.b(new FileMapper(), Reflection.a(File.class));
        builder.a(new JarFileFetcher.Factory(), Reflection.a(Uri.class));
        builder.a(new ByteBufferFetcher.Factory(), Reflection.a(ByteBuffer.class));
        builder.b(new StringMapper(), Reflection.a(String.class));
        builder.b(new PathMapper(), Reflection.a(Path.class));
        arrayList2.add(new Pair(new FileUriKeyer(), Reflection.a(Uri.class)));
        arrayList2.add(new Pair(new UriKeyer(), Reflection.a(Uri.class)));
        builder.a(new FileUriFetcher.Factory(), Reflection.a(Uri.class));
        builder.a(new ByteArrayFetcher.Factory(), Reflection.a(byte[].class));
        builder.a(new DataUriFetcher.Factory(), Reflection.a(Uri.class));
        builder.a.add(new EngineInterceptor(this, androidSystemCallbacks, androidRequestService, logger));
        this.e = builder.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0171 A[Catch: all -> 0x017a, TryCatch #4 {all -> 0x017a, blocks: (B:74:0x016b, B:76:0x0171, B:79:0x017e, B:81:0x0182, B:84:0x018e, B:85:0x0193), top: B:108:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e A[Catch: all -> 0x017a, TryCatch #4 {all -> 0x017a, blocks: (B:74:0x016b, B:76:0x0171, B:79:0x017e, B:81:0x0182, B:84:0x018e, B:85:0x0193), top: B:108:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(coil3.request.ImageRequest r20, int r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.a(coil3.request.ImageRequest, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(ImageRequest imageRequest, EventListener eventListener) {
        Logger logger = this.a.g;
        if (logger != null) {
            Logger.Level level = Logger.Level.Info;
            if (logger.getA().compareTo(level) <= 0) {
                logger.log("RealImageLoader", level, "🏗 Cancelled - " + imageRequest.b, null);
            }
        }
        eventListener.getClass();
        ImageRequest.Listener listener = imageRequest.d;
        if (listener != null) {
            listener.onCancel(imageRequest);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(coil3.request.ErrorResult r7, coil3.target.Target r8, coil3.EventListener r9) {
        /*
            r6 = this;
            coil3.request.ImageRequest r0 = r7.b
            coil3.Image r1 = r7.a
            coil3.RealImageLoader$Options r6 = r6.a
            coil3.util.Logger r6 = r6.g
            if (r6 == 0) goto L2d
            java.lang.Throwable r2 = r7.c
            coil3.util.Logger$Level r3 = r6.getA()
            coil3.util.Logger$Level r4 = coil3.util.Logger.Level.Error
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "🚨 Failed - "
            r3.<init>(r5)
            java.lang.Object r5 = r0.b
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "RealImageLoader"
            r6.log(r5, r4, r3, r2)
        L2d:
            boolean r6 = r8 instanceof coil3.transition.TransitionTarget
            if (r6 != 0) goto L34
            if (r8 == 0) goto L51
            goto L47
        L34:
            coil3.Extras$Key r6 = coil3.request.b.a
            java.lang.Object r6 = coil3.b.a(r0, r6)
            coil3.transition.Transition$Factory r6 = (coil3.transition.Transition.Factory) r6
            r2 = r8
            coil3.transition.TransitionTarget r2 = (coil3.transition.TransitionTarget) r2
            coil3.transition.Transition r6 = r6.create(r2, r7)
            boolean r2 = r6 instanceof coil3.transition.NoneTransition
            if (r2 == 0) goto L4b
        L47:
            r8.onError(r1)
            goto L51
        L4b:
            r9.getClass()
            r6.transition()
        L51:
            r9.getClass()
            coil3.request.ImageRequest$Listener r6 = r0.d
            if (r6 == 0) goto L5b
            r6.onError(r0, r7)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.c(coil3.request.ErrorResult, coil3.target.Target, coil3.EventListener):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(coil3.request.SuccessResult r8, coil3.target.Target r9, coil3.EventListener r10) {
        /*
            r7 = this;
            coil3.request.ImageRequest r0 = r8.b
            coil3.Image r1 = r8.a
            coil3.decode.DataSource r2 = r8.c
            coil3.RealImageLoader$Options r7 = r7.a
            coil3.util.Logger r7 = r7.g
            if (r7 == 0) goto L5d
            coil3.util.Logger$Level r3 = coil3.util.Logger.Level.Info
            coil3.util.Logger$Level r4 = r7.getA()
            int r4 = r4.compareTo(r3)
            if (r4 > 0) goto L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int[] r5 = defpackage.xl1.a
            int r6 = r2.ordinal()
            r5 = r5[r6]
            r6 = 1
            if (r5 == r6) goto L38
            r6 = 2
            if (r5 == r6) goto L38
            r6 = 3
            if (r5 == r6) goto L35
            r6 = 4
            if (r5 != r6) goto L31
            java.lang.String r5 = "☁️"
            goto L3a
        L31:
            defpackage.p60.b()
            return
        L35:
            java.lang.String r5 = "💾"
            goto L3a
        L38:
            java.lang.String r5 = "🧠"
        L3a:
            r4.<init>(r5)
            java.lang.String r5 = " Successful ("
            r4.append(r5)
            java.lang.String r2 = r2.name()
            r4.append(r2)
            java.lang.String r2 = ") - "
            r4.append(r2)
            java.lang.Object r2 = r0.b
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r7.log(r5, r3, r2, r4)
        L5d:
            boolean r7 = r9 instanceof coil3.transition.TransitionTarget
            if (r7 != 0) goto L64
            if (r9 == 0) goto L81
            goto L77
        L64:
            coil3.Extras$Key r7 = coil3.request.b.a
            java.lang.Object r7 = coil3.b.a(r0, r7)
            coil3.transition.Transition$Factory r7 = (coil3.transition.Transition.Factory) r7
            r2 = r9
            coil3.transition.TransitionTarget r2 = (coil3.transition.TransitionTarget) r2
            coil3.transition.Transition r7 = r7.create(r2, r8)
            boolean r2 = r7 instanceof coil3.transition.NoneTransition
            if (r2 == 0) goto L7b
        L77:
            r9.onSuccess(r1)
            goto L81
        L7b:
            r10.getClass()
            r7.transition()
        L81:
            r10.getClass()
            coil3.request.ImageRequest$Listener r7 = r0.d
            if (r7 == 0) goto L8b
            r7.onSuccess(r0, r8)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.d(coil3.request.SuccessResult, coil3.target.Target, coil3.EventListener):void");
    }

    @Override // coil3.ImageLoader
    public final Disposable enqueue(ImageRequest imageRequest) {
        lv lvVar = oy.a;
        return e.a(imageRequest, kotlinx.coroutines.c.b(this.b, bn0.a.e(), new RealImageLoader$enqueue$job$1(this, imageRequest, null), 2));
    }

    @Override // coil3.ImageLoader
    public final Object execute(ImageRequest imageRequest, Continuation continuation) {
        return ((imageRequest.c instanceof ViewTarget) || (imageRequest.u instanceof ViewSizeResolver) || ((Lifecycle) b.a(imageRequest, coil3.request.b.e)) != null) ? zr.c(new AnonymousClass2(imageRequest, this, null), continuation) : a(imageRequest, 1, continuation);
    }

    @Override // coil3.ImageLoader
    /* JADX INFO: renamed from: getComponents, reason: from getter */
    public final ComponentRegistry getE() {
        return this.e;
    }

    @Override // coil3.ImageLoader
    public final ImageRequest.Defaults getDefaults() {
        return this.a.b;
    }

    @Override // coil3.ImageLoader
    public final DiskCache getDiskCache() {
        return (DiskCache) this.a.d.getValue();
    }

    @Override // coil3.ImageLoader
    public final MemoryCache getMemoryCache() {
        return (MemoryCache) this.a.c.getValue();
    }

    @Override // coil3.ImageLoader
    public final ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this.a);
    }

    @Override // coil3.ImageLoader
    public final void shutdown() {
        if (g.getAndSet(this, 1) == 1) {
            return;
        }
        zr.b(this.b, null);
        this.c.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }
}
