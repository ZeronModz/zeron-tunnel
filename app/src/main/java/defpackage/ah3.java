package defpackage;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ah3 extends zzai {
    public final /* synthetic */ zzo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah3(zzn zznVar, zzo zzoVar) {
        super("getValue");
        this.c = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        n8.R("getValue", 2, list);
        zzao zzaoVarB = zzgVar.b.b(zzgVar, (zzao) list.get(0));
        zzao zzaoVarB2 = zzgVar.b.b(zzgVar, (zzao) list.get(1));
        String strMo64zza = this.c.mo64zza(zzaoVarB.zzc());
        return strMo64zza != null ? new zzas(strMo64zza) : zzaoVarB2;
    }
}
