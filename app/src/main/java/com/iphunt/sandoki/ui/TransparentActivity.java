package com.iphunt.sandoki.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.ez0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class TransparentActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean b = false;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z || this.b) {
            return;
        }
        this.b = true;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("command", "timed_toggle");
            showAssist(bundle);
            this.a.postDelayed(new ez0(22, this, bundle), 2000L);
        } catch (Exception unused) {
            finish();
        }
    }
}
