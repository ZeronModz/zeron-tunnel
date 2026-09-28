package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ab2 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final r92 b;

    public ab2(r92 r92Var, Handler handler) {
        this.b = r92Var;
        Looper looper = handler.getLooper();
        String str = wt2.a;
        this.a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        ph phVar = new ph(this, i, 8);
        String str = wt2.a;
        Handler handler = this.a;
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                phVar.run();
            } else {
                handler.post(phVar);
            }
        }
    }
}
