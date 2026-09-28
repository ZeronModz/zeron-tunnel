package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzftx;
import java.util.DesugarCollections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cw2 extends zzftj {
    public static final cw2 d = new cw2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzftj
    public final boolean a() {
        Iterator it = DesugarCollections.unmodifiableCollection(dw2.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((zv2) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final void b(boolean z) {
        Iterator it = DesugarCollections.unmodifiableCollection(dw2.c.a).iterator();
        while (it.hasNext()) {
            zzftx zzftxVar = ((zv2) it.next()).d;
            if (zzftxVar.b.get() != 0) {
                i60.m.d(zzftxVar.c(), "setState", true != z ? "backgrounded" : "foregrounded", zzftxVar.a);
            }
        }
    }
}
