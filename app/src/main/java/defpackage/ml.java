package defpackage;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.b;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import defpackage.gz0;
import defpackage.ml;
import defpackage.w91;
import java.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ml implements Node {
    public gz0 a;
    public SafeCloseImageReaderProxy b;
    public SafeCloseImageReaderProxy c;
    public ec d;
    public wa e;
    public mt0 f;

    public final int a() {
        int maxImages;
        w91.i();
        jx0.g("The ImageReader is not initialized.", this.b != null);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.b;
        synchronized (safeCloseImageReaderProxy.a) {
            maxImages = safeCloseImageReaderProxy.d.getMaxImages() - safeCloseImageReaderProxy.b;
        }
        return maxImages;
    }

    public final void b(ImageProxy imageProxy) {
        w91.i();
        if (this.a == null) {
            imageProxy.toString();
            km0.g("CaptureNode");
            imageProxy.close();
            return;
        }
        rd1 tagBundle = imageProxy.getImageInfo().getTagBundle();
        if (((Integer) tagBundle.a.get(this.a.g)) == null) {
            km0.g("CaptureNode");
            imageProxy.close();
            return;
        }
        w91.i();
        ec ecVar = this.d;
        Objects.requireNonNull(ecVar);
        ecVar.a.accept(new fc(this.a, imageProxy));
        gz0 gz0Var = this.a;
        this.a = null;
        int i = gz0Var.j;
        b bVar = gz0Var.f;
        if (i != -1 && i != 100) {
            gz0Var.j = 100;
            bVar.onCaptureProcessProgressed(100);
        }
        bVar.onImageCaptured();
    }

    public final void c(gz0 gz0Var) {
        w91.i();
        boolean z = false;
        jx0.g("only one capture stage is supported.", gz0Var.h.size() == 1);
        jx0.g("Too many acquire images. Close image to be able to process next.", a() > 0);
        this.a = gz0Var;
        xg0.a(gz0Var.i, new y6(this, 7, gz0Var, z), fy.b());
    }

    @Override // androidx.camera.core.processing.Node
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ec transform(wa waVar) {
        int i;
        ImageReaderProxy imageReaderProxyA;
        Consumer consumer;
        ImageReaderProxy imageReaderProxy;
        final int i2;
        ImageReaderProxy imageReaderProxyA2;
        CameraCaptureCallback fjVar;
        boolean z = false;
        boolean z2 = false;
        final int i3 = 1;
        jx0.g("CaptureNode does not support recreation yet.", this.e == null && this.b == null);
        this.e = waVar;
        Size size = waVar.d;
        int i4 = waVar.j;
        Size size2 = waVar.i;
        ImageReaderProxyProvider imageReaderProxyProvider = waVar.h;
        int i5 = waVar.e;
        boolean z3 = waVar.g;
        CameraCaptureCallback klVar = new kl(this, z2 ? 1 : 0);
        if (z3 || imageReaderProxyProvider != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            if (imageReaderProxyProvider != null) {
                imageReaderProxyA = imageReaderProxyProvider.newInstance(width, height, i5, 4, 0L);
                i = i5;
            } else {
                i = i5;
                imageReaderProxyA = nf0.a(width, height, i, 4);
            }
            mt0 mt0Var = new mt0(imageReaderProxyA);
            this.f = mt0Var;
            consumer = new Consumer(this) { // from class: il
                public final /* synthetic */ ml b;

                {
                    this.b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    int i6 = i3;
                    ml mlVar = this.b;
                    switch (i6) {
                        case 0:
                            mlVar.c((gz0) obj);
                            break;
                        case 1:
                            gz0 gz0Var = (gz0) obj;
                            mlVar.c(gz0Var);
                            mt0 mt0Var2 = mlVar.f;
                            jx0.g("Pending request should be null", mt0Var2.b == null);
                            mt0Var2.b = gz0Var;
                            break;
                        default:
                            zc zcVar = (zc) obj;
                            w91.i();
                            gz0 gz0Var2 = mlVar.a;
                            if (gz0Var2 != null && gz0Var2.a == zcVar.a) {
                                gz0Var2.f.onCaptureFailure(zcVar.b);
                                break;
                            }
                            break;
                    }
                }
            };
            imageReaderProxy = mt0Var;
        } else {
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), i5, 4);
            List listAsList = Arrays.asList(klVar, metadataImageReader.b);
            if (listAsList.isEmpty()) {
                fjVar = new fj();
            } else if (listAsList.size() == 1) {
                fjVar = (CameraCaptureCallback) listAsList.get(0);
            } else {
                klVar = new ej(listAsList);
                final boolean z4 = z ? 1 : 0;
                consumer = new Consumer(this) { // from class: il
                    public final /* synthetic */ ml b;

                    {
                        this.b = this;
                    }

                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        int i6 = z4;
                        ml mlVar = this.b;
                        switch (i6) {
                            case 0:
                                mlVar.c((gz0) obj);
                                break;
                            case 1:
                                gz0 gz0Var = (gz0) obj;
                                mlVar.c(gz0Var);
                                mt0 mt0Var2 = mlVar.f;
                                jx0.g("Pending request should be null", mt0Var2.b == null);
                                mt0Var2.b = gz0Var;
                                break;
                            default:
                                zc zcVar = (zc) obj;
                                w91.i();
                                gz0 gz0Var2 = mlVar.a;
                                if (gz0Var2 != null && gz0Var2.a == zcVar.a) {
                                    gz0Var2.f.onCaptureFailure(zcVar.b);
                                    break;
                                }
                                break;
                        }
                    }
                };
                i = i5;
                imageReaderProxy = metadataImageReader;
            }
            klVar = fjVar;
            final int z42 = z ? 1 : 0;
            consumer = new Consumer(this) { // from class: il
                public final /* synthetic */ ml b;

                {
                    this.b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    int i6 = z42;
                    ml mlVar = this.b;
                    switch (i6) {
                        case 0:
                            mlVar.c((gz0) obj);
                            break;
                        case 1:
                            gz0 gz0Var = (gz0) obj;
                            mlVar.c(gz0Var);
                            mt0 mt0Var2 = mlVar.f;
                            jx0.g("Pending request should be null", mt0Var2.b == null);
                            mt0Var2.b = gz0Var;
                            break;
                        default:
                            zc zcVar = (zc) obj;
                            w91.i();
                            gz0 gz0Var2 = mlVar.a;
                            if (gz0Var2 != null && gz0Var2.a == zcVar.a) {
                                gz0Var2.f.onCaptureFailure(zcVar.b);
                                break;
                            }
                            break;
                    }
                }
            };
            i = i5;
            imageReaderProxy = metadataImageReader;
        }
        waVar.a = klVar;
        Surface surface = imageReaderProxy.getSurface();
        Objects.requireNonNull(surface);
        jx0.g("The surface is already set.", waVar.b == null);
        waVar.b = new ImmediateSurface(surface, waVar.d, i);
        this.b = new SafeCloseImageReaderProxy(imageReaderProxy);
        imageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.a
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                ml mlVar = this.a;
                try {
                    ImageProxy imageProxyAcquireLatestImage = imageReaderProxy2.acquireLatestImage();
                    if (imageProxyAcquireLatestImage != null) {
                        mlVar.b(imageProxyAcquireLatestImage);
                        return;
                    }
                    gz0 gz0Var = mlVar.a;
                    if (gz0Var != null) {
                        int i6 = gz0Var.a;
                        ImageCaptureException imageCaptureException = new ImageCaptureException(2, "Failed to acquire latest image", null);
                        w91.i();
                        gz0 gz0Var2 = mlVar.a;
                        if (gz0Var2 == null || gz0Var2.a != i6) {
                            return;
                        }
                        gz0Var2.f.onCaptureFailure(imageCaptureException);
                    }
                } catch (IllegalStateException e) {
                    gz0 gz0Var3 = mlVar.a;
                    if (gz0Var3 != null) {
                        int i7 = gz0Var3.a;
                        ImageCaptureException imageCaptureException2 = new ImageCaptureException(2, "Failed to acquire latest image", e);
                        w91.i();
                        gz0 gz0Var4 = mlVar.a;
                        if (gz0Var4 == null || gz0Var4.a != i7) {
                            return;
                        }
                        gz0Var4.f.onCaptureFailure(imageCaptureException2);
                    }
                }
            }
        }, dn0.r());
        if (size2 != null) {
            int width2 = size2.getWidth();
            int height2 = size2.getHeight();
            if (imageReaderProxyProvider != null) {
                i2 = 2;
                imageReaderProxyA2 = imageReaderProxyProvider.newInstance(width2, height2, i4, 4, 0L);
            } else {
                i2 = 2;
                imageReaderProxyA2 = nf0.a(width2, height2, i4, 4);
            }
            imageReaderProxyA2.setOnImageAvailableListener(new b1(this, 7), dn0.r());
            this.c = new SafeCloseImageReaderProxy(imageReaderProxyA2);
            waVar.c = new ImmediateSurface(imageReaderProxyA2.getSurface(), size2, i4);
        } else {
            i2 = 2;
        }
        waVar.k.a = consumer;
        waVar.l.a = new Consumer(this) { // from class: il
            public final /* synthetic */ ml b;

            {
                this.b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i6 = i2;
                ml mlVar = this.b;
                switch (i6) {
                    case 0:
                        mlVar.c((gz0) obj);
                        break;
                    case 1:
                        gz0 gz0Var = (gz0) obj;
                        mlVar.c(gz0Var);
                        mt0 mt0Var2 = mlVar.f;
                        jx0.g("Pending request should be null", mt0Var2.b == null);
                        mt0Var2.b = gz0Var;
                        break;
                    default:
                        zc zcVar = (zc) obj;
                        w91.i();
                        gz0 gz0Var2 = mlVar.a;
                        if (gz0Var2 != null && gz0Var2.a == zcVar.a) {
                            gz0Var2.f.onCaptureFailure(zcVar.b);
                            break;
                        }
                        break;
                }
            }
        };
        ec ecVar = new ec(new Edge(), new Edge(), i, waVar.f);
        this.d = ecVar;
        return ecVar;
    }

    @Override // androidx.camera.core.processing.Node
    public final void release() {
        w91.i();
        wa waVar = this.e;
        Objects.requireNonNull(waVar);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.b;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = this.c;
        ImmediateSurface immediateSurface = waVar.b;
        Objects.requireNonNull(immediateSurface);
        immediateSurface.a();
        ImmediateSurface immediateSurface2 = waVar.b;
        Objects.requireNonNull(immediateSurface2);
        xg0.p(immediateSurface2.e).addListener(new jl(safeCloseImageReaderProxy, 0), dn0.r());
        ImmediateSurface immediateSurface3 = waVar.c;
        if (immediateSurface3 != null) {
            immediateSurface3.a();
            xg0.p(waVar.c.e).addListener(new jl(safeCloseImageReaderProxy2, 1), dn0.r());
        }
    }
}
