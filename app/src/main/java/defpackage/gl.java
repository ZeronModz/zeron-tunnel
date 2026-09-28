package defpackage;

import android.content.DialogInterface;
import com.journeyapps.barcodescanner.CaptureManager;
import com.v2ray.ang.AppConfig;
import com.v2ray.ang.ui.ServerActivity;
import com.v2ray.ang.ui.ServerCustomConfigActivity;
import com.v2ray.ang.ui.UserAssetActivity;
import com.v2ray.ang.ui.UserAssetUrlActivity;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gl implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((CaptureManager) obj).a.finish();
                break;
            case 1:
                ServerActivity serverActivity = (ServerActivity) obj;
                int i3 = ServerActivity.h0;
                Lazy lazy = zq0.a;
                zq0.F(serverActivity.l());
                serverActivity.finish();
                break;
            case 2:
                ServerCustomConfigActivity serverCustomConfigActivity = (ServerCustomConfigActivity) obj;
                int i4 = ServerCustomConfigActivity.f;
                Lazy lazy2 = zq0.a;
                zq0.F(serverCustomConfigActivity.i());
                serverCustomConfigActivity.finish();
                break;
            case 3:
                UserAssetActivity userAssetActivity = (UserAssetActivity) obj;
                int i5 = UserAssetActivity.j;
                try {
                    AppConfig.a.getClass();
                    Object obj2 = AppConfig.j.get(i);
                    obj2.getClass();
                    String str = (String) obj2;
                    Lazy lazy3 = zq0.a;
                    zq0.z().i("pref_geo_files_sources", str);
                    userAssetActivity.k().e.setText(str);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                UserAssetUrlActivity userAssetUrlActivity = (UserAssetUrlActivity) obj;
                int i6 = UserAssetUrlActivity.h;
                Lazy lazy4 = zq0.a;
                String strI = userAssetUrlActivity.i();
                strI.getClass();
                zq0.r().o(strI);
                userAssetUrlActivity.finish();
                break;
        }
    }
}
