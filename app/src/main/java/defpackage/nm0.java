package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.sandok.tunnel.service.OpenVPNService;
import com.v2ray.ang.ui.LogsFragment;
import java.util.Objects;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nm0 implements ServiceConnection {
    public final /* synthetic */ LogsFragment a;

    public nm0(LogsFragment logsFragment) {
        this.a = logsFragment;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ArrayDeque<OpenVPNService.LogMsg> arrayDequeLog_history;
        OpenVPNService.EventMsg eventMsg;
        OpenVPNService.EventMsg eventMsg2;
        iBinder.getClass();
        OpenVPNService service = ((OpenVPNService.LocalBinder) iBinder).getService();
        LogsFragment logsFragment = this.a;
        logsFragment.d0 = service;
        Objects.toString(service);
        OpenVPNService openVPNService = logsFragment.d0;
        if (openVPNService != null) {
            openVPNService.client_attach(logsFragment);
        }
        if (logsFragment.b0) {
            return;
        }
        logsFragment.b0 = true;
        OpenVPNService openVPNService2 = logsFragment.d0;
        if (openVPNService2 != null && (eventMsg2 = openVPNService2.get_last_event_prof_manage()) != null) {
            logsFragment.X(eventMsg2);
        }
        OpenVPNService openVPNService3 = logsFragment.d0;
        if (openVPNService3 != null && (eventMsg = openVPNService3.get_last_event()) != null) {
            logsFragment.X(eventMsg);
        }
        OpenVPNService openVPNService4 = logsFragment.d0;
        if (openVPNService4 == null || (arrayDequeLog_history = openVPNService4.log_history()) == null) {
            return;
        }
        Iterator<T> it = arrayDequeLog_history.iterator();
        while (it.hasNext()) {
            String str = ((OpenVPNService.LogMsg) it.next()).line;
            if (str != null) {
                logsFragment.W(str);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.d0 = null;
    }
}
