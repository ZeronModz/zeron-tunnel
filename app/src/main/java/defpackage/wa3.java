package defpackage;

import com.google.android.gms.internal.ads.i;
import com.google.android.gms.internal.ads.o8;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.zzhbr;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhqb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wa3 {
    public static final p73 a = new p73(ua3.class, zzhbr.class, i.d);
    public static final p73 b = new p73(va3.class, zzhbs.class, i.e);
    public static final b73 c;
    public static final c73 d;
    public static final v9 e;
    public static final int f;

    static {
        o8.z();
        c = new b73("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzhbr.class, zzhqb.ASYMMETRIC_PRIVATE);
        zzhqb zzhqbVar = zzhqb.ASYMMETRIC_PUBLIC;
        p8.B();
        d = new c73("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhbs.class, zzhqbVar);
        e = v9.b;
        f = 2;
    }
}
