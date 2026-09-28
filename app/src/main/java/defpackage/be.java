package defpackage;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class be extends Animatable2Compat.AnimationCallback {
    public final /* synthetic */ a b;

    public be(a aVar) {
        this.b = aVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void a(Drawable drawable) {
        a aVar = this.b;
        aVar.setIndeterminate(false);
        aVar.c(aVar.b);
    }
}
