package defpackage;

import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhjj;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkz;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zzhmm;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e83 implements zzhla {
    public static final e83 a = new e83();

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Object zze(zzhjj zzhjjVar, f73 f73Var, zzhkz zzhkzVar) throws GeneralSecurityException {
        hc3 hc3VarC;
        n7 n7VarC = ((g43) zzhjjVar).c();
        zzhkp zzhkpVar = new zzhkp();
        for (int i = 0; i < zzhjjVar.zzd(); i++) {
            n7 n7VarD = ((g43) zzhjjVar).d(i);
            if (n7VarD.b == e43.c) {
                zzhlx zzhlxVar = (zzhlx) zzhkzVar.zza(n7VarD);
                zzhaz zzhazVarA = n7VarD.a();
                if (zzhazVarA instanceof zzhmm) {
                    hc3VarC = ((zzhmm) zzhazVarA).c();
                } else {
                    if (!(zzhazVarA instanceof zzhjo)) {
                        String name = zzhazVarA.getClass().getName();
                        String strValueOf = String.valueOf(zzhazVarA.a());
                        throw new GeneralSecurityException(hz.x(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    hc3VarC = ((zzhjo) zzhazVarA).c();
                }
                zzhkpVar.a(hc3VarC, zzhlxVar);
            }
        }
        return new d83();
    }
}
