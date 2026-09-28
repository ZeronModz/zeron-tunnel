package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.zzgz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d43 extends BroadcastReceiver {
    public final g0 a;
    public boolean b;
    public boolean c;

    public d43(g0 g0Var) {
        this.a = g0Var;
    }

    public final void a() {
        g0 g0Var = this.a;
        g0Var.g0();
        g0Var.zzaW().a();
        g0Var.zzaW().a();
        if (this.b) {
            g0Var.zzaV().n.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                g0Var.l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                g0Var.zzaV().f.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g0 g0Var = this.a;
        g0Var.g0();
        String action = intent.getAction();
        g0Var.zzaV().n.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            g0Var.zzaV().i.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        zzgz zzgzVar = g0Var.b;
        g0.P(zzgzVar);
        boolean zE = zzgzVar.e();
        if (this.c != zE) {
            this.c = zE;
            g0Var.zzaW().j(new pt2(this, zE));
        }
    }
}
