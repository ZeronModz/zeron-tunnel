package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;

 
 
public final class bk3 {
    public final AudioTrack a;
    public final Handler b;
    public ak3 c;
    public final ik3 d;

     
     
    public   bk3(AudioTrack audioTrack, ik3 ik3Var) {
        this.a = audioTrack;
        this.d = ik3Var;
        Handler handlerN = wt2.n();
        this.b = handlerN;
        AudioRouting$OnRoutingChangedListener r0 = new AudioRouting$OnRoutingChangedListener() { // from class: ak3
            public final   void onRoutingChanged(AudioRouting audioRouting) {
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

    public final   void a(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.b.post(new rj3(2, this, routedDevice));
        }
    }

    public final   void b() {
        ak3 ak3Var = this.c;
        ak3Var.getClass();
        this.a.removeOnRoutingChangedListener(ak3Var);
        this.c = null;
    }
}
