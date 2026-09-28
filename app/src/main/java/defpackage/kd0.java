package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.sandok.tunnel.service.InjectorService;
import com.v2ray.ang.ui.HomeFragment;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kd0 implements ServiceConnection {
    public final /* synthetic */ HomeFragment a;

    public kd0(HomeFragment homeFragment) {
        this.a = homeFragment;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        iBinder.getClass();
        InjectorService service = ((InjectorService.MyBinder) iBinder).getService();
        HomeFragment homeFragment = this.a;
        homeFragment.d2 = service;
        if (service != null) {
            service.setInjectorListener(homeFragment);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
