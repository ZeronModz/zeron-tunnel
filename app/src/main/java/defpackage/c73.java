package defpackage;

import com.google.android.gms.internal.ads.w8;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.zzhba;
import com.google.android.gms.internal.ads.zzhjx;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class c73 implements zzhba {
    public final String a;
    public final Class b;
    public final zzhqb c;

    public c73(String str, Class cls, zzhqb zzhqbVar) {
        this.a = str;
        this.b = cls;
        this.c = zzhqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final Object zza(zzian zzianVar) throws GeneralSecurityException {
        return ((r73) j73.b.a.get()).a(zzhkg.b.e(s73.a(this.a, zzianVar, this.c, zzhqy.RAW, null)), this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final String zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final Class zzc() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final w8 zzd(zzian zzianVar) throws GeneralSecurityException {
        w93 w93VarZ = x8.z();
        w93VarZ.g(this.a);
        w93VarZ.h(zzianVar);
        w93VarZ.i(zzhqy.RAW);
        x8 x8Var = (x8) w93VarZ.e();
        t73 t73Var = new t73(x8Var, z73.b(x8Var.v()));
        zzhkg zzhkgVar = zzhkg.b;
        s73 s73Var = (s73) zzhkgVar.f(zzhjx.b.b(zzhkgVar.g(t73Var), null));
        v93 v93VarY = w8.y();
        String str = s73Var.a;
        v93VarY.d();
        ((w8) v93VarY.b).A(str);
        zzian zzianVar2 = s73Var.c;
        v93VarY.d();
        ((w8) v93VarY.b).B(zzianVar2);
        zzhqb zzhqbVar = s73Var.d;
        v93VarY.d();
        ((w8) v93VarY.b).C(zzhqbVar);
        return (w8) v93VarY.e();
    }
}
