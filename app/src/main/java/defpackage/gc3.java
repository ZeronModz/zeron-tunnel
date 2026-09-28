package defpackage;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhxn;
import java.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gc3 implements zzhbs {
    public static final ne2 a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        zzhxn zzhxnVar = zzhxn.SHA256;
        lb3 lb3Var = lb3.b;
        map.put(zzhxnVar, lb3Var);
        map2.put(lb3Var, zzhxnVar);
        zzhxn zzhxnVar2 = zzhxn.SHA384;
        lb3 lb3Var2 = lb3.c;
        map.put(zzhxnVar2, lb3Var2);
        map2.put(lb3Var2, zzhxnVar2);
        zzhxn zzhxnVar3 = zzhxn.SHA512;
        lb3 lb3Var3 = lb3.d;
        map.put(zzhxnVar3, lb3Var3);
        map2.put(lb3Var3, zzhxnVar3);
        a = new ne2(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        b = new byte[0];
        c = new byte[]{0};
    }
}
