package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zze;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.zzau;
import com.google.android.gms.internal.ads.zzbb;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzegw;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzeiw;
import com.google.android.gms.internal.ads.zzens;
import com.google.android.gms.internal.ads.zzepp;
import com.google.android.gms.internal.ads.zzepu;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzflv;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfna;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfnm;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnv;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhkz;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhnp;
import com.google.android.gms.internal.ads.zzikp;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzmz;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzpc;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.consent_sdk.zzcj;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.d0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.ump.ConsentDebugSettings$Builder;
import com.google.common.util.concurrent.FutureCallback;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mo2 implements zzgzl, zzfmu, zzfna, zzdhc, zzhkz, zzhnp, zzo, FutureCallback, zze, zzdy, zzjp, zzdz {
    public static mo2 d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ mo2(int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = null;
                this.c = null;
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    private final void c(Throwable th) {
        zzflv zzflvVar = (zzflv) this.c;
        synchronized (zzflvVar) {
            zzflvVar.d = null;
        }
    }

    private final /* synthetic */ void g(Object obj) {
        zzflv zzflvVar = (zzflv) this.c;
        synchronized (zzflvVar) {
            try {
                zzflvVar.d = null;
                zzflvVar.c.addFirst((zzflt) this.b);
                if (zzflvVar.e == 1) {
                    zzflvVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(zzikp zzikpVar) {
        ((List) this.b).add(zzikpVar);
    }

    public void b(p73 p73Var) throws GeneralSecurityException {
        if (p73Var == null) {
            io0.e("primitive constructor must be non-null");
            return;
        }
        q73 q73Var = new q73(p73Var.a, p73Var.b);
        HashMap map = (HashMap) this.b;
        if (!map.containsKey(q73Var)) {
            map.put(q73Var, p73Var);
            return;
        }
        p73 p73Var2 = (p73) map.get(q73Var);
        if (!p73Var2.equals(p73Var) || p73Var != p73Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(q73Var.toString()));
        }
    }

    public void d(zzhla zzhlaVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.c;
        Class clsZza = zzhlaVar.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzhlaVar);
            return;
        }
        zzhla zzhlaVar2 = (zzhla) map.get(clsZza);
        if (!zzhlaVar2.equals(zzhlaVar) || !zzhlaVar.equals(zzhlaVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
        }
    }

    public void e(zzikp zzikpVar) {
        ((List) this.c).add(zzikpVar);
    }

    public void f(Object obj, String str) throws IOException {
        boolean zCommit;
        String str2 = (String) this.b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                new StringBuilder(String.valueOf(obj.getClass()).length() + 33 + String.valueOf(str2).length());
                p60.f(hz.x(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        p60.f(hz.x(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public zzcj i(Activity activity, pq pqVar) {
        px1 px1VarA = pqVar.a;
        if (px1VarA == null) {
            px1VarA = new ConsentDebugSettings$Builder((Application) this.b).a();
        }
        return yi3.a(new yi3(this, activity, px1VarA, pqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            ((zzda) this.b).zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            r rVar = ((AppMeasurementDynamiteService) this.c).a;
            if (rVar != null) {
                m mVar = rVar.f;
                r.h(mVar);
                mVar.i.b(e, "Event interceptor threw exception");
            }
        }
    }

    public ua3 j() throws GeneralSecurityException {
        ECPoint eCPoint;
        va3 va3Var = (va3) this.b;
        if (va3Var == null) {
            zg1.m("Cannot build without a ecdsa public key");
            return null;
        }
        ci2 ci2Var = (ci2) this.c;
        if (ci2Var == null) {
            zg1.m("Cannot build without a private value");
            return null;
        }
        BigInteger bigInteger = (BigInteger) ci2Var.b;
        ECPoint eCPoint2 = va3Var.b;
        sa3 sa3Var = va3Var.a.b;
        BigInteger order = sa3Var.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            zg1.m("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = sa3Var.b;
        if (!w63.b(eCParameterSpec, w63.a) && !w63.b(eCParameterSpec, w63.b) && !w63.b(eCParameterSpec, w63.c)) {
            zg1.m("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            zg1.m("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            zg1.m("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        w63.a(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = w63.c(curve);
        v63 v63VarD = w63.d(ECPoint.POINT_INFINITY, bigIntegerC);
        v63 v63VarD2 = w63.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                v63VarD = w63.f(v63VarD, v63VarD2, a, bigIntegerC);
                v63VarD2 = w63.e(v63VarD2, a, bigIntegerC);
            } else {
                v63VarD2 = w63.f(v63VarD, v63VarD2, a, bigIntegerC);
                v63VarD = w63.e(v63VarD, a, bigIntegerC);
            }
        }
        if (v63VarD.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = v63VarD.c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(v63VarD.a.multiply(bigIntegerMod).mod(bigIntegerC), v63VarD.b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        w63.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new ua3((va3) this.b, (ci2) this.c);
        }
        zg1.m("Invalid private value");
        return null;
    }

    public we3 k() {
        return new we3((List) this.b, (List) this.c);
    }

    public void l(String str) throws IOException {
        if (((SharedPreferences) this.c).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.b;
        p60.f(hz.x(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    @Override // com.google.common.util.concurrent.FutureCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFailure(java.lang.Throwable r12) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo2.onFailure(java.lang.Throwable):void");
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onSuccess(Object obj) throws RemoteException {
        w wVar = (w) this.c;
        wVar.a();
        zza();
        wVar.i = false;
        wVar.j = 1;
        m mVar = wVar.a.f;
        r.h(mVar);
        mVar.m.b(((fi3) this.b).a, "Successfully registered trigger URI");
        wVar.C();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        switch (this.a) {
            case 0:
                try {
                    d92 d92Var = (d92) this.c;
                    zzba zzbaVarZza = zzba.zza(th);
                    Parcel parcelZza = d92Var.zza();
                    e12.c(parcelZza, zzbaVarZza);
                    d92Var.zzda(2, parcelZza);
                    return;
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
                    return;
                }
            case 1:
                try {
                    ((zzbzl) this.c).zzf(zzba.zza(th));
                    return;
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
                    return;
                }
            case 2:
            case 4:
            case 5:
            default:
                zzfoe zzfoeVar = (zzfoe) this.c;
                zzfoeVar.zzj(th);
                zzfoeVar.zzd(false);
                ((bv2) this.b).a(zzfoeVar);
                return;
            case 3:
                gj0 gj0Var = (gj0) this.c;
                synchronized (gj0Var) {
                    try {
                        bq2 bq2Var = (bq2) gj0Var.h;
                        tt2 tt2Var = (tt2) this.b;
                        bq2Var.c(tt2Var);
                        tt2 tt2VarA = ((bq2) gj0Var.h).a();
                        if (tt2Var.v0) {
                            while (tt2VarA != null) {
                                gj0Var.b(tt2VarA);
                                tt2VarA = ((bq2) gj0Var.h).a();
                            }
                        } else if (tt2VarA != null) {
                            gj0Var.b(tt2VarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 6:
                c(th);
                return;
            case 7:
                ((zzfnm) ((fq0) this.c).f).c.zzc((zzfnb) this.b, th);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        Bundle bundle;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                try {
                    d92 d92Var = (d92) this.c;
                    zzbzd zzbzdVar = (zzbzd) this.b;
                    Parcel parcelZza = d92Var.zza();
                    parcelZza.writeString(str);
                    e12.c(parcelZza, zzbzdVar);
                    d92Var.zzda(1, parcelZza);
                    return;
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
                    return;
                }
            case 1:
                zzbzl zzbzlVar = (zzbzl) this.c;
                zzbzu zzbzuVar = (zzbzu) this.b;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    if (!((Boolean) zzbd.zzc().a(p32.K2)).booleanValue()) {
                        zzbzlVar.zze(parcelFileDescriptor);
                        return;
                    }
                    if (((Boolean) zzbd.zzc().a(p32.L2)).booleanValue() && (bundle = zzbzuVar.m) != null) {
                        bundle.putLong(zzdxh.BINDER_CALL_START.zza(), zzt.zzk().currentTimeMillis());
                    }
                    zzbzlVar.zzg(parcelFileDescriptor, zzbzuVar);
                    return;
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
                    return;
                }
            case 2:
            case 4:
            case 5:
            default:
                return;
            case 3:
                gj0 gj0Var = (gj0) this.c;
                zzens zzensVar = (zzens) obj;
                synchronized (gj0Var) {
                    try {
                        ((bq2) gj0Var.h).b(zzensVar, (tt2) this.b);
                        tt2 tt2VarA = ((bq2) gj0Var.h).a();
                        if (tt2VarA != null) {
                            gj0Var.b(tt2VarA);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 6:
                g(obj);
                return;
            case 7:
                ((zzfnm) ((fq0) this.c).f).c.zzd((zzfnb) this.b);
                return;
        }
    }

    private final void h(Object obj) {
    }

    public /* synthetic */ mo2(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ mo2(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public mo2(int i, int i2) {
        List arrayList;
        Object arrayList2;
        this.a = 19;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.b = arrayList;
        if (i2 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i2);
        }
        this.c = arrayList2;
    }

    public mo2(Context context) {
        this.a = 10;
        this.b = context.getPackageName();
        this.c = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public mo2(zzegw zzegwVar, zzbzu zzbzuVar, zzbzl zzbzlVar) {
        this.a = 1;
        this.b = zzbzuVar;
        this.c = zzbzlVar;
    }

    public mo2(zzegw zzegwVar, d92 d92Var, zzbzd zzbzdVar) {
        this.a = 0;
        this.c = d92Var;
        this.b = zzbzdVar;
    }

    public mo2(d0 d0Var) {
        this.a = 24;
        this.c = d0Var;
    }

    public mo2(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.a = 15;
        if (dn0.N(1)) {
            this.b = new SecretKeySpec(bArr, "AES");
            this.c = provider;
        } else {
            zg1.m("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
    }

    public /* synthetic */ mo2(r73 r73Var) {
        this.a = 13;
        this.b = new HashMap(r73Var.a);
        this.c = new HashMap(r73Var.b);
    }

    public /* synthetic */ mo2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzhkz
    public /* synthetic */ Object zza(n7 n7Var) {
        return ((r73) this.b).a(n7Var.a(), ((zzhla) this.c).zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public Object zza(Object obj) {
        zzeiu zzeiuVar = (zzeiu) this.b;
        zzeiw zzeiwVar = (zzeiw) this.c;
        zzeiuVar.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeiwVar.a));
        contentValues.put("gws_query_id", zzeiwVar.b);
        contentValues.put("url", zzeiwVar.c);
        contentValues.put("event_state", Integer.valueOf(zzeiwVar.d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        zzt.zzc();
        Context context = zzeiuVar.a;
        zzbo zzboVarZzE = zzs.zzE(context);
        if (zzboVarZzE != null) {
            try {
                zzboVarZzE.zzf(new a(context));
                return null;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public String mo64zza(String str) {
        Map map = (Map) ((o) this.c).d.get((String) this.b);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfna
    public void zza() throws RemoteException {
        switch (this.a) {
            case 4:
                zzepp zzeppVar = (zzepp) this.b;
                zzeppVar.c.zze((zzbhu) this.c);
                break;
            case 5:
                zzepu zzepuVar = (zzepu) this.b;
                zzepuVar.a.zze((zzbhu) this.c);
                break;
            default:
                r rVar = ((w) this.c).a;
                f63 f63Var = rVar.e;
                r.f(f63Var);
                SparseArray sparseArrayG = f63Var.g();
                fi3 fi3Var = (fi3) this.b;
                sparseArrayG.put(fi3Var.c, Long.valueOf(fi3Var.b));
                f63 f63Var2 = rVar.e;
                r.f(f63Var2);
                int[] iArr = new int[sparseArrayG.size()];
                long[] jArr = new long[sparseArrayG.size()];
                for (int i = 0; i < sparseArrayG.size(); i++) {
                    iArr[i] = sparseArrayG.keyAt(i);
                    jArr[i] = ((Long) sparseArrayG.valueAt(i)).longValue();
                }
                Bundle bundle = new Bundle();
                bundle.putIntArray("uriSources", iArr);
                bundle.putLongArray("uriTimestamps", jArr);
                f63Var2.n.b(bundle);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.a) {
            case 8:
                zzfnb zzfnbVar = (zzfnb) this.b;
                ((zzfnv) obj).zzdM((zzfno) zzfnbVar.a, zzfnbVar.b, (Throwable) this.c);
                break;
            case 23:
                ((zzna) obj).zzdh((zzmy) this.b, (zzin) this.c);
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((zzna) obj).zzdf((zzmy) this.b, (zzwg) this.c);
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                ((zzna) obj).zzg((zzmy) this.b, (zzau) this.c);
                break;
            default:
                zzmy zzmyVar = (zzmy) this.b;
                zzbv zzbvVar = (zzbv) this.c;
                ((zzna) obj).zzp(zzmyVar, zzbvVar);
                int i = zzbvVar.a;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public /* synthetic */ void zza(Object obj, fk3 fk3Var) {
        zzna zznaVar = (zzna) obj;
        zznaVar.zzdi((zzbb) this.c, new zzmz(fk3Var, ((zzpc) this.b).e));
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str) {
        zzfyn zzfynVar = zzs.zza;
        zzt.zzc();
        zzs.zzQ((Context) this.b, (String) this.c, str);
        return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public byte[] zza(byte[] bArr, int i) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.a) {
            case 15:
                if (i <= 16) {
                    Provider provider = (Provider) this.c;
                    SecretKeySpec secretKeySpec = (SecretKeySpec) this.b;
                    Mac mac = Mac.getInstance("AESCMAC", provider);
                    mac.init(secretKeySpec);
                    byte[] bArrDoFinal = mac.doFinal(bArr);
                    return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
                }
                zu0.p("outputLength must not be larger than 16");
                return null;
            default:
                return bArr.length <= 64 ? ((t83) this.b).zza(bArr, i) : ((mo2) this.c).zza(bArr, i);
        }
    }
}
