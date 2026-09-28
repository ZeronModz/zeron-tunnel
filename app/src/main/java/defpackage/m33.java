package defpackage;

import com.google.android.gms.internal.ads.h7;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m33 extends if3 {
    @Override // defpackage.if3
    public final void U(h7 h7Var, Set set) {
        synchronized (h7Var) {
            try {
                if (h7Var.h == null) {
                    h7Var.h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.if3
    public final int X(h7 h7Var) {
        int i;
        synchronized (h7Var) {
            i = h7Var.i - 1;
            h7Var.i = i;
        }
        return i;
    }
}
