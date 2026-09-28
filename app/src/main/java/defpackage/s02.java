package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s02 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t02 b;

    public /* synthetic */ s02(t02 t02Var, int i) {
        this.a = i;
        this.b = t02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t02 t02Var = this.b;
                try {
                    if (t02Var.f == null && t02Var.g) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(t02Var.a);
                        advertisingIdClient.start();
                        t02Var.f = advertisingIdClient;
                        break;
                    }
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
                    t02Var.f = null;
                    return;
                }
                break;
            default:
                p32.a(this.b.a);
                break;
        }
    }
}
