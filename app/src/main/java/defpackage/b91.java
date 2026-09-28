package defpackage;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b91 extends LinearSmoothScroller {
    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final float j(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
