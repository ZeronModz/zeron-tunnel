package coil3.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import coil3.ImageLoader;
import coil3.fetch.SourceFetchResult;
import coil3.graphics.Decoder;
import coil3.request.Options;
import coil3.request.b;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcoil3/decode/StaticImageDecoder;", "Lcoil3/decode/Decoder;", "Landroid/graphics/ImageDecoder$Source;", "source", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lcoil3/request/Options;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lcoil3/request/Options;Lkotlinx/coroutines/sync/Semaphore;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StaticImageDecoder implements Decoder {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final Options c;
    public final Semaphore d;

    /* JADX INFO: renamed from: coil3.decode.StaticImageDecoder$decode$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", i = {0, 0}, l = {168}, m = "decode", n = {"this", "$this$withPermit$iv"}, s = {"L$0", "L$1"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return StaticImageDecoder.this.decode(this);
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, Options options, Semaphore semaphore) {
        this.a = source;
        this.b = autoCloseable;
        this.c = options;
        this.d = semaphore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.graphics.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decode(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.graphics.StaticImageDecoder.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.graphics.StaticImageDecoder.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.sync.Semaphore r6 = (kotlinx.coroutines.sync.Semaphore) r6
            java.lang.Object r0 = r0.L$0
            coil3.decode.StaticImageDecoder r0 = (coil3.graphics.StaticImageDecoder) r0
            kotlin.d.b(r7)
            r7 = r6
            r6 = r0
            goto L4a
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L38:
            kotlin.d.b(r7)
            r0.L$0 = r6
            kotlinx.coroutines.sync.Semaphore r7 = r6.d
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r0 = r7.acquire(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            java.lang.AutoCloseable r0 = r6.b     // Catch: java.lang.Throwable -> L6f
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            android.graphics.ImageDecoder$Source r2 = r6.a     // Catch: java.lang.Throwable -> L71
            coil3.decode.StaticImageDecoder$decode$lambda$2$lambda$1$$inlined$decodeBitmap$1 r5 = new coil3.decode.StaticImageDecoder$decode$lambda$2$lambda$1$$inlined$decodeBitmap$1     // Catch: java.lang.Throwable -> L71
            r5.<init>()     // Catch: java.lang.Throwable -> L71
            android.graphics.Bitmap r6 = android.graphics.ImageDecoder.decodeBitmap(r2, r5)     // Catch: java.lang.Throwable -> L71
            coil3.decode.DecodeResult r2 = new coil3.decode.DecodeResult     // Catch: java.lang.Throwable -> L71
            coil3.BitmapImage r5 = new coil3.BitmapImage     // Catch: java.lang.Throwable -> L71
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L71
            boolean r6 = r1.element     // Catch: java.lang.Throwable -> L71
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L71
            defpackage.w91.j(r0, r3)     // Catch: java.lang.Throwable -> L6f
            r7.release()
            return r2
        L6f:
            r6 = move-exception
            goto L78
        L71:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L73
        L73:
            r1 = move-exception
            defpackage.w91.j(r0, r6)     // Catch: java.lang.Throwable -> L6f
            throw r1     // Catch: java.lang.Throwable -> L6f
        L78:
            r7.release()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.graphics.StaticImageDecoder.decode(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/decode/StaticImageDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "<init>", "(Lkotlinx/coroutines/sync/Semaphore;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        public final Semaphore a;

        public /* synthetic */ Factory(Semaphore semaphore, int i, xu xuVar) {
            this((i & 1) != 0 ? c.a(4) : semaphore);
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder create(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader) {
            ImageDecoder.Source sourceA;
            Bitmap.Config configA = b.a(options);
            if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceA = b.a(sourceFetchResult.a, options)) != null) {
                return new StaticImageDecoder(sourceA, sourceFetchResult.a, options, this.a);
            }
            return null;
        }

        public Factory(Semaphore semaphore) {
            this.a = semaphore;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
