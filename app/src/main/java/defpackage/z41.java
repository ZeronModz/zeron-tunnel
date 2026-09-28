package defpackage;

import android.content.Intent;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzctu;
import com.google.android.gms.internal.ads.zzcxl;
import com.google.android.gms.internal.ads.zzczm;
import com.google.android.gms.internal.ads.zzdal;
import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzdmp;
import com.google.android.gms.internal.ads.zzdmq;
import com.google.android.gms.internal.ads.zzdyo;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzfsm;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z41 implements zzdmp {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public z41(kx kxVar, WebView webView, String str, String str2, zzfsm zzfsmVar) {
        this.a = 2;
        this.f = new ArrayList();
        this.g = new HashMap();
        this.d = kxVar;
        this.e = webView;
        this.h = zzfsmVar;
        this.c = str;
        this.b = str2;
    }

    public hb3 a() throws GeneralSecurityException {
        ci2 ci2Var;
        ci2 ci2Var2;
        ib3 ib3Var = (ib3) this.b;
        if (ib3Var == null) {
            zg1.m("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        ci2 ci2Var3 = (ci2) this.d;
        if (ci2Var3 == null || (ci2Var = (ci2) this.e) == null) {
            zg1.m("Cannot build without prime factors");
            return null;
        }
        ci2 ci2Var4 = (ci2) this.c;
        if (ci2Var4 == null) {
            zg1.m("Cannot build without private exponent");
            return null;
        }
        ci2 ci2Var5 = (ci2) this.f;
        if (ci2Var5 == null || (ci2Var2 = (ci2) this.g) == null) {
            zg1.m("Cannot build without prime exponents");
            return null;
        }
        ci2 ci2Var6 = (ci2) this.h;
        if (ci2Var6 == null) {
            zg1.m("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = ib3Var.a.b;
        BigInteger bigInteger2 = ib3Var.b;
        BigInteger bigInteger3 = (BigInteger) ci2Var3.b;
        BigInteger bigInteger4 = (BigInteger) ci2Var.b;
        BigInteger bigInteger5 = (BigInteger) ci2Var4.b;
        BigInteger bigInteger6 = (BigInteger) ci2Var5.b;
        BigInteger bigInteger7 = (BigInteger) ci2Var2.b;
        BigInteger bigInteger8 = (BigInteger) ci2Var6.b;
        if (!bigInteger3.isProbablePrime(10)) {
            zg1.m("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            zg1.m("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            zg1.m("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            zg1.m("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            zg1.m("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            zg1.m("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new hb3((ib3) this.b, (ci2) this.d, (ci2) this.e, (ci2) this.c, (ci2) this.f, (ci2) this.g, (ci2) this.h);
        }
        zg1.m("qInv is invalid.");
        return null;
    }

    public ob3 b() throws GeneralSecurityException {
        ci2 ci2Var;
        ci2 ci2Var2;
        pb3 pb3Var = (pb3) this.b;
        if (pb3Var == null) {
            zg1.m("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        ci2 ci2Var3 = (ci2) this.d;
        if (ci2Var3 == null || (ci2Var = (ci2) this.e) == null) {
            zg1.m("Cannot build without prime factors");
            return null;
        }
        ci2 ci2Var4 = (ci2) this.c;
        if (ci2Var4 == null) {
            zg1.m("Cannot build without private exponent");
            return null;
        }
        ci2 ci2Var5 = (ci2) this.f;
        if (ci2Var5 == null || (ci2Var2 = (ci2) this.g) == null) {
            zg1.m("Cannot build without prime exponents");
            return null;
        }
        ci2 ci2Var6 = (ci2) this.h;
        if (ci2Var6 == null) {
            zg1.m("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = pb3Var.a.b;
        BigInteger bigInteger2 = pb3Var.b;
        BigInteger bigInteger3 = (BigInteger) ci2Var3.b;
        BigInteger bigInteger4 = (BigInteger) ci2Var.b;
        BigInteger bigInteger5 = (BigInteger) ci2Var4.b;
        BigInteger bigInteger6 = (BigInteger) ci2Var5.b;
        BigInteger bigInteger7 = (BigInteger) ci2Var2.b;
        BigInteger bigInteger8 = (BigInteger) ci2Var6.b;
        if (!bigInteger3.isProbablePrime(10)) {
            zg1.m("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            zg1.m("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            zg1.m("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            zg1.m("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            zg1.m("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            zg1.m("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new ob3((pb3) this.b, (ci2) this.d, (ci2) this.e, (ci2) this.c, (ci2) this.f, (ci2) this.g, (ci2) this.h);
        }
        zg1.m("qInv is invalid.");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) this.f;
                return "Format: " + ((String) this.c) + "\nContents: " + ((String) this.b) + "\nRaw bytes: (" + (bArr == null ? 0 : bArr.length) + " bytes)\nOrientation: " + ((Integer) this.g) + "\nEC level: " + ((String) this.d) + "\nBarcode image: " + ((String) this.e) + "\nOriginal intent: " + ((Intent) this.h) + '\n';
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmp, com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzdmq zzh() {
        k02.M(ji2.class, (ji2) this.e);
        k02.M(oh2.class, (oh2) this.f);
        k02.M(zzdml.class, (zzdml) this.g);
        k02.M(zzctu.class, (zzctu) this.h);
        zzctu zzctuVar = (zzctu) this.h;
        zzdml zzdmlVar = (zzdml) this.g;
        new zzcxl();
        new zzfkq();
        new zzczm();
        return new ed2((gd2) this.b, zzctuVar, zzdmlVar, new zzdyo(), (ji2) this.e, (oh2) this.f, new jq2(), (zzfgn) this.c, (zzffr) this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public /* synthetic */ zzdmp zzb(zzffr zzffrVar) {
        this.d = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public /* synthetic */ zzdmp zzc(zzfgn zzfgnVar) {
        this.c = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public /* bridge */ /* synthetic */ zzdmp zzd(zzctu zzctuVar) {
        this.h = zzctuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public /* bridge */ /* synthetic */ zzdmp zze(zzdml zzdmlVar) {
        this.g = zzdmlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public /* bridge */ /* synthetic */ zzdmp zzf(oh2 oh2Var) {
        this.f = oh2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public /* bridge */ /* synthetic */ zzdmp zzg(ji2 ji2Var) {
        this.e = ji2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp, com.google.android.gms.internal.ads.zzdal
    public /* synthetic */ zzdal zzi(zzffr zzffrVar) {
        this.d = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp, com.google.android.gms.internal.ads.zzdal
    public /* synthetic */ zzdal zzj(zzfgn zzfgnVar) {
        this.c = zzfgnVar;
        return this;
    }

    public /* synthetic */ z41(gd2 gd2Var) {
        this.a = 1;
        this.b = gd2Var;
    }

    public /* synthetic */ z41(int i) {
        this.a = i;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public z41(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.a = 0;
        this.b = str;
        this.c = str2;
        this.f = bArr;
        this.g = num;
        this.d = str3;
        this.e = str4;
        this.h = intent;
    }
}
