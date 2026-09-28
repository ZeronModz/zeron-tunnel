package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzccr;
import com.google.android.gms.internal.ads.zzcqn;
import com.google.android.gms.internal.ads.zzcqp;
import com.google.android.gms.internal.ads.zzcrb;
import com.google.android.gms.internal.ads.zzcrd;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzehj;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzerp;
import com.google.android.gms.internal.ads.zzext;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzgup;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ee2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;

    public /* synthetic */ ee2(zzikp zzikpVar, int i) {
        this.a = i;
        this.b = zzikpVar;
    }

    public jo2 a() {
        Context contextA = ((sc2) this.b).a();
        jo2 jo2Var = new jo2();
        jo2Var.h = 1;
        jo2Var.f = new zzbyw(contextA, zzt.zzs().zza(), jo2Var, jo2Var);
        return jo2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        zzgup zzgupVarZzh;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        zzikp zzikpVar = this.b;
        switch (i) {
            case 0:
                return new zzbl(((sc2) zzikpVar).a());
            case 1:
                return new zzcqn(((oc2) zzikpVar).zzb());
            case 2:
                return new zzcqp(((oc2) zzikpVar).zzb());
            case 3:
                return new oe2((gn2) zzikpVar.zzb(), i2);
            case 4:
                return new qe2((gn2) zzikpVar.zzb(), i2);
            case 5:
                return new zzcrb(((sc2) zzikpVar).a());
            case 6:
                return new zzcrd((zzfiq) zzikpVar.zzb());
            case 7:
                return new qe2(zzccr.b(((de2) zzikpVar).a.a()).a(), i3);
            case 8:
                return new oe2((gn2) zzikpVar.zzb(), i3);
            case 9:
                return new l72(((zzbsz) zzikpVar.zzb()).a);
            case 10:
                return new zzdje(new uf2(((ig2) zzikpVar).a.a, i2), g3.g);
            case 11:
                return new zzdje((wg2) zzikpVar.zzb(), g3.g);
            case 12:
                return new zzdje((wg2) zzikpVar.zzb(), g3.g);
            case 13:
                return ((qf2) zzikpVar).zzb();
            case 14:
                VersionInfoParcel versionInfoParcelA = ((yc2) zzikpVar).a();
                zzt.zzc();
                return new zzbdb(UUID.randomUUID().toString(), versionInfoParcelA, "native", new JSONObject(), false, true);
            case 15:
                String packageName = ((sc2) zzikpVar).a().getPackageName();
                k02.J(packageName);
                return packageName;
            case 16:
                Context contextA = ((sc2) zzikpVar).a();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new ho2(contextA, ta2Var);
            case 17:
                return a();
            case 18:
                return new qo2(((cd2) zzikpVar).zzb());
            case 19:
                return new zzehj(((sc2) zzikpVar).a());
            case 20:
                return new hp2(((sc2) zzikpVar).a());
            case 21:
                return new ip2(((sc2) zzikpVar).a());
            case 22:
                return new zzeqf((ql2) zzikpVar.zzb());
            case 23:
                return new zzerp((zzdxz) zzikpVar.zzb());
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return new er2((Set) zzikpVar.zzb(), 1);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new nr2(ta2Var2, ((sc2) zzikpVar).a(), i2);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return new er2((zzffr) zzikpVar.zzb(), 3);
            case 27:
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                er2 er2Var = new er2(ta2Var3, 4);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzikpVar.zzb();
                if (((Boolean) zzbd.zzc().a(p32.X4)).booleanValue()) {
                    zzgupVarZzh = zzgup.zzi(new zzezj(er2Var, ((Integer) zzbd.zzc().a(p32.Y4)).intValue(), scheduledExecutorService));
                } else {
                    zzgupVarZzh = zzgup.zzh();
                }
                k02.J(zzgupVarZzh);
                return zzgupVarZzh;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new zzezj(new zzext(ta2Var4), ((Integer) zzbd.zzc().a(p32.Id)).intValue(), (ScheduledExecutorService) zzikpVar.zzb());
            default:
                Context contextA2 = ((sc2) zzikpVar).a();
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                return new nr2(contextA2, ta2Var5, i3);
        }
    }
}
