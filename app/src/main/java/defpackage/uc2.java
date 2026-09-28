package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcrh;
import com.google.android.gms.internal.ads.zzcue;
import com.google.android.gms.internal.ads.zzcvs;
import com.google.android.gms.internal.ads.zzcvu;
import com.google.android.gms.internal.ads.zzcwb;
import com.google.android.gms.internal.ads.zzcxa;
import com.google.android.gms.internal.ads.zzcxv;
import com.google.android.gms.internal.ads.zzdcm;
import com.google.android.gms.internal.ads.zzddu;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdjq;
import com.google.android.gms.internal.ads.zzdti;
import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzeol;
import com.google.android.gms.internal.ads.zzfkj;
import com.google.android.gms.internal.ads.zzgup;
import com.google.android.gms.internal.ads.zzikg;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;

    public /* synthetic */ uc2(zzcue zzcueVar, se3 se3Var, int i) {
        this.a = i;
        this.b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        se3 se3Var = this.b;
        switch (i) {
            case 0:
                zzeam zzeamVar = (zzeam) se3Var.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                Set setSingleton = ((Boolean) zzbd.zzc().a(p32.j2)).booleanValue() ? Collections.singleton(new zzdje(zzeamVar, ta2Var)) : Collections.EMPTY_SET;
                k02.J(setSingleton);
                return setSingleton;
            case 1:
                return new zzeml((ql2) se3Var.zzb());
            case 2:
                return new zzeol((ql2) se3Var.zzb());
            case 3:
                zzdti zzdtiVar = (zzdti) se3Var.zzb();
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new zzfkj(zzdtiVar, ta2Var2);
            case 4:
                return new zzcrh((Context) se3Var.zzb());
            case 5:
                return zzgup.zzi(new zzdje((zzcvu) se3Var.zzb(), g3.g));
            case 6:
                Set setSingleton2 = Collections.singleton(new zzdje((zzcvu) se3Var.zzb(), g3.g));
                k02.J(setSingleton2);
                return setSingleton2;
            case 7:
                return new zzdje((zzcvs) se3Var.zzb(), g3.f);
            case 8:
                return new zzdje((zzcvs) se3Var.zzb(), g3.f);
            case 9:
                Set setSingleton3 = Collections.singleton(new zzdje((zzcvu) se3Var.zzb(), g3.g));
                k02.J(setSingleton3);
                return setSingleton3;
            case 10:
                zzcwb zzcwbVar = (zzcwb) se3Var.zzb();
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new zzdje(zzcwbVar, ta2Var3);
            case 11:
                return new zzcxa((zzdcm) se3Var.zzb());
            case 12:
                zzddu zzdduVar = (zzddu) se3Var.zzb();
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new zzdje(zzdduVar, ta2Var4);
            case 13:
                zzddu zzdduVar2 = (zzddu) se3Var.zzb();
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                return new zzdje(zzdduVar2, ta2Var5);
            case 14:
                return new zzdje((zzcxv) se3Var.zzb(), g3.g);
            case 15:
                return new zzdje((zzcxv) se3Var.zzb(), g3.g);
            case 16:
                return new zzdje((zzcxv) se3Var.zzb(), g3.g);
            case 17:
                return new zzdje((zzcxv) se3Var.zzb(), g3.g);
            case 18:
                return new zzdje((zzcxv) se3Var.zzb(), g3.g);
            case 19:
                return new zzdje((zzcxv) se3Var.zzb(), g3.g);
            case 20:
                return zzgup.zzi(new zzdje((ug2) se3Var.zzb(), g3.g));
            case 21:
                return zzgup.zzi(new zzdje((ug2) se3Var.zzb(), g3.g));
            case 22:
                zzdjq zzdjqVar = (zzdjq) se3Var.zzb();
                ta2 ta2Var6 = g3.a;
                k02.J(ta2Var6);
                return new zzdje(zzdjqVar, ta2Var6);
            case 23:
                df2 df2Var = (df2) se3Var.zzb();
                ta2 ta2Var7 = g3.a;
                k02.J(ta2Var7);
                return new zzdje(df2Var, ta2Var7);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                df2 df2Var2 = (df2) se3Var.zzb();
                ta2 ta2Var8 = g3.a;
                k02.J(ta2Var8);
                return new zzdje(df2Var2, ta2Var8);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                df2 df2Var3 = (df2) se3Var.zzb();
                ta2 ta2Var9 = g3.a;
                k02.J(ta2Var9);
                return new zzdje(df2Var3, ta2Var9);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                df2 df2Var4 = (df2) se3Var.zzb();
                ta2 ta2Var10 = g3.a;
                k02.J(ta2Var10);
                return new zzdje(df2Var4, ta2Var10);
            case 27:
                df2 df2Var5 = (df2) se3Var.zzb();
                ta2 ta2Var11 = g3.a;
                k02.J(ta2Var11);
                return new zzdje(df2Var5, ta2Var11);
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                df2 df2Var6 = (df2) se3Var.zzb();
                ta2 ta2Var12 = g3.a;
                k02.J(ta2Var12);
                return new zzdje(df2Var6, ta2Var12);
            default:
                df2 df2Var7 = (df2) se3Var.zzb();
                ta2 ta2Var13 = g3.a;
                k02.J(ta2Var13);
                return new zzdje(df2Var7, ta2Var13);
        }
    }

    public /* synthetic */ uc2(se3 se3Var, int i) {
        this.a = i;
        this.b = se3Var;
    }
}
