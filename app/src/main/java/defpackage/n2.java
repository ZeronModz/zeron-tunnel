package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements ViewBinding {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearProgressIndicator c;
    public final RecyclerView d;
    public final SwitchCompat e;
    public final SwitchCompat f;

    public n2(LinearLayout linearLayout, LinearLayout linearLayout2, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, SwitchCompat switchCompat, SwitchCompat switchCompat2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearProgressIndicator;
        this.d = recyclerView;
        this.e = switchCompat;
        this.f = switchCompat2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
