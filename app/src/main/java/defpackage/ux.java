package defpackage;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ux implements Observer {
    public final /* synthetic */ DialogFragment a;

    public ux(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (((LifecycleOwner) obj) != null) {
            DialogFragment dialogFragment = this.a;
            if (dialogFragment.f0) {
                View viewN = dialogFragment.N();
                if (viewN.getParent() != null) {
                    u7.p("DialogFragment can not be attached to a container view");
                } else if (dialogFragment.j0 != null) {
                    if (FragmentManager.H(3)) {
                        Objects.toString(dialogFragment.j0);
                    }
                    dialogFragment.j0.setContentView(viewN);
                }
            }
        }
    }
}
