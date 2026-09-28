package com.v2ray.ang.ui;

import android.view.View;
import androidx.lifecycle.m;
import com.google.android.material.button.MaterialButton;
import defpackage.oy;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AboutActivity aboutActivity = (AboutActivity) obj;
                int i2 = AboutActivity.g;
                kotlinx.coroutines.c.d(m.a(aboutActivity), null, null, new AboutActivity$checkForUpdates$1(aboutActivity.i().b.isChecked(), aboutActivity, null), 3);
                break;
            default:
                HomeFragment homeFragment = (HomeFragment) obj;
                int i3 = HomeFragment.f2;
                homeFragment.A0("Starting");
                MaterialButton materialButton = homeFragment.P0;
                if (materialButton != null) {
                    materialButton.setEnabled(false);
                }
                kotlinx.coroutines.c.d(m.a(homeFragment), oy.a, null, new HomeFragment$initViews$6$1(homeFragment, null), 2);
                break;
        }
    }
}
