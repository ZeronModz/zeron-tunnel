package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) obj;
                int i2 = AppBarLayout.z;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                materialShapeDrawable.l(fFloatValue);
                Drawable drawable = appBarLayout.v;
                if (drawable instanceof MaterialShapeDrawable) {
                    ((MaterialShapeDrawable) drawable).l(fFloatValue);
                }
                Iterator it = appBarLayout.r.iterator();
                while (it.hasNext()) {
                    ((AppBarLayout.LiftOnScrollListener) it.next()).onUpdate(fFloatValue, materialShapeDrawable.u);
                }
                break;
            default:
                ((ViewPropertyAnimatorUpdateListener) obj2).onAnimationUpdate((View) obj);
                break;
        }
    }
}
