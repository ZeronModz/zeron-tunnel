package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import androidx.browser.customtabs.CustomTabsIntent$Builder;
import androidx.camera.camera2.internal.compat.d;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.d2;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.t1;
import com.google.android.gms.internal.ads.w2;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgj$zza$zza;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzcvc;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzdjx;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfgx;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzikx;
import java.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t61 implements zzgzl, zzfgx, zzbgc, zzdmc, zzdjx, zzgen, zzbie {
    public static t61 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public t61(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            case 2:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 4:
                this.b = new ArrayMap();
                this.c = new SparseArray();
                this.d = new LongSparseArray();
                this.e = new ArrayMap();
                break;
            case 19:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                break;
            case 20:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = e43.h;
                break;
            case 21:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = q43.j;
                break;
            case 22:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = j83.e;
                break;
            case 23:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = e43.u;
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public static synchronized t61 g() {
        t61 t61Var;
        t61Var = f;
        if (t61Var == null) {
            t61Var = new t61(0);
            f = t61Var;
        }
        return t61Var;
    }

    private final void r(Object obj) {
        bv2 bv2Var;
        zzfff zzfffVar = (zzfff) this.e;
        rf2 rf2Var = (rf2) obj;
        synchronized (zzfffVar) {
            if (rf2Var != null) {
                try {
                    rf2Var.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzfffVar.m) {
                zzfffVar.a();
            }
            if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.b) == null) {
                zzfor zzforVar = zzfffVar.i;
                zzfoe zzfoeVar = (zzfoe) this.c;
                zzfoeVar.zzg(rf2Var.a.b);
                zzfoeVar.zzi(rf2Var.f.a);
                zzfoeVar.zzd(true);
                zzforVar.b(zzfoeVar.zzm());
            } else {
                bv2Var.e(rf2Var.a.b);
                bv2Var.g(rf2Var.f.a);
                zzfoe zzfoeVar2 = (zzfoe) this.c;
                zzfoeVar2.zzd(true);
                bv2Var.a(zzfoeVar2);
                bv2Var.h();
            }
        }
    }

    public void a(Fragment fragment) {
        if (((ArrayList) this.b).contains(fragment)) {
            zu0.g(fragment, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(fragment);
        }
        fragment.l = true;
    }

    public Fragment b(String str) {
        o oVar = (o) ((HashMap) this.c).get(str);
        if (oVar != null) {
            return oVar.c;
        }
        return null;
    }

    public Fragment c(String str) {
        for (o oVar : ((HashMap) this.c).values()) {
            if (oVar != null) {
                Fragment fragmentC = oVar.c;
                if (!str.equals(fragmentC.f)) {
                    fragmentC = fragmentC.u.c.c(str);
                }
                if (fragmentC != null) {
                    return fragmentC;
                }
            }
        }
        return null;
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : ((HashMap) this.c).values()) {
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : ((HashMap) this.c).values()) {
            if (oVar != null) {
                arrayList.add(oVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List f() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public Size[] h(int i) {
        HashMap map = (HashMap) this.d;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = ((d) this.b).a.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            km0.g("StreamConfigurationMapCompat");
            return outputSizes;
        }
        Size[] sizeArrA = ((OutputSizesCorrector) this.c).a(outputSizes, i);
        map.put(Integer.valueOf(i), sizeArrA);
        return (Size[]) sizeArrA.clone();
    }

    public boolean i(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean j(Context context) {
        Boolean boolValueOf = (Boolean) this.c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.c = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void k(o oVar) {
        Fragment fragment = oVar.c;
        String str = fragment.f;
        HashMap map = (HashMap) this.c;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.f, oVar);
        if (FragmentManager.H(2)) {
            fragment.toString();
        }
    }

    public void l(o oVar) {
        Fragment fragment = oVar.c;
        if (fragment.B) {
            ((fa0) this.e).b(fragment);
        }
        if (((o) ((HashMap) this.c).put(fragment.f, null)) != null && FragmentManager.H(2)) {
            fragment.toString();
        }
    }

    public void m(int i) throws InvalidAlgorithmParameterException {
        switch (this.a) {
            case 20:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
            case 21:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
            default:
                this.b = Integer.valueOf(i);
                return;
        }
    }

    public void p() {
        this.c = 12;
    }

    public void q(int i) throws GeneralSecurityException {
        switch (this.a) {
            case 20:
                if (i != 12 && i != 16) {
                    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
                }
                this.c = Integer.valueOf(i);
                return;
            default:
                this.c = Integer.valueOf(i);
                return;
        }
    }

    public void s() {
        switch (this.a) {
            case 20:
                this.d = 16;
                break;
            default:
                this.d = 16;
                break;
        }
    }

    public m43 t() throws GeneralSecurityException {
        ic3 ic3Var;
        hc3 hc3VarB;
        s43 s43Var = (s43) this.b;
        if (s43Var == null) {
            zg1.m("Cannot build without parameters");
            return null;
        }
        ic3 ic3Var2 = (ic3) this.c;
        if (ic3Var2 == null || (ic3Var = (ic3) this.d) == null) {
            zg1.m("Cannot build without key material");
            return null;
        }
        if (s43Var.a != ((hc3) ic3Var2.b).a.length) {
            zg1.m("AES key size mismatch");
            return null;
        }
        if (s43Var.b != ((hc3) ic3Var.b).a.length) {
            zg1.m("HMAC key size mismatch");
            return null;
        }
        if (s43Var.a() && ((Integer) this.e) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((s43) this.b).a() && ((Integer) this.e) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        r43 r43Var = ((s43) this.b).e;
        if (r43Var == r43.e) {
            hc3VarB = k73.a;
        } else if (r43Var == r43.d) {
            hc3VarB = k73.a(((Integer) this.e).intValue());
        } else {
            if (r43Var != r43.c) {
                u7.p("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(r43Var)));
                return null;
            }
            hc3VarB = k73.b(((Integer) this.e).intValue());
        }
        return new m43((s43) this.b, (ic3) this.c, (ic3) this.d, hc3VarB, (Integer) this.e);
    }

    public w43 u() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            zg1.m("Key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            zg1.m("IV size is not set");
            return null;
        }
        if (((Integer) this.d) == null) {
            zg1.m("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.c).intValue();
        ((Integer) this.d).getClass();
        return new w43(iIntValue, iIntValue2, (e43) this.e);
    }

    public z43 v() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            zg1.m("Key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            zg1.m("IV size is not set");
            return null;
        }
        if (((Integer) this.d) == null) {
            zg1.m("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        ((Integer) this.c).getClass();
        ((Integer) this.d).getClass();
        return new z43(iIntValue, (q43) this.e);
    }

    public k83 w() throws GeneralSecurityException {
        Integer num = (Integer) this.b;
        if (num == null) {
            zg1.m("key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            zg1.m("tag size is not set");
            return null;
        }
        if (((i83) this.d) == null) {
            zg1.m("hash type is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.b));
        }
        Integer num2 = (Integer) this.c;
        int iIntValue = num2.intValue();
        i83 i83Var = (i83) this.d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (i83Var == i83.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (i83Var == i83.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (i83Var == i83.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (i83Var == i83.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (i83Var != i83.f) {
                zg1.m("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new k83(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (j83) this.e, (i83) this.d);
    }

    public ta3 x() throws GeneralSecurityException {
        q43 q43Var = q43.q;
        r43 r43Var = (r43) this.b;
        if (r43Var == null) {
            zg1.m("signature encoding is not set");
            return null;
        }
        sa3 sa3Var = (sa3) this.c;
        if (sa3Var == null) {
            zg1.m("EC curve type is not set");
            return null;
        }
        q43 q43Var2 = (q43) this.d;
        if (q43Var2 == null) {
            zg1.m("hash type is not set");
            return null;
        }
        e43 e43Var = (e43) this.e;
        if (sa3Var == sa3.c && q43Var2 != q43.o) {
            zg1.m("NIST_P256 requires SHA256");
            return null;
        }
        if (sa3Var == sa3.d && q43Var2 != q43.p && q43Var2 != q43Var) {
            zg1.m("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (sa3Var != sa3.e || q43Var2 == q43Var) {
            return new ta3(r43Var, sa3Var, q43Var2, e43Var);
        }
        zg1.m("NIST_P521 requires SHA512");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        bv2 bv2Var;
        switch (this.a) {
            case 6:
                zzt.zzh().f("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 7:
                zzo.zzi("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.d)));
                return;
            case 8:
            case 11:
            case 12:
            case 13:
            default:
                zzfoe zzfoeVar = (zzfoe) this.b;
                if (zzfoeVar == null) {
                    return;
                }
                zzfoeVar.zzd(false);
                bv2 bv2Var2 = (bv2) this.c;
                if (bv2Var2 == null) {
                    ((mv2) this.e).f.b(zzfoeVar.zzm());
                    return;
                } else {
                    bv2Var2.a(zzfoeVar);
                    bv2Var2.h();
                    return;
                }
            case 9:
                ((ve2) this.e).e.zza(new lu1(this, th, (mv2) this.c, (String) this.b, (zzv) this.d, 2));
                return;
            case 10:
                return;
            case 14:
                if (((Boolean) zzbd.zzc().a(p32.K6)).booleanValue()) {
                    zze.zzb("Banner ad failed to load", th);
                }
                zzfff zzfffVar = (zzfff) this.e;
                synchronized (zzfffVar) {
                    try {
                        zzcvc zzcvcVar = (zzcvc) this.d;
                        com.google.android.gms.ads.internal.client.zze zzeVarK = xg0.K(th, zzcvcVar.b().l);
                        zzfffVar.n = zzeVarK;
                        zzcvcVar.a().zzdI(zzeVarK);
                        mu.A(zzeVarK.zza, "BannerAdLoader.onFailure", th);
                        if (zzfffVar.m) {
                            zzfffVar.c();
                            zzfffVar.h.j(zzfffVar.j.a());
                        }
                        if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.b) == null) {
                            zzfor zzforVar = zzfffVar.i;
                            zzfoe zzfoeVar2 = (zzfoe) this.c;
                            zzfoeVar2.zzh(zzeVarK);
                            zzfoeVar2.zzj(th);
                            zzfoeVar2.zzd(false);
                            zzforVar.b(zzfoeVar2.zzm());
                        } else {
                            bv2Var.f(zzeVarK);
                            zzfoe zzfoeVar3 = (zzfoe) this.c;
                            zzfoeVar3.zzj(th);
                            zzfoeVar3.zzd(false);
                            bv2Var.a(zzfoeVar3);
                            bv2Var.h();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 15:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5zzb(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t61.mo5zzb(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public /* bridge */ /* synthetic */ zzfgx zzc(String str) {
        str.getClass();
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public /* bridge */ /* synthetic */ zzfgx zzd(Context context) {
        context.getClass();
        this.d = context;
        return this;
    }

    private final void n(Throwable th) {
    }

    private final void o(Throwable th) {
    }

    public t61(Context context, Executor executor, zzfvh zzfvhVar, e5 e5Var) {
        this.a = 17;
        this.b = context;
        this.c = executor;
        this.d = zzfvhVar;
    }

    public /* synthetic */ t61(zzbgj$zza$zza zzbgj_zza_zza, String str, d2 d2Var, String str2) {
        this.a = 11;
        this.c = zzbgj_zza_zza;
        this.b = str;
        this.d = d2Var;
        this.e = str2;
    }

    public /* synthetic */ t61(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ t61(gd2 gd2Var) {
        this.a = 8;
        this.c = gd2Var;
    }

    public t61(tt2 tt2Var, zzbvs zzbvsVar, AdFormat adFormat) {
        this.a = 12;
        this.e = null;
        this.b = tt2Var;
        this.c = zzbvsVar;
        this.d = adFormat;
    }

    public t61(zzs zzsVar, zzbif zzbifVar, Bundle bundle, Context context, Uri uri) {
        this.a = 24;
        this.b = zzbifVar;
        this.c = bundle;
        this.d = context;
        this.e = uri;
    }

    public t61(zzbou zzbouVar, Map map, zza zzaVar, String str) {
        this.a = 6;
        this.c = map;
        this.d = zzaVar;
        this.b = str;
        this.e = zzbouVar;
    }

    public t61(zzcjw zzcjwVar, List list, String str, Uri uri) {
        this.a = 7;
        this.c = list;
        this.b = str;
        this.d = uri;
        this.e = zzcjwVar;
    }

    public t61(l5 l5Var) {
        this.a = 18;
        this.c = this;
        this.b = l5Var;
        se3 se3VarA = se3.a(py2.a);
        te3 te3Var = l5Var.b;
        te3 te3Var2 = l5Var.d;
        se3 se3Var = l5Var.l;
        se3 se3Var2 = l5Var.n;
        se3 se3Var3 = l5Var.i;
        te3 te3Var3 = l5Var.e;
        int i = vy2.a;
        se3 se3VarA2 = se3.a(new zg2(te3Var, te3Var2, se3Var, se3VarA, se3Var2, se3Var3, te3Var3));
        this.d = se3VarA2;
        this.e = se3.a(new zg2(l5Var.d, se3VarA2, l5Var.l, l5Var.k, se3.a(ry2.a), new tx2(this, 3), l5Var.e));
    }

    public t61(ve2 ve2Var, mv2 mv2Var, String str, zzv zzvVar) {
        this.a = 9;
        this.c = mv2Var;
        this.b = str;
        this.d = zzvVar;
        Objects.requireNonNull(ve2Var);
        this.e = ve2Var;
    }

    public t61(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        this.a = 3;
        this.d = new HashMap();
        this.e = new HashMap();
        new HashMap();
        this.b = new d(streamConfigurationMap);
        this.c = outputSizesCorrector;
    }

    public /* synthetic */ t61(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public zzgdv mo74zza() {
        return (zzgdv) ((se3) this.e).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo75zza() {
        nt ntVarB;
        zzbif zzbifVar = (zzbif) this.b;
        mt mtVar = zzbifVar.b;
        if (mtVar == null) {
            zzbifVar.a = null;
            ntVarB = null;
        } else {
            ntVarB = zzbifVar.a;
            if (ntVarB == null) {
                ntVarB = mtVar.b(null);
                zzbifVar.a = ntVarB;
            }
        }
        CustomTabsIntent$Builder customTabsIntent$Builder = new CustomTabsIntent$Builder(ntVarB);
        zzs.zzak(customTabsIntent$Builder, (Bundle) this.c);
        jt jtVarA = customTabsIntent$Builder.a();
        Intent intent = jtVarA.a;
        Context context = (Context) this.d;
        intent.setPackage(l02.R(context));
        intent.setData((Uri) this.e);
        context.startActivity(intent, jtVarA.b);
        Activity activity = (Activity) context;
        zzikx zzikxVar = zzbifVar.c;
        if (zzikxVar == null) {
            return;
        }
        activity.unbindService(zzikxVar);
        zzbifVar.b = null;
        zzbifVar.a = null;
        zzbifVar.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public zzfgy zza() {
        k02.M(Context.class, (Context) this.d);
        k02.M(String.class, (String) this.b);
        k02.M(zzr.class, (zzr) this.e);
        return new sd2((gd2) this.c, (Context) this.d, (String) this.b, (zzr) this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public void zza(g32 g32Var) {
        a22 a22Var = (a22) g32Var.zzY().o();
        zzbgj$zza$zza zzbgj_zza_zza = (zzbgj$zza$zza) this.c;
        a22Var.d();
        ((t1) a22Var.b).x(zzbgj_zza_zza);
        g32Var.d();
        ((y2) g32Var.b).C((t1) a22Var.e());
        e32 e32Var = (e32) g32Var.zzG().o();
        String str = (String) this.b;
        e32Var.d();
        ((w2) e32Var.b).x(str);
        d2 d2Var = (d2) this.d;
        e32Var.d();
        ((w2) e32Var.b).y(d2Var);
        g32Var.d();
        ((y2) g32Var.b).B((w2) e32Var.e());
        String str2 = (String) this.e;
        g32Var.d();
        ((y2) g32Var.b).w(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        boolean zZzk;
        zzbvs zzbvsVar = (zzbvs) this.c;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = ((AdFormat) this.d).ordinal();
            if (iOrdinal == 1) {
                zZzk = zzbvsVar.zzk(new a(context));
            } else if (iOrdinal == 2) {
                zZzk = zzbvsVar.zzm(new a(context));
            } else {
                if (iOrdinal == 5) {
                    zZzk = zzbvsVar.zzt(new a(context));
                }
                throw new zzdmb("Adapter failed to show.");
            }
            if (zZzk) {
                zzdbx zzdbxVar = (zzdbx) this.e;
                if (zzdbxVar == null) {
                    return;
                }
                if (((Boolean) zzbd.zzc().a(p32.c2)).booleanValue() || ((tt2) this.b).Y != 2) {
                    return;
                }
                zzdbxVar.zza();
                return;
            }
            throw new zzdmb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdmb(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    /* JADX INFO: renamed from: zzb */
    public tt2 mo79zzb() {
        return (tt2) this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public /* bridge */ /* synthetic */ zzfgx zzb(zzr zzrVar) {
        zzrVar.getClass();
        this.e = zzrVar;
        return this;
    }
}
