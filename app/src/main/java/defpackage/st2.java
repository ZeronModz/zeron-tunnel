package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfio;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class st2 implements OnAdMetadataChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ IInterface b;
    public final /* synthetic */ d12 c;

    public /* synthetic */ st2(d12 d12Var, IInterface iInterface, int i) {
        this.a = i;
        this.b = iInterface;
        this.c = d12Var;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        int i = this.a;
        IInterface iInterface = this.b;
        d12 d12Var = this.c;
        switch (i) {
            case 0:
                if (((zzfii) d12Var).i != null) {
                    try {
                        ((zzdq) iInterface).zze();
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                        return;
                    }
                }
                break;
            default:
                if (((zzfio) d12Var).d != null) {
                    try {
                        ((zzcb) iInterface).zze();
                    } catch (RemoteException e2) {
                        zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
                break;
        }
    }
}
