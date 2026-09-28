package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DataSet<T extends Entry> extends BaseDataSet<T> {
    public List p;
    public float q;
    public float r;
    public float s;
    public float t;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.p = list;
        if (list == null) {
            this.p = new ArrayList();
        }
        calcMinMax();
    }

    public void a(Entry entry) {
        if (entry == null) {
            return;
        }
        b(entry);
        c(entry);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean addEntry(Entry entry) {
        if (entry == null) {
            return false;
        }
        List arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        a(entry);
        return arrayList.add(entry);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void addEntryOrdered(Entry entry) {
        if (entry == null) {
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList();
        }
        a(entry);
        if (this.p.size() > 0) {
            if (((Entry) this.p.get(r0.size() - 1)).b() > entry.b()) {
                this.p.add(getEntryIndex(entry.b(), entry.a(), Rounding.UP), entry);
                return;
            }
        }
        this.p.add(entry);
    }

    public final void b(Entry entry) {
        if (entry.b() < this.t) {
            this.t = entry.b();
        }
        if (entry.b() > this.s) {
            this.s = entry.b();
        }
    }

    public void c(Entry entry) {
        if (entry.a() < this.r) {
            this.r = entry.a();
        }
        if (entry.a() > this.q) {
            this.q = entry.a();
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void calcMinMax() {
        List list = this.p;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            a((Entry) it.next());
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void calcMinMaxY(float f, float f2) {
        List list = this.p;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        int entryIndex = getEntryIndex(f2, Float.NaN, Rounding.UP);
        for (int entryIndex2 = getEntryIndex(f, Float.NaN, Rounding.DOWN); entryIndex2 <= entryIndex; entryIndex2++) {
            c((Entry) this.p.get(entryIndex2));
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void clear() {
        this.p.clear();
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final List getEntriesForXValue(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.p.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            Entry entry = (Entry) this.p.get(i2);
            if (f == entry.b()) {
                while (i2 > 0 && ((Entry) this.p.get(i2 - 1)).b() == f) {
                    i2--;
                }
                int size2 = this.p.size();
                while (i2 < size2) {
                    Entry entry2 = (Entry) this.p.get(i2);
                    if (entry2.b() != f) {
                        break;
                    }
                    arrayList.add(entry2);
                    i2++;
                }
            } else if (f > entry.b()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getEntryCount() {
        return this.p.size();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final Entry getEntryForIndex(int i) {
        return (Entry) this.p.get(i);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final Entry getEntryForXValue(float f, float f2, Rounding rounding) {
        int entryIndex = getEntryIndex(f, f2, rounding);
        if (entryIndex > -1) {
            return (Entry) this.p.get(entryIndex);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getEntryIndex(float f, float f2, Rounding rounding) {
        int i;
        Entry entry;
        List list = this.p;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.p.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            float fB = ((Entry) this.p.get(i3)).b() - f;
            int i4 = i3 + 1;
            float fB2 = ((Entry) this.p.get(i4)).b() - f;
            float fAbs = Math.abs(fB);
            float fAbs2 = Math.abs(fB2);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = fB;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i3;
            }
            i2 = i4;
        }
        if (size != -1) {
            float fB3 = ((Entry) this.p.get(size)).b();
            if (rounding == Rounding.UP) {
                if (fB3 < f && size < this.p.size() - 1) {
                    size++;
                }
            } else if (rounding == Rounding.DOWN && fB3 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((Entry) this.p.get(size - 1)).b() == fB3) {
                    size--;
                }
                float fA = ((Entry) this.p.get(size)).a();
                loop2: while (true) {
                    i = size;
                    do {
                        size++;
                        if (size >= this.p.size()) {
                            break loop2;
                        }
                        entry = (Entry) this.p.get(size);
                        if (entry.b() != fB3) {
                            break loop2;
                        }
                    } while (Math.abs(entry.a() - f2) >= Math.abs(fA - f2));
                    fA = f2;
                }
                return i;
            }
        }
        return size;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final float getXMax() {
        return this.s;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final float getXMin() {
        return this.t;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final float getYMax() {
        return this.q;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final float getYMin() {
        return this.r;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean removeEntry(Entry entry) {
        List list;
        if (entry == null || (list = this.p) == null) {
            return false;
        }
        boolean zRemove = list.remove(entry);
        if (zRemove) {
            calcMinMax();
        }
        return zRemove;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        sb.append(str);
        sb.append(", entries: ");
        sb.append(this.p.size());
        sb.append("\n");
        StringBuffer stringBuffer = new StringBuffer(sb.toString());
        for (int i = 0; i < this.p.size(); i++) {
            stringBuffer.append(((Entry) this.p.get(i)).toString().concat(" "));
        }
        return stringBuffer.toString();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final Entry getEntryForXValue(float f, float f2) {
        return getEntryForXValue(f, f2, Rounding.CLOSEST);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getEntryIndex(Entry entry) {
        return this.p.indexOf(entry);
    }
}
