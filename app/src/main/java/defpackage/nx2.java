package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.j;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.h;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzado;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzafh;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbqk;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzdbi;
import com.google.android.gms.internal.ads.zzdbj;
import com.google.android.gms.internal.ads.zzddw;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzgp;
import com.google.android.gms.internal.ads.zzgw;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzha;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzmk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.b;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.e;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import me.ibrahimsn.lib.OnItemReselectedListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class nx2 implements TransformationCallback, CameraConfig, OnApplyWindowInsetsListener, SuccessContinuation, AsyncFunction, FutureCallback, Function, DifferentialMotionFlingTarget, ProfileInstaller$DiagnosticsCallback, OnItemReselectedListener, OnCompleteListener, ListenerHolder$Notifier, BaseGmsClient$BaseOnConnectionFailedListener, zzado, zzaed, zzgp, zzfwf, BaseGmsClient$BaseConnectionCallbacks, InitializationCompleteCallback, zzha, zzgzl, zzdhc {
    public static nx2 c;
    public final /* synthetic */ int a;
    public final Object b;

    public nx2(Context context) {
        this.a = 0;
        mo2 mo2Var = mo2.d;
        if (mo2Var == null) {
            mo2Var = new mo2(context);
            mo2.d = mo2Var;
        }
        this.b = mo2Var;
        jx2.d(context);
    }

    public static final nx2 c(Context context) {
        nx2 nx2Var;
        synchronized (nx2.class) {
            try {
                nx2Var = c;
                if (nx2Var == null) {
                    nx2Var = new nx2(context);
                    c = nx2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nx2Var;
    }

    public void a() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // com.google.common.base.Function, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        rb0 rb0Var = (rb0) this.b;
        entry.getClass();
        return new hn0(entry, rb0Var);
    }

    public void b() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new df(2, viewFindViewById));
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ boolean containsOption(jq jqVar) {
        return hz.a(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        hz.b(this, str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public Identifier getCompatibilityId() {
        return (mb) this.b;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return l.c;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Config.OptionPriority getOptionPriority(jq jqVar) {
        return hz.d(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set getPriorities(jq jqVar) {
        return hz.e(this, jqVar);
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public float getScaledScrollFactor() {
        return -((NestedScrollView) this.b).getVerticalScrollFactorCompat();
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor) {
        return (SessionProcessor) retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public int getUseCaseCombinationRequiredRule() {
        return ((Integer) retrieveOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public UseCaseConfigFactory getUseCaseConfigFactory() {
        return (UseCaseConfigFactory) retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public boolean isCaptureProcessProgressSupported() {
        return ((Boolean) retrieveOption(CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public boolean isPostviewSupported() {
        return ((Boolean) retrieveOption(CameraConfig.OPTION_POSTVIEW_SUPPORTED, Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Set listOptions() {
        return hz.g(this);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((InstallStatusListener) obj).onInstallStatusUpdated((ModuleInstallStatusUpdate) this.b);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.b;
        WeakHashMap weakHashMap = h.a;
        WindowInsetsCompat windowInsetsCompat2 = collapsingToolbarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
        if (!Objects.equals(collapsingToolbarLayout.A, windowInsetsCompat2)) {
            collapsingToolbarLayout.A = windowInsetsCompat2;
            collapsingToolbarLayout.requestLayout();
        }
        return windowInsetsCompat.a.c();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.b;
        Exception excH = task.h();
        if (excH != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m36constructorimpl(new Result.Failure(excH)));
        } else if (task.k()) {
            cancellableContinuationImpl.cancel(null);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m36constructorimpl(task.i()));
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnected(Bundle bundle) {
        t12 t12Var;
        zzbfl zzbflVar = (zzbfl) this.b;
        synchronized (zzbflVar.c) {
            try {
                t12Var = zzbflVar.d;
            } catch (DeadObjectException e) {
                zzo.zzg("Unable to obtain a cache service instance.", e);
                ((zzbfl) this.b).d();
            }
            if (t12Var != null) {
                zzbflVar.f = (v12) t12Var.getService();
                ((zzbfl) this.b).c.notifyAll();
            } else {
                ((zzbfl) this.b).c.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        ((OnConnectionFailedListener) this.b).onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        zzbfl zzbflVar = (zzbfl) this.b;
        synchronized (zzbflVar.c) {
            zzbflVar.f = null;
            zzbflVar.c.notifyAll();
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                ((ImageProxy) obj).close();
                break;
            default:
                km0.h("VideoEncoderSession");
                ((j) obj).b();
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationFailed(String str) {
        try {
            ((zzbqk) this.b).zzf(str);
        } catch (RemoteException e) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationSucceeded() {
        try {
            ((zzbqk) this.b).zze();
        } catch (RemoteException e) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // me.ibrahimsn.lib.OnItemReselectedListener
    public void onItemReselect(int i) {
        ((Function1) this.b).invoke(Integer.valueOf(i));
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onResultReceived(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override // com.google.android.material.animation.TransformationCallback
    public void onScaleChanged(View view) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        BottomAppBar bottomAppBar = (BottomAppBar) this.b;
        bottomAppBar.V.n((floatingActionButton.getVisibility() == 0 && bottomAppBar.d0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /* JADX INFO: renamed from: onSuccess */
    public void mo18onSuccess(Object obj) {
        switch (this.a) {
            case 8:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.material.animation.TransformationCallback
    public void onTranslationChanged(View view) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        BottomAppBar bottomAppBar = (BottomAppBar) this.b;
        int i = bottomAppBar.d0;
        MaterialShapeDrawable materialShapeDrawable = bottomAppBar.V;
        if (i != 1) {
            return;
        }
        float translationX = floatingActionButton.getTranslationX();
        if (bottomAppBar.getTopEdgeTreatment().e != translationX) {
            bottomAppBar.getTopEdgeTreatment().e = translationX;
            materialShapeDrawable.invalidateSelf();
        }
        float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
        if (bottomAppBar.getTopEdgeTreatment().d != fMax) {
            bottomAppBar.getTopEdgeTreatment().c(fMax);
            materialShapeDrawable.invalidateSelf();
        }
        materialShapeDrawable.n(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(jq jqVar) {
        return hz.h(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOptionWithPriority(jq jqVar, Config.OptionPriority optionPriority) {
        return hz.j(this, jqVar, optionPriority);
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public boolean startDifferentialMotionFling(float f) {
        if (f == 0.0f) {
            return false;
        }
        stopDifferentialMotionFling();
        ((NestedScrollView) this.b).d((int) f);
        return true;
    }

    @Override // androidx.core.view.DifferentialMotionFlingTarget
    public void stopDifferentialMotionFling() {
        ((NestedScrollView) this.b).d.abortAnimation();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Settings settings = (Settings) obj;
        y6 y6Var = (y6) this.b;
        if (settings == null) {
            Logger.b.a(5);
            return b.e(null);
        }
        e eVar = (e) y6Var.c;
        ds dsVar = e.r;
        eVar.f();
        eVar.m.f(null, eVar.e.a);
        eVar.q.d(null);
        return b.e(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 27:
                ((zzdbi) obj).zzdI((zze) obj2);
                break;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((zzdbj) obj).zzd((zzdmb) obj2);
                break;
            default:
                ((zzddw) obj).zzm((zzt) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public void zzb() {
        switch (this.a) {
            case 0:
                synchronized (nx2.class) {
                    mo2 mo2Var = (mo2) this.b;
                    mo2Var.l("vendor_scoped_gpid_v2_id");
                    mo2Var.l("vendor_scoped_gpid_v2_creation_time");
                    break;
                }
                return;
            default:
                g gVar = (g) this.b;
                Surface surface = gVar.Q0;
                if (surface != null) {
                    zzadl zzadlVar = gVar.D0;
                    Handler handler = zzadlVar.a;
                    if (handler != null) {
                        handler.post(new h4(zzadlVar, surface, SystemClock.elapsedRealtime()));
                    }
                    gVar.T0 = true;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public void zzc() {
        g gVar = (g) this.b;
        if (gVar.Q0 != null) {
            gVar.a0(0, 1);
        }
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public /* synthetic */ Object retrieveOption(jq jqVar, Object obj) {
        return hz.i(this, jqVar, obj);
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public SessionProcessor getSessionProcessor() {
        return (SessionProcessor) retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR);
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        return xg0.m(((androidx.arch.core.util.Function) this.b).apply(obj));
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public void onNotifyListenerFailed() {
    }

    public /* synthetic */ nx2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public nx2(zzbuu zzbuuVar, zzbqk zzbqkVar) {
        this.a = 24;
        this.b = zzbqkVar;
    }

    public nx2() {
        this.a = 3;
        this.b = new mb(new Object());
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public void zzd(zzbv zzbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzha
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ zzhb mo19zza() {
        int i = zzcit.w;
        return new zzgw((byte[]) this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    /* JADX INFO: renamed from: zza */
    public void mo17zza() {
        zzmk zzmkVar = ((g) this.b).H;
        if (zzmkVar != null) {
            zzmkVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public void zza(int i, long j) {
        ((zzfvh) this.b).b(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public /* synthetic */ void zza(long j, zzer zzerVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 20:
                w91.H(j, zzerVar, ((zzako) obj).I);
                break;
            default:
                w91.H(j, zzerVar, ((zzapq) obj).b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public long zza(long j) {
        zzafh zzafhVar = (zzafh) this.b;
        String str = wt2.a;
        return Math.max(0L, Math.min((j * ((long) zzafhVar.e)) / 1000000, zzafhVar.j - 1));
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        ((pg2) this.b).f.zzn(false);
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onDiagnosticReceived(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public void zzb(int i, long j, String str) {
        ((zzfvh) this.b).e(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public /* synthetic */ void mo5zzb(Object obj) {
        ((pg2) this.b).f.zzn(true);
    }
}
