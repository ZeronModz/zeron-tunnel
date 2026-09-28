package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.fragment.app.r;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ov implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ e c;
    public final /* synthetic */ r d;

    public ov(View view, ViewGroup viewGroup, e eVar, r rVar) {
        this.a = view;
        this.b = viewGroup;
        this.c = eVar;
        this.d = rVar;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        View view = this.a;
        view.clearAnimation();
        this.b.endViewTransition(view);
        this.c.a();
        if (FragmentManager.H(2)) {
            Objects.toString(this.d);
        }
    }
}
