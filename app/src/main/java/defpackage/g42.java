package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzgzl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g42 implements zzasc, BaseGmsClient$BaseOnConnectionFailedListener, zzgzl {
    public final /* synthetic */ zzcen a;

    public g42(zzcen zzcenVar) {
        this.a = zzcenVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.a.b(new RuntimeException("Connection failed."));
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzo.zzf("Failed to load media data due to video view load failure.");
        this.a.b(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo5zzb(Object obj) {
        zzcjl zzcjlVar = (zzcjl) obj;
        zzcen zzcenVar = this.a;
        if (zzcjlVar == null) {
            zzcenVar.b(new zzenv(1, "Missing webview from video view future."));
        } else {
            zzcjlVar.zzab("/video", new zzchd(new k72(zzcenVar)));
            zzcjlVar.zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public void zza(zzash zzashVar) {
        this.a.b(zzashVar);
    }
}
