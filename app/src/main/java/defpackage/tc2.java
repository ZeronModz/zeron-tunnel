package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzfc;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tc2 implements zzikg {
    public final sc2 a;

    public tc2(sc2 sc2Var) {
        this.a = sc2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        zzfc liteSdkVersion;
        zzcy zzcyVar = gu2.a(this.a.a()).b;
        if (zzcyVar != null) {
            try {
                liteSdkVersion = zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
                liteSdkVersion = null;
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.zzb();
        }
        return null;
    }
}
