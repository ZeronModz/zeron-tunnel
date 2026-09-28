package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bk3 {
    public final AudioTrack a;
    public final Handler b;
    public ak3 c;
    public final ik3 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ak3, android.media.AudioRouting$OnRoutingChangedListener] */
    public /* synthetic */ bk3(AudioTrack audioTrack, ik3 ik3Var) {
        this.a = audioTrack;
        this.d = ik3Var;
        Handler handlerN = wt2.n();
        this.b = handlerN;
        ?? r0 = new AudioRouting$OnRoutingChangedListener() { // from class: ak3
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                bk3 bk3Var = this.a;
                if (bk3Var.c == null) {
                    return;
                }
                ii2.B().execute(new wn2(28, bk3Var, audioRouting));
            }
        };
        this.c = r0;
        audioTrack.addOnRoutingChangedListener((AudioRouting$OnRoutingChangedListener) r0, handlerN);
    }

    public final /* synthetic */ void a(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.b.post(new rj3(2, this, routedDevice));
        }
    }

    public final /* synthetic */ void b() {
        ak3 ak3Var = this.c;
        ak3Var.getClass();
        this.a.removeOnRoutingChangedListener(ak3Var);
        this.c = null;
    }
}
