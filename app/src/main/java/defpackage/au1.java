package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class au1 extends zj0 implements DialogInterface.OnCancelListener {
    public volatile boolean b;
    public final AtomicReference c;
    public final zau d;
    public final GoogleApiAvailability e;

    public au1(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.c = new AtomicReference(null);
        this.d = new zau(Looper.getMainLooper());
        this.e = googleApiAvailability;
    }

    @Override // defpackage.zj0
    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new vt1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void d(ConnectionResult connectionResult, int i) {
        this.c.set(null);
        ((gs1) this).g.h(connectionResult, i);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        vt1 vt1Var = (vt1) this.c.get();
        d(connectionResult, vt1Var == null ? -1 : vt1Var.a);
    }
}
