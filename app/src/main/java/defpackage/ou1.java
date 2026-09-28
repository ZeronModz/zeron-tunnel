package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zzc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ou1 extends zzc {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou1(b bVar, int i, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f = bVar;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        b bVar = this.f;
        int i = this.d;
        if (i != 0) {
            bVar.zzd(1, null);
            Bundle bundle = this.e;
            e(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable(b.KEY_PENDING_INTENT) : null));
        } else {
            if (d()) {
                return;
            }
            bVar.zzd(1, null);
            e(new ConnectionResult(8, null));
        }
    }

    public abstract boolean d();

    public abstract void e(ConnectionResult connectionResult);
}
