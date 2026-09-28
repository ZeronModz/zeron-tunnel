package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzcdu;
import java.util.Objects;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q92 extends zzb {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public q92(zzcdu zzcduVar) {
        Objects.requireNonNull(zzcduVar);
        this.b = zzcduVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        switch (this.a) {
            case 0:
                try {
                    try {
                        isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging((Context) this.b);
                    } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
                        e = e;
                        zzo.zzg("Fail to get isAdIdFakeForDebugLogging", e);
                        isAdIdFakeForDebugLogging = false;
                        zzl.zzh(isAdIdFakeForDebugLogging);
                        StringBuilder sb = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
                        sb.append("Update ad debug logging enablement as ");
                        sb.append(isAdIdFakeForDebugLogging);
                        zzo.zzi(sb.toString());
                        return;
                    }
                    break;
                } catch (GooglePlayServicesNotAvailableException e2) {
                    e = e2;
                    zzo.zzg("Fail to get isAdIdFakeForDebugLogging", e);
                    isAdIdFakeForDebugLogging = false;
                    zzl.zzh(isAdIdFakeForDebugLogging);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
                    sb2.append("Update ad debug logging enablement as ");
                    sb2.append(isAdIdFakeForDebugLogging);
                    zzo.zzi(sb2.toString());
                    return;
                } catch (GooglePlayServicesRepairableException e3) {
                    e = e3;
                    zzo.zzg("Fail to get isAdIdFakeForDebugLogging", e);
                    isAdIdFakeForDebugLogging = false;
                    zzl.zzh(isAdIdFakeForDebugLogging);
                    StringBuilder sb22 = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
                    sb22.append("Update ad debug logging enablement as ");
                    sb22.append(isAdIdFakeForDebugLogging);
                    zzo.zzi(sb22.toString());
                    return;
                } catch (IllegalStateException e4) {
                    e = e4;
                    zzo.zzg("Fail to get isAdIdFakeForDebugLogging", e);
                    isAdIdFakeForDebugLogging = false;
                    zzl.zzh(isAdIdFakeForDebugLogging);
                    StringBuilder sb222 = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
                    sb222.append("Update ad debug logging enablement as ");
                    sb222.append(isAdIdFakeForDebugLogging);
                    zzo.zzi(sb222.toString());
                    return;
                }
                zzl.zzh(isAdIdFakeForDebugLogging);
                StringBuilder sb2222 = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
                sb2222.append("Update ad debug logging enablement as ");
                sb2222.append(isAdIdFakeForDebugLogging);
                zzo.zzi(sb2222.toString());
                return;
            default:
                zzcdu zzcduVar = (zzcdu) this.b;
                zzbhh zzbhhVar = new zzbhh(zzcduVar.e, zzcduVar.f.afmaVersion);
                synchronized (zzcduVar.a) {
                    try {
                        zzt.zzm();
                        zzbhk.a(zzcduVar.h, zzbhhVar);
                    } catch (IllegalArgumentException e5) {
                        zzo.zzj("Cannot config CSI reporter.", e5);
                    }
                    break;
                }
                return;
        }
    }

    public q92(Context context) {
        this.b = context;
    }
}
