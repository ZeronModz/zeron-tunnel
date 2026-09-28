package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcen;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qa2 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zzcen b;

    public qa2(zzcdm zzcdmVar, Context context, zzcen zzcenVar) {
        this.a = context;
        this.b = zzcenVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcen zzcenVar = this.b;
        try {
            zzcenVar.a(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzcenVar.b(e);
            zzo.zzg("Exception while getting advertising Id info", e);
        }
    }
}
