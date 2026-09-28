package com.iphunt.sandoki.services;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MyInteractionSessionService extends VoiceInteractionSessionService {
    @Override // android.service.voice.VoiceInteractionSessionService
    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        Objects.toString(bundle);
        if (bundle != null) {
            bundle.getString("command");
        }
        MyInteractionSession myInteractionSession = new MyInteractionSession(this);
        myInteractionSession.b = bundle;
        if (bundle != null) {
            bundle.getString("command");
        }
        return myInteractionSession;
    }
}
