package defpackage;

import android.content.IntentFilter;
import androidx.appcompat.app.k;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s6 {
    public r6 a;
    public final /* synthetic */ k b;

    public s6(k kVar) {
        this.b = kVar;
    }

    public final void a() {
        r6 r6Var = this.a;
        if (r6Var != null) {
            try {
                this.b.k.unregisterReceiver(r6Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public abstract void d();

    public final void e() {
        a();
        IntentFilter intentFilterB = b();
        if (intentFilterB.countActions() == 0) {
            return;
        }
        r6 r6Var = this.a;
        if (r6Var == null) {
            r6Var = new r6(this, 0);
            this.a = r6Var;
        }
        this.b.k.registerReceiver(r6Var, intentFilterB);
    }
}
