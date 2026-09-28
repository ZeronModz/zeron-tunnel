package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e50 {
    public static HardwareFoldingFeature a(Activity activity, FoldingFeature foldingFeature) {
        kc0 kc0Var;
        j80 j80Var;
        int type = foldingFeature.getType();
        if (type == 1) {
            kc0.b.getClass();
            kc0Var = kc0.c;
        } else {
            if (type != 2) {
                return null;
            }
            kc0.b.getClass();
            kc0Var = kc0.d;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            j80Var = j80.b;
        } else {
            if (state != 2) {
                return null;
            }
            j80Var = j80.c;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        Bounds bounds2 = new Bounds(bounds);
        Rect rectC = zq1.a.computeCurrentWindowMetrics(activity).a.c();
        if (bounds2.a() == 0 && bounds2.b() == 0) {
            return null;
        }
        if (bounds2.b() != rectC.width() && bounds2.a() != rectC.height()) {
            return null;
        }
        if (bounds2.b() < rectC.width() && bounds2.a() < rectC.height()) {
            return null;
        }
        if (bounds2.b() == rectC.width() && bounds2.a() == rectC.height()) {
            return null;
        }
        Rect bounds3 = foldingFeature.getBounds();
        bounds3.getClass();
        return new HardwareFoldingFeature(new Bounds(bounds3), kc0Var, j80Var);
    }

    public static WindowLayoutInfo b(Activity activity, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        HardwareFoldingFeature hardwareFoldingFeatureA;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                foldingFeature.getClass();
                hardwareFoldingFeatureA = a(activity, foldingFeature);
            } else {
                hardwareFoldingFeatureA = null;
            }
            if (hardwareFoldingFeatureA != null) {
                arrayList.add(hardwareFoldingFeatureA);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
