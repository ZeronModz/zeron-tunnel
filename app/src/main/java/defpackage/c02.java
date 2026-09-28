package defpackage;

import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzan;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c02 extends kz1 {
    public final /* synthetic */ int b;

    public /* synthetic */ c02(int i) {
        this.b = i;
    }

    public static zzan c(zzg zzgVar, List list) {
        n8.a0(zzbk.FN.name(), 2, list);
        zzao zzaoVarB = zzgVar.b.b(zzgVar, (zzao) list.get(0));
        zzao zzaoVarB2 = zzgVar.b.b(zzgVar, (zzao) list.get(1));
        if (!(zzaoVarB2 instanceof zzae)) {
            u7.r(vh.l("FN requires an ArrayValue of parameter names found ", zzaoVarB2.getClass().getCanonicalName()));
            return null;
        }
        List listA = ((zzae) zzaoVarB2).a();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzan(zzaoVarB.zzc(), listA, arrayList, zzgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:369:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.measurement.zzg] */
    /* JADX WARN: Type inference failed for: r5v29, types: [com.google.android.gms.internal.measurement.zzao] */
    /* JADX WARN: Type inference failed for: r8v174 */
    /* JADX WARN: Type inference failed for: r8v179 */
    /* JADX WARN: Type inference failed for: r8v200, types: [com.google.android.gms.internal.measurement.zzae] */
    /* JADX WARN: Type inference failed for: r8v207, types: [com.google.android.gms.internal.measurement.zzal] */
    /* JADX WARN: Type inference failed for: r8v244 */
    /* JADX WARN: Type inference failed for: r8v245 */
    @Override // defpackage.kz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzao a(java.lang.String r9, com.google.android.gms.internal.measurement.zzg r10, java.util.ArrayList r11) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c02.a(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.ArrayList):com.google.android.gms.internal.measurement.zzao");
    }
}
