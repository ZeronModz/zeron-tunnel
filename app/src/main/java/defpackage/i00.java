package defpackage;

import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 extends FloatPropertyCompat {
    public final /* synthetic */ FloatValueHolder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(FloatValueHolder floatValueHolder) {
        super("FloatValueHolder");
        this.a = floatValueHolder;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float a(Object obj) {
        return this.a.a;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void b(float f, Object obj) {
        this.a.a = f;
    }
}
