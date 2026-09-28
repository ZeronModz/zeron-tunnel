package defpackage;

import android.animation.Animator;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mv implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ Animator a;
    public final /* synthetic */ r b;

    public mv(Animator animator, r rVar) {
        this.a = animator;
        this.b = rVar;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        this.a.end();
        if (FragmentManager.H(2)) {
            Objects.toString(this.b);
        }
    }
}
