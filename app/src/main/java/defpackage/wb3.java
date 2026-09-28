package defpackage;

import com.google.android.gms.internal.ads.s8;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb3 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;
    public static final a73 e;
    public static final z63 f;
    public static final ne2 g;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        hc3 hc3VarA2 = z73.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        a = new m73(ya3.class, vb3.d);
        b = new l73(hc3VarA, p83.C);
        c = new a73(bb3.class, p83.D);
        d = new z63(hc3VarA2, p83.E);
        e = new a73(za3.class, vb3.b);
        f = new z63(hc3VarA, vb3.c);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        zzhqy zzhqyVar = zzhqy.RAW;
        xa3 xa3Var = xa3.e;
        map.put(zzhqyVar, xa3Var);
        map2.put(xa3Var, zzhqyVar);
        zzhqy zzhqyVar2 = zzhqy.TINK;
        xa3 xa3Var2 = xa3.b;
        map.put(zzhqyVar2, xa3Var2);
        map2.put(xa3Var2, zzhqyVar2);
        zzhqy zzhqyVar3 = zzhqy.CRUNCHY;
        xa3 xa3Var3 = xa3.c;
        map.put(zzhqyVar3, xa3Var3);
        map2.put(xa3Var3, zzhqyVar3);
        zzhqy zzhqyVar4 = zzhqy.LEGACY;
        xa3 xa3Var4 = xa3.d;
        map.put(zzhqyVar4, xa3Var4);
        map2.put(xa3Var4, zzhqyVar4);
        g = new ne2(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
    }

    public static s8 a(bb3 bb3Var) {
        r93 r93VarY = s8.y();
        byte[] bArrB = bb3Var.b.b();
        zzian zzianVarZzs = zzian.zzs(bArrB, 0, bArrB.length);
        r93VarY.d();
        ((s8) r93VarY.b).B(zzianVarZzs);
        return (s8) r93VarY.e();
    }
}
