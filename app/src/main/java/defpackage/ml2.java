package defpackage;

import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzgaf;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ml2 {
    public final zzgaf a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public ml2(zzgaf zzgafVar) {
        this.a = zzgafVar;
    }

    public final void a(zzbdz zzbdzVar) {
        this.c.set(true);
        synchronized (zzbdzVar.a) {
            try {
                l12 l12Var = zzbdzVar.b;
                if (l12Var == null) {
                    l12Var = new l12();
                    zzbdzVar.b = l12Var;
                }
                l12Var.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.zza();
    }
}
