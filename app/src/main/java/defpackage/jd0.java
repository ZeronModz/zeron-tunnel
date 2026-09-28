package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.sandok.tunnel.service.OpenVPNService;
import com.v2ray.ang.ui.HomeFragment;
import java.util.Objects;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jd0 implements ServiceConnection {
    public final /* synthetic */ HomeFragment a;

    public jd0(HomeFragment homeFragment) {
        this.a = homeFragment;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws JSONException {
        OpenVPNService.ProfileList profileList;
        Intent intent;
        String stringExtra;
        OpenVPNService.ProfileList profileList2;
        iBinder.getClass();
        OpenVPNService service = ((OpenVPNService.LocalBinder) iBinder).getService();
        HomeFragment homeFragment = this.a;
        homeFragment.Y1 = service;
        Objects.toString(service);
        if (!homeFragment.S1) {
            OpenVPNService openVPNService = homeFragment.Y1;
            if (openVPNService != null) {
                openVPNService.client_attach(homeFragment);
            }
            homeFragment.S1 = true;
        }
        homeFragment.U1 |= 1;
        boolean zH0 = homeFragment.h0();
        int i = homeFragment.U1;
        int i2 = homeFragment.V1;
        if ((i & i2) == i2 && (stringExtra = (intent = homeFragment.L().getIntent()).getStringExtra("net.openvpn.openvpn.AUTOSTART_PROFILE_NAME")) != null) {
            String.format("CLI: autostart: %s", Arrays.copyOf(new Object[]{stringExtra}, 1));
            intent.removeExtra("net.openvpn.openvpn.AUTOSTART_PROFILE_NAME");
            OpenVPNService openVPNService2 = homeFragment.Y1;
            if (zH0) {
                OpenVPNService.Profile profile = openVPNService2 != null ? openVPNService2.get_current_profile() : null;
                if (!yg0.a(profile != null ? profile.get_name() : null, stringExtra)) {
                    homeFragment.L0(false);
                }
            } else {
                if (openVPNService2 == null || (profileList2 = openVPNService2.get_profile_list()) == null) {
                    profileList2 = null;
                }
                if (profileList2 != null) {
                    profileList2.get_profile_by_name(stringExtra);
                }
            }
        }
        homeFragment.h0();
        OpenVPNService openVPNService3 = homeFragment.Y1;
        OpenVPNService.EventMsg eventMsg = openVPNService3 != null ? openVPNService3.get_last_event() : null;
        if (homeFragment.S1) {
            return;
        }
        if (eventMsg != null) {
            homeFragment.u0(eventMsg);
        } else {
            OpenVPNService openVPNService4 = homeFragment.Y1;
            if (openVPNService4 == null || (profileList = openVPNService4.get_profile_list()) == null) {
                profileList = null;
            }
            if ((profileList != null ? profileList.size() : 0) > 0) {
                OpenVPNService.EventMsg eventMsgDisconnected = OpenVPNService.EventMsg.disconnected();
                eventMsgDisconnected.getClass();
                homeFragment.u0(eventMsgDisconnected);
            }
        }
        OpenVPNService openVPNService5 = homeFragment.Y1;
        OpenVPNService.EventMsg eventMsg2 = openVPNService5 != null ? openVPNService5.get_last_event_prof_manage() : null;
        if (eventMsg2 != null) {
            homeFragment.u0(eventMsg2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HomeFragment homeFragment = this.a;
        homeFragment.S1 = false;
        homeFragment.Y1 = null;
    }
}
