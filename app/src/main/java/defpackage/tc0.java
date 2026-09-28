package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.TextView;
import com.v2ray.ang.ui.HomeFragment;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tc0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeFragment b;

    public /* synthetic */ tc0(HomeFragment homeFragment, int i) {
        this.a = i;
        this.b = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        HomeFragment homeFragment = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int i2 = HomeFragment.f2;
                if (iIntValue == 0) {
                    homeFragment.M0();
                } else if (iIntValue == 1) {
                    homeFragment.j0();
                } else if (iIntValue == 2) {
                    Uri uri = Uri.parse("https://vpnprous.com/");
                    try {
                        homeFragment.U(new Intent("android.intent.action.VIEW", uri));
                    } catch (ActivityNotFoundException unused) {
                        homeFragment.U(new Intent("android.intent.action.VIEW", uri));
                    }
                } else if (iIntValue == 3) {
                    homeFragment.L().finish();
                }
                break;
            case 1:
                Long l = (Long) obj;
                TextView textView = homeFragment.Y0;
                if (textView != null) {
                    l.getClass();
                    textView.setText(HomeFragment.s0(l.longValue()));
                }
                break;
            case 2:
                Long l2 = (Long) obj;
                TextView textView2 = homeFragment.Z0;
                if (textView2 != null) {
                    l2.getClass();
                    textView2.setText(HomeFragment.s0(l2.longValue()));
                }
                break;
            case 3:
                int i3 = HomeFragment.f2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Lazy lazy = zq0.a;
                int iC = (int) ((jElapsedRealtime - zq0.u().c(0L, "v2rayTime")) / 1000);
                TextView textView3 = homeFragment.X0;
                if (textView3 != null) {
                    textView3.setText(HomeFragment.t0(iC));
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                int i4 = HomeFragment.f2;
                if (iIntValue2 == 0) {
                    homeFragment.M0();
                } else if (iIntValue2 == 1) {
                    homeFragment.j0();
                } else if (iIntValue2 == 2) {
                    Uri uri2 = Uri.parse("https://vpnprous.com/");
                    try {
                        homeFragment.U(new Intent("android.intent.action.VIEW", uri2));
                    } catch (ActivityNotFoundException unused2) {
                        homeFragment.U(new Intent("android.intent.action.VIEW", uri2));
                    }
                } else if (iIntValue2 == 3) {
                    homeFragment.L().finish();
                }
                break;
        }
        return mk1Var;
        return mk1Var;
    }
}
