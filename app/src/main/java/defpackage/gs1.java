package defpackage;

import androidx.collection.ArraySet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 extends au1 {
    public final ArraySet f;
    public final b g;

    public gs1(LifecycleFragment lifecycleFragment, b bVar, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f = new ArraySet();
        this.g = bVar;
        lifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @Override // defpackage.zj0
    public final void c() {
        this.b = false;
        b bVar = this.g;
        bVar.getClass();
        synchronized (b.r) {
            try {
                if (bVar.k == this) {
                    bVar.k = null;
                    bVar.l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.f.isEmpty()) {
            return;
        }
        this.g.a(this);
    }
}
