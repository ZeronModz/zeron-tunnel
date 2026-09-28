package defpackage;

import com.google.android.gms.internal.ads.n9;
import com.google.android.gms.internal.ads.p9;
import com.google.android.gms.internal.ads.zzhpt;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.util.DesugarCollections;
import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cc3 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;
    public static final a73 e;
    public static final z63 f;
    public static final ne2 g;
    public static final ne2 h;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        hc3 hc3VarA2 = z73.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        a = new m73(nb3.class, vb3.p);
        b = new l73(hc3VarA, vb3.k);
        c = new a73(pb3.class, vb3.l);
        d = new z63(hc3VarA2, vb3.m);
        e = new a73(ob3.class, vb3.n);
        f = new z63(hc3VarA, vb3.o);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        zzhqy zzhqyVar = zzhqy.RAW;
        mb3 mb3Var = mb3.e;
        map.put(zzhqyVar, mb3Var);
        map2.put(mb3Var, zzhqyVar);
        zzhqy zzhqyVar2 = zzhqy.TINK;
        mb3 mb3Var2 = mb3.b;
        map.put(zzhqyVar2, mb3Var2);
        map2.put(mb3Var2, zzhqyVar2);
        zzhqy zzhqyVar3 = zzhqy.CRUNCHY;
        mb3 mb3Var3 = mb3.c;
        map.put(zzhqyVar3, mb3Var3);
        map2.put(mb3Var3, zzhqyVar3);
        zzhqy zzhqyVar4 = zzhqy.LEGACY;
        mb3 mb3Var4 = mb3.d;
        map.put(zzhqyVar4, mb3Var4);
        map2.put(mb3Var4, zzhqyVar4);
        g = new ne2(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        zzhpt zzhptVar = zzhpt.SHA256;
        lb3 lb3Var = lb3.b;
        map3.put(zzhptVar, lb3Var);
        map4.put(lb3Var, zzhptVar);
        zzhpt zzhptVar2 = zzhpt.SHA384;
        lb3 lb3Var2 = lb3.c;
        map3.put(zzhptVar2, lb3Var2);
        map4.put(lb3Var2, zzhptVar2);
        zzhpt zzhptVar3 = zzhpt.SHA512;
        lb3 lb3Var3 = lb3.d;
        map3.put(zzhptVar3, lb3Var3);
        map4.put(lb3Var3, zzhptVar3);
        h = new ne2(DesugarCollections.unmodifiableMap(map3), DesugarCollections.unmodifiableMap(map4));
    }

    public static n9 a(nb3 nb3Var) {
        la3 la3VarY = n9.y();
        lb3 lb3Var = nb3Var.d;
        ne2 ne2Var = h;
        zzhpt zzhptVar = (zzhpt) ne2Var.a(lb3Var);
        la3VarY.d();
        ((n9) la3VarY.b).A(zzhptVar);
        zzhpt zzhptVar2 = (zzhpt) ne2Var.a(nb3Var.e);
        la3VarY.d();
        ((n9) la3VarY.b).B(zzhptVar2);
        int i = nb3Var.f;
        la3VarY.d();
        ((n9) la3VarY.b).C(i);
        return (n9) la3VarY.e();
    }

    public static p9 b(pb3 pb3Var) {
        na3 na3VarZ = p9.z();
        n9 n9VarA = a(pb3Var.a);
        na3VarZ.d();
        ((p9) na3VarZ.b).D(n9VarA);
        byte[] bArrJ = qj1.J(pb3Var.b);
        zzian zzianVar = zzian.zza;
        zzian zzianVarZzs = zzian.zzs(bArrJ, 0, bArrJ.length);
        na3VarZ.d();
        ((p9) na3VarZ.b).E(zzianVarZzs);
        byte[] bArrJ2 = qj1.J(pb3Var.a.b);
        zzian zzianVarZzs2 = zzian.zzs(bArrJ2, 0, bArrJ2.length);
        na3VarZ.d();
        ((p9) na3VarZ.b).F(zzianVarZzs2);
        na3VarZ.d();
        ((p9) na3VarZ.b).C(0);
        return (p9) na3VarZ.e();
    }

    public static ci2 c(zzian zzianVar) {
        return new ci2(new BigInteger(1, zzianVar.zzy()), 18);
    }
}
