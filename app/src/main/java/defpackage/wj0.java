package defpackage;

import android.util.Rational;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.LegacyPreviewScalingStrategy;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wj0 implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wj0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                Size size3 = (Size) obj3;
                int i2 = LegacyPreviewScalingStrategy.d(size, size3).a - size.a;
                int i3 = LegacyPreviewScalingStrategy.d(size2, size3).a - size2.a;
                if (i2 == 0 && i3 == 0) {
                    return size.compareTo(size2);
                }
                if (i2 != 0) {
                    if (i3 != 0) {
                        if (i2 < 0 && i3 < 0) {
                            return size.compareTo(size2);
                        }
                        if (i2 > 0 && i3 > 0) {
                            return -size.compareTo(size2);
                        }
                        if (i2 < 0) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 1:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                int iCompareTo = Boolean.valueOf(materialButton.o).compareTo(Boolean.valueOf(materialButton2.o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
    }
}
