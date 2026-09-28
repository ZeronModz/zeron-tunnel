package com.iphunt.sandoki.ui;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class AirplaneModeViewModel extends AndroidViewModel {
    public final Context a;
    public final SharedPreferences b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public final MutableLiveData h;

    public AirplaneModeViewModel(Application application) {
        super(application);
        this.c = new MutableLiveData();
        this.d = new MutableLiveData();
        this.e = new MutableLiveData();
        this.f = new MutableLiveData();
        this.g = new MutableLiveData();
        this.h = new MutableLiveData();
        Context applicationContext = application.getApplicationContext();
        this.a = applicationContext;
        this.b = applicationContext.getSharedPreferences("airplane_mode_prefs", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            androidx.lifecycle.MutableLiveData r1 = r6.c
            r2 = 1
            r3 = 0
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Exception -> L1d
            java.lang.String r5 = "airplane_mode_on"
            int r4 = android.provider.Settings.Global.getInt(r4, r5, r3)     // Catch: java.lang.Exception -> L1d
            if (r4 != r2) goto L14
            r4 = r2
            goto L15
        L14:
            r4 = r3
        L15:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L1d
            r1.k(r4)     // Catch: java.lang.Exception -> L1d
            goto L22
        L1d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.k(r4)
        L22:
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = "voice_interaction_service"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r4)     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L39
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L39
            goto L3a
        L39:
            r2 = r3
        L3a:
            androidx.lifecycle.MutableLiveData r0 = r6.f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.k(r1)
            java.lang.String r0 = "auto_toggle_enabled"
            android.content.SharedPreferences r1 = r6.b
            boolean r0 = r1.getBoolean(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            androidx.lifecycle.MutableLiveData r2 = r6.d
            r2.k(r0)
            java.lang.String r0 = "toggle_interval"
            r2 = 15
            int r0 = r1.getInt(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.lifecycle.MutableLiveData r6 = r6.e
            r6.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iphunt.sandoki.ui.AirplaneModeViewModel.a():void");
    }
}
