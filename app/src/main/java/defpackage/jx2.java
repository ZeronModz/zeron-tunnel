package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.appcompat.app.k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo;
import androidx.appcompat.widget.ActivityChooserModel$ActivitySorter;
import androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord;
import androidx.camera.camera2.internal.a0;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.camera.core.internal.utils.a;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.h;
import androidx.exifinterface.media.ExifInterface;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbj;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.android.gms.internal.ads.zzcie;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzckv;
import com.google.android.gms.internal.ads.zzgyv;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzat;
import com.google.android.gms.internal.consent_sdk.zzav;
import com.google.android.gms.internal.consent_sdk.zzax;
import com.google.android.gms.internal.consent_sdk.zzbc;
import com.google.android.gms.internal.consent_sdk.zzbd;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzbw;
import com.google.android.gms.internal.consent_sdk.zzby;
import com.google.android.gms.internal.consent_sdk.zzcc;
import com.google.android.gms.internal.consent_sdk.zzdm;
import com.google.android.gms.internal.consent_sdk.zzdr;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.google.android.material.navigationrail.NavigationRailView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.d;
import com.google.firebase.crashlytics.internal.common.e;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonSerializationContext;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.zxing.client.android.BeepManager;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.CaptureManager;
import com.trilead.ssh2.sftp.AttribFlags;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class jx2 implements ActivityChooserModel$ActivitySorter, OnApplyWindowInsetsListener, CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl, BarcodeCallback, SuccessContinuation, FutureCallback, CallbackToFutureAdapter$Resolver, Operation, ImageCaptureControl, ViewUtils$OnApplyWindowInsetsListener, JsonSerializationContext, JsonDeserializationContext, ViewPropertyAnimatorUpdateListener, BaseGmsClient$BaseConnectionCallbacks, zzdr, zzax, zzgyv, zzgzl, OnH5AdsEventListener, zzcer, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback, zzcie, zzckv {
    public static jx2 c;
    public final /* synthetic */ int a;
    public final Object b;

    public jx2(yw1 yw1Var, zzbq zzbqVar) {
        this.a = 19;
        ij2 ij2VarA = ij2.a(new zzby(yw1Var.c));
        if (zzbqVar == null) {
            io0.e("instance cannot be null");
            throw null;
        }
        x1 x1Var = new x1(zzbqVar);
        zzdm zzdmVar = new zzdm();
        this.b = zzdmVar;
        x1 x1Var2 = yw1Var.c;
        zzat zzatVar = uy1.a;
        zzav zzavVar = dz1.a;
        ij2 ij2Var = yw1Var.g;
        zzap zzapVar = yw1Var.h;
        ij2 ij2Var2 = yw1Var.d;
        ij2 ij2VarA2 = ij2.a(new zzbd(x1Var2, yw1Var.e, ij2VarA, ij2Var2, x1Var, new zzbw(ij2VarA, zzatVar, new zzcc(x1Var2, ij2VarA, zzatVar, zzavVar, ij2Var, zzapVar, zzdmVar, ij2Var2))));
        if (zzdmVar.a == null) {
            zzdmVar.a = ij2VarA2;
        } else {
            zg1.h();
            throw null;
        }
    }

    public static cc b(nb nbVar) throws ImageCaptureException {
        Packet packet = nbVar.a;
        ImageProxy imageProxy = (ImageProxy) packet.c();
        Rect rectB = packet.b();
        try {
            byte[] bArrD = a.d(imageProxy, rectB, nbVar.b, packet.f());
            try {
                w30 w30Var = new w30(new ExifInterface(new ByteArrayInputStream(bArrD)));
                Size size = new Size(rectB.width(), rectB.height());
                Rect rect = new Rect(0, 0, rectB.width(), rectB.height());
                int iF = packet.f();
                Matrix matrixG = packet.g();
                RectF rectF = cg1.a;
                Matrix matrix = new Matrix(matrixG);
                matrix.postTranslate(-rectB.left, -rectB.top);
                return new cc(bArrD, w30Var, 256, size, rect, iF, matrix, packet.a());
            } catch (IOException e) {
                throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e2);
        }
    }

    public static final jx2 d(Context context) {
        jx2 jx2Var;
        synchronized (jx2.class) {
            try {
                jx2Var = c;
                if (jx2Var == null) {
                    jx2Var = new jx2(context);
                    c = jx2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jx2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r1 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = java.util.Arrays.copyOfRange(r2, r1, r10.limit());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cc a(defpackage.nb r11, int r12) {
        /*
            r10 = this;
            androidx.camera.core.processing.Packet r11 = r11.a
            java.lang.Object r10 = r10.b
            androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector r10 = (androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector) r10
            java.lang.Object r0 = r11.c()
            androidx.camera.core.ImageProxy r0 = (androidx.camera.core.ImageProxy) r0
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r10 = r10.a
            r1 = 0
            if (r10 != 0) goto L29
            androidx.camera.core.ImageProxy$PlaneProxy[] r10 = r0.getPlanes()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.getBuffer()
            int r0 = r10.capacity()
            byte[] r0 = new byte[r0]
            r10.rewind()
            r10.get(r0)
        L27:
            r2 = r0
            goto L84
        L29:
            androidx.camera.core.ImageProxy$PlaneProxy[] r10 = r0.getPlanes()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.getBuffer()
            int r0 = r10.capacity()
            byte[] r2 = new byte[r0]
            r10.rewind()
            r10.get(r2)
            r3 = 2
            r4 = r3
        L41:
            int r5 = r4 + 4
            r6 = -1
            if (r5 > r0) goto L68
            r5 = r2[r4]
            if (r5 == r6) goto L4b
            goto L68
        L4b:
            if (r5 != r6) goto L56
            int r5 = r4 + 1
            r5 = r2[r5]
            r6 = -38
            if (r5 != r6) goto L56
            goto L7b
        L56:
            int r5 = r4 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r6 = r4 + 3
            r6 = r2[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 + r3
            int r4 = r4 + r5
            goto L41
        L68:
            int r1 = r3 + 1
            if (r1 <= r0) goto L6e
            r1 = r6
            goto L79
        L6e:
            r4 = r2[r3]
            if (r4 != r6) goto La6
            r4 = r2[r1]
            r5 = -40
            if (r4 != r5) goto La6
            r1 = r3
        L79:
            if (r1 == r6) goto L84
        L7b:
            int r10 = r10.limit()
            byte[] r0 = java.util.Arrays.copyOfRange(r2, r1, r10)
            goto L27
        L84:
            w30 r3 = r11.d()
            java.util.Objects.requireNonNull(r3)
            android.util.Size r5 = r11.h()
            android.graphics.Rect r6 = r11.b()
            int r7 = r11.f()
            android.graphics.Matrix r8 = r11.g()
            androidx.camera.core.impl.CameraCaptureResult r9 = r11.a()
            cc r1 = new cc
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        La6:
            r4 = r12
            r3 = r1
            r12 = r4
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx2.a(nb, int):cc");
    }

    @Override // androidx.camera.core.processing.Operation
    public Object apply(Object obj) {
        cc ccVarB;
        nb nbVar = (nb) obj;
        try {
            Packet packet = nbVar.a;
            int iE = packet.e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                ccVarB = a(nbVar, iE);
            } else {
                ccVarB = b(nbVar);
            }
            ((ImageProxy) packet.c()).close();
            return ccVarB;
        } catch (Throwable th) {
            ((ImageProxy) nbVar.a.c()).close();
            throw th;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                xa0 xa0Var = (xa0) obj;
                jx0.g("The result can only set once!", xa0Var.b == null);
                xa0Var.b = bVar;
                return "FutureChain[" + xa0Var + "]";
            default:
                zk0 zk0Var = (zk0) obj;
                jx0.g("The result can only set once!", zk0Var.f == null);
                zk0Var.f = bVar;
                return "ListFuture[" + this + "]";
        }
    }

    @Override // com.journeyapps.barcodescanner.BarcodeCallback
    public void barcodeResult(BarcodeResult barcodeResult) {
        ((CaptureManager) this.b).b.a.c();
        BeepManager beepManager = ((CaptureManager) this.b).i;
        synchronized (beepManager) {
            if (beepManager.b) {
                beepManager.a();
            }
        }
        ((CaptureManager) this.b).j.post(new r4(14, this, barcodeResult));
    }

    public void c(Serializable serializable, Object obj) {
        try {
            ((Field) this.b).set(serializable, obj);
        } catch (IllegalAccessException e) {
            u7.g(e);
        }
    }

    @Override // com.google.gson.JsonDeserializationContext
    public Object deserialize(JsonElement jsonElement, Type type) {
        Gson gson = ((TreeTypeAdapter) this.b).c;
        gson.getClass();
        TypeToken typeToken = new TypeToken(type);
        if (jsonElement == null) {
            return null;
        }
        return gson.b(new JsonTreeReader(jsonElement), typeToken);
    }

    public void f(boolean z) {
        synchronized (jx2.class) {
            try {
                mo2 mo2Var = (mo2) this.b;
                mo2Var.f(Boolean.valueOf(z), "paidv2_publisher_option");
                if (!z) {
                    mo2Var.l("paidv2_creation_time");
                    mo2Var.l("paidv2_id");
                    mo2Var.l("vendor_scoped_gpid_v2_id");
                    mo2Var.l("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g() {
        boolean z;
        synchronized (jx2.class) {
            z = ((SharedPreferences) ((mo2) this.b).c).getBoolean("paidv2_publisher_option", true);
        }
        return z;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl
    public Object get(CameraCharacteristics.Key key) {
        return ((CameraCharacteristics) this.b).get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl
    public Set getPhysicalCameraIds() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.core.imagecapture.ImageCaptureControl
    public void lockFlashMode() {
        ef0 ef0Var = (ef0) this.b;
        synchronized (ef0Var.p) {
            try {
                if (ef0Var.p.get() != null) {
                    return;
                }
                ef0Var.p.set(Integer.valueOf(ef0Var.F()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdClosed() {
        try {
            ((zzbtz) this.b).zzf();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public void onAdFailedToShow(AdError adError) {
        try {
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(code).length() + 59 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb.append("Mediated ad failed to show: Error Code = ");
            sb.append(code);
            sb.append(". Error Message = ");
            sb.append(message);
            sb.append(" Error Domain = ");
            sb.append(domain);
            zzo.zzi(sb.toString());
            ((zzbtz) this.b).zzy(adError.zza());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onAdLeftApplication() {
        try {
            ((zzbtz) this.b).zzh();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdOpened() {
        try {
            ((zzbtz) this.b).zzi();
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
    public void onAnimationUpdate(View view) {
        ((View) ((WindowDecorActionBar) this.b).e.getParent()).invalidate();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        WindowInsetsCompat windowInsetsCompatB;
        boolean z2;
        int iD = windowInsetsCompat.d();
        k kVar = (k) this.b;
        Context context = kVar.k;
        int iD2 = windowInsetsCompat.d();
        ActionBarContextView actionBarContextView = kVar.v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kVar.v.getLayoutParams();
            if (kVar.v.isShown()) {
                if (kVar.c0 == null) {
                    kVar.c0 = new Rect();
                    kVar.d0 = new Rect();
                }
                Rect rect = kVar.c0;
                Rect rect2 = kVar.d0;
                rect.set(windowInsetsCompat.b(), windowInsetsCompat.d(), windowInsetsCompat.c(), windowInsetsCompat.a());
                ViewGroup viewGroup = kVar.A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = xo1.a;
                    uo1.a(viewGroup, rect, rect2);
                } else {
                    if (!xo1.a) {
                        xo1.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            xo1.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                xo1.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = xo1.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = kVar.A;
                WeakHashMap weakHashMap = h.a;
                WindowInsetsCompat windowInsetsCompatA = dn1.a(viewGroup2);
                int iB = windowInsetsCompatA == null ? 0 : windowInsetsCompatA.b();
                int iC = windowInsetsCompatA == null ? 0 : windowInsetsCompatA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || kVar.C != null) {
                    View view2 = kVar.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            kVar.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    kVar.C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    kVar.A.addView(kVar.C, -1, layoutParams);
                }
                View view4 = kVar.C;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = kVar.C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!kVar.H && z) {
                    iD2 = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                kVar.v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = kVar.C;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = windowInsetsCompat.b();
            int iC2 = windowInsetsCompat.c();
            int iA = windowInsetsCompat.a();
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            og0 og0VarC = og0.c(iB2, iD2, iC2, iA);
            oq1 oq1Var = builder.a;
            oq1Var.g(og0VarC);
            windowInsetsCompatB = oq1Var.b();
        } else {
            windowInsetsCompatB = windowInsetsCompat;
        }
        return h.k(view, windowInsetsCompatB);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnected(Bundle bundle) {
        ((ConnectionCallbacks) this.b).onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        ((ConnectionCallbacks) this.b).onConnectionSuspended(i);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 6:
                boolean z = th instanceof TimeoutException;
                b bVar = (b) this.b;
                if (z) {
                    bVar.d(th);
                    return;
                } else {
                    bVar.b(Collections.EMPTY_LIST);
                    return;
                }
            case 7:
                ((EncoderImpl) this.b).b(0, "Unable to acquire InputBuffer.", th);
                return;
            default:
                l0 l0Var = (l0) this.b;
                l0Var.finishClose();
                a0 a0Var = l0Var.b;
                a0Var.a(l0Var);
                synchronized (a0Var.b) {
                    a0Var.e.remove(l0Var);
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
    public /* synthetic */ void onH5AdsEvent(String str) {
        int i = zzbpq.d;
        ((WebView) this.b).evaluateJavascript(str, null);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /* JADX INFO: renamed from: onSuccess */
    public void mo18onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 6:
                List list = (List) obj;
                list.getClass();
                ((b) obj2).b(new ArrayList(list));
                break;
            case 7:
                InputBuffer inputBuffer = (InputBuffer) obj;
                EncoderImpl encoderImpl = (EncoderImpl) obj2;
                inputBuffer.setPresentationTimeUs(encoderImpl.q.uptimeUs());
                inputBuffer.setEndOfStream(true);
                inputBuffer.submit();
                xg0.a(inputBuffer.getTerminationFuture(), new rb0(this, 6), encoderImpl.h);
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward(RewardItem rewardItem) {
        try {
            ((zzbtz) this.b).zzr(new zzcbq(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onVideoComplete() {
        try {
            ((zzbtz) this.b).zzn();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPause() {
        try {
            ((zzbtz) this.b).zzq();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPlay() {
        try {
            ((zzbtz) this.b).zzu();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onVideoStart() {
        try {
            ((zzbtz) this.b).zzo();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdClicked() {
        try {
            ((zzbtz) this.b).zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdImpression() {
        try {
            ((zzbtz) this.b).zzk();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.gson.JsonSerializationContext
    public JsonElement serialize(Object obj) {
        Gson gson = ((TreeTypeAdapter) this.b).c;
        if (obj == null) {
            gson.getClass();
            return JsonNull.a;
        }
        Class<?> cls = obj.getClass();
        gson.getClass();
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        gson.i(obj, cls, jsonTreeWriter);
        return jsonTreeWriter.u();
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel$ActivitySorter
    public void sort(Intent intent, List list, List list2) {
        HashMap map = (HashMap) this.b;
        map.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo = (ActivityChooserModel$ActivityResolveInfo) list.get(i);
            activityChooserModel$ActivityResolveInfo.b = 0.0f;
            ActivityInfo activityInfo = activityChooserModel$ActivityResolveInfo.a.activityInfo;
            map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityChooserModel$ActivityResolveInfo);
        }
        float f = 1.0f;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            ActivityChooserModel$HistoricalRecord activityChooserModel$HistoricalRecord = (ActivityChooserModel$HistoricalRecord) list2.get(size2);
            ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo2 = (ActivityChooserModel$ActivityResolveInfo) map.get(activityChooserModel$HistoricalRecord.a);
            if (activityChooserModel$ActivityResolveInfo2 != null) {
                activityChooserModel$ActivityResolveInfo2.b = (activityChooserModel$HistoricalRecord.c * f) + activityChooserModel$ActivityResolveInfo2.b;
                f *= 0.95f;
            }
        }
        Collections.sort(list);
    }

    @Override // androidx.camera.core.imagecapture.ImageCaptureControl
    public ListenableFuture submitStillCaptureRequests(List list) {
        ef0 ef0Var = (ef0) this.b;
        w91.i();
        ListenableFuture<List<Void>> listenableFutureSubmitStillCaptureRequests = ef0Var.c().submitStillCaptureRequests(list, ef0Var.o, ef0Var.q);
        oi oiVar = new oi(5);
        return xg0.z(listenableFutureSubmitStillCaptureRequests, new nx2(oiVar, 7), fy.b());
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Settings settings = (Settings) obj;
        e eVar = ((d) this.b).e;
        if (settings == null) {
            Logger.b.a(5);
            return com.google.android.gms.tasks.b.e(null);
        }
        ds dsVar = e.r;
        return com.google.android.gms.tasks.b.f(Arrays.asList(eVar.f(), eVar.m.f(null, eVar.e.a)));
    }

    @Override // androidx.camera.core.imagecapture.ImageCaptureControl
    public void unlockFlashMode() {
        ef0 ef0Var = (ef0) this.b;
        synchronized (ef0Var.p) {
            try {
                Integer num = (Integer) ef0Var.p.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != ef0Var.F()) {
                    ef0Var.H();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl
    public CameraCharacteristics unwrap() {
        return (CameraCharacteristics) this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        switch (this.a) {
            case 21:
                ti2 ti2Var = (ti2) this.b;
                String message = th.getMessage();
                synchronized (ti2Var) {
                    ti2Var.i(new q43(message, 9));
                }
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((pg2) this.b).f.zzm(false);
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        switch (this.a) {
            case 21:
                ti2 ti2Var = (ti2) this.b;
                zzbj zzbjVar = (zzbj) obj;
                synchronized (ti2Var) {
                    ti2Var.i(new ca2(zzbjVar, 12));
                }
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((pg2) this.b).f.zzm(true);
                return;
            default:
                ((ch2) this.b).a.zza();
                return;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward() {
        try {
            ((zzbtz) this.b).zzz();
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoUnmute() {
    }

    private final void e(Throwable th) {
    }

    @Override // com.journeyapps.barcodescanner.BarcodeCallback
    public void possibleResultPoints(List list) {
    }

    @Override // com.google.gson.JsonSerializationContext
    public JsonElement serialize(Object obj, Type type) {
        Gson gson = ((TreeTypeAdapter) this.b).c;
        gson.getClass();
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        gson.i(obj, type, jsonTreeWriter);
        return jsonTreeWriter.u();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public /* bridge */ /* synthetic */ Object zza() {
        return new gx1(((yw1) this.b).b);
    }

    @Override // com.google.android.gms.internal.ads.zzckv
    public void zza(Uri uri) {
        zzcjw zzcjwVar = ((j3) this.b).n;
        if (zzcjwVar == null) {
            zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzcjwVar.zzQ(uri);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public zzbc zza() {
        return (zzbc) ((zzdm) this.b).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcer, com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public void mo3zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 23:
                zzbsl zzbslVar = (zzbsl) obj2;
                zzbslVar.getClass();
                if (((zzbrg) obj).zzk()) {
                    zzbslVar.i = 1;
                }
                break;
            default:
                zze.zza("Getting a new session for JS Engine.");
                ((zzbsf) obj2).a.a(((zzbrg) obj).zzl());
                break;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public /* synthetic */ ListenableFuture zza() {
        return ((zzau) this.b).zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public /* synthetic */ void zza(boolean z, long j) {
        zzcfu zzcfuVar = ((zzcit) this.b).l;
        if (zzcfuVar != null) {
            zzcfuVar.zzr(z, j);
        }
    }

    public jx2(Context context) {
        this.a = 0;
        mo2 mo2Var = mo2.d;
        if (mo2Var == null) {
            mo2Var = new mo2(context);
            mo2.d = mo2Var;
        }
        this.b = mo2Var;
    }

    public jx2(zzbsk zzbskVar, zzbsf zzbsfVar) {
        this.a = 24;
        this.b = zzbsfVar;
        Objects.requireNonNull(zzbskVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public void onAdFailedToShow(String str) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("Mediated ad failed to show: ");
            sb.append(str);
            zzo.zzi(sb.toString());
            ((zzbtz) this.b).zzv(str);
        } catch (RemoteException unused) {
        }
    }

    public /* synthetic */ jx2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public jx2(Quirks quirks) {
        this.a = 9;
        this.b = new JpegMetadataCorrector(quirks);
    }

    public jx2(Field field) {
        this.a = 13;
        this.b = field;
        field.setAccessible(true);
    }

    public jx2(d dVar, String str) {
        this.a = 5;
        this.b = dVar;
    }

    public jx2() {
        this.a = 1;
        this.b = new HashMap();
    }

    @Override // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        boolean fitsSystemWindows;
        boolean fitsSystemWindows2;
        boolean fitsSystemWindows3;
        og0 og0VarG = windowInsetsCompat.a.g(519);
        NavigationRailView navigationRailView = (NavigationRailView) this.b;
        Boolean bool = navigationRailView.i;
        if (bool != null) {
            fitsSystemWindows = bool.booleanValue();
        } else {
            WeakHashMap weakHashMap = h.a;
            fitsSystemWindows = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows) {
            viewUtils$RelativePadding.b += og0VarG.b;
        }
        Boolean bool2 = navigationRailView.j;
        if (bool2 != null) {
            fitsSystemWindows2 = bool2.booleanValue();
        } else {
            WeakHashMap weakHashMap2 = h.a;
            fitsSystemWindows2 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows2) {
            viewUtils$RelativePadding.d += og0VarG.d;
        }
        Boolean bool3 = navigationRailView.k;
        if (bool3 != null) {
            fitsSystemWindows3 = bool3.booleanValue();
        } else {
            WeakHashMap weakHashMap3 = h.a;
            fitsSystemWindows3 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows3) {
            viewUtils$RelativePadding.a += wo1.f(view) ? og0VarG.c : og0VarG.a;
        }
        int i = viewUtils$RelativePadding.a;
        int i2 = viewUtils$RelativePadding.b;
        int i3 = viewUtils$RelativePadding.c;
        int i4 = viewUtils$RelativePadding.d;
        WeakHashMap weakHashMap4 = h.a;
        view.setPaddingRelative(i, i2, i3, i4);
        return windowInsetsCompat;
    }
}
