package com.iphunt.sandoki.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.service.voice.VoiceInteractionSession;
import defpackage.j60;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MyInteractionSession extends VoiceInteractionSession {
    public static final /* synthetic */ int c = 0;
    public final Handler a;
    public Bundle b;

    public MyInteractionSession(Context context) {
        super(context);
        this.a = new Handler(Looper.getMainLooper());
    }

    public final void a(boolean z) {
        try {
            Intent intent = new Intent("android.settings.VOICE_CONTROL_AIRPLANE_MODE");
            intent.putExtra("airplane_mode_enabled", z);
            intent.addFlags(268435456);
            startVoiceActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // android.service.voice.VoiceInteractionSession
    public final void onHandleAssist(VoiceInteractionSession.AssistState assistState) {
        boolean z;
        Bundle bundle;
        super.onHandleAssist(assistState);
        Bundle assistData = assistState.getAssistData();
        String string = assistData != null ? assistData.getString("command") : null;
        if (string == null && (bundle = this.b) != null) {
            string = bundle.getString("command");
        }
        if (string == null) {
            string = "timed_toggle";
        }
        z = false;
        switch (string) {
            case "turn_on":
                a(true);
                break;
            case "smart_toggle":
                try {
                    if (Settings.Global.getInt(getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
                a(!z);
                break;
            case "turn_off":
                a(false);
                break;
            case "timed_toggle":
                a(true);
                this.a.postDelayed(new j60(this, 9), 2000L);
                break;
        }
    }
}
