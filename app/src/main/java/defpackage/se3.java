package defpackage;

import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class se3 implements zzikp, zzika {
    public static final Object c = new Object();
    public volatile zzikp a;
    public volatile Object b = c;

    public se3(zzikp zzikpVar) {
        this.a = zzikpVar;
    }

    public static se3 a(zzikp zzikpVar) {
        return zzikpVar instanceof se3 ? (se3) zzikpVar : new se3(zzikpVar);
    }

    public static zzika b(zzikp zzikpVar) {
        if (zzikpVar instanceof zzika) {
            return (zzika) zzikpVar;
        }
        zzikpVar.getClass();
        return new se3(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
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
                Object objZzb = this.a.zzb();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.b = objZzb;
                this.a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
