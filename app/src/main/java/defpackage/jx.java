package defpackage;

import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.google.android.material.progressindicator.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jx extends FloatPropertyCompat {
    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float a(Object obj) {
        return ((f) obj).o.b * 10000.0f;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void b(float f, Object obj) {
        f fVar = (f) obj;
        fVar.o.b = f / 10000.0f;
        fVar.invalidateSelf();
    }
}
