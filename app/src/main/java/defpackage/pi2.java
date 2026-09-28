package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcwd;
import com.google.android.gms.internal.ads.zzdde;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdjd;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdjq;
import com.google.android.gms.internal.ads.zzegt;
import com.google.android.gms.internal.ads.zzegz;
import com.google.android.gms.internal.ads.zzffx;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgzl;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pi2 implements zzdhc, zzgzl, OnUserEarnedRewardListener, zzfmu, zzbsr, zzbss, zzcwd, zzffx, InitializationStatus {
    public final /* synthetic */ int a;
    public static final /* synthetic */ pi2 b = new pi2(0);
    public static final /* synthetic */ pi2 c = new pi2(1);
    public static final /* synthetic */ pi2 d = new pi2(2);
    public static final /* synthetic */ pi2 e = new pi2(3);
    public static final /* synthetic */ pi2 f = new pi2(4);
    public static final /* synthetic */ pi2 g = new pi2(5);
    public static final /* synthetic */ pi2 h = new pi2(6);
    public static final /* synthetic */ pi2 i = new pi2(7);
    public static final /* synthetic */ pi2 j = new pi2(8);
    public static final /* synthetic */ pi2 k = new pi2(9);
    public static final /* synthetic */ pi2 l = new pi2(10);
    public static final /* synthetic */ pi2 m = new pi2(12);
    public static final /* synthetic */ pi2 n = new pi2(13);
    public static final /* synthetic */ pi2 o = new pi2(14);
    public static final /* synthetic */ pi2 p = new pi2(15);
    public static final /* synthetic */ pi2 q = new pi2(17);
    public static final /* synthetic */ pi2 r = new pi2(18);
    public static final /* synthetic */ pi2 s = new pi2(19);
    public static final /* synthetic */ pi2 t = new pi2(21);
    public static final /* synthetic */ pi2 u = new pi2(22);
    public static final /* synthetic */ pi2 v = new pi2(23);
    public static final /* synthetic */ pi2 w = new pi2(24);
    public static final /* synthetic */ pi2 x = new pi2(25);
    public static final /* synthetic */ pi2 y = new pi2(27);
    public static final /* synthetic */ pi2 z = new pi2(28);
    public static final /* synthetic */ pi2 A = new pi2(29);

    public /* synthetic */ pi2(zzex zzexVar) {
        this.a = 20;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public Map getAdapterStatusMap() {
        HashMap map = new HashMap();
        map.put("com.google.android.gms.ads.MobileAds", new yq2());
        return map;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public /* synthetic */ void onUserEarnedReward(RewardItem rewardItem) {
        int i2 = this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public void mo3zza(Object obj) throws RemoteException {
        switch (this.a) {
            case 0:
                ((zzdjd) obj).zzi();
                break;
            case 1:
                ((zzdjm) obj).zzdQ();
                break;
            case 2:
                ((zzdjm) obj).zzdu();
                break;
            case 3:
                zzdjq zzdjqVar = (zzdjq) obj;
                if (!zzdjqVar.d) {
                    zzdjqVar.b.a(zzdjqVar.a, zzdjqVar.c);
                    zzdjqVar.d = true;
                }
                break;
            case 4:
                ((zzboz) obj).zzc();
                break;
            case 5:
                ((zzboz) obj).zza();
                break;
            case 6:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
                break;
            case 7:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 8:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                break;
            case 9:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 10:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
            default:
                ((zzcbc) obj).zze();
                break;
            case 18:
                ((zzbk) obj).zzg();
                break;
            case 19:
                ((zzbk) obj).zzb();
                break;
            case 21:
                ((zzdde) obj).zzl();
                break;
            case 22:
                ((zzr) obj).zzdS();
                break;
            case 23:
                ((zzr) obj).zzdv();
                break;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ((zzr) obj).zzh();
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((zzbfe) obj).zzc();
                break;
            case 27:
                ((zzcbc) obj).zzj();
                break;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((zzcbc) obj).zzk();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public JSONObject zzb(Object obj) throws JSONException {
        zzegt zzegtVar = (zzegt) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzbd.zzc().a(p32.Ja)).booleanValue()) {
            zzbzw zzbzwVar = zzegtVar.c;
            jSONObject2.put("ad_request_url", zzbzwVar.f);
            jSONObject2.put("ad_request_post_body", zzbzwVar.c);
        }
        zzbzw zzbzwVar2 = zzegtVar.c;
        jSONObject2.put("base_url", zzbzwVar2.b);
        jSONObject2.put("signals", zzegtVar.b);
        zzegz zzegzVar = zzegtVar.a;
        jSONObject3.put("body", zzegzVar.c);
        jSONObject3.put("headers", zzbb.zza().zzk(zzegzVar.b));
        jSONObject3.put("response_code", zzegzVar.a);
        jSONObject3.put("latency", zzegzVar.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbzwVar2.h);
        return jSONObject;
    }

    public /* synthetic */ pi2(int i2) {
        this.a = i2;
    }

    private final /* synthetic */ void a(RewardItem rewardItem) {
    }

    private final /* synthetic */ void b(RewardItem rewardItem) {
    }

    private final void c(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public /* synthetic */ void mo5zzb(Object obj) {
        switch (this.a) {
            case 11:
                ((zzcjl) obj).destroy();
                break;
            default:
                zze.zza("Notification of cache hit successful.");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public /* synthetic */ Object zza(JSONObject jSONObject) {
        return new zzbzw(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public /* synthetic */ zzed zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zze.zza("Ad request signals:");
        zze.zza(jSONObject.toString(2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        switch (this.a) {
            case 11:
                break;
            default:
                zze.zza("Notification of cache hit failed.");
                break;
        }
    }
}
