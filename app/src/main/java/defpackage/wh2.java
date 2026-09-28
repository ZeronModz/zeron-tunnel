package defpackage;

import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzdde;
import com.google.android.gms.internal.ads.zzdea;
import com.google.android.gms.internal.ads.zzdeb;
import com.google.android.gms.internal.ads.zzdgc;
import com.google.android.gms.internal.ads.zzdgh;
import com.google.android.gms.internal.ads.zzdgw;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdin;
import com.google.android.gms.internal.ads.zzdir;
import com.google.android.gms.internal.ads.zzdiv;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh2 implements zzdhc {
    public final /* synthetic */ int a;
    public static final /* synthetic */ wh2 b = new wh2(0);
    public static final /* synthetic */ wh2 c = new wh2(1);
    public static final /* synthetic */ wh2 d = new wh2(2);
    public static final /* synthetic */ wh2 e = new wh2(3);
    public static final /* synthetic */ wh2 f = new wh2(4);
    public static final /* synthetic */ wh2 g = new wh2(5);
    public static final /* synthetic */ wh2 h = new wh2(6);
    public static final /* synthetic */ wh2 i = new wh2(7);
    public static final /* synthetic */ wh2 j = new wh2(8);
    public static final /* synthetic */ wh2 k = new wh2(9);
    public static final /* synthetic */ wh2 l = new wh2(10);
    public static final /* synthetic */ wh2 m = new wh2(11);
    public static final /* synthetic */ wh2 n = new wh2(12);
    public static final /* synthetic */ wh2 o = new wh2(13);
    public static final /* synthetic */ wh2 p = new wh2(14);
    public static final /* synthetic */ wh2 q = new wh2(15);
    public static final /* synthetic */ wh2 r = new wh2(16);
    public static final /* synthetic */ wh2 s = new wh2(17);
    public static final /* synthetic */ wh2 t = new wh2(18);
    public static final /* synthetic */ wh2 u = new wh2(19);
    public static final /* synthetic */ wh2 v = new wh2(20);
    public static final /* synthetic */ wh2 w = new wh2(21);
    public static final /* synthetic */ wh2 x = new wh2(22);
    public static final /* synthetic */ wh2 y = new wh2(24);
    public static final /* synthetic */ wh2 z = new wh2(25);
    public static final /* synthetic */ wh2 A = new wh2(26);
    public static final /* synthetic */ wh2 B = new wh2(27);
    public static final /* synthetic */ wh2 C = new wh2(28);
    public static final /* synthetic */ wh2 D = new wh2(29);

    public /* synthetic */ wh2(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo3zza(Object obj) throws ExecutionException, InterruptedException {
        switch (this.a) {
            case 0:
                ((zzdbf) obj).zzf();
                break;
            case 1:
                ((zzdbf) obj).zzds();
                break;
            case 2:
                ((zzdct) obj).zzg();
                break;
            case 3:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
            case 4:
                ((zzdde) obj).zzl();
                break;
            case 5:
                ((zzr) obj).zzdo();
                break;
            case 6:
                ((zzr) obj).zzdp();
                break;
            case 7:
                ((zzr) obj).zzdq();
                break;
            case 8:
                ((zzr) obj).zzdS();
                break;
            case 9:
                ((zzr) obj).zzdv();
                break;
            case 10:
                ((zzr) obj).zzdw();
                break;
            case 11:
                ((zzr) obj).zzdx();
                break;
            case 12:
                ((zzr) obj).zzdy();
                break;
            case 13:
                ((zzr) obj).zzdz();
                break;
            case 14:
                ((zzr) obj).zzh();
                break;
            case 15:
                ((zzdea) obj).zzk();
                break;
            case 16:
                ((zzdeb) obj).zzL();
                break;
            case 17:
                ((zzdeb) obj).zza();
                break;
            case 18:
                ((zzdgc) obj).zza();
                break;
            case 19:
                ((zzdgh) obj).zzdH();
                break;
            case 20:
                ((zzdgh) obj).zzdG();
                break;
            case 21:
                ((zzdgw) obj).zzo();
                break;
            case 22:
                ((zzdha) obj).zza();
                break;
            case 23:
                ((zzdin) obj).zzd("MalformedJson");
                break;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ((zzdin) obj).zze();
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((zzdin) obj).zzf();
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                ((zzdir) obj).zzg();
                break;
            case 27:
                ((zzdir) obj).zzh();
                break;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((zzdiv) obj).zzb();
                break;
            default:
                ((zzdiv) obj).zza();
                break;
        }
    }
}
