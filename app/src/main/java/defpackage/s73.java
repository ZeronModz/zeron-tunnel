package defpackage;

import com.google.android.gms.internal.ads.zzhlg;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s73 implements zzhlg {
    public final String a;
    public final hc3 b;
    public final zzian c;
    public final zzhqb d;
    public final zzhqy e;
    public final Integer f;

    public s73(String str, hc3 hc3Var, zzian zzianVar, zzhqb zzhqbVar, zzhqy zzhqyVar, Integer num) {
        this.a = str;
        this.b = hc3Var;
        this.c = zzianVar;
        this.d = zzhqbVar;
        this.e = zzhqyVar;
        this.f = num;
    }

    public static s73 a(String str, zzian zzianVar, zzhqb zzhqbVar, zzhqy zzhqyVar, Integer num) throws GeneralSecurityException {
        if (zzhqyVar == zzhqy.RAW) {
            if (num != null) {
                zg1.m("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            zg1.m("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new s73(str, z73.b(str), zzianVar, zzhqbVar, zzhqyVar, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final hc3 zzf() {
        return this.b;
    }
}
