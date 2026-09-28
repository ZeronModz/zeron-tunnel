package defpackage;

import com.google.android.gms.internal.ads.i;
import com.google.android.gms.internal.ads.k9;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.zzhbr;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhqb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb3 {
    public static final p73 a = new p73(hb3.class, zzhbr.class, i.f);
    public static final p73 b = new p73(ib3.class, zzhbs.class, p83.v);
    public static final b73 c;
    public static final c73 d;
    public static final v9 e;
    public static final int f;

    static {
        k9.D();
        c = new b73("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzhbr.class, zzhqb.ASYMMETRIC_PRIVATE);
        zzhqb zzhqbVar = zzhqb.ASYMMETRIC_PUBLIC;
        l9.B();
        d = new c73("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhbs.class, zzhqbVar);
        e = v9.c;
        f = 2;
    }
}
