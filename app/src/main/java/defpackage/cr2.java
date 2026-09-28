package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzdbi;
import com.google.android.gms.internal.ads.zzerp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr2 implements zzdbi {
    public final /* synthetic */ zzerp a;
    public final /* synthetic */ zzbrb b;

    public /* synthetic */ cr2(zzerp zzerpVar, zzbrb zzbrbVar) {
        this.a = zzerpVar;
        this.b = zzbrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final /* synthetic */ void zzdI(zze zzeVar) {
        this.a.zzdI(zzeVar);
        zzbrb zzbrbVar = this.b;
        if (zzbrbVar != null) {
            try {
                zzbrbVar.zzg(zzeVar);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        if (zzbrbVar != null) {
            try {
                zzbrbVar.zzf(zzeVar.zza);
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
