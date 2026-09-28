package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z90 implements FragmentOnAttachListener {
    public final /* synthetic */ Fragment a;

    public z90(Fragment fragment) {
        this.a = fragment;
    }

    @Override // androidx.fragment.app.FragmentOnAttachListener
    public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
        this.a.u(fragment);
    }
}
