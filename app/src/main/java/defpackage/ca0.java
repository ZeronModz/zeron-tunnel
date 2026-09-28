package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ca0 implements FragmentResultListener {
    public final Lifecycle a;
    public final FragmentResultListener b;
    public final y90 c;

    public ca0(Lifecycle lifecycle, FragmentResultListener fragmentResultListener, y90 y90Var) {
        this.a = lifecycle;
        this.b = fragmentResultListener;
        this.c = y90Var;
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public final void onFragmentResult(String str, Bundle bundle) {
        this.b.onFragmentResult(str, bundle);
    }
}
