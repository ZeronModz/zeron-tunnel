package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.v2ray.ang.service.V2RayVpnService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bm1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ V2RayVpnService a;

    public bm1(V2RayVpnService v2RayVpnService) {
        this.a = v2RayVpnService;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.setUnderlyingNetworks(new Network[]{network});
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        this.a.setUnderlyingNetworks(new Network[]{network});
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.setUnderlyingNetworks(null);
    }
}
