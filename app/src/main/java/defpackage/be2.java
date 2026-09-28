package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzccr;
import com.google.android.gms.internal.ads.zzdvu;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzebe;
import com.google.android.gms.internal.ads.zzeki;
import com.google.android.gms.internal.ads.zzfor;
import java.util.Objects;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class be2 extends zzda {
    public final Context a;
    public final VersionInfoParcel b;
    public final ql2 c;
    public final zzeki d;
    public final wq2 e;
    public final zzeak f;
    public final zzccq g;
    public final zzdvu h;
    public final gn2 i;
    public final zzbjy j;
    public final zzfor k;
    public final gu2 l;
    public final wg2 m;
    public final zzdxz n;
    public final un2 o;
    public boolean p = false;
    public final Long q = Long.valueOf(zzt.zzk().elapsedRealtime());

    public be2(Context context, VersionInfoParcel versionInfoParcel, ql2 ql2Var, zzeki zzekiVar, wq2 wq2Var, zzeak zzeakVar, zzccq zzccqVar, zzdvu zzdvuVar, gn2 gn2Var, zzbjy zzbjyVar, zzfor zzforVar, gu2 gu2Var, wg2 wg2Var, zzdxz zzdxzVar, un2 un2Var) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = ql2Var;
        this.d = zzekiVar;
        this.e = wq2Var;
        this.f = zzeakVar;
        this.g = zzccqVar;
        this.h = zzdvuVar;
        this.i = gn2Var;
        this.j = zzbjyVar;
        this.k = zzforVar;
        this.l = gu2Var;
        this.m = wg2Var;
        this.n = zzdxzVar;
        this.o = un2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zze() {
        if (this.p) {
            zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) zzbd.zzc().a(p32.Z2)).booleanValue()) {
            zzbb.zzc();
        }
        Context context = this.a;
        p32.a(context);
        zzt.zzh().d(context, this.b, this.n);
        this.m.a();
        zzt.zzj().a(context);
        final int i = 1;
        this.p = true;
        this.f.a();
        wq2 wq2Var = this.e;
        wq2Var.getClass();
        final int i2 = 2;
        zzt.zzh().i().zzk(new vq2(wq2Var, 2));
        final int i3 = 0;
        wq2Var.f.execute(new vq2(wq2Var, 0));
        if (((Boolean) zzbd.zzc().a(p32.U4)).booleanValue()) {
            zzdvu zzdvuVar = this.h;
            if (!zzdvuVar.f.getAndSet(true)) {
                zzt.zzh().i().zzk(new rl2(zzdvuVar, 0));
            }
            zzdvuVar.c.execute(new rl2(zzdvuVar, 2));
        }
        this.i.a();
        if (((Boolean) zzbd.zzc().a(p32.Fa)).booleanValue()) {
            final int i4 = 3;
            g3.a.execute(new Runnable(this) { // from class: ae2
                public final /* synthetic */ be2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strA;
                    int i5 = i4;
                    be2 be2Var = this.b;
                    switch (i5) {
                        case 0:
                            ay2.D(be2Var.a, true);
                            break;
                        case 1:
                            zzbid zzbidVarZzn = zzt.zzn();
                            Context context2 = be2Var.a;
                            zzdxz zzdxzVar = be2Var.n;
                            if (!zzbidVarZzn.b.getAndSet(true)) {
                                zzbidVarZzn.c = context2;
                                zzbidVarZzn.d = zzdxzVar;
                                if (zzbidVarZzn.f == null && context2 != null && (strA = et.a(context2)) != null && !strA.equals(context2.getPackageName())) {
                                    zzbidVarZzn.a = context2.getApplicationContext();
                                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                    if (!TextUtils.isEmpty(strA)) {
                                        intent.setPackage(strA);
                                    }
                                    context2.bindService(intent, zzbidVarZzn, 33);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zzbyt zzbytVar = new zzbyt();
                            zzbjy zzbjyVar = be2Var.j;
                            zzbjyVar.getClass();
                            try {
                                z42 z42Var = (z42) zzs.zza(zzbjyVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", c22.b);
                                Parcel parcelZza = z42Var.zza();
                                e12.e(parcelZza, zzbytVar);
                                z42Var.zzda(1, parcelZza);
                            } catch (RemoteException e) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                return;
                            }
                            break;
                        default:
                            if (zzt.zzh().i().zzJ()) {
                                if (!zzt.zzo().zze(be2Var.a, zzt.zzh().i().zzL(), be2Var.b.afmaVersion)) {
                                    zzt.zzh().i().zzK(false);
                                    zzt.zzh().i().zzM(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzbd.zzc().a(p32.tc)).booleanValue()) {
            g3.a.execute(new Runnable(this) { // from class: ae2
                public final /* synthetic */ be2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strA;
                    int i5 = i2;
                    be2 be2Var = this.b;
                    switch (i5) {
                        case 0:
                            ay2.D(be2Var.a, true);
                            break;
                        case 1:
                            zzbid zzbidVarZzn = zzt.zzn();
                            Context context2 = be2Var.a;
                            zzdxz zzdxzVar = be2Var.n;
                            if (!zzbidVarZzn.b.getAndSet(true)) {
                                zzbidVarZzn.c = context2;
                                zzbidVarZzn.d = zzdxzVar;
                                if (zzbidVarZzn.f == null && context2 != null && (strA = et.a(context2)) != null && !strA.equals(context2.getPackageName())) {
                                    zzbidVarZzn.a = context2.getApplicationContext();
                                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                    if (!TextUtils.isEmpty(strA)) {
                                        intent.setPackage(strA);
                                    }
                                    context2.bindService(intent, zzbidVarZzn, 33);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zzbyt zzbytVar = new zzbyt();
                            zzbjy zzbjyVar = be2Var.j;
                            zzbjyVar.getClass();
                            try {
                                z42 z42Var = (z42) zzs.zza(zzbjyVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", c22.b);
                                Parcel parcelZza = z42Var.zza();
                                e12.e(parcelZza, zzbytVar);
                                z42Var.zzda(1, parcelZza);
                            } catch (RemoteException e) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                return;
                            }
                            break;
                        default:
                            if (zzt.zzh().i().zzJ()) {
                                if (!zzt.zzo().zze(be2Var.a, zzt.zzh().i().zzL(), be2Var.b.afmaVersion)) {
                                    zzt.zzh().i().zzK(false);
                                    zzt.zzh().i().zzM(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzbd.zzc().a(p32.O3)).booleanValue()) {
            g3.a.execute(new Runnable(this) { // from class: ae2
                public final /* synthetic */ be2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strA;
                    int i5 = i3;
                    be2 be2Var = this.b;
                    switch (i5) {
                        case 0:
                            ay2.D(be2Var.a, true);
                            break;
                        case 1:
                            zzbid zzbidVarZzn = zzt.zzn();
                            Context context2 = be2Var.a;
                            zzdxz zzdxzVar = be2Var.n;
                            if (!zzbidVarZzn.b.getAndSet(true)) {
                                zzbidVarZzn.c = context2;
                                zzbidVarZzn.d = zzdxzVar;
                                if (zzbidVarZzn.f == null && context2 != null && (strA = et.a(context2)) != null && !strA.equals(context2.getPackageName())) {
                                    zzbidVarZzn.a = context2.getApplicationContext();
                                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                    if (!TextUtils.isEmpty(strA)) {
                                        intent.setPackage(strA);
                                    }
                                    context2.bindService(intent, zzbidVarZzn, 33);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zzbyt zzbytVar = new zzbyt();
                            zzbjy zzbjyVar = be2Var.j;
                            zzbjyVar.getClass();
                            try {
                                z42 z42Var = (z42) zzs.zza(zzbjyVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", c22.b);
                                Parcel parcelZza = z42Var.zza();
                                e12.e(parcelZza, zzbytVar);
                                z42Var.zzda(1, parcelZza);
                            } catch (RemoteException e) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                return;
                            }
                            break;
                        default:
                            if (zzt.zzh().i().zzJ()) {
                                if (!zzt.zzo().zze(be2Var.a, zzt.zzh().i().zzL(), be2Var.b.afmaVersion)) {
                                    zzt.zzh().i().zzK(false);
                                    zzt.zzh().i().zzM(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) zzbd.zzc().a(p32.z5)).booleanValue()) {
            if (((Boolean) zzbd.zzc().a(p32.A5)).booleanValue()) {
                g3.a.execute(new Runnable(this) { // from class: ae2
                    public final /* synthetic */ be2 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String strA;
                        int i5 = i;
                        be2 be2Var = this.b;
                        switch (i5) {
                            case 0:
                                ay2.D(be2Var.a, true);
                                break;
                            case 1:
                                zzbid zzbidVarZzn = zzt.zzn();
                                Context context2 = be2Var.a;
                                zzdxz zzdxzVar = be2Var.n;
                                if (!zzbidVarZzn.b.getAndSet(true)) {
                                    zzbidVarZzn.c = context2;
                                    zzbidVarZzn.d = zzdxzVar;
                                    if (zzbidVarZzn.f == null && context2 != null && (strA = et.a(context2)) != null && !strA.equals(context2.getPackageName())) {
                                        zzbidVarZzn.a = context2.getApplicationContext();
                                        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                        if (!TextUtils.isEmpty(strA)) {
                                            intent.setPackage(strA);
                                        }
                                        context2.bindService(intent, zzbidVarZzn, 33);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zzbyt zzbytVar = new zzbyt();
                                zzbjy zzbjyVar = be2Var.j;
                                zzbjyVar.getClass();
                                try {
                                    z42 z42Var = (z42) zzs.zza(zzbjyVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", c22.b);
                                    Parcel parcelZza = z42Var.zza();
                                    e12.e(parcelZza, zzbytVar);
                                    z42Var.zzda(1, parcelZza);
                                } catch (RemoteException e) {
                                    zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                    return;
                                } catch (zzr e2) {
                                    zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                    return;
                                }
                                break;
                            default:
                                if (zzt.zzh().i().zzJ()) {
                                    if (!zzt.zzo().zze(be2Var.a, zzt.zzh().i().zzL(), be2Var.b.afmaVersion)) {
                                        zzt.zzh().i().zzK(false);
                                        zzt.zzh().i().zzM(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        }
        if (((Boolean) zzbd.zzc().a(p32.N5)).booleanValue()) {
            un2 un2Var = this.o;
            ta2 ta2Var = g3.f;
            Objects.requireNonNull(un2Var);
            ta2Var.execute(new c(un2Var, 2));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzf(float f) {
        zzt.zzi().zza(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzg(String str) {
        Context context = this.a;
        p32.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzbd.zzc().a(p32.S4)).booleanValue()) {
                zzt.zzl().zza(context, this.b, str, null, this.k, null, null, this.i.g());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzh(boolean z) {
        zzt.zzi().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) a.d(iObjectWrapper);
        if (context == null) {
            zzo.zzf("Context is null. Failed to open debug menu.");
            return;
        }
        zzat zzatVar = new zzat(context);
        zzatVar.zzc(str);
        zzatVar.zzd(this.b.afmaVersion);
        zzatVar.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, IObjectWrapper iObjectWrapper) {
        String strZzt;
        s33 s33Var;
        Context context = this.a;
        p32.a(context);
        if (((Boolean) zzbd.zzc().a(p32.Z4)).booleanValue()) {
            try {
                zzt.zzc();
                strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(context);
            } catch (RemoteException | RuntimeException e) {
                zzt.zzh().f("NonagonMobileAdsSettingManager_AppId", e);
                strZzt = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        } else {
            strZzt = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzt) ? str : strZzt;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.S4)).booleanValue();
        l32 l32Var = p32.y1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbd.zzc().a(l32Var)).booleanValue();
        if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
            s33Var = new s33(22, this, (Runnable) a.d(iObjectWrapper));
        } else {
            s33Var = null;
            z = zBooleanValue2;
        }
        s33 s33Var2 = s33Var;
        if (z) {
            zzt.zzl().zza(this.a, this.b, str2, s33Var2, this.k, this.n, this.q, this.i.g());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized float zzk() {
        return zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized boolean zzl() {
        return zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        return this.b.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) {
        this.e.d(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbtt zzbttVar) {
        this.l.b(zzbttVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbqn zzbqnVar) {
        zzeak zzeakVar = this.f;
        zzeakVar.getClass();
        zzeakVar.e.a.addListener(new qj2(4, zzeakVar, zzbqnVar), zzeakVar.j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() {
        return this.f.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(zzfv zzfvVar) {
        zzccq zzccqVar = this.g;
        Context context = this.a;
        zzccqVar.getClass();
        i31 i31VarA = zzccr.b(context).a();
        ((ga2) i31VarA.c).a(-1, ((Clock) i31VarA.b).currentTimeMillis());
        if (((Boolean) zzbd.zzc().a(p32.Y0)).booleanValue() && zzccqVar.a(context) && zzccq.g(context)) {
            synchronized (zzccqVar.i) {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
        this.f.q = false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(zzdn zzdnVar) {
        this.i.f(zzdnVar, zzebe.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z) throws RemoteException {
        Context context;
        try {
            context = this.a;
            jx2.d(context).f(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
        if (z) {
            return;
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                return;
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e2) {
            zzt.zzh().f("clearStorageOnGpidPubDisable_scar", e2);
            return;
        }
        throw new RemoteException(e.getMessage());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
        if (((Boolean) zzbd.zzc().a(p32.Ra)).booleanValue()) {
            zzt.zzh().g = str;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzw() {
        if (((Boolean) zzbd.zzc().a(p32.Y2)).booleanValue()) {
            zzt.zzr().c();
            if (((Boolean) zzbd.zzc().a(p32.Z2)).booleanValue()) {
                zzbb.zzd();
            }
        }
    }
}
