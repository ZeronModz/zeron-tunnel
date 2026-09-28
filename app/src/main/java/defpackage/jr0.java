package defpackage;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements Comparable {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(MotionWidget motionWidget) {
        int i;
        WidgetFrame widgetFrame = motionWidget.a;
        widgetFrame.getClass();
        widgetFrame.getClass();
        widgetFrame.getClass();
        motionWidget.c.getClass();
        float f = widgetFrame.c;
        float f2 = widgetFrame.b;
        for (String str : widgetFrame.d.keySet()) {
            CustomVariable customVariable = (CustomVariable) widgetFrame.d.get(str);
            if (customVariable != null && (i = customVariable.b) != 903 && i != 904 && i != 906) {
                this.a.put(str, customVariable);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((jr0) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
