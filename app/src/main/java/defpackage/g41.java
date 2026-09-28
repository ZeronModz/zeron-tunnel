package defpackage;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m;
import dev.zeron.tunnel.R;
import com.v2ray.ang.ui.RoutingSettingActivity;
import defpackage.hv;
import defpackage.lv;
import defpackage.oy;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g41 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoutingSettingActivity b;

    public /* synthetic */ g41(RoutingSettingActivity routingSettingActivity, int i) {
        this.a = i;
        this.b = routingSettingActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, final int i) {
        int i2 = this.a;
        final RoutingSettingActivity routingSettingActivity = this.b;
        switch (i2) {
            case 0:
                int i3 = RoutingSettingActivity.j;
                try {
                    Object value = routingSettingActivity.f.getValue();
                    value.getClass();
                    String str = ((String[]) value)[i];
                    Lazy lazy = zq0.a;
                    zq0.z().i("pref_routing_domain_strategy", str);
                    routingSettingActivity.h().d.setText(str);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                int i4 = RoutingSettingActivity.j;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(routingSettingActivity);
                alertDialog$Builder.b(R.string.routing_settings_import_rulesets_tip);
                alertDialog$Builder.d(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.v2ray.ang.ui.h
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i5) {
                        RoutingSettingActivity routingSettingActivity2 = routingSettingActivity;
                        int i6 = i;
                        int i7 = RoutingSettingActivity.j;
                        try {
                            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(routingSettingActivity2);
                            lv lvVar = oy.a;
                            kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new RoutingSettingActivity$importPredefined$1$1$1(routingSettingActivity2, i6, null), 2);
                        } catch (Exception unused2) {
                        }
                    }
                });
                alertDialog$Builder.c(android.R.string.cancel, new k(5));
                alertDialog$Builder.f();
                break;
        }
    }
}
