package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void c() {
        ConstraintWidget constraintWidget = this.b;
        Guideline guideline = (Guideline) constraintWidget;
        int i = guideline.x0;
        int i2 = guideline.y0;
        int i3 = guideline.A0;
        DependencyNode dependencyNode = this.h;
        if (i3 == 1) {
            if (i != -1) {
                dependencyNode.l.add(constraintWidget.X.d.h);
                this.b.X.d.h.k.add(dependencyNode);
                dependencyNode.f = i;
            } else if (i2 != -1) {
                dependencyNode.l.add(constraintWidget.X.d.i);
                this.b.X.d.i.k.add(dependencyNode);
                dependencyNode.f = -i2;
            } else {
                dependencyNode.b = true;
                dependencyNode.l.add(constraintWidget.X.d.i);
                this.b.X.d.i.k.add(dependencyNode);
            }
            l(this.b.d.h);
            l(this.b.d.i);
            return;
        }
        if (i != -1) {
            dependencyNode.l.add(constraintWidget.X.e.h);
            this.b.X.e.h.k.add(dependencyNode);
            dependencyNode.f = i;
        } else if (i2 != -1) {
            dependencyNode.l.add(constraintWidget.X.e.i);
            this.b.X.e.i.k.add(dependencyNode);
            dependencyNode.f = -i2;
        } else {
            dependencyNode.b = true;
            dependencyNode.l.add(constraintWidget.X.e.i);
            this.b.X.e.i.k.add(dependencyNode);
        }
        l(this.b.e.h);
        l(this.b.e.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        int i = ((Guideline) constraintWidget).A0;
        DependencyNode dependencyNode = this.h;
        if (i == 1) {
            constraintWidget.c0 = dependencyNode.g;
        } else {
            constraintWidget.d0 = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        this.h.b();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean j() {
        return false;
    }

    public final void l(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.h;
        dependencyNode2.k.add(dependencyNode);
        dependencyNode.l.add(dependencyNode2);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void update(Dependency dependency) {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c && !dependencyNode.j) {
            dependencyNode.c((int) ((((DependencyNode) dependencyNode.l.get(0)).g * ((Guideline) this.b).w0) + 0.5f));
        }
    }
}
