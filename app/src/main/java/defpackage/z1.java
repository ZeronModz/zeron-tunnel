package defpackage;

import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.InspectionCompanion;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z1 {
    public static /* synthetic */ WindowInsets.Builder a() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder b(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ InspectionCompanion.UninitializedPropertyMapException c() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }

    public static /* synthetic */ void d(Map map) {
        new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }
}
