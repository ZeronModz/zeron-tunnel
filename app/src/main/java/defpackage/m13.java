package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m13 implements Iterator {
    public String a;
    public final CharSequence c;
    public int b = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

    public m13(CharSequence charSequence) {
        this.c = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        n8.A0(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = 4;
            int i3 = this.d;
            while (true) {
                int i4 = this.d;
                if (i4 == -1) {
                    this.b = 3;
                    break;
                }
                int iA = a(i4);
                CharSequence charSequence = this.c;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.d = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.d = iB;
                }
                if (iB == i3) {
                    int i5 = iB + 1;
                    this.d = i5;
                    if (i5 > charSequence.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i3 < iA) {
                        charSequence.charAt(i3);
                    }
                    if (i3 < iA) {
                        charSequence.charAt(iA - 1);
                    }
                    int i6 = this.e;
                    if (i6 == 1) {
                        iA = charSequence.length();
                        this.d = -1;
                        if (iA > i3) {
                            charSequence.charAt(iA - 1);
                        }
                    } else {
                        this.e = i6 - 1;
                    }
                    string = charSequence.subSequence(i3, iA).toString();
                }
            }
            this.a = string;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            p60.m();
            return null;
        }
        this.b = 2;
        String str = this.a;
        this.a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
