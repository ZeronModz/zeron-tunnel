package defpackage;

import com.google.android.gms.internal.ads.zzhpt;
import com.google.android.gms.internal.ads.zzhqy;
import java.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q83 {
    public static final ne2 a;
    public static final ne2 b;
    public static final m73 c;
    public static final l73 d;
    public static final a73 e;
    public static final z63 f;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        zzhqy zzhqyVar = zzhqy.RAW;
        j83 j83Var = j83.e;
        map.put(zzhqyVar, j83Var);
        map2.put(j83Var, zzhqyVar);
        zzhqy zzhqyVar2 = zzhqy.TINK;
        j83 j83Var2 = j83.b;
        map.put(zzhqyVar2, j83Var2);
        map2.put(j83Var2, zzhqyVar2);
        zzhqy zzhqyVar3 = zzhqy.LEGACY;
        j83 j83Var3 = j83.d;
        map.put(zzhqyVar3, j83Var3);
        map2.put(j83Var3, zzhqyVar3);
        zzhqy zzhqyVar4 = zzhqy.CRUNCHY;
        j83 j83Var4 = j83.c;
        map.put(zzhqyVar4, j83Var4);
        map2.put(j83Var4, zzhqyVar4);
        a = new ne2(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        zzhpt zzhptVar = zzhpt.SHA1;
        i83 i83Var = i83.b;
        map3.put(zzhptVar, i83Var);
        map4.put(i83Var, zzhptVar);
        zzhpt zzhptVar2 = zzhpt.SHA224;
        i83 i83Var2 = i83.c;
        map3.put(zzhptVar2, i83Var2);
        map4.put(i83Var2, zzhptVar2);
        zzhpt zzhptVar3 = zzhpt.SHA256;
        i83 i83Var3 = i83.d;
        map3.put(zzhptVar3, i83Var3);
        map4.put(i83Var3, zzhptVar3);
        zzhpt zzhptVar4 = zzhpt.SHA384;
        i83 i83Var4 = i83.e;
        map3.put(zzhptVar4, i83Var4);
        map4.put(i83Var4, zzhptVar4);
        zzhpt zzhptVar5 = zzhpt.SHA512;
        i83 i83Var5 = i83.f;
        map3.put(zzhptVar5, i83Var5);
        map4.put(i83Var5, zzhptVar5);
        b = new ne2(DesugarCollections.unmodifiableMap(map3), DesugarCollections.unmodifiableMap(map4));
        c = new m73(k83.class, p83.c);
        d = new l73(hc3VarA, e63.C);
        e = new a73(g83.class, e63.D);
        f = new z63(hc3VarA, p83.b);
    }
}
