package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentContainer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vx extends FragmentContainer {
    public final /* synthetic */ i90 a;
    public final /* synthetic */ DialogFragment b;

    public vx(DialogFragment dialogFragment, i90 i90Var) {
        this.b = dialogFragment;
        this.a = i90Var;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final View a(int i) {
        i90 i90Var = this.a;
        if (i90Var.b()) {
            return i90Var.a(i);
        }
        Dialog dialog = this.b.j0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final boolean b() {
        return this.a.b() || this.b.n0;
    }
}
