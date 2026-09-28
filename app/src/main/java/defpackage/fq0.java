package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.SessionConfig$CloseableErrorListener;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcss;
import com.google.android.gms.internal.ads.zzcxl;
import com.google.android.gms.internal.ads.zzczm;
import com.google.android.gms.internal.ads.zzdal;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdyo;
import com.google.android.gms.internal.ads.zzepw;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfnm;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import io.github.g00fy2.quickie.QROverlayView;
import java.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fq0 implements ViewBinding, zzdlt, zzg {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ fq0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = r43.e;
    }

    public v61 a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig$Builder sessionConfig$BuilderE = SessionConfig$Builder.e((eq0) this.c, size);
        sessionConfig$BuilderE.b.c = 1;
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.a = immediateSurface;
        xg0.a(xg0.p(immediateSurface.e), new y6(23, surface, surfaceTexture), fy.b());
        sessionConfig$BuilderE.c((ImmediateSurface) this.a, DynamicRange.d, -1);
        SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener = (SessionConfig$CloseableErrorListener) this.f;
        if (sessionConfig$CloseableErrorListener != null) {
            sessionConfig$CloseableErrorListener.a();
        }
        SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener2 = new SessionConfig$CloseableErrorListener(new ve0(this, 2));
        this.f = sessionConfig$CloseableErrorListener2;
        sessionConfig$BuilderE.f = sessionConfig$CloseableErrorListener2;
        return sessionConfig$BuilderE.d();
    }

    public /* synthetic */ String b() {
        String str = (String) zzbd.zzc().a(p32.vb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.a);
            jSONObject.put("eventCategory", (String) this.b);
            jSONObject.putOpt("event", (String) this.c);
            jSONObject.putOpt("errorCode", (Integer) this.d);
            jSONObject.putOpt("rewardType", (String) this.e);
            jSONObject.putOpt("rewardAmount", (Integer) this.f);
        } catch (JSONException unused) {
            zzo.zzi("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return hz.x(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public void c(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public fq0 d(zzfmu zzfmuVar) {
        return f(new t62(zzfmuVar, 13));
    }

    public void e(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public fq0 f(zzgyw zzgywVar) {
        zzfnm zzfnmVar = (zzfnm) this.f;
        zzgzy zzgzyVar = zzfnmVar.a;
        return new fq0(zzfnmVar, this.a, (String) this.b, (ListenableFuture) this.c, (List) this.d, z.Z((ListenableFuture) this.e, zzgywVar, zzgzyVar));
    }

    public void g(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return (QROverlayView) this.a;
    }

    public void h(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    public s43 i() throws GeneralSecurityException {
        if (((Integer) this.a) == null) {
            zg1.m("AES key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            zg1.m("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            zg1.m("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.d;
        if (num == null) {
            zg1.m("tag size is not set");
            return null;
        }
        if (((q43) this.e) == null) {
            zg1.m("hash type is not set");
            return null;
        }
        int iIntValue = num.intValue();
        q43 q43Var = (q43) this.e;
        if (q43Var == q43.c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (q43Var == q43.d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (q43Var == q43.e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (q43Var == q43.f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (q43Var != q43.g) {
                zg1.m("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new s43(((Integer) this.a).intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (r43) this.f, (q43) this.e);
    }

    public fq0 j(long j) {
        zzfnm zzfnmVar = (zzfnm) this.f;
        ScheduledExecutorService scheduledExecutorService = zzfnmVar.b;
        return new fq0(zzfnmVar, this.a, (String) this.b, (ListenableFuture) this.c, (List) this.d, z.T((ListenableFuture) this.e, j, TimeUnit.SECONDS, scheduledExecutorService));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzfnb k() {
        zzfnm zzfnmVar = (zzfnm) this.f;
        Object obj = this.a;
        String strB = (String) this.b;
        if (strB == null) {
            strB = zzfnmVar.b(obj);
        }
        zzfnb zzfnbVar = new zzfnb(obj, strB, (ListenableFuture) this.e);
        zzfnmVar.c.zza(zzfnbVar);
        ListenableFuture listenableFuture = (ListenableFuture) this.c;
        wn2 wn2Var = new wn2(8, this, zzfnbVar);
        ta2 ta2Var = g3.g;
        listenableFuture.addListener(wn2Var, ta2Var);
        zzfnbVar.addListener(new s33(0 == true ? 1 : 0, zzfnbVar, new mo2(this, 7, zzfnbVar, false)), ta2Var);
        return zzfnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt, com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzdlu zzh() {
        k02.M(ji2.class, (ji2) this.d);
        k02.M(oh2.class, (oh2) this.e);
        k02.M(zzepw.class, (zzepw) this.f);
        new zzcxl();
        new zzfkq();
        new zzczm();
        return new rd2((gd2) this.a, new zzdyo(), (ji2) this.d, (oh2) this.e, new jq2(), (zzepw) this.f, (zzfgn) this.b, (zzffr) this.c);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        if (((AtomicBoolean) this.f).get()) {
            ((zzdbd) this.a).onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
        if (((AtomicBoolean) this.f).get()) {
            ((zzdbx) this.b).zza();
            zzdjo zzdjoVar = (zzdjo) this.c;
            synchronized (zzdjoVar) {
                zzdjoVar.i(pi2.e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public /* bridge */ /* synthetic */ zzdlt zzd(zzepw zzepwVar) {
        this.f = zzepwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public /* bridge */ /* synthetic */ zzdlt zze(oh2 oh2Var) {
        this.e = oh2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public /* bridge */ /* synthetic */ zzdlt zzf(ji2 ji2Var) {
        this.d = ji2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt, com.google.android.gms.internal.ads.zzdal
    public /* synthetic */ zzdal zzi(zzffr zzffrVar) {
        this.c = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt, com.google.android.gms.internal.ads.zzdal
    public /* synthetic */ zzdal zzj(zzfgn zzfgnVar) {
        this.b = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public /* synthetic */ zzdlt zzb(zzffr zzffrVar) {
        this.c = zzffrVar;
        return this;
    }

    public /* synthetic */ fq0(String str) {
        this.b = str;
    }

    public fq0(zzfnm zzfnmVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(zzfnmVar);
        this.f = zzfnmVar;
        this.a = obj;
        this.b = str;
        this.c = listenableFuture;
        this.d = list;
        this.e = listenableFuture2;
    }

    @Override // com.google.android.gms.internal.ads.zzdlt
    public /* synthetic */ zzdlt zzc(zzfgn zzfgnVar) {
        this.b = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zza(View view) {
        if (((AtomicBoolean) this.f).compareAndSet(false, true)) {
            ((zzcss) this.e).zzdr();
            ((zzdjg) this.d).j(view);
        }
    }
}
