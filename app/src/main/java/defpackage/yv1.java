package defpackage;

import com.google.android.play.core.appupdate.internal.zzaf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 implements zzaf {
    public static final Object c = new Object();
    public volatile zzaf a;
    public volatile Object b;

    public static zzaf a(zzaf zzafVar) {
        if (zzafVar instanceof yv1) {
            return zzafVar;
        }
        yv1 yv1Var = new yv1();
        yv1Var.b = c;
        yv1Var.a = zzafVar;
        return yv1Var;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        Object objZza;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.b;
                if (objZza == obj2) {
                    objZza = this.a.zza();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.b = objZza;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
