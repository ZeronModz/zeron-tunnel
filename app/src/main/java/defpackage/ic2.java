package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import androidx.datastore.core.DataStore;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcss;
import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzdiy;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdlr;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzdyk;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzevl;
import com.google.android.gms.internal.ads.zzeyq;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfmi;
import com.google.android.gms.internal.ads.zzfnm;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfze;
import com.google.android.gms.internal.ads.zzgaf;
import com.google.android.gms.internal.ads.zzgcn;
import com.google.android.gms.internal.ads.zzgdh;
import com.google.android.gms.internal.ads.zzikg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ic2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;
    public final se3 c;

    public /* synthetic */ ic2(se3 se3Var, se3 se3Var2, int i) {
        this.a = i;
        this.b = se3Var;
        this.c = se3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        se3 se3Var = this.c;
        se3 se3Var2 = this.b;
        switch (i) {
            case 0:
                return new hc2((ec2) se3Var2.zzb(), (zzdxz) se3Var.zzb());
            case 1:
                return new lc2((ScheduledExecutorService) se3Var.zzb());
            case 2:
                return ((Boolean) zzbd.zzc().a(p32.D3)).booleanValue() ? new zzazh((zzazc) se3Var.zzb()) : new zzazh((zzazc) se3Var2.zzb());
            case 3:
                return new zzcsn(((zzbdb) se3Var2.zzb()).c, (l72) se3Var.zzb(), zzfmi.a());
            case 4:
                zzcss zzcssVar = (zzcss) se3Var2.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                Set setSingleton = ((JSONObject) se3Var.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdje(zzcssVar, ta2Var));
                k02.J(setSingleton);
                return setSingleton;
            case 5:
                zzcss zzcssVar2 = (zzcss) se3Var2.zzb();
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                Set setSingleton2 = ((JSONObject) se3Var.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdje(zzcssVar2, ta2Var2));
                k02.J(setSingleton2);
                return setSingleton2;
            case 6:
                zzcss zzcssVar3 = (zzcss) se3Var2.zzb();
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                Set setSingleton3 = ((JSONObject) se3Var.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdje(zzcssVar3, ta2Var3));
                k02.J(setSingleton3);
                return setSingleton3;
            case 7:
                zzcss zzcssVar4 = (zzcss) se3Var2.zzb();
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                Set setSingleton4 = ((JSONObject) se3Var.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdje(zzcssVar4, ta2Var4));
                k02.J(setSingleton4);
                return setSingleton4;
            case 8:
                return new zzdlr((zzddq) se3Var2.zzb(), (zzdiy) se3Var.zzb());
            case 9:
                return new zzdyk((String) se3Var2.zzb(), (zzdye) se3Var.zzb());
            case 10:
                return new v3((zzeak) se3Var2.zzb(), (ol2) se3Var.zzb());
            case 11:
                xu2 xu2Var = (xu2) se3Var2.zzb();
                CookieManager cookieManagerZza = zzt.zzf().zza((Context) se3Var.zzb());
                zzfno zzfnoVar = zzfno.WEBVIEW_COOKIE;
                Objects.requireNonNull(xu2Var);
                hc0 hc0Var = new hc0(cookieManagerZza, 6);
                fq0 fq0Var = new fq0(xu2Var, zzfnoVar, null, zzfnm.d, Collections.EMPTY_LIST, z.T(xu2Var.a.zzc(hc0Var), 1L, TimeUnit.SECONDS, xu2Var.b));
                ww1 ww1Var = new ww1(15);
                zzfnm zzfnmVar = (zzfnm) fq0Var.f;
                return new fq0(zzfnmVar, fq0Var.a, (String) fq0Var.b, (ListenableFuture) fq0Var.c, (List) fq0Var.d, z.R((ListenableFuture) fq0Var.e, Exception.class, ww1Var, zzfnmVar.a)).k();
            case 12:
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                zzeyq zzeyqVar = new zzeyq(ta2Var5);
                Clock clock = (Clock) se3Var2.zzb();
                k02.J(ta2Var5);
                return new zzevl(zzeyqVar, ((Long) a42.f.g()).longValue(), clock, ta2Var5, (zzdxz) se3Var.zzb());
            case 13:
                return new zzfiq((Clock) se3Var2.zzb(), (zzdxz) se3Var.zzb());
            case 14:
                return new hs2((String) se3Var2.zzb(), ((Integer) se3Var.zzb()).intValue());
            case 15:
                return new rv2((tv2) se3Var2.zzb(), (ov2) se3Var.zzb());
            case 16:
                DataStore dataStore = (DataStore) se3Var2.zzb();
                ta2 ta2Var6 = g3.a;
                k02.J(ta2Var6);
                return new zzgaf(dataStore, new uh2(ta2Var6, 20), (nl2) se3Var.zzb(), new zzfze());
            case 17:
                return new zzgcn((Executor) se3Var2.zzb(), (ox2) se3Var.zzb());
            default:
                return new f6((ox2) se3Var2.zzb(), (zzgdh) se3Var.zzb());
        }
    }
}
