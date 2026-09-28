package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements ViewBinding {
    public final ScrollView a;
    public final SwitchCompat b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final TextView l;
    public final TextView m;

    public m2(ScrollView scrollView, SwitchCompat switchCompat, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView, TextView textView2) {
        this.a = scrollView;
        this.b = switchCompat;
        this.c = linearLayout;
        this.d = linearLayout2;
        this.e = linearLayout3;
        this.f = linearLayout4;
        this.g = linearLayout5;
        this.h = linearLayout6;
        this.i = linearLayout7;
        this.j = linearLayout8;
        this.k = linearLayout9;
        this.l = textView;
        this.m = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
