package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k3 implements ViewBinding {
    public final LinearLayout a;
    public final SwitchCompat b;

    public k3(LinearLayout linearLayout, SwitchCompat switchCompat) {
        this.a = linearLayout;
        this.b = switchCompat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
