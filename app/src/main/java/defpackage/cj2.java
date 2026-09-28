package defpackage;

import com.google.android.gms.internal.ads.zzcwi;
import com.google.android.gms.internal.ads.zzekg;
import com.google.android.gms.internal.ads.zzekh;
import com.google.android.gms.internal.ads.zzemm;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cj2 implements zzcwi {
    public final Map a;
    public final Map b;
    public final Map c;
    public final se3 d;
    public final tj2 e;

    public cj2(Map map, Map map2, Map map3, se3 se3Var, tj2 tj2Var) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = se3Var;
        this.e = tj2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final zzekg zza(int i, String str) {
        zzekg zzekgVarZza;
        zzekg zzekgVar = (zzekg) this.a.get(str);
        if (zzekgVar != null) {
            return zzekgVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzemm zzemmVar = (zzemm) this.c.get(str);
            if (zzemmVar != null) {
                return new zzekh(zzemmVar, ox1.i);
            }
            zzekgVarZza = (zzekg) this.b.get(str);
            if (zzekgVarZza == null) {
                return null;
            }
        } else if (this.e.d == null || (zzekgVarZza = ((zzcwi) this.d.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzekh(zzekgVarZza, ox1.h);
    }
}
