package com.journeyapps.barcodescanner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Size implements Comparable<Size> {
    public final int a;
    public final int b;

    public Size(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Size size) {
        int i = this.b * this.a;
        int i2 = size.b * size.a;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public final boolean b(Size size) {
        return this.a <= size.a && this.b <= size.b;
    }

    public final Size c(int i, int i2) {
        return new Size((this.a * i) / i2, (this.b * i) / i2);
    }

    public final Size d(Size size) {
        int i = size.b;
        int i2 = this.a;
        int i3 = i2 * i;
        int i4 = size.a;
        int i5 = this.b;
        return i3 <= i4 * i5 ? new Size(i4, (i5 * i4) / i2) : new Size((i2 * i) / i5, i);
    }

    public final Size e(Size size) {
        int i = size.b;
        int i2 = this.a;
        int i3 = i2 * i;
        int i4 = size.a;
        int i5 = this.b;
        return i3 >= i4 * i5 ? new Size(i4, (i5 * i4) / i2) : new Size((i2 * i) / i5, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Size size = (Size) obj;
            if (this.a == size.a && this.b == size.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
