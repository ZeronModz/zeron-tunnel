package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class mj0 {
    public final float a;
    public final float b;
    public nj0 d;
    public nj0 e;
    public final ArrayList c = new ArrayList();
    public int f = -1;
    public int g = -1;
    public float h = 0.0f;
    public int i = -1;

    public mj0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final void a(float f, float f2, float f3, boolean z, boolean z2) {
        float fAbs;
        float f4 = f3 / 2.0f;
        float f5 = f - f4;
        float f6 = f4 + f;
        float f7 = this.b;
        if (f6 > f7) {
            fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
        } else {
            fAbs = 0.0f;
            if (f5 < 0.0f) {
                fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
            }
        }
        b(f, f2, f3, z, z2, fAbs, 0.0f, 0.0f);
    }

    public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
        if (f3 <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.c;
        if (z2) {
            if (z) {
                u7.r("Anchor keylines cannot be focal.");
                return;
            }
            int i = this.i;
            if (i != -1 && i != 0) {
                u7.r("Anchor keylines must be either the first or last keyline.");
                return;
            }
            this.i = arrayList.size();
        }
        nj0 nj0Var = new nj0(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
        nj0 nj0Var2 = this.d;
        if (z) {
            if (nj0Var2 == null) {
                this.d = nj0Var;
                this.f = arrayList.size();
            }
            if (this.g != -1 && arrayList.size() - this.g > 1) {
                u7.r("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                return;
            } else if (f3 != this.d.d) {
                u7.r("Keylines that are marked as focal must all have the same masked item size.");
                return;
            } else {
                this.e = nj0Var;
                this.g = arrayList.size();
            }
        } else if (nj0Var2 == null && f3 < this.h) {
            u7.r("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            return;
        } else if (this.e != null && f3 > this.h) {
            u7.r("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            return;
        }
        this.h = f3;
        arrayList.add(nj0Var);
    }

    public final void c(float f, float f2, float f3, int i, boolean z) {
        if (i <= 0 || f3 <= 0.0f) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            a((i2 * f3) + f, f2, f3, z, false);
        }
    }

    public final oj0 d() {
        if (this.d == null) {
            u7.p("There must be a keyline marked as focal.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            float f = this.a;
            if (i >= size) {
                return new oj0(f, arrayList, this.f, this.g);
            }
            nj0 nj0Var = (nj0) arrayList2.get(i);
            arrayList.add(new nj0((i * f) + (this.d.b - (this.f * f)), nj0Var.b, nj0Var.c, nj0Var.d, nj0Var.e, nj0Var.f, nj0Var.g, nj0Var.h));
            i++;
        }
    }
}
