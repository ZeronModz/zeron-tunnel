package defpackage;

import com.google.android.gms.internal.ads.zzfti;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzftx;
import java.util.DesugarCollections;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bw2 implements zzfti {
    public static final bw2 e = new bw2(new zzftj());
    public Date a;
    public boolean b;
    public final zzftj c;
    public boolean d;

    public bw2(zzftj zzftjVar) {
        this.c = zzftjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final void zzd(boolean z) {
        if (!this.d && z) {
            Date date = new Date();
            Date date2 = this.a;
            if (date2 == null || date.after(date2)) {
                this.a = date;
                if (this.b) {
                    Iterator it = DesugarCollections.unmodifiableCollection(dw2.c.b).iterator();
                    while (it.hasNext()) {
                        zzftx zzftxVar = ((zv2) it.next()).d;
                        Date date3 = this.a;
                        zzftxVar.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.d = z;
    }
}
