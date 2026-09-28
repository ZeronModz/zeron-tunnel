package defpackage;

import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 {
    public WidgetRun a;
    public ArrayList b;

    public static long a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        ArrayList arrayList = dependencyNode.k;
        if (widgetRun instanceof b) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) arrayList.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    jMin = Math.min(jMin, a(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        DependencyNode dependencyNode3 = widgetRun.i;
        DependencyNode dependencyNode4 = widgetRun.h;
        if (dependencyNode != dependencyNode3) {
            return jMin;
        }
        long jI = j - widgetRun.i();
        return Math.min(Math.min(jMin, a(dependencyNode4, jI)), jI - ((long) dependencyNode4.f));
    }

    public static long b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        ArrayList arrayList = dependencyNode.k;
        if (widgetRun instanceof b) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) arrayList.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.d != widgetRun) {
                    jMax = Math.max(jMax, b(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        DependencyNode dependencyNode3 = widgetRun.h;
        DependencyNode dependencyNode4 = widgetRun.i;
        if (dependencyNode != dependencyNode3) {
            return jMax;
        }
        long jI = widgetRun.i() + j;
        return Math.max(Math.max(jMax, b(dependencyNode4, jI)), jI - ((long) dependencyNode4.f));
    }
}
