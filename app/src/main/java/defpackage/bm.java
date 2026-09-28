package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.h;
import com.google.android.material.progressindicator.g;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bm extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm(String str, int i, Class cls) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return Float.valueOf(((g) obj).b());
            case 9:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 10:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 11:
                WeakHashMap weakHashMap = h.a;
                return Float.valueOf(((View) obj).getPaddingStart());
            case 12:
                WeakHashMap weakHashMap2 = h.a;
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 13:
                return Float.valueOf(((SwitchCompat) obj).z);
            case 14:
                return Float.valueOf(vo1.a.l((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                dm dmVar = (dm) obj;
                PointF pointF = (PointF) obj2;
                dmVar.getClass();
                dmVar.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                dmVar.b = iRound;
                int i = dmVar.f + 1;
                dmVar.f = i;
                if (i == dmVar.g) {
                    vo1.a(dmVar.e, dmVar.a, iRound, dmVar.c, dmVar.d);
                    dmVar.f = 0;
                    dmVar.g = 0;
                }
                break;
            case 1:
                dm dmVar2 = (dm) obj;
                PointF pointF2 = (PointF) obj2;
                dmVar2.getClass();
                dmVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                dmVar2.d = iRound2;
                int i2 = dmVar2.g + 1;
                dmVar2.g = i2;
                if (dmVar2.f == i2) {
                    vo1.a(dmVar2.e, dmVar2.a, dmVar2.b, dmVar2.c, iRound2);
                    dmVar2.f = 0;
                    dmVar2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                vo1.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                vo1.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                vo1.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ay2.a((ImageView) obj, (Matrix) obj2);
                break;
            case 6:
                hm hmVar = (hm) obj;
                float[] fArr = (float[]) obj2;
                System.arraycopy(fArr, 0, hmVar.c, 0, fArr.length);
                hmVar.a();
                break;
            case 7:
                hm hmVar2 = (hm) obj;
                PointF pointF6 = (PointF) obj2;
                hmVar2.getClass();
                hmVar2.d = pointF6.x;
                hmVar2.e = pointF6.y;
                hmVar2.a();
                break;
            case 8:
                g gVar = (g) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                if (gVar.h != fFloatValue) {
                    gVar.h = fFloatValue;
                    gVar.invalidateSelf();
                }
                break;
            case 9:
                View view4 = (View) obj;
                view4.getLayoutParams().width = ((Float) obj2).intValue();
                view4.requestLayout();
                break;
            case 10:
                View view5 = (View) obj;
                view5.getLayoutParams().height = ((Float) obj2).intValue();
                view5.requestLayout();
                break;
            case 11:
                View view6 = (View) obj;
                int iIntValue = ((Float) obj2).intValue();
                int paddingTop = view6.getPaddingTop();
                WeakHashMap weakHashMap = h.a;
                view6.setPaddingRelative(iIntValue, paddingTop, view6.getPaddingEnd(), view6.getPaddingBottom());
                break;
            case 12:
                View view7 = (View) obj;
                WeakHashMap weakHashMap2 = h.a;
                view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                break;
            case 13:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 14:
                vo1.b((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
