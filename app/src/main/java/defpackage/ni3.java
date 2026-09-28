package defpackage;

import android.util.Base64;
import com.google.android.gms.internal.ads.zd;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzpf;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzqj;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zztg;
import com.google.android.gms.internal.ads.zzth;
import com.google.android.gms.internal.ads.zztj;
import com.google.android.gms.internal.ads.zztn;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zzuf;
import com.google.android.gms.internal.ads.zzuw;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni3 implements zzdy, zzgru, zzso, zzto, zztn, zzuf, zzuw, zzdr {
    public static final /* synthetic */ ni3 b = new ni3(7);
    public static final /* synthetic */ ni3 c = new ni3(8);
    public static final /* synthetic */ ni3 d = new ni3(9);
    public static final /* synthetic */ ni3 e = new ni3(10);
    public static final /* synthetic */ ni3 f = new ni3(11);
    public static final /* synthetic */ ni3 g = new ni3(12);
    public static final /* synthetic */ ni3 h = new ni3(13);
    public static final /* synthetic */ ni3 i = new ni3(16);
    public static final /* synthetic */ ni3 j = new ni3(17);
    public static final /* synthetic */ ni3 k = new ni3(18);
    public static final /* synthetic */ ni3 l = new ni3(19);
    public static final /* synthetic */ ni3 m = new ni3(20);
    public final /* synthetic */ int a;

    public /* synthetic */ ni3(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo9zza(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 8:
                ((zzqa) obj).zze();
                break;
            case 9:
                ((zzqa) obj).zzd();
                break;
            case 10:
                ((zzqa) obj).zzc();
                break;
            case 11:
                ((zzqa) obj).zzb();
                break;
            case 12:
                ((zzqa) obj).zzb();
                break;
            case 13:
                ((zzqj) obj).zza();
                break;
            case 19:
                zztn zztnVar = ((kl3) obj).b;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public int zzb(yk3 yk3Var) {
        return yk3Var.q != null ? 1 : 0;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public zzth zza(zztj zztjVar, yk3 yk3Var) {
        if (yk3Var.q == null) {
            return null;
        }
        return new zztp(new zztg(new zztq(1), 6001));
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public Object mo10zza() {
        byte[] bArr = new byte[12];
        zzpf.h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public /* synthetic */ List zza(String str, boolean z, boolean z2) {
        return zd.a(str, z, z2);
    }
}
