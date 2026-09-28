package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewOverlay;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.h;
import androidx.core.view.r;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfwx;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.common.base.Function;
import com.google.common.collect.Maps$EntryTransformer;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.DecoderThread;
import com.journeyapps.barcodescanner.RotationCallback;
import com.journeyapps.barcodescanner.SourceData;
import com.journeyapps.barcodescanner.camera.PreviewCallback;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.DesugarCollections;
import java.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import junit.framework.Protectable;
import junit.framework.TestCase;
import kotlin.jvm.functions.Function1;
import me.ibrahimsn.lib.OnItemSelectedListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rb0 implements OnApplyWindowInsetsListener, ViewUtils$OnApplyWindowInsetsListener, RotationCallback, PreviewCallback, FutureCallback, ShadowViewDelegate, DataEncoder, Maps$EntryTransformer, OnItemSelectedListener, Protectable, ViewOverlayImpl, BaseGmsClient$SignOutCallbacks, OnSuccessListener, zzgzl, zzajb, zzast, zzfwx, BaseGmsClient$BaseOnConnectionFailedListener, zzcli, zzcep, SignalCallbacks {
    public static volatile rb0 c;
    public final /* synthetic */ int a;
    public final Object b;

    public rb0(View view) {
        this.a = 17;
        this.b = view.getOverlay();
    }

    public Set a() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return setUnmodifiableSet;
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable) {
        ((ViewOverlay) this.b).add(drawable);
    }

    @Override // com.google.firebase.encoders.DataEncoder
    public void encode(Object obj, Writer writer) throws IOException {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = (JsonDataEncoderBuilder) this.b;
        cj0 cj0Var = new cj0(writer, jsonDataEncoderBuilder.a, jsonDataEncoderBuilder.b, jsonDataEncoderBuilder.c, jsonDataEncoderBuilder.d);
        cj0Var.b(obj, false);
        cj0Var.c();
        cj0Var.c.flush();
    }

    @Override // com.google.android.material.shadow.ShadowViewDelegate
    public float getRadius() {
        return ((FloatingActionButton) this.b).getSizeDimension() / 2.0f;
    }

    @Override // com.google.android.material.shadow.ShadowViewDelegate
    public boolean isCompatPaddingEnabled() {
        return ((FloatingActionButton) this.b).k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                WeakHashMap weakHashMap = h.a;
                WindowInsetsCompat windowInsetsCompat2 = appBarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
                if (!Objects.equals(appBarLayout.g, windowInsetsCompat2)) {
                    appBarLayout.g = windowInsetsCompat2;
                    if (appBarLayout.v != null && appBarLayout.getTopInset() > 0) {
                        i2 = 1;
                    }
                    appBarLayout.setWillNotDraw(i2 ^ 1);
                    appBarLayout.requestLayout();
                }
                return windowInsetsCompat;
            case 4:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.n, windowInsetsCompat)) {
                    coordinatorLayout.n = windowInsetsCompat;
                    boolean z = windowInsetsCompat != null && windowInsetsCompat.d() > 0;
                    coordinatorLayout.o = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!windowInsetsCompat.a.o()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i2 < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i2);
                            WeakHashMap weakHashMap2 = h.a;
                            if (!childAt.getFitsSystemWindows() || ((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).a == null || !windowInsetsCompat.a.o()) {
                                i2++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return windowInsetsCompat;
            default:
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = (ScrimInsetsFrameLayout) obj;
                Rect rect = scrimInsetsFrameLayout.b;
                if (rect == null) {
                    rect = new Rect();
                    scrimInsetsFrameLayout.b = rect;
                }
                int iB = windowInsetsCompat.b();
                r rVar = windowInsetsCompat.a;
                rect.set(iB, windowInsetsCompat.d(), windowInsetsCompat.c(), windowInsetsCompat.a());
                scrimInsetsFrameLayout.a(windowInsetsCompat);
                if (!rVar.l().equals(og0.e) && scrimInsetsFrameLayout.a != null) {
                    z = false;
                }
                scrimInsetsFrameLayout.setWillNotDraw(z);
                WeakHashMap weakHashMap3 = h.a;
                scrimInsetsFrameLayout.postInvalidateOnAnimation();
                return rVar.c();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzbfl zzbflVar = (zzbfl) this.b;
        synchronized (zzbflVar.c) {
            try {
                zzbflVar.f = null;
                if (zzbflVar.d != null) {
                    zzbflVar.d = null;
                }
                zzbflVar.c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 6:
                boolean z = th instanceof MediaCodec.CodecException;
                EncoderImpl encoderImpl = (EncoderImpl) ((jx2) obj).b;
                if (!z) {
                    encoderImpl.b(0, th.getMessage(), th);
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    encoderImpl.b(1, codecException.getMessage(), codecException);
                }
                break;
            case 8:
                ((b) obj).d(th);
                break;
            case 9:
                ((bf0) obj).close();
                break;
        }
    }

    @Override // me.ibrahimsn.lib.OnItemSelectedListener
    public boolean onItemSelect(int i) {
        ((Function1) this.b).invoke(Integer.valueOf(i));
        return true;
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewCallback
    public void onPreview(SourceData sourceData) {
        synchronized (((DecoderThread) this.b).h) {
            try {
                DecoderThread decoderThread = (DecoderThread) this.b;
                if (decoderThread.g) {
                    decoderThread.c.obtainMessage(R.id.zxing_decode, sourceData).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewCallback
    public void onPreviewError(Exception exc) {
        synchronized (((DecoderThread) this.b).h) {
            try {
                DecoderThread decoderThread = (DecoderThread) this.b;
                if (decoderThread.g) {
                    decoderThread.c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.journeyapps.barcodescanner.RotationCallback
    public void onRotationChanged(int i) {
        ((CameraPreview) this.b).c.postDelayed(new w2(this, 10), 250L);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks
    public void onSignOutComplete() {
        ((zabq) this.b).m.n.post(new ws1(this));
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /* JADX INFO: renamed from: onSuccess */
    public void mo18onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 6:
                break;
            case 8:
                b bVar = (b) obj2;
                try {
                    bVar.b(obj);
                } catch (Throwable th) {
                    bVar.d(th);
                    return;
                }
                break;
            case 9:
                break;
            case 15:
                ((Runnable) obj2).run();
                break;
            default:
                ((ic3) obj2).onCanceled();
                break;
        }
    }

    @Override // junit.framework.Protectable
    public void protect() throws Throwable {
        try {
            ((TestCase) this.b).f0();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (th != null) {
            throw th;
        }
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable) {
        ((ViewOverlay) this.b).remove(drawable);
    }

    @Override // com.google.android.material.shadow.ShadowViewDelegate
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.google.android.material.shadow.ShadowViewDelegate
    public void setShadowPadding(int i, int i2, int i3, int i4) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.b;
        floatingActionButton.l.set(i, i2, i3, i4);
        int i5 = floatingActionButton.i;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    @Override // com.google.common.collect.Maps$EntryTransformer
    public Object transformEntry(Object obj, Object obj2) {
        return ((Function) this.b).apply(obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzt.zzh().f("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        zzau zzauVar = (zzau) this.b;
        zzaa.zze(zzauVar.zzA(), null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
        zzo.zzg("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) zzbd.zzc().a(p32.gb)).booleanValue() || zzauVar.zzN().get() || zzauVar.zzO().getAndIncrement() >= ((Integer) zzbd.zzc().a(p32.hb)).intValue()) {
            return;
        }
        zzauVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo5zzb(Object obj) {
        zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzbd.zzc().a(p32.gb)).booleanValue()) {
            zzau zzauVar = (zzau) this.b;
            zzaa.zze(zzauVar.zzA(), null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzauVar.zzO().get())));
            zzauVar.zzN().set(true);
        }
    }

    public /* synthetic */ rb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public rb0(zzbsf zzbsfVar) {
        this.a = 27;
        Objects.requireNonNull(zzbsfVar);
        this.b = zzbsfVar;
    }

    public /* synthetic */ rb0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public rb0() {
        this.a = 0;
        this.b = new HashSet();
    }

    private final void b(Throwable th) {
    }

    @Override // com.google.firebase.encoders.DataEncoder
    public String encode(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            encode(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onSuccess(String str) {
        try {
            ((zzbvv) this.b).zze(str);
        } catch (RemoteException e) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(String str) {
        try {
            ((zzbvv) this.b).zzf(str);
        } catch (RemoteException e) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(AdError adError) {
        try {
            ((zzbvv) this.b).zzg(adError.zza());
        } catch (RemoteException e) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcep
    /* JADX INFO: renamed from: zza */
    public void mo21zza() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                ((zzbrf) obj).zza();
                break;
            case 27:
                ((zzbsf) obj).d.e();
                break;
            default:
                ((zzcen) obj).b(new zzbso("Cannot get Javascript Engine"));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzast
    /* JADX INFO: renamed from: zza */
    public File mo20zza() {
        return (File) this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public boolean zza(File file) {
        try {
            return ((zzfvc) this.b).a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        boolean z;
        BottomAppBar bottomAppBar = (BottomAppBar) this.b;
        if (bottomAppBar.j0) {
            bottomAppBar.p0 = windowInsetsCompat.a();
        }
        boolean z2 = false;
        if (bottomAppBar.k0) {
            z = bottomAppBar.r0 != windowInsetsCompat.b();
            bottomAppBar.r0 = windowInsetsCompat.b();
        } else {
            z = false;
        }
        if (bottomAppBar.l0) {
            boolean z3 = bottomAppBar.q0 != windowInsetsCompat.c();
            bottomAppBar.q0 = windowInsetsCompat.c();
            z2 = z3;
        }
        if (!z && !z2) {
            return windowInsetsCompat;
        }
        AnimatorSet animatorSet = bottomAppBar.a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.W;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.H();
        bottomAppBar.G();
        return windowInsetsCompat;
    }
}
