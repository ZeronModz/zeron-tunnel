package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zd extends Property {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(a aVar) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.a = aVar;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        return Float.valueOf(AnimationUtils.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.F.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.b.F.getDefaultColor()))));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
        Float f = (Float) obj2;
        int colorForState = extendedFloatingActionButton.F.getColorForState(extendedFloatingActionButton.getDrawableState(), this.a.b.F.getDefaultColor());
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.f(extendedFloatingActionButton.F);
        } else {
            extendedFloatingActionButton.f(colorStateListValueOf);
        }
    }
}
