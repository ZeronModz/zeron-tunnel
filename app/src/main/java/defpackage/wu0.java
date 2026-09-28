package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.activity.BackEventCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wu0 implements OnBackAnimationCallback {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public wu0(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.a = function1;
        this.b = function12;
        this.c = function0;
        this.d = function02;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new BackEventCompat(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new BackEventCompat(backEvent));
    }
}
