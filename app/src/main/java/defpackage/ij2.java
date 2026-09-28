package defpackage;

import com.google.android.gms.internal.consent_sdk.zzdr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 implements zzdr {
    public static final Object c = new Object();
    public volatile zzdr a;
    public volatile Object b;

    public static ij2 a(zzdr zzdrVar) {
        if (zzdrVar instanceof ij2) {
            return (ij2) zzdrVar;
        }
        ij2 ij2Var = new ij2();
        ij2Var.b = c;
        ij2Var.a = zzdrVar;
        return ij2Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object zza() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZza = this.a.zza();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objZza) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZza + ". This is likely due to a circular dependency.");
                }
                this.b = objZza;
                this.a = null;
                return objZza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
