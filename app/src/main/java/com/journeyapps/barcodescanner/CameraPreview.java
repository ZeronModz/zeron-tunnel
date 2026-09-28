package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import dev.zeron.tunnel.R;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.journeyapps.barcodescanner.camera.CameraSurface;
import com.journeyapps.barcodescanner.camera.CenterCropStrategy;
import com.journeyapps.barcodescanner.camera.DisplayConfiguration;
import com.journeyapps.barcodescanner.camera.FitCenterStrategy;
import com.journeyapps.barcodescanner.camera.FitXYStrategy;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import defpackage.a11;
import defpackage.b41;
import defpackage.fk;
import defpackage.n4;
import defpackage.nk;
import defpackage.ok;
import defpackage.rb0;
import defpackage.u7;
import defpackage.zk3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CameraPreview extends ViewGroup {
    public static final /* synthetic */ int A = 0;
    public CameraInstance a;
    public WindowManager b;
    public Handler c;
    public boolean d;
    public SurfaceView e;
    public TextureView f;
    public boolean g;
    public RotationListener h;
    public int i;
    public final ArrayList j;
    public DisplayConfiguration k;
    public CameraSettings l;
    public Size m;
    public Size n;
    public Rect o;
    public Size p;
    public Rect q;
    public Rect r;
    public Size s;
    public double t;
    public PreviewScalingStrategy u;
    public boolean v;
    public final ok w;
    public final b x;
    public final rb0 y;
    public final c z;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface StateListener {
        void cameraClosed();

        void cameraError(Exception exc);

        void previewSized();

        void previewStarted();

        void previewStopped();
    }

    public CameraPreview(Context context) {
        super(context);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new CameraSettings();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new ok(this);
        this.x = new b(this);
        this.y = new rb0(this, 3);
        this.z = new c(this);
        a(context, null);
    }

    private int getDisplayRotation() {
        return this.b.getDefaultDisplay().getRotation();
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.b = (WindowManager) context.getSystemService("window");
        this.c = new Handler(this.x);
        this.h = new RotationListener();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a11.a);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.s = new Size(dimension, dimension2);
        }
        this.d = typedArrayObtainStyledAttributes.getBoolean(3, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.u = new CenterCropStrategy();
        } else if (integer == 2) {
            this.u = new FitCenterStrategy();
        } else if (integer == 3) {
            this.u = new FitXYStrategy();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void c() {
        TextureView textureView;
        SurfaceView surfaceView;
        Util.a();
        this.i = -1;
        CameraInstance cameraInstance = this.a;
        if (cameraInstance != null) {
            Util.a();
            if (cameraInstance.f) {
                cameraInstance.a.c(cameraInstance.m);
            } else {
                cameraInstance.g = true;
            }
            cameraInstance.f = false;
            this.a = null;
            this.g = false;
        } else {
            this.c.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.p == null && (surfaceView = this.e) != null) {
            surfaceView.getHolder().removeCallback(this.w);
        }
        if (this.p == null && (textureView = this.f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.m = null;
        this.n = null;
        this.r = null;
        RotationListener rotationListener = this.h;
        b41 b41Var = rotationListener.c;
        if (b41Var != null) {
            b41Var.disable();
        }
        rotationListener.c = null;
        rotationListener.b = null;
        rotationListener.d = null;
        this.z.previewStopped();
    }

    public final void e() {
        Util.a();
        if (this.a == null) {
            CameraInstance cameraInstance = new CameraInstance(getContext());
            CameraSettings cameraSettings = this.l;
            if (!cameraInstance.f) {
                cameraInstance.i = cameraSettings;
                cameraInstance.c.g = cameraSettings;
            }
            this.a = cameraInstance;
            cameraInstance.d = this.c;
            Util.a();
            cameraInstance.f = true;
            cameraInstance.g = false;
            zk3 zk3Var = cameraInstance.a;
            fk fkVar = cameraInstance.j;
            synchronized (zk3Var.e) {
                zk3Var.b++;
                zk3Var.c(fkVar);
            }
            this.i = getDisplayRotation();
        }
        if (this.p != null) {
            h();
        } else {
            SurfaceView surfaceView = this.e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.w);
            } else {
                TextureView textureView = this.f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f.getSurfaceTexture();
                        this.p = new Size(this.f.getWidth(), this.f.getHeight());
                        h();
                    } else {
                        this.f.setSurfaceTextureListener(new nk(this));
                    }
                }
            }
        }
        requestLayout();
        RotationListener rotationListener = this.h;
        Context context = getContext();
        rb0 rb0Var = this.y;
        b41 b41Var = rotationListener.c;
        if (b41Var != null) {
            b41Var.disable();
        }
        rotationListener.c = null;
        rotationListener.b = null;
        rotationListener.d = null;
        Context applicationContext = context.getApplicationContext();
        rotationListener.d = rb0Var;
        rotationListener.b = (WindowManager) applicationContext.getSystemService("window");
        b41 b41Var2 = new b41(rotationListener, applicationContext);
        rotationListener.c = b41Var2;
        b41Var2.enable();
        rotationListener.a = rotationListener.b.getDefaultDisplay().getRotation();
    }

    public final void f() {
        if (this.a == null || getDisplayRotation() == this.i) {
            return;
        }
        c();
        e();
    }

    public final void g(CameraSurface cameraSurface) {
        CameraInstance cameraInstance;
        if (this.g || (cameraInstance = this.a) == null) {
            return;
        }
        cameraInstance.b = cameraSurface;
        Util.a();
        if (!cameraInstance.f) {
            u7.p("CameraInstance is not open");
            return;
        }
        cameraInstance.a.c(cameraInstance.l);
        this.g = true;
        d();
        this.z.previewStarted();
    }

    public CameraInstance getCameraInstance() {
        return this.a;
    }

    public CameraSettings getCameraSettings() {
        return this.l;
    }

    public Rect getFramingRect() {
        return this.q;
    }

    public Size getFramingRectSize() {
        return this.s;
    }

    public double getMarginFraction() {
        return this.t;
    }

    public Rect getPreviewFramingRect() {
        return this.r;
    }

    public PreviewScalingStrategy getPreviewScalingStrategy() {
        PreviewScalingStrategy previewScalingStrategy = this.u;
        return previewScalingStrategy != null ? previewScalingStrategy : this.f != null ? new CenterCropStrategy() : new FitCenterStrategy();
    }

    public Size getPreviewSize() {
        return this.n;
    }

    public final void h() {
        Rect rect;
        float f;
        Size size = this.p;
        if (size == null || this.n == null || (rect = this.o) == null) {
            return;
        }
        if (this.e != null && size.equals(new Size(rect.width(), this.o.height()))) {
            g(new CameraSurface(this.e.getHolder()));
            return;
        }
        TextureView textureView = this.f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.n != null) {
            Size size2 = new Size(this.f.getWidth(), this.f.getHeight());
            Size size3 = this.n;
            int i = size2.a;
            float f2 = size2.b;
            float f3 = i / f2;
            float f4 = size3.a / size3.b;
            float f5 = 1.0f;
            if (f3 < f4) {
                float f6 = f4 / f3;
                f = 1.0f;
                f5 = f6;
            } else {
                f = f3 / f4;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f5, f);
            float f7 = i;
            matrix.postTranslate((f7 - (f5 * f7)) / 2.0f, (f2 - (f * f2)) / 2.0f);
            this.f.setTransform(matrix);
        }
        g(new CameraSurface(this.f.getSurfaceTexture()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d) {
            TextureView textureView = new TextureView(getContext());
            this.f = textureView;
            textureView.setSurfaceTextureListener(new nk(this));
            addView(this.f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.e = surfaceView;
        surfaceView.getHolder().addCallback(this.w);
        addView(this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Size size = new Size(i3 - i, i4 - i2);
        this.m = size;
        CameraInstance cameraInstance = this.a;
        if (cameraInstance != null && cameraInstance.e == null) {
            DisplayConfiguration displayConfiguration = new DisplayConfiguration(getDisplayRotation(), size);
            this.k = displayConfiguration;
            displayConfiguration.c = getPreviewScalingStrategy();
            CameraInstance cameraInstance2 = this.a;
            DisplayConfiguration displayConfiguration2 = this.k;
            cameraInstance2.e = displayConfiguration2;
            cameraInstance2.c.h = displayConfiguration2;
            Util.a();
            if (!cameraInstance2.f) {
                u7.p("CameraInstance is not open");
                return;
            }
            cameraInstance2.a.c(cameraInstance2.k);
            boolean z2 = this.v;
            if (z2) {
                CameraInstance cameraInstance3 = this.a;
                cameraInstance3.getClass();
                Util.a();
                if (cameraInstance3.f) {
                    cameraInstance3.a.c(new n4(3, cameraInstance3, z2));
                }
            }
        }
        SurfaceView surfaceView = this.e;
        if (surfaceView == null) {
            TextureView textureView = this.f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.v);
        return bundle;
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.l = cameraSettings;
    }

    public void setFramingRectSize(Size size) {
        this.s = size;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.t = d;
        } else {
            u7.r("The margin fraction must be less than 0.5");
        }
    }

    public void setPreviewScalingStrategy(PreviewScalingStrategy previewScalingStrategy) {
        this.u = previewScalingStrategy;
    }

    public void setTorch(boolean z) {
        this.v = z;
        CameraInstance cameraInstance = this.a;
        if (cameraInstance != null) {
            Util.a();
            if (cameraInstance.f) {
                cameraInstance.a.c(new n4(3, cameraInstance, z));
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.d = z;
    }

    public void d() {
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new CameraSettings();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new ok(this);
        this.x = new b(this);
        this.y = new rb0(this, 3);
        this.z = new c(this);
        a(context, attributeSet);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new CameraSettings();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new ok(this);
        this.x = new b(this);
        this.y = new rb0(this, 3);
        this.z = new c(this);
        a(context, attributeSet);
    }
}
