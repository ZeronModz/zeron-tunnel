package com.github.mikephil.charting.data;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ChartData<T extends IDataSet<? extends Entry>> {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public List i;

    public ChartData(T... tArr) {
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            arrayList.add(t);
        }
        this.i = arrayList;
        i();
    }

    public void a() {
        IDataSet iDataSet;
        IDataSet iDataSet2;
        List<IDataSet> list = this.i;
        if (list == null) {
            return;
        }
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        for (IDataSet iDataSet3 : list) {
            if (this.a < iDataSet3.getYMax()) {
                this.a = iDataSet3.getYMax();
            }
            if (this.b > iDataSet3.getYMin()) {
                this.b = iDataSet3.getYMin();
            }
            if (this.c < iDataSet3.getXMax()) {
                this.c = iDataSet3.getXMax();
            }
            if (this.d > iDataSet3.getXMin()) {
                this.d = iDataSet3.getXMin();
            }
            if (iDataSet3.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                if (this.e < iDataSet3.getYMax()) {
                    this.e = iDataSet3.getYMax();
                }
                if (this.f > iDataSet3.getYMin()) {
                    this.f = iDataSet3.getYMin();
                }
            } else {
                if (this.g < iDataSet3.getYMax()) {
                    this.g = iDataSet3.getYMax();
                }
                if (this.h > iDataSet3.getYMin()) {
                    this.h = iDataSet3.getYMin();
                }
            }
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        Iterator it = this.i.iterator();
        while (true) {
            iDataSet = null;
            if (it.hasNext()) {
                iDataSet2 = (IDataSet) it.next();
                if (iDataSet2.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    break;
                }
            } else {
                iDataSet2 = null;
                break;
            }
        }
        if (iDataSet2 != null) {
            this.e = iDataSet2.getYMax();
            this.f = iDataSet2.getYMin();
            for (IDataSet iDataSet4 : this.i) {
                if (iDataSet4.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    if (iDataSet4.getYMin() < this.f) {
                        this.f = iDataSet4.getYMin();
                    }
                    if (iDataSet4.getYMax() > this.e) {
                        this.e = iDataSet4.getYMax();
                    }
                }
            }
        }
        Iterator it2 = this.i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            IDataSet iDataSet5 = (IDataSet) it2.next();
            if (iDataSet5.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                iDataSet = iDataSet5;
                break;
            }
        }
        if (iDataSet != null) {
            this.g = iDataSet.getYMax();
            this.h = iDataSet.getYMin();
            for (IDataSet iDataSet6 : this.i) {
                if (iDataSet6.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                    if (iDataSet6.getYMin() < this.h) {
                        this.h = iDataSet6.getYMin();
                    }
                    if (iDataSet6.getYMax() > this.g) {
                        this.g = iDataSet6.getYMax();
                    }
                }
            }
        }
    }

    public IDataSet b(int i) {
        List list = this.i;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (IDataSet) this.i.get(i);
    }

    public final int c() {
        List list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int d() {
        Iterator it = this.i.iterator();
        int entryCount = 0;
        while (it.hasNext()) {
            entryCount += ((IDataSet) it.next()).getEntryCount();
        }
        return entryCount;
    }

    public Entry e(Highlight highlight) {
        if (highlight.f >= this.i.size()) {
            return null;
        }
        return ((IDataSet) this.i.get(highlight.f)).getEntryForXValue(highlight.a, highlight.b);
    }

    public final IDataSet f() {
        List list = this.i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        IDataSet iDataSet = (IDataSet) this.i.get(0);
        for (IDataSet iDataSet2 : this.i) {
            if (iDataSet2.getEntryCount() > iDataSet.getEntryCount()) {
                iDataSet = iDataSet2;
            }
        }
        return iDataSet;
    }

    public final float g(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float h(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }

    public void i() {
        a();
    }

    public ChartData() {
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = new ArrayList();
    }

    public ChartData(List<T> list) {
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = list;
        i();
    }
}
