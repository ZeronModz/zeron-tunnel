package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ch0 implements ViewBinding {
    public final LinearLayout a;
    public final AppCompatCheckBox b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;

    public ch0(LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.a = linearLayout;
        this.b = appCompatCheckBox;
        this.c = appCompatImageView;
        this.d = appCompatTextView;
        this.e = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
