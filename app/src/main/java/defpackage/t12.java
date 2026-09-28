package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzh;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 extends zzc {
    public final /* synthetic */ int a = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public t12(Context context, Looper looper, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener) {
        int i = s92.a;
        Context applicationContext = context.getApplicationContext();
        super(applicationContext == null ? context : applicationContext, looper, 123, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, null);
    }

    public boolean b() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (((Boolean) zzbd.zzc().a(p32.w2)).booleanValue()) {
            Feature feature = zzh.zza;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!dn0.p(availableFeatures[i], feature)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder iBinder) {
        switch (this.a) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof v12 ? (v12) iInterfaceQueryLocalInterface : new v12(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof r62 ? (r62) iInterfaceQueryLocalInterface2 : new r62(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public Feature[] getApiFeatures() {
        switch (this.a) {
            case 0:
                return zzh.zzb;
            default:
                return super.getApiFeatures();
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        switch (this.a) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            default:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        switch (this.a) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            default:
                return "com.google.android.gms.ads.service.HTTP";
        }
    }

    public /* synthetic */ t12(Context context, Looper looper, int i, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener, String str) {
        super(context, looper, i, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, str);
    }
}
