package com.v2ray.ang.ui;

import android.os.Bundle;
import dev.zeron.tunnel.R;
import kotlin.Metadata;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/ScSwitchActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScSwitchActivity extends BaseActivity {
    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        moveTaskToBack(true);
        setContentView(R.layout.activity_none);
        CoreController coreController = com.v2ray.ang.service.b.a;
        if (com.v2ray.ang.service.b.a.getIsRunning()) {
            com.v2ray.ang.service.b.g(this);
        } else {
            com.v2ray.ang.service.b.e(this);
        }
        finish();
    }
}
