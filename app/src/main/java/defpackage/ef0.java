package defpackage;

import android.util.Pair;
import android.util.Rational;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture$Builder;
import androidx.camera.core.ImageCapture$Defaults;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.imagecapture.ImagePipeline;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.SessionConfig$CloseableErrorListener;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.k;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 extends k {
    public static final ImageCapture$Defaults z = new ImageCapture$Defaults();
    public final int o;
    public final AtomicReference p;
    public final int q;
    public int r;
    public Rational s;
    public ScreenFlashWrapper t;
    public SessionConfig$Builder u;
    public ImagePipeline v;
    public TakePictureManager w;
    public SessionConfig$CloseableErrorListener x;
    public final jx2 y;

    static {
        new ExifRotationAvailability();
    }

    public ef0(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.p = new AtomicReference(null);
        this.r = -1;
        this.s = null;
        this.y = new jx2(this, 10);
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) this.f;
        xa xaVar = ImageCaptureConfig.b;
        if (imageCaptureConfig2.containsOption(xaVar)) {
            this.o = ((Integer) ((l) imageCaptureConfig2.getConfig()).retrieveOption(xaVar)).intValue();
        } else {
            this.o = 1;
        }
        this.q = ((Integer) imageCaptureConfig2.retrieveOption(ImageCaptureConfig.i, 0)).intValue();
        ImageCapture$ScreenFlash imageCapture$ScreenFlash = (ImageCapture$ScreenFlash) imageCaptureConfig2.retrieveOption(ImageCaptureConfig.j, null);
        ScreenFlashWrapper.e.getClass();
        this.t = new ScreenFlashWrapper(imageCapture$ScreenFlash, null);
    }

    public static boolean G(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void D(boolean z2) {
        TakePictureManager takePictureManager;
        w91.i();
        SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener = this.x;
        if (sessionConfig$CloseableErrorListener != null) {
            sessionConfig$CloseableErrorListener.a();
            this.x = null;
        }
        ImagePipeline imagePipeline = this.v;
        if (imagePipeline != null) {
            w91.i();
            imagePipeline.c.release();
            imagePipeline.d.getClass();
            this.v = null;
        }
        if (z2 || (takePictureManager = this.w) == null) {
            return;
        }
        takePictureManager.a();
        this.w = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7 A[PHI: r6
      0x00f7: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v14 int), (r6v14 int) binds: [B:6:0x0050, B:8:0x005e, B:16:0x0092, B:18:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.impl.SessionConfig$Builder E(java.lang.String r19, androidx.camera.core.impl.ImageCaptureConfig r20, androidx.camera.core.impl.StreamSpec r21) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef0.E(java.lang.String, androidx.camera.core.impl.ImageCaptureConfig, androidx.camera.core.impl.StreamSpec):androidx.camera.core.impl.SessionConfig$Builder");
    }

    public final int F() {
        int iIntValue;
        synchronized (this.p) {
            iIntValue = this.r;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((ImageCaptureConfig) this.f).retrieveOption(ImageCaptureConfig.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void H() {
        synchronized (this.p) {
            try {
                if (this.p.get() != null) {
                    return;
                }
                c().setFlashMode(F());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig e(boolean z2, UseCaseConfigFactory useCaseConfigFactory) {
        z.getClass();
        ImageCaptureConfig imageCaptureConfig = ImageCapture$Defaults.a;
        imageCaptureConfig.getClass();
        Config config = useCaseConfigFactory.getConfig(ec1.e(imageCaptureConfig), this.o);
        if (z2) {
            config = vh.B(config, imageCaptureConfig);
        }
        if (config == null) {
            return null;
        }
        return new ImageCaptureConfig(l.a(((ImageCapture$Builder) j(config)).a));
    }

    @Override // androidx.camera.core.k
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig.Builder j(Config config) {
        return new ImageCapture$Builder(androidx.camera.core.impl.k.c(config));
    }

    @Override // androidx.camera.core.k
    public final void q() {
        jx0.f(b(), "Attached camera cannot be null");
        if (F() == 3) {
            CameraInternal cameraInternalB = b();
            if ((cameraInternalB != null ? cameraInternalB.getCameraInfo().getLensFacing() : -1) == 0) {
                return;
            }
            u7.r("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // androidx.camera.core.k
    public final void r() {
        km0.a("ImageCapture");
        H();
        c().setScreenFlash(this.t);
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        boolean z2;
        if (cameraInfoInternal.getCameraQuirks().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            MutableConfig mutableConfig = builder.getMutableConfig();
            xa xaVar = ImageCaptureConfig.h;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mutableConfig.retrieveOption(xaVar, bool2))) {
                km0.g("ImageCapture");
            } else {
                km0.e(4, km0.f("ImageCapture"));
                builder.getMutableConfig().insertOption(xaVar, bool2);
            }
        }
        MutableConfig mutableConfig2 = builder.getMutableConfig();
        Boolean bool3 = Boolean.TRUE;
        xa xaVar2 = ImageCaptureConfig.h;
        Boolean bool4 = Boolean.FALSE;
        boolean z3 = true;
        if (bool3.equals(mutableConfig2.retrieveOption(xaVar2, bool4))) {
            if (b() == null || b().getExtendedConfig().getSessionProcessor(null) == null) {
                z2 = true;
            } else {
                km0.g("ImageCapture");
                z2 = false;
            }
            Integer num = (Integer) mutableConfig2.retrieveOption(ImageCaptureConfig.e, null);
            if (num != null && num.intValue() != 256) {
                km0.g("ImageCapture");
                z2 = false;
            }
            if (!z2) {
                km0.g("ImageCapture");
                mutableConfig2.insertOption(xaVar2, bool4);
            }
        } else {
            z2 = false;
        }
        Integer num2 = (Integer) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.e, null);
        if (num2 != null) {
            if (b() != null && b().getExtendedConfig().getSessionProcessor(null) != null && num2.intValue() != 256) {
                z3 = false;
            }
            jx0.b(z3, "Cannot set non-JPEG buffer format with Extensions enabled.");
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, Integer.valueOf(z2 ? 35 : num2.intValue()));
        } else if (Objects.equals(builder.getMutableConfig().retrieveOption(ImageCaptureConfig.f, null), 1)) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.c);
        } else if (z2) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
        } else {
            List list = (List) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
            if (list == null || G(256, list)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            } else if (G(35, list)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            }
        }
        return builder.getUseCaseConfig();
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    @Override // androidx.camera.core.k
    public final void u() {
        ScreenFlashWrapper screenFlashWrapper = this.t;
        screenFlashWrapper.b();
        screenFlashWrapper.a();
        TakePictureManager takePictureManager = this.w;
        if (takePictureManager != null) {
            takePictureManager.a();
        }
    }

    @Override // androidx.camera.core.k
    public final sc v(Config config) {
        this.u.b.c(config);
        Object[] objArr = {this.u.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(DesugarCollections.unmodifiableList(arrayList));
        rc rcVarF = this.g.f();
        rcVarF.d = config;
        return rcVarF.a();
    }

    @Override // androidx.camera.core.k
    public final StreamSpec w(StreamSpec streamSpec, StreamSpec streamSpec2) {
        SessionConfig$Builder sessionConfig$BuilderE = E(d(), (ImageCaptureConfig) this.f, streamSpec);
        this.u = sessionConfig$BuilderE;
        Object[] objArr = {sessionConfig$BuilderE.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(DesugarCollections.unmodifiableList(arrayList));
        m();
        return streamSpec;
    }

    @Override // androidx.camera.core.k
    public final void x() {
        ScreenFlashWrapper screenFlashWrapper = this.t;
        screenFlashWrapper.b();
        screenFlashWrapper.a();
        TakePictureManager takePictureManager = this.w;
        if (takePictureManager != null) {
            takePictureManager.a();
        }
        D(false);
        c().setScreenFlash(null);
    }
}
