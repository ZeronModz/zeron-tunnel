package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.ui.AboutActivity;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.ui.RoutingEditActivity;
import com.v2ray.ang.ui.RoutingSettingActivity;
import com.v2ray.ang.ui.ServerActivity;
import com.v2ray.ang.ui.ServerCustomConfigActivity;
import com.v2ray.ang.ui.SubEditActivity;
import com.v2ray.ang.ui.UserAssetUrlActivity;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                int i2 = AboutActivity.g;
                dialogInterface.dismiss();
                break;
            case 1:
                int i3 = HomeFragment.f2;
                new Handler(Looper.getMainLooper()).postDelayed(new j4(3), 300L);
                break;
            case 2:
                int i4 = HomeFragment.f2;
                Lazy lazy = zq0.a;
                zq0.u().k("OwnCOnfigSwitch", false);
                dialogInterface.dismiss();
                break;
            case 3:
                Hometab.Companion companion = Hometab.n;
                dialogInterface.dismiss();
                break;
            case 4:
                int i5 = RoutingEditActivity.f;
                break;
            case 5:
                int i6 = RoutingSettingActivity.j;
                break;
            case 6:
                int i7 = ServerActivity.h0;
                break;
            case 7:
                int i8 = ServerCustomConfigActivity.f;
                break;
            case 8:
                int i9 = SubEditActivity.g;
                break;
            case 9:
                break;
            default:
                int i10 = UserAssetUrlActivity.h;
                break;
        }
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }
}
