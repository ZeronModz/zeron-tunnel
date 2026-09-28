package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i90 extends FragmentContainer {
    public final /* synthetic */ Fragment a;

    public i90(Fragment fragment) {
        this.a = fragment;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final View a(int i) {
        Fragment fragment = this.a;
        View view = fragment.F;
        if (view != null) {
            return view.findViewById(i);
        }
        u7.p(hz.s("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public final boolean b() {
        return this.a.F != null;
    }
}
