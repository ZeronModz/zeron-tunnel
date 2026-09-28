package defpackage;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.Image2Bitmap;
import androidx.camera.core.imagecapture.JpegBytes2Image;
import androidx.camera.core.imagecapture.JpegImage2Result;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.b;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 implements Node {
    public final Executor a;
    public ec b;
    public bz0 c;
    public jx2 d;
    public i60 e;
    public ww f;
    public JpegImage2Result g;
    public JpegBytes2Image h;
    public Image2Bitmap i;
    public final Quirks j;
    public final boolean k;

    public fz0(Executor executor) {
        Quirks quirks = mx.a;
        if (mx.a.b(LowMemoryQuirk.class) != null) {
            this.a = new b(executor);
        } else {
            this.a = executor;
        }
        this.j = quirks;
        this.k = quirks.a(IncorrectJpegMetadataQuirk.class);
    }

    public final ImageProxy a(fc fcVar) {
        gz0 gz0Var = fcVar.a;
        Packet<ImageProxy> packetApply = (Packet) this.c.apply(fcVar);
        if ((packetApply.e() == 35 || this.k) && this.b.d == 256) {
            packetApply = this.h.apply((Packet) this.d.apply(new nb(packetApply, gz0Var.d)));
        }
        return (ImageProxy) this.g.apply(packetApply);
    }

    public final void b(ec ecVar) {
        this.b = ecVar;
        final int i = 0;
        ecVar.a.a = new Consumer(this) { // from class: cz0
            public final /* synthetic */ fz0 b;

            {
                this.b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                final fz0 fz0Var = this.b;
                final fc fcVar = (fc) obj;
                switch (i2) {
                    case 0:
                        if (!fcVar.a.f.g) {
                            final int i3 = 1;
                            fz0Var.a.execute(new Runnable() { // from class: dz0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i3;
                                    fc fcVar2 = fcVar;
                                    fz0 fz0Var2 = fz0Var;
                                    switch (i4) {
                                        case 0:
                                            int i5 = fz0Var2.b.d;
                                            jx0.b(i5 == 35 || i5 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i5);
                                            try {
                                                ((jc0) dn0.r()).execute(new f20(29, fcVar2.a, (Bitmap) fz0Var2.i.apply((Packet) fz0Var2.c.apply(fcVar2))));
                                            } catch (Exception unused) {
                                                fcVar2.b.close();
                                                km0.c("ProcessingNode");
                                                return;
                                            }
                                            break;
                                        default:
                                            gz0 gz0Var = fcVar2.a;
                                            try {
                                                gz0Var.getClass();
                                                ((jc0) dn0.r()).execute(new f20(28, gz0Var, fz0Var2.a(fcVar2)));
                                            } catch (ImageCaptureException e) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, e));
                                            } catch (OutOfMemoryError e2) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed due to low memory.", e2)));
                                                return;
                                            } catch (RuntimeException e3) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed.", e3)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            fcVar.b.close();
                        }
                        break;
                    default:
                        if (!fcVar.a.f.g) {
                            final int i4 = 0;
                            fz0Var.a.execute(new Runnable() { // from class: dz0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i42 = i4;
                                    fc fcVar2 = fcVar;
                                    fz0 fz0Var2 = fz0Var;
                                    switch (i42) {
                                        case 0:
                                            int i5 = fz0Var2.b.d;
                                            jx0.b(i5 == 35 || i5 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i5);
                                            try {
                                                ((jc0) dn0.r()).execute(new f20(29, fcVar2.a, (Bitmap) fz0Var2.i.apply((Packet) fz0Var2.c.apply(fcVar2))));
                                            } catch (Exception unused) {
                                                fcVar2.b.close();
                                                km0.c("ProcessingNode");
                                                return;
                                            }
                                            break;
                                        default:
                                            gz0 gz0Var = fcVar2.a;
                                            try {
                                                gz0Var.getClass();
                                                ((jc0) dn0.r()).execute(new f20(28, gz0Var, fz0Var2.a(fcVar2)));
                                            } catch (ImageCaptureException e) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, e));
                                            } catch (OutOfMemoryError e2) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed due to low memory.", e2)));
                                                return;
                                            } catch (RuntimeException e3) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed.", e3)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            km0.g("ProcessingNode");
                            fcVar.b.close();
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        ecVar.b.a = new Consumer(this) { // from class: cz0
            public final /* synthetic */ fz0 b;

            {
                this.b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i22 = i2;
                final fz0 fz0Var = this.b;
                final fc fcVar = (fc) obj;
                switch (i22) {
                    case 0:
                        if (!fcVar.a.f.g) {
                            final int i3 = 1;
                            fz0Var.a.execute(new Runnable() { // from class: dz0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i42 = i3;
                                    fc fcVar2 = fcVar;
                                    fz0 fz0Var2 = fz0Var;
                                    switch (i42) {
                                        case 0:
                                            int i5 = fz0Var2.b.d;
                                            jx0.b(i5 == 35 || i5 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i5);
                                            try {
                                                ((jc0) dn0.r()).execute(new f20(29, fcVar2.a, (Bitmap) fz0Var2.i.apply((Packet) fz0Var2.c.apply(fcVar2))));
                                            } catch (Exception unused) {
                                                fcVar2.b.close();
                                                km0.c("ProcessingNode");
                                                return;
                                            }
                                            break;
                                        default:
                                            gz0 gz0Var = fcVar2.a;
                                            try {
                                                gz0Var.getClass();
                                                ((jc0) dn0.r()).execute(new f20(28, gz0Var, fz0Var2.a(fcVar2)));
                                            } catch (ImageCaptureException e) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, e));
                                            } catch (OutOfMemoryError e2) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed due to low memory.", e2)));
                                                return;
                                            } catch (RuntimeException e3) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed.", e3)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            fcVar.b.close();
                        }
                        break;
                    default:
                        if (!fcVar.a.f.g) {
                            final int i4 = 0;
                            fz0Var.a.execute(new Runnable() { // from class: dz0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i42 = i4;
                                    fc fcVar2 = fcVar;
                                    fz0 fz0Var2 = fz0Var;
                                    switch (i42) {
                                        case 0:
                                            int i5 = fz0Var2.b.d;
                                            jx0.b(i5 == 35 || i5 == 256, "Postview only support YUV and JPEG output formats. Output format: " + i5);
                                            try {
                                                ((jc0) dn0.r()).execute(new f20(29, fcVar2.a, (Bitmap) fz0Var2.i.apply((Packet) fz0Var2.c.apply(fcVar2))));
                                            } catch (Exception unused) {
                                                fcVar2.b.close();
                                                km0.c("ProcessingNode");
                                                return;
                                            }
                                            break;
                                        default:
                                            gz0 gz0Var = fcVar2.a;
                                            try {
                                                gz0Var.getClass();
                                                ((jc0) dn0.r()).execute(new f20(28, gz0Var, fz0Var2.a(fcVar2)));
                                            } catch (ImageCaptureException e) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, e));
                                            } catch (OutOfMemoryError e2) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed due to low memory.", e2)));
                                                return;
                                            } catch (RuntimeException e3) {
                                                ((jc0) dn0.r()).execute(new ez0(0, gz0Var, new ImageCaptureException(0, "Processing failed.", e3)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            km0.g("ProcessingNode");
                            fcVar.b.close();
                        }
                        break;
                }
            }
        };
        this.c = new bz0();
        this.d = new jx2(this.j);
        this.f = new ww(18);
        this.e = new i60(17);
        this.g = new JpegImage2Result();
        this.i = new Image2Bitmap();
        if (ecVar.c == 35 || this.k) {
            this.h = new JpegBytes2Image();
        }
    }

    @Override // androidx.camera.core.processing.Node
    public final /* bridge */ /* synthetic */ Object transform(Object obj) {
        b((ec) obj);
        return null;
    }

    @Override // androidx.camera.core.processing.Node
    public final void release() {
    }
}
