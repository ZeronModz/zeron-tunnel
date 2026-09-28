package defpackage;

import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.zzhpt;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.util.DesugarCollections;
import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac3 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;
    public static final a73 e;
    public static final z63 f;
    public static final ne2 g;
    public static final ne2 h;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        hc3 hc3VarA2 = z73.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        a = new m73(gb3.class, vb3.j);
        b = new l73(hc3VarA, vb3.e);
        c = new a73(ib3.class, vb3.f);
        d = new z63(hc3VarA2, vb3.g);
        e = new a73(hb3.class, vb3.h);
        f = new z63(hc3VarA, vb3.i);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        zzhqy zzhqyVar = zzhqy.RAW;
        fb3 fb3Var = fb3.e;
        map.put(zzhqyVar, fb3Var);
        map2.put(fb3Var, zzhqyVar);
        zzhqy zzhqyVar2 = zzhqy.TINK;
        fb3 fb3Var2 = fb3.b;
        map.put(zzhqyVar2, fb3Var2);
        map2.put(fb3Var2, zzhqyVar2);
        zzhqy zzhqyVar3 = zzhqy.CRUNCHY;
        fb3 fb3Var3 = fb3.c;
        map.put(zzhqyVar3, fb3Var3);
        map2.put(fb3Var3, zzhqyVar3);
        zzhqy zzhqyVar4 = zzhqy.LEGACY;
        fb3 fb3Var4 = fb3.d;
        map.put(zzhqyVar4, fb3Var4);
        map2.put(fb3Var4, zzhqyVar4);
        g = new ne2(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        zzhpt zzhptVar = zzhpt.SHA256;
        eb3 eb3Var = eb3.b;
        map3.put(zzhptVar, eb3Var);
        map4.put(eb3Var, zzhptVar);
        zzhpt zzhptVar2 = zzhpt.SHA384;
        eb3 eb3Var2 = eb3.c;
        map3.put(zzhptVar2, eb3Var2);
        map4.put(eb3Var2, zzhptVar2);
        zzhpt zzhptVar3 = zzhpt.SHA512;
        eb3 eb3Var3 = eb3.d;
        map3.put(zzhptVar3, eb3Var3);
        map4.put(eb3Var3, zzhptVar3);
        h = new ne2(DesugarCollections.unmodifiableMap(map3), DesugarCollections.unmodifiableMap(map4));
    }

    public static l9 a(ib3 ib3Var) {
        ja3 ja3VarZ = l9.z();
        gb3 gb3Var = ib3Var.a;
        ha3 ha3VarW = j9.w();
        zzhpt zzhptVar = (zzhpt) h.a(gb3Var.d);
        ha3VarW.d();
        ((j9) ha3VarW.b).y(zzhptVar);
        j9 j9Var = (j9) ha3VarW.e();
        ja3VarZ.d();
        ((l9) ja3VarZ.b).C(j9Var);
        byte[] bArrJ = qj1.J(ib3Var.b);
        zzian zzianVar = zzian.zza;
        zzian zzianVarZzs = zzian.zzs(bArrJ, 0, bArrJ.length);
        ja3VarZ.d();
        ((l9) ja3VarZ.b).D(zzianVarZzs);
        byte[] bArrJ2 = qj1.J(ib3Var.a.b);
        zzian zzianVarZzs2 = zzian.zzs(bArrJ2, 0, bArrJ2.length);
        ja3VarZ.d();
        ((l9) ja3VarZ.b).E(zzianVarZzs2);
        return (l9) ja3VarZ.e();
    }

    public static ci2 b(zzian zzianVar) {
        return new ci2(new BigInteger(1, zzianVar.zzy()), 18);
    }
}
