package defpackage;

import android.view.View;
import androidx.core.view.h;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h00 extends FloatPropertyCompat {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h00(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((View) obj).getY();
            case 1:
                WeakHashMap weakHashMap = h.a;
                return cn1.h((View) obj);
            case 2:
                return ((View) obj).getAlpha();
            case 3:
                return ((View) obj).getScrollX();
            case 4:
                return ((View) obj).getScrollY();
            case 5:
                return ((View) obj).getTranslationX();
            case 6:
                return ((View) obj).getTranslationY();
            case 7:
                WeakHashMap weakHashMap2 = h.a;
                return cn1.g((View) obj);
            case 8:
                return ((View) obj).getScaleX();
            case 9:
                return ((View) obj).getScaleY();
            case 10:
                return ((View) obj).getRotation();
            case 11:
                return ((View) obj).getRotationX();
            case 12:
                return ((View) obj).getRotationY();
            default:
                return ((View) obj).getX();
        }
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void b(float f, Object obj) {
        switch (this.a) {
            case 0:
                ((View) obj).setY(f);
                break;
            case 1:
                WeakHashMap weakHashMap = h.a;
                cn1.o((View) obj, f);
                break;
            case 2:
                ((View) obj).setAlpha(f);
                break;
            case 3:
                ((View) obj).setScrollX((int) f);
                break;
            case 4:
                ((View) obj).setScrollY((int) f);
                break;
            case 5:
                ((View) obj).setTranslationX(f);
                break;
            case 6:
                ((View) obj).setTranslationY(f);
                break;
            case 7:
                WeakHashMap weakHashMap2 = h.a;
                cn1.n((View) obj, f);
                break;
            case 8:
                ((View) obj).setScaleX(f);
                break;
            case 9:
                ((View) obj).setScaleY(f);
                break;
            case 10:
                ((View) obj).setRotation(f);
                break;
            case 11:
                ((View) obj).setRotationX(f);
                break;
            case 12:
                ((View) obj).setRotationY(f);
                break;
            default:
                ((View) obj).setX(f);
                break;
        }
    }
}
