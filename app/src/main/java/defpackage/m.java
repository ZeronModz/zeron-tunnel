package defpackage;

import android.widget.CompoundButton;
import com.v2ray.ang.ui.AboutActivity;
import com.v2ray.ang.ui.PerAppProxyActivity;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                int i = AboutActivity.g;
                compoundButton.getClass();
                Lazy lazy = zq0.a;
                zq0.z().k("pref_check_update_pre_release", z);
                break;
            case 1:
                int i2 = PerAppProxyActivity.f;
                compoundButton.getClass();
                Lazy lazy2 = zq0.a;
                zq0.z().k("pref_per_app_proxy", z);
                break;
            default:
                int i3 = PerAppProxyActivity.f;
                compoundButton.getClass();
                Lazy lazy3 = zq0.a;
                zq0.z().k("pref_bypass_apps", z);
                break;
        }
    }
}
