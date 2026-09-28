package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fb2 {
    public final AudioManager.OnAudioFocusChangeListener a;
    public final Handler b;
    public final gh2 c;
    public final Object d;

    public fb2(r92 r92Var, Handler handler, gh2 gh2Var) {
        this.b = handler;
        this.c = gh2Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.a = new ab2(r92Var, handler);
        } else {
            this.a = r92Var;
        }
        this.d = i >= 26 ? new AudioFocusRequest.Builder(1).setAudioAttributes(gh2Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(r92Var, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb2)) {
            return false;
        }
        fb2 fb2Var = (fb2) obj;
        return Objects.equals(this.a, fb2Var.a) && Objects.equals(this.b, fb2Var.b) && Objects.equals(this.c, fb2Var.c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.a, this.b, this.c, Boolean.FALSE);
    }
}
