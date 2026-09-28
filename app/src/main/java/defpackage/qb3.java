package defpackage;

import com.google.android.gms.internal.ads.i;
import com.google.android.gms.internal.ads.o9;
import com.google.android.gms.internal.ads.p9;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.zzhbr;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhqb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qb3 {
    public static final p73 a = new p73(ob3.class, zzhbr.class, i.g);
    public static final p73 b = new p73(pb3.class, zzhbs.class, i.h);
    public static final b73 c;
    public static final c73 d;
    public static final v9 e;
    public static final int f;

    static {
        o9.D();
        c = new b73("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzhbr.class, zzhqb.ASYMMETRIC_PRIVATE);
        zzhqb zzhqbVar = zzhqb.ASYMMETRIC_PUBLIC;
        p9.B();
        d = new c73("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhbs.class, zzhqbVar);
        e = v9.d;
        f = 2;
    }
}
