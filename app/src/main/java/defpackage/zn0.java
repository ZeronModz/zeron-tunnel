package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.activity.BackEventCompat;
import com.google.android.material.motion.MaterialBackHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zn0 implements OnBackAnimationCallback {
    public final /* synthetic */ MaterialBackHandler a;
    public final /* synthetic */ ao0 b;

    public zn0(ao0 ao0Var, MaterialBackHandler materialBackHandler) {
        this.b = ao0Var;
        this.a = materialBackHandler;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.cancelBackProgress();
        }
    }

    public final void onBackInvoked() {
        this.a.handleBackInvoked();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.updateBackProgress(new BackEventCompat(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.startBackProgress(new BackEventCompat(backEvent));
        }
    }
}
