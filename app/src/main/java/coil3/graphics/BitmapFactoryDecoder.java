package coil3.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import coil3.Extras;
import coil3.ImageLoader;
import coil3.fetch.SourceFetchResult;
import coil3.graphics.Decoder;
import coil3.request.Options;
import coil3.request.a;
import coil3.request.b;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.i5;
import defpackage.j03;
import defpackage.n8;
import defpackage.p40;
import defpackage.p60;
import defpackage.qu;
import defpackage.sf;
import defpackage.u7;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.c;
import okio.Buffer;
import okio.ForwardingSource;
import okio.RealBufferedSource;
import okio.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder;", "Lcoil3/decode/Decoder;", "Lcoil3/decode/ImageSource;", "source", "Lcoil3/request/Options;", "options", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lcoil3/decode/ExifOrientationStrategy;", "exifOrientationStrategy", "<init>", "(Lcoil3/decode/ImageSource;Lcoil3/request/Options;Lkotlinx/coroutines/sync/Semaphore;Lcoil3/decode/ExifOrientationStrategy;)V", "Factory", "ExceptionCatchingSource", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BitmapFactoryDecoder implements Decoder {
    public final ImageSource a;
    public final Options b;
    public final Semaphore c;
    public final ExifOrientationStrategy d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "DEFAULT_MAX_PARALLELISM", "I", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$ExceptionCatchingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "<init>", "(Lokio/Source;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExceptionCatchingSource extends ForwardingSource {
        public Exception b;

        public ExceptionCatchingSource(Source source) {
            super(source);
        }

        @Override // okio.ForwardingSource, okio.Source
        public final long read(Buffer buffer, long j) throws Exception {
            try {
                return super.read(buffer, j);
            } catch (Exception e) {
                this.b = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: coil3.decode.BitmapFactoryDecoder$decode$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", i = {0, 0, 1}, l = {212, 40}, m = "decode", n = {"this", "$this$withPermit$iv", "$this$withPermit$iv"}, s = {"L$0", "L$1", "L$0"})
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
            return BitmapFactoryDecoder.this.decode(this);
        }
    }

    static {
        new Companion(null);
    }

    public /* synthetic */ BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, ExifOrientationStrategy exifOrientationStrategy, int i, xu xuVar) {
        this(imageSource, options, (i & 4) != 0 ? c.a(Integer.MAX_VALUE) : semaphore, (i & 8) != 0 ? ExifOrientationStrategy.RESPECT_PERFORMANCE : exifOrientationStrategy);
    }

    public static final DecodeResult a(BitmapFactoryDecoder bitmapFactoryDecoder) throws Exception {
        ExifData exifData;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Options options2 = bitmapFactoryDecoder.b;
        ExceptionCatchingSource exceptionCatchingSource = new ExceptionCatchingSource(bitmapFactoryDecoder.a.source());
        RealBufferedSource realBufferedSource = new RealBufferedSource(exceptionCatchingSource);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new sf((RealBufferedSource) realBufferedSource.peek(), 2), null, options);
        Exception exc = exceptionCatchingSource.b;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = p40.a;
        if (bitmapFactoryDecoder.d.supports(options.outMimeType, realBufferedSource)) {
            ExifInterface exifInterface = new ExifInterface(new ExifInterfaceInputStream(new sf((RealBufferedSource) realBufferedSource.peek(), 2)));
            int iD = exifInterface.d(1, "Orientation");
            boolean z2 = iD == 2 || iD == 7 || iD == 4 || iD == 5;
            switch (exifInterface.d(1, "Orientation")) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            exifData = new ExifData(z2, i2);
        } else {
            exifData = ExifData.c;
        }
        Exception exc2 = exceptionCatchingSource.b;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Extras.Key key = b.c;
            if (u7.b(coil3.b.b(options2, key)) != null) {
                options.inPreferredColorSpace = u7.b(coil3.b.b(options2, key));
            }
        }
        boolean zBooleanValue = ((Boolean) coil3.b.b(options2, b.d)).booleanValue();
        Context context = options2.a;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) coil3.b.b(options2, b.b);
        boolean z3 = exifData.a;
        int i4 = exifData.b;
        if ((z3 || i4 > 0) && (config == null || i5.k(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) coil3.b.b(options2, b.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && yg0.a(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i3 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i5 = options.outWidth;
        if (i5 <= 0 || (i = options.outHeight) <= 0) {
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i6 = (i4 == 90 || i4 == 270) ? i : i5;
            if (i4 != 90 && i4 != 270) {
                i5 = i;
            }
            Size size = options2.b;
            Scale scale = options2.c;
            long j = n8.j(i6, i5, size, scale, (Size) coil3.b.b(options2, a.b));
            int i7 = (int) (j >> 32);
            int i8 = (int) (j & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i6 / i7);
            int iHighestOneBit2 = Integer.highestOneBit(i5 / i8);
            int[] iArr = qu.a;
            int i9 = iArr[scale.ordinal()];
            if (i9 == 1) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (i9 != 2) {
                    p60.b();
                    return null;
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            if (iMin < 1) {
                iMin = 1;
            }
            options.inSampleSize = iMin;
            double d = iMin;
            double d2 = ((double) i7) / (((double) i6) / d);
            double d3 = ((double) i8) / (((double) i5) / d);
            int i10 = iArr[scale.ordinal()];
            if (i10 == 1) {
                dMax = Math.max(d2, d3);
            } else {
                if (i10 != 2) {
                    p60.b();
                    return null;
                }
                dMax = Math.min(d2, d3);
            }
            if (options2.d == Precision.INEXACT && dMax > 1.0d) {
                dMax = 1.0d;
            }
            boolean z4 = dMax == 1.0d;
            options.inScaled = !z4;
            if (!z4) {
                if (dMax > 1.0d) {
                    options.inDensity = kotlin.math.a.a(2.147483647E9d / dMax);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = kotlin.math.a.a(2.147483647E9d * dMax);
                }
            }
            z = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new sf(realBufferedSource, 2), null, options);
            realBufferedSource.close();
            Exception exc3 = exceptionCatchingSource.b;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                u7.p("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z3 || i4 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z3) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i4 > 0) {
                    matrix.postRotate(i4, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i4 == 90 || i4 == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, p40.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new DecodeResult(j03.c(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.graphics.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decode(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.graphics.BitmapFactoryDecoder.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.graphics.BitmapFactoryDecoder.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L37
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.sync.Semaphore r7 = (kotlinx.coroutines.sync.Semaphore) r7
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6c
        L2f:
            r8 = move-exception
            goto L76
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r4
        L37:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.Semaphore r7 = (kotlinx.coroutines.sync.Semaphore) r7
            java.lang.Object r2 = r0.L$0
            coil3.decode.BitmapFactoryDecoder r2 = (coil3.graphics.BitmapFactoryDecoder) r2
            kotlin.d.b(r8)
            r8 = r7
            r7 = r2
            goto L57
        L45:
            kotlin.d.b(r8)
            r0.L$0 = r7
            kotlinx.coroutines.sync.Semaphore r8 = r7.c
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = r8.acquire(r0)
            if (r2 != r1) goto L57
            goto L68
        L57:
            l8 r2 = new l8     // Catch: java.lang.Throwable -> L72
            r2.<init>(r7, r5)     // Catch: java.lang.Throwable -> L72
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L72
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L72
            r0.label = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = kotlinx.coroutines.a.i(r2, r0)     // Catch: java.lang.Throwable -> L72
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            r6 = r8
            r8 = r7
            r7 = r6
        L6c:
            coil3.decode.DecodeResult r8 = (coil3.graphics.DecodeResult) r8     // Catch: java.lang.Throwable -> L2f
            r7.release()
            return r8
        L72:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L76:
            r7.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.graphics.BitmapFactoryDecoder.decode(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/decode/BitmapFactoryDecoder$Factory;", "Lcoil3/decode/Decoder$Factory;", "Lkotlinx/coroutines/sync/Semaphore;", "parallelismLock", "Lcoil3/decode/ExifOrientationStrategy;", "exifOrientationStrategy", "<init>", "(Lkotlinx/coroutines/sync/Semaphore;Lcoil3/decode/ExifOrientationStrategy;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        public final Semaphore a;
        public final ExifOrientationStrategy b;

        public /* synthetic */ Factory(Semaphore semaphore, ExifOrientationStrategy exifOrientationStrategy, int i, xu xuVar) {
            this((i & 1) != 0 ? c.a(4) : semaphore, (i & 2) != 0 ? ExifOrientationStrategy.RESPECT_PERFORMANCE : exifOrientationStrategy);
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder create(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(sourceFetchResult.a, options, this.a, this.b);
        }

        public Factory(Semaphore semaphore, ExifOrientationStrategy exifOrientationStrategy) {
            this.a = semaphore;
            this.b = exifOrientationStrategy;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public BitmapFactoryDecoder(ImageSource imageSource, Options options, Semaphore semaphore, ExifOrientationStrategy exifOrientationStrategy) {
        this.a = imageSource;
        this.b = options;
        this.c = semaphore;
        this.d = exifOrientationStrategy;
    }
}
