package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.b;
import androidx.core.os.OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ye0 implements ImageReaderProxy.OnImageAvailableListener {
    public ImageAnalysis$Analyzer a;
    public volatile int b;
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;
    public Executor g;
    public SafeCloseImageReaderProxy h;
    public ImageWriter i;
    public ByteBuffer n;
    public ByteBuffer o;
    public ByteBuffer p;
    public ByteBuffer q;
    public volatile int d = 1;
    public Rect j = new Rect();
    public Rect k = new Rect();
    public Matrix l = new Matrix();
    public Matrix m = new Matrix();
    public final Object r = new Object();
    public boolean s = true;

    public abstract ImageProxy a(ImageReaderProxy imageReaderProxy);

    public final ListenableFuture b(final ImageProxy imageProxy) throws Throwable {
        Object obj;
        Executor executor;
        final ImageAnalysis$Analyzer imageAnalysis$Analyzer;
        boolean z;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        bf0 bf0Var;
        bf0 bf0VarH;
        int i = this.e ? this.b : 0;
        Object obj2 = this.r;
        synchronized (obj2) {
            try {
                try {
                    executor = this.g;
                    imageAnalysis$Analyzer = this.a;
                    z = this.e && i != this.c;
                    if (z) {
                        g(imageProxy, i);
                    }
                    if (this.e) {
                        d(imageProxy);
                    }
                    try {
                        safeCloseImageReaderProxy = this.h;
                        try {
                            imageWriter = this.i;
                            byteBuffer = this.n;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                byteBuffer2 = this.o;
                byteBuffer3 = this.p;
                byteBuffer4 = this.q;
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                throw th;
            }
        }
        if (imageAnalysis$Analyzer == null || executor == null || !this.s) {
            return new rf0(new OperationCanceledException("No analyzer or executor currently set."), 1);
        }
        if (safeCloseImageReaderProxy == null) {
            bf0Var = null;
        } else {
            if (this.d == 2) {
                bf0VarH = ImageProcessingUtil.d(imageProxy, safeCloseImageReaderProxy, byteBuffer, i, this.f);
            } else {
                if (this.d == 1) {
                    if (this.f) {
                        ImageProcessingUtil.a(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        bf0VarH = ImageProcessingUtil.h(imageProxy, safeCloseImageReaderProxy, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                bf0Var = null;
            }
            bf0Var = bf0VarH;
        }
        boolean z2 = bf0Var == null;
        final ImageProxy imageProxy2 = z2 ? imageProxy : bf0Var;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.r) {
            if (z && !z2) {
                try {
                    f(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy2.getWidth(), imageProxy2.getHeight());
                } finally {
                }
            }
            this.c = i;
            rect.set(this.k);
            matrix.set(this.m);
        }
        final b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            executor.execute(new Runnable() { // from class: xe0
                @Override // java.lang.Runnable
                public final void run() {
                    ye0 ye0Var = this.a;
                    ImageProxy imageProxy3 = imageProxy;
                    Matrix matrix2 = matrix;
                    ImageProxy imageProxy4 = imageProxy2;
                    Rect rect2 = rect;
                    ImageAnalysis$Analyzer imageAnalysis$Analyzer2 = imageAnalysis$Analyzer;
                    b bVar2 = bVar;
                    if (!ye0Var.s) {
                        bVar2.d(new OperationCanceledException("ImageAnalysis is detached"));
                        return;
                    }
                    SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy4, null, new ob(imageProxy3.getImageInfo().getTagBundle(), imageProxy3.getImageInfo().getTimestamp(), ye0Var.e ? 0 : ye0Var.b, matrix2));
                    if (!rect2.isEmpty()) {
                        settableImageProxy.setCropRect(rect2);
                    }
                    imageAnalysis$Analyzer2.analyze(settableImageProxy);
                    bVar2.b(null);
                }
            });
            bVar.a = "analyzeImage";
            return ohVar;
        } catch (Exception e) {
            ohVar.a(e);
            return ohVar;
        }
    }

    public abstract void c();

    public final void d(ImageProxy imageProxy) {
        if (this.d != 1) {
            if (this.d == 2 && this.n == null) {
                this.n = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth() * 4);
                return;
            }
            return;
        }
        ByteBuffer byteBufferAllocateDirect = this.o;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth());
            this.o = byteBufferAllocateDirect;
        }
        byteBufferAllocateDirect.position(0);
        ByteBuffer byteBufferAllocateDirect2 = this.p;
        if (byteBufferAllocateDirect2 == null) {
            byteBufferAllocateDirect2 = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
            this.p = byteBufferAllocateDirect2;
        }
        byteBufferAllocateDirect2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = this.q;
        if (byteBufferAllocateDirect3 == null) {
            byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
            this.q = byteBufferAllocateDirect3;
        }
        byteBufferAllocateDirect3.position(0);
    }

    public abstract void e(ImageProxy imageProxy);

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = cg1.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.k = rect;
        this.m.setConcat(this.l, matrix);
    }

    public final void g(ImageProxy imageProxy, int i) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.h;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.a();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int imageFormat = this.h.getImageFormat();
        int maxImages = this.h.getMaxImages();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.h = new SafeCloseImageReaderProxy(nf0.a(i2, width, imageFormat, maxImages));
        if (this.d == 1) {
            ImageWriter imageWriter = this.i;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.i = ImageWriter.newInstance(this.h.getSurface(), this.h.getMaxImages());
        }
    }

    public final void h(Executor executor, b1 b1Var) {
        if (b1Var == null) {
            c();
        }
        synchronized (this.r) {
            this.a = b1Var;
            this.g = executor;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyA = a(imageReaderProxy);
            if (imageProxyA != null) {
                e(imageProxyA);
            }
        } catch (IllegalStateException unused) {
            km0.c("ImageAnalysisAnalyzer");
        }
    }
}
