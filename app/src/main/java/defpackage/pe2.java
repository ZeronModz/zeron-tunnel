package defpackage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.a;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzctu;
import com.google.android.gms.internal.ads.zzcwb;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzdnp;
import com.google.android.gms.internal.ads.zzdoe;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdos;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfze;
import com.google.android.gms.internal.ads.zzgaf;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgem;
import com.google.android.gms.internal.ads.zzghq;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzgup;
import com.google.android.gms.internal.ads.zzikg;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.internal.ContextScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pe2 implements zzikg {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pe2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public zzdoh a() {
        zzdoh zzdohVar = ((zzdos) this.b).a;
        k02.J(zzdohVar);
        return zzdohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new oe2(new ip2(((sc2) ((ee2) obj).b).a()), 2);
            case 1:
                return ((zzctu) obj).a;
            case 2:
                return ((tf2) obj).c();
            case 3:
                ha2 ha2Var = (ha2) obj;
                return new zzdje(new zf2(((wf2) ha2Var.b).b.d, (zzdxz) ha2Var.c.zzb(), ((ng2) ha2Var.d).b()), g3.a);
            case 4:
                la2 la2Var = (la2) obj;
                zzgup zzgupVarZzi = ((Boolean) zzbd.zzc().a(p32.be)).booleanValue() ? zzgup.zzi(new zzdje(new eg2(((wf2) la2Var.b).b.d, (Executor) la2Var.c.zzb()), g3.a)) : zzgup.zzh();
                k02.J(zzgupVarZzi);
                return zzgupVarZzi;
            case 5:
                return ((zg2) obj).a();
            case 6:
                yf2 yf2Var = (yf2) obj;
                return new zzcwb(new zzccn(((sc2) yf2Var.b).a(), ((rh2) yf2Var.c).a().g));
            case 7:
                return new kg2(((ue3) obj).zzb());
            case 8:
                return new dh2(((ng2) obj).a());
            case 9:
                return (zzdml) obj;
            case 10:
                tj2 tj2Var = ((ej2) obj).a.a;
                k02.J(tj2Var);
                Set setSingleton = tj2Var.d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                k02.J(setSingleton);
                return setSingleton;
            case 11:
                zzdol zzdolVar = (zzdol) ((yg2) obj).b.zzb();
                k02.J(zzdolVar);
                JSONObject jSONObject = zzdolVar.b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(zzdolVar.a.z);
                    } catch (JSONException unused) {
                        return null;
                    }
                    break;
                }
                return jSONObject;
            case 12:
                return new zzdoe(new zzdnp(((nj2) obj).b.a()));
            case 13:
                zzdoh zzdohVar = ((zzdos) obj).a;
                k02.J(zzdohVar);
                return zzdohVar;
            case 14:
                return new ll2((zzcjl) ((zzikg) obj).zzb());
            case 15:
                return new zzdje(new ll2((zzcjl) ((zzikg) ((pe2) obj).b).zzb()), g3.f);
            case 16:
                ic2 ic2Var = (ic2) obj;
                DataStore dataStore = (DataStore) ic2Var.b.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new ml2(new zzgaf(dataStore, new uh2(ta2Var, 20), (nl2) ic2Var.c.zzb(), new zzfze()));
            case 17:
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                la2 la2Var2 = (la2) obj;
                Set setSingleton2 = ((Boolean) zzbd.zzc().a(p32.d6)).booleanValue() ? Collections.singleton(new zzdje(new zl2((zzbgd) ((se3) la2Var2.b).zzb(), ((ue3) la2Var2.c).zzb()), ta2Var2)) : Collections.EMPTY_SET;
                k02.J(setSingleton2);
                return setSingleton2;
            case 18:
                yf2 yf2Var2 = (yf2) obj;
                ko2 ko2Var = new ko2(((sc2) yf2Var2.b).a(), (zzccq) yf2Var2.c.zzb());
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new zzdje(ko2Var, ta2Var3);
            case 19:
                la2 la2Var3 = (la2) obj;
                zzehr zzehrVar = (zzehr) ((se3) la2Var3.b).zzb();
                la2 la2Var4 = (la2) la2Var3.c;
                zl2 zl2Var = new zl2(zzehrVar, new so2(((la2) la2Var4.b).a(), ((oc2) la2Var4.c).zzb()));
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new zzdje(zl2Var, ta2Var4);
            case 20:
                return new er2(((ph2) obj).b.c, 6);
            case 21:
                zzcdj zzcdjVar = new zzcdj();
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                String str = ((et2) obj).b.a.d;
                k02.J(str);
                return new zzfcs(zzcdjVar, ta2Var5, str);
            case 22:
                final Context context = (Context) ((pc2) obj).b.c;
                k02.J(context);
                ta2 ta2Var6 = g3.a;
                k02.J(ta2Var6);
                cx2 cx2Var = cx2.a;
                ContextScope contextScopeA = zr.a(new ExecutorCoroutineDispatcherImpl(ta2Var6));
                Function0 function0 = new Function0() { // from class: dx2
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Object invoke() {
                        return j03.h(context, "ad_quality_data.pb");
                    }
                };
                EmptyList emptyList = EmptyList.INSTANCE;
                emptyList.getClass();
                return a.a(new FileStorage(cx2Var, null, function0, 2, null), null, emptyList, contextScopeA);
            case 23:
                zzgdv zzgdvVarMo74zza = ((zzgem) ((tx2) obj).zzb()).mo10zza().mo74zza();
                k02.J(zzgdvVarMo74zza);
                return zzgdvVarMo74zza;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                zzgdv zzgdvVarZza = ((zzghq) ((tx2) obj).zzb()).zza().zza();
                k02.J(zzgdvVarZza);
                return zzgdvVarZza;
            default:
                zzgdv zzgdvVarZza2 = ((zzghs) ((tx2) obj).zzb()).mo81zza().zza();
                k02.J(zzgdvVarZza2);
                return zzgdvVarZza2;
        }
    }
}
