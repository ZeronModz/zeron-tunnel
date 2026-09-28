package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.NetworkStateTracker24;
import com.google.android.gms.internal.ads.zzcdu;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jt0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public jt0(zzcdu zzcduVar) {
        this.a = 2;
        Objects.requireNonNull(zzcduVar);
        this.b = zzcduVar;
    }

    private final void a(Network network, NetworkCapabilities networkCapabilities) {
        m03 m03Var = (m03) this.b;
        synchronized (m03Var) {
            m03Var.c = networkCapabilities;
        }
    }

    private final void b(Network network) {
        synchronized (h02.class) {
            ((h02) this.b).a = null;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 2:
                ((zzcdu) this.b).p.set(true);
                break;
            case 3:
                ((ov2) this.b).b(true);
                break;
            case 4:
                ((tv2) this.b).c(true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                Logger loggerA = Logger.a();
                int i = kt0.a;
                networkCapabilities.toString();
                loggerA.getClass();
                NetworkStateTracker24 networkStateTracker24 = (NetworkStateTracker24) this.b;
                networkStateTracker24.b(Build.VERSION.SDK_INT >= 28 ? new NetworkState(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : kt0.a(networkStateTracker24.f));
                return;
            case 1:
                synchronized (h02.class) {
                    ((h02) this.b).a = networkCapabilities;
                    break;
                }
                return;
            case 5:
                a(network, networkCapabilities);
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                network.getClass();
                Logger loggerA = Logger.a();
                int i = kt0.a;
                loggerA.getClass();
                NetworkStateTracker24 networkStateTracker24 = (NetworkStateTracker24) this.b;
                networkStateTracker24.b(kt0.a(networkStateTracker24.f));
                return;
            case 1:
                b(network);
                return;
            case 2:
                ((zzcdu) this.b).p.set(false);
                return;
            case 3:
                ((ov2) this.b).b(false);
                return;
            case 4:
                ((tv2) this.b).c(false);
                return;
            default:
                m03 m03Var = (m03) this.b;
                synchronized (m03Var) {
                    m03Var.c = null;
                    break;
                }
                return;
        }
    }

    public /* synthetic */ jt0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public jt0(ov2 ov2Var) {
        this.a = 3;
        Objects.requireNonNull(ov2Var);
        this.b = ov2Var;
    }

    public jt0(tv2 tv2Var) {
        this.a = 4;
        Objects.requireNonNull(tv2Var);
        this.b = tv2Var;
    }
}
