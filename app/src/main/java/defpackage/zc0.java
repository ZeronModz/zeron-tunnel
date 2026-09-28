package defpackage;

import android.app.ActivityManager;
import android.content.DialogInterface;
import androidx.appcompat.app.g;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.v2ray.ang.ui.HomeFragment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeFragment b;

    public /* synthetic */ zc0(HomeFragment homeFragment, int i) {
        this.a = i;
        this.b = homeFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        HomeFragment homeFragment = this.b;
        switch (i2) {
            case 0:
                g gVar = homeFragment.I0;
                if (gVar != null) {
                    gVar.dismiss();
                }
                RewardedAd rewardedAd = homeFragment.o1;
                if (rewardedAd != null) {
                    rewardedAd.setFullScreenContentCallback(new td0(homeFragment, 0));
                }
                RewardedAd rewardedAd2 = homeFragment.o1;
                if (rewardedAd2 != null) {
                    rewardedAd2.show(homeFragment.L(), new ad0(homeFragment));
                }
                break;
            case 1:
                g gVar2 = homeFragment.I0;
                if (gVar2 != null) {
                    gVar2.dismiss();
                }
                break;
            case 2:
                int i3 = HomeFragment.f2;
                try {
                    Object systemService = homeFragment.L().getSystemService("activity");
                    systemService.getClass();
                    ((ActivityManager) systemService).clearApplicationUserData();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                g gVar3 = homeFragment.I0;
                if (gVar3 != null) {
                    gVar3.dismiss();
                }
                break;
        }
    }
}
