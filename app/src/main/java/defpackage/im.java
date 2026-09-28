package defpackage;

import android.view.View;
import androidx.core.view.h;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class im {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public im(View view) {
        this.a = view.getTranslationX();
        this.b = view.getTranslationY();
        WeakHashMap weakHashMap = h.a;
        this.c = cn1.g(view);
        this.d = view.getScaleX();
        this.e = view.getScaleY();
        this.f = view.getRotationX();
        this.g = view.getRotationY();
        this.h = view.getRotation();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        return imVar.a == this.a && imVar.b == this.b && imVar.c == this.c && imVar.d == this.d && imVar.e == this.e && imVar.f == this.f && imVar.g == this.g && imVar.h == this.h;
    }

    public final int hashCode() {
        float f = this.a;
        int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.b;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.c;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.d;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.e;
        int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
        float f6 = this.f;
        int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
        float f7 = this.g;
        int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.h;
        return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }
}
