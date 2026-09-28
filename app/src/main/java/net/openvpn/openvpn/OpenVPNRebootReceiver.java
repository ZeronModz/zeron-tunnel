package net.openvpn.openvpn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class OpenVPNRebootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BaseActivity.b.getClass();
        context.getClass();
        PrefUtil prefUtil = new PrefUtil(context.getSharedPreferences(PreferenceManager.a(context), 0));
        String strC = prefUtil.c("autostart_profile_name");
        if (strC != null) {
            SharedPreferences.Editor editorEdit = prefUtil.a.edit();
            editorEdit.remove("autostart_profile_name");
            editorEdit.apply();
            if (prefUtil.b("autostart")) {
                Intent intentPutExtra = new Intent(context, (Class<?>) Hometab.class).addFlags(268468224).putExtra("net.openvpn.openvpn.AUTOSTART_PROFILE_NAME", strC);
                intentPutExtra.getClass();
                context.startActivity(intentPutExtra);
                intentPutExtra.toString();
            }
        }
    }
}
