package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ImagePipeline;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.a;
import androidx.camera.core.processing.Operation;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements Operation {
    @Override // androidx.camera.core.processing.Operation
    public final Object apply(Object obj) throws ImageCaptureException {
        w30 w30Var;
        fc fcVar = (fc) obj;
        ImageProxy imageProxy = fcVar.b;
        gz0 gz0Var = fcVar.a;
        if (a.c(imageProxy.getFormat())) {
            try {
                ju juVar = w30.b;
                ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                buffer.rewind();
                byte[] bArr = new byte[buffer.capacity()];
                buffer.get(bArr);
                w30Var = new w30(new ExifInterface(new ByteArrayInputStream(bArr)));
                imageProxy.getPlanes()[0].getBuffer().rewind();
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            w30Var = null;
        }
        ImagePipeline.g.getClass();
        if (((ImageCaptureRotationOptionQuirk) mx.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            xa xaVar = el.i;
        } else if (a.c(imageProxy.getFormat())) {
            jx0.f(w30Var, "JPEG image must have exif.");
            Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
            int iA = gz0Var.c - w30Var.a();
            Size size2 = cg1.b(cg1.g(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = cg1.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
            RectF rectF = new RectF(gz0Var.b);
            matrixA.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int iA2 = w30Var.a();
            Matrix matrix = new Matrix(gz0Var.e);
            matrix.postConcat(matrixA);
            CameraCaptureResult emptyCameraCaptureResult = imageProxy.getImageInfo() instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageProxy.getImageInfo()).a : new CameraCaptureResult.EmptyCameraCaptureResult();
            imageProxy.getFormat();
            return new cc(imageProxy, w30Var, imageProxy.getFormat(), size2, rect, iA2, matrix, emptyCameraCaptureResult);
        }
        Rect rect2 = gz0Var.b;
        int i = gz0Var.c;
        Matrix matrix2 = gz0Var.e;
        CameraCaptureResult emptyCameraCaptureResult2 = imageProxy.getImageInfo() instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageProxy.getImageInfo()).a : new CameraCaptureResult.EmptyCameraCaptureResult();
        Size size3 = new Size(imageProxy.getWidth(), imageProxy.getHeight());
        if (a.c(imageProxy.getFormat())) {
            jx0.f(w30Var, "JPEG image must have Exif.");
        }
        return new cc(imageProxy, w30Var, imageProxy.getFormat(), size3, rect2, i, matrix2, emptyCameraCaptureResult2);
    }
}
