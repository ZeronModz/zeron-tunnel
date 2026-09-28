package defpackage;

import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzgsb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n13 implements zzgru {
    public final zzgsb a = new zzgsb();
    public volatile zzgru b;
    public Object c;

    public n13(zzgru zzgruVar) {
        this.b = zzgruVar;
    }

    public final String toString() {
        Object objT = this.b;
        if (objT == ot2.g) {
            String strValueOf = String.valueOf(this.c);
            objT = vh.t(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objT);
        return vh.t(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public final Object mo10zza() {
        zzgru zzgruVar = this.b;
        ot2 ot2Var = ot2.g;
        if (zzgruVar != ot2Var) {
            synchronized (this.a) {
                try {
                    if (this.b != ot2Var) {
                        Object objMo10zza = this.b.mo10zza();
                        this.c = objMo10zza;
                        this.b = ot2Var;
                        return objMo10zza;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
