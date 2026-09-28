package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.view.m;
import androidx.camera.view.n;
import androidx.collection.ArrayMap;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.h;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zze;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.k4;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcig;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdpc;
import com.google.android.gms.internal.ads.zzdpu;
import com.google.android.gms.internal.ads.zzdqc;
import com.google.android.gms.internal.ads.zzdqe;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzgw;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzha;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import junit.extensions.TestSetup;
import junit.framework.Protectable;
import junit.framework.TestResult;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i31 implements FutureCallback, Protectable, OnApplyWindowInsetsListener, OnCompleteListener, zzast, BaseGmsClient$BaseOnConnectionFailedListener, zzasc, BaseGmsClient$BaseConnectionCallbacks, zzcep, MediationAdLoadCallback, zzgzl, zzha, zzfil, zze, zzbkf, zzclh, NativeAd.OnNativeAdLoadedListener {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public i31(gd2 gd2Var, Context context, String str) {
        this.a = 17;
        te3 te3VarA = te3.a(context);
        se3 se3Var = gd2Var.K0;
        k4 k4Var = new k4(te3VarA, se3Var, gd2Var.L0, 1);
        se3 se3VarA = se3.a(new bs2(se3Var, 9));
        se3 se3VarA2 = se3.a(bu2.a);
        se3 se3Var2 = gd2Var.d;
        te3 te3Var = gd2Var.H;
        int i = du2.a;
        se3 se3VarA3 = se3.a(new we2(te3VarA, se3Var2, te3Var, k4Var, se3VarA, se3VarA2));
        this.b = se3.a(new ha2(se3VarA3, se3VarA, se3VarA2, 27));
        this.c = se3.a(new xj2(te3.b(str), se3VarA3, te3VarA, se3VarA, se3VarA2, gd2Var.j, gd2Var.I, gd2Var.l));
    }

    public void b(tt2 tt2Var) {
        c("aai", tt2Var.w);
        c("request_id", tt2Var.n0);
        c("ad_format", tt2.a(tt2Var.b));
    }

    public void c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.b).put(str, str2);
    }

    public void d() {
        ((zzdxz) this.c).b.execute(new em2(this, 2));
    }

    public zzt e() {
        if (!((Boolean) zzbd.zzc().a(p32.Jf)).booleanValue()) {
            d();
            return zzt.SUCCESS;
        }
        zzdxz zzdxzVar = (zzdxz) this.c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        zzdye zzdyeVar = zzdxzVar.a;
        zzdyeVar.getClass();
        if (concurrentHashMap.isEmpty()) {
            zzo.zzd("Empty paramMap.");
            return zzt.SUCCESS;
        }
        String strGenerateUrl = zzdyeVar.f.generateUrl(concurrentHashMap);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        return zzdyeVar.d.zzc(strGenerateUrl, null);
    }

    public void f() {
        ((zzdxz) this.c).b.execute(new em2(this, 0));
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 4:
                ViewPager viewPager = (ViewPager) obj;
                WindowInsetsCompat windowInsetsCompatK = h.k(view, windowInsetsCompat);
                if (windowInsetsCompatK.a.o()) {
                    return windowInsetsCompatK;
                }
                Rect rect = (Rect) this.b;
                rect.left = windowInsetsCompatK.b();
                rect.top = windowInsetsCompatK.d();
                rect.right = windowInsetsCompatK.c();
                rect.bottom = windowInsetsCompatK.a();
                int childCount = viewPager.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    WindowInsetsCompat windowInsetsCompatB = h.b(viewPager.getChildAt(i2), windowInsetsCompatK);
                    rect.left = Math.min(windowInsetsCompatB.b(), rect.left);
                    rect.top = Math.min(windowInsetsCompatB.d(), rect.top);
                    rect.right = Math.min(windowInsetsCompatB.c(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatB.a(), rect.bottom);
                }
                int i3 = rect.left;
                int i4 = rect.top;
                int i5 = rect.right;
                int i6 = rect.bottom;
                WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompatK);
                og0 og0VarC = og0.c(i3, i4, i5, i6);
                oq1 oq1Var = builder.a;
                oq1Var.g(og0VarC);
                return oq1Var.b();
            default:
                return ((ViewUtils$OnApplyWindowInsetsListener) this.b).onApplyWindowInsets(view, windowInsetsCompat, new ViewUtils$RelativePadding((ViewUtils$RelativePadding) obj));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((zaad) this.c).b.remove((TaskCompletionSource) this.b);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnected(Bundle bundle) {
        try {
            ((zzcen) this.b).a((r62) ((zzbqf) this.c).a.getService());
        } catch (DeadObjectException e) {
            ((zzcen) this.b).b(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (((l00) this.c).c) {
            ((w12) this.b).b(new RuntimeException("Connection failed."));
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        ((zzcen) this.b).b(new RuntimeException(vh.i(i, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i).length() + 23))));
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 1:
                int i = ((SurfaceEdge) this.b).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    km0.a("SurfaceProcessorNode");
                    return;
                } else {
                    "Downstream node failed to provide Surface. Target: ".concat(xg0.i(i));
                    km0.h("SurfaceProcessorNode");
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
        ((qn2) this.b).b(nativeAd, (String) this.c);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /* JADX INFO: renamed from: onSuccess, reason: collision with other method in class */
    public void mo18onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
                surfaceOutput.getClass();
                try {
                    ((SurfaceProcessorNode) obj2).a.onOutputSurface(surfaceOutput);
                } catch (ProcessingException unused) {
                    km0.c("SurfaceProcessorNode");
                    return;
                }
                break;
            default:
                jx0.g("Unexpected result from SurfaceRequest. Surface was provided twice.", ((wc) obj).a != 3);
                km0.a("TextureViewImpl");
                ((SurfaceTexture) this.b).release();
                n nVar = ((m) obj2).a;
                if (nVar.j != null) {
                    nVar.j = null;
                }
                break;
        }
    }

    @Override // junit.framework.Protectable
    public void protect() {
        ((TestSetup) this.c).f0((TestResult) this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzclh
    public /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 23:
                zzdpu zzdpuVar = (zzdpu) this.b;
                HashMap map = new HashMap();
                map.put("messageType", "htmlLoaded");
                map.put("id", (String) ((Map) obj).get("id"));
                zzdpuVar.b.d(map);
                break;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                zzdqc zzdqcVar = (zzdqc) this.b;
                HashMap map2 = new HashMap();
                map2.put("messageType", "validatorHtmlLoaded");
                map2.put("id", (String) ((Map) obj).get("id"));
                zzdqcVar.b.d(map2);
                break;
            default:
                zzcen zzcenVar = (zzcen) obj;
                if (!z) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Ad Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    zzcenVar.b(new Exception(vh.s(sb, ", Failing URL: ", str2)));
                } else {
                    if (((Boolean) zzbd.zzc().a(p32.N2)).booleanValue()) {
                        ec1.R(zzdxh.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), (Bundle) this.b);
                    }
                    zzcenVar.a(null);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 14:
                ((zzcer) this.b).mo3zza(obj);
                break;
            case 18:
                df2 df2Var = (df2) obj2;
                List listA = df2Var.a();
                dh2 dh2Var = df2Var.o;
                zzcdv zzcdvVar = df2Var.s;
                df2Var.h.a(df2Var.g.b(df2Var.e, df2Var.f, false, (String) this.b, (String) obj, listA, dh2Var, zzcdvVar), df2Var.n);
                break;
            case 21:
                zzdoc zzdocVar = (zzdoc) obj2;
                View view = (View) this.b;
                gp2 gp2Var = (gp2) obj;
                zzcjl zzcjlVarK = zzdocVar.m.k();
                if (zzdocVar.p.c() && gp2Var != null && zzcjlVarK != null && view != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(gp2Var.a, view);
                    break;
                }
                break;
            default:
                zzdxh zzdxhVar = (zzdxh) this.b;
                ec1.R(zzdxhVar.zza(), ((kk2) obj2).d.e);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public JSONObject zzc() {
        return ((zzdqe) this.b).zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public JSONObject zzd() {
        return ((zzdqe) this.b).zzq();
    }

    private final void a(Throwable th) {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((zzbvg) this.b).zzg(adError.zza());
        } catch (RemoteException e) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public Object onSuccess(Object obj) {
        zzbvg zzbvgVar = (zzbvg) this.b;
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd == null) {
            zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                zzbvgVar.zzf("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                return null;
            }
        }
        try {
            zzbvgVar.zze(new a(mediationBannerAd.getView()));
        } catch (RemoteException e2) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
        }
        return new jx2((zzbtz) this.c, 25);
    }

    public i31(Context context) {
        this.a = 7;
        this.c = context;
        this.b = null;
    }

    public /* synthetic */ i31(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ i31(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public i31(gd2 gd2Var, Context context, ta2 ta2Var) {
        this.a = 29;
        this.b = gd2Var;
        this.c = context;
    }

    public i31(zzdxz zzdxzVar) {
        this.a = 27;
        this.c = zzdxzVar;
        this.b = new ConcurrentHashMap();
    }

    public /* synthetic */ i31(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public i31(ExecutorService executorService) {
        this.a = 0;
        this.c = new ArrayMap();
        this.b = executorService;
    }

    public i31(ViewPager viewPager) {
        this.a = 4;
        this.c = viewPager;
        this.b = new Rect();
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public void zzb(MotionEvent motionEvent) {
        ((zzdqe) this.b).onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public zzfii zzb() {
        return (zzfii) ((se3) this.c).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public zzfio zza() {
        return (zzfio) ((se3) this.b).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public /* synthetic */ zzhb mo19zza() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 15:
                zzcit zzcitVar = (zzcit) this.b;
                zzhb zzhbVarMo19zza = ((zzha) obj).mo19zza();
                jx2 jx2Var = new jx2(zzcitVar, 26);
                return new zzcig(zzcitVar.c, zzhbVarMo19zza, zzcitVar.p, zzcitVar.q, zzcitVar, jx2Var);
            default:
                int i2 = zzcit.w;
                byte[] bArr = (byte[]) obj;
                return new pb2(new zzgw(bArr), bArr.length, ((zzha) this.b).mo19zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzast
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public File mo20zza() {
        File file = (File) this.b;
        if (file != null) {
            return file;
        }
        File file2 = new File(((Context) this.c).getCacheDir(), "volley");
        this.b = file2;
        return file2;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo21zza() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 11:
                com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
                ((zzcen) this.b).b(new zzbso("Unable to obtain a JavascriptEngine."));
                ((zzbsf) obj).d();
                break;
            default:
                zzguf zzgufVar = zzdpc.o;
                zzdqe zzdqeVar = (zzdqe) this.b;
                Map mapZzk = zzdqeVar.zzk();
                if (mapZzk != null) {
                    int size = zzgufVar.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = mapZzk.get((String) zzgufVar.get(i2));
                        i2++;
                        if (obj2 != null) {
                            zzdqeVar.onClick((ViewGroup) obj);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public void zza(zzash zzashVar) {
        String str = (String) this.b;
        String string = zzashVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        zzo.zzi(sb.toString());
        ((s32) this.c).a(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 14:
                ((zzcep) obj).mo21zza();
                break;
            case 18:
                df2 df2Var = (df2) obj;
                df2Var.h.a(df2Var.g.b(df2Var.e, df2Var.f, false, (String) this.b, null, df2Var.a(), df2Var.o, df2Var.s), null);
                break;
            case 21:
                if (((Boolean) zzbd.zzc().a(p32.r6)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().g(th, "omid native display exp");
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public /* synthetic */ zzt zza(String str) {
        new l92((zzf) this.b, (Context) this.c, str).start();
        return zzt.SUCCESS;
    }
}
