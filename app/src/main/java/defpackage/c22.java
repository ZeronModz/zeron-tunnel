package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.signatureverification.SignatureVerificationLogger;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzakw;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzbgj$zzd$zza;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdbj;
import com.google.android.gms.internal.ads.zzdbv;
import com.google.android.gms.internal.ads.zzdbz;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzibw;
import com.google.android.gms.internal.ads.zzica;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c22 implements zzibw, zzica, zzq, zzcep, zzcer, zzbst, zzbsr, zzbc, SignatureVerificationLogger, zzafa, zzgzl, zzdhc {
    public static final /* synthetic */ c22 b = new c22(9);
    public static final /* synthetic */ c22 c = new c22(11);
    public static final /* synthetic */ c22 d = new c22(15);
    public static final /* synthetic */ c22 e = new c22(19);
    public static final /* synthetic */ c22 f = new c22(20);
    public static final /* synthetic */ c22 g = new c22(21);
    public static final /* synthetic */ c22 h = new c22(23);
    public static final /* synthetic */ c22 i = new c22(24);
    public static final /* synthetic */ c22 j = new c22(25);
    public static final /* synthetic */ c22 k = new c22(26);
    public static final /* synthetic */ c22 l = new c22(27);
    public static final /* synthetic */ c22 m = new c22(28);
    public static final /* synthetic */ c22 n = new c22(29);
    public final /* synthetic */ int a;

    public /* synthetic */ c22(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcer, com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo3zza(Object obj) {
        switch (this.a) {
            case 12:
                zze.zza("Ending javascript session.");
                zzbsn zzbsnVar = (zzbsn) ((zzbsm) obj);
                HashSet<AbstractMap.SimpleEntry> hashSet = zzbsnVar.b;
                for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
                    zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzboh) simpleEntry.getValue()).toString())));
                    zzbsnVar.a.zzn((String) simpleEntry.getKey(), (zzboh) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 13:
                g3.f.execute(new vn1((zzbrg) obj, 19));
                break;
            case 23:
                ((zza) obj).onAdClicked();
                break;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ((zzdbj) obj).zze();
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((zzdbv) obj).zzj(xg0.P(11, null, null));
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                ((zzdbz) obj).zzdr();
                break;
            case 27:
                ((zzdbf) obj).zzdJ();
                break;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((zzdbf) obj).zzdt();
                break;
            default:
                ((zzdbf) obj).zze();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public zzaeu[] zzb(Uri uri, Map map) {
        switch (this.a) {
        }
        return mo4zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb, reason: collision with other method in class */
    public /* synthetic */ void mo5zzb(Object obj) {
        ((jg2) obj).zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzica
    public Object zzb(int i2) {
        zzbgj$zzd$zza zzbgj_zzd_zzaZzc = zzbgj$zzd$zza.zzc(i2);
        return zzbgj_zzd_zzaZzc == null ? zzbgj$zzd$zza.AD_FORMAT_TYPE_UNSPECIFIED : zzbgj_zzd_zzaZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        switch (this.a) {
            case 9:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                if (iInterfaceQueryLocalInterface instanceof z42) {
                    return (z42) iInterfaceQueryLocalInterface;
                }
                return new z42(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                if (iInterfaceQueryLocalInterface2 instanceof z92) {
                    return (z92) iInterfaceQueryLocalInterface2;
                }
                return new z92(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public /* synthetic */ Object zza(JSONObject jSONObject) {
        switch (this.a) {
            case 14:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo21zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public /* synthetic */ zzaeu[] mo4zza() {
        switch (this.a) {
            case 20:
                int i2 = zzcit.w;
                return new zzaeu[]{new zzakw(), new zzajh()};
            default:
                int i3 = zzcit.w;
                return new zzaeu[]{new zzakw(), new zzajh(), new zzako(zzamd.zza, 32, null, null, zzguf.zzi(), null)};
        }
    }
}
