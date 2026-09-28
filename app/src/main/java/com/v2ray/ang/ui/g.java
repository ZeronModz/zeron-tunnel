package com.v2ray.ang.ui;

import android.content.DialogInterface;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m;
import dev.zeron.tunnel.R;
import defpackage.hv;
import defpackage.lv;
import defpackage.oy;
import defpackage.qf3;
import defpackage.ul1;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseActivity b;

    public /* synthetic */ g(BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = baseActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        BaseActivity baseActivity = this.b;
        switch (i2) {
            case 0:
                RoutingEditActivity routingEditActivity = (RoutingEditActivity) baseActivity;
                int i3 = RoutingEditActivity.f;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(routingEditActivity);
                lv lvVar = oy.a;
                kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new RoutingEditActivity$deleteServer$1$1(routingEditActivity, null), 2);
                break;
            case 1:
                RoutingSettingActivity routingSettingActivity = (RoutingSettingActivity) baseActivity;
                int i4 = RoutingSettingActivity.j;
                try {
                    Regex regex = ul1.a;
                    String strG = ul1.g(routingSettingActivity);
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA2 = m.a(routingSettingActivity);
                    lv lvVar2 = oy.a;
                    kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA2, hv.c, null, new RoutingSettingActivity$importFromClipboard$1$1(strG, routingSettingActivity, null), 2);
                } catch (Exception unused) {
                    qf3.M(routingSettingActivity, R.string.toast_failure);
                    return;
                }
                break;
            default:
                SubEditActivity subEditActivity = (SubEditActivity) baseActivity;
                int i5 = SubEditActivity.g;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA3 = m.a(subEditActivity);
                lv lvVar3 = oy.a;
                kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA3, hv.c, null, new SubEditActivity$deleteServer$1$1(subEditActivity, null), 2);
                break;
        }
    }
}
