package defpackage;

import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselStrategy;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pj0 {
    public final oj0 a;
    public final List b;
    public final List c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public pj0(oj0 oj0Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = oj0Var;
        this.b = DesugarCollections.unmodifiableList(arrayList);
        this.c = DesugarCollections.unmodifiableList(arrayList2);
        float f = ((oj0) vh.e(arrayList, 1)).b().a - oj0Var.b().a;
        this.f = f;
        float f2 = oj0Var.d().a - ((oj0) vh.e(arrayList2, 1)).d().a;
        this.g = f2;
        this.d = d(f, arrayList, true);
        this.e = d(f2, arrayList2, false);
    }

    public static float[] d(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            oj0 oj0Var = (oj0) arrayList.get(i2);
            oj0 oj0Var2 = (oj0) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? oj0Var2.b().a - oj0Var.b().a : oj0Var.d().a - oj0Var2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static float[] e(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{AnimationUtils.b(0.0f, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static oj0 f(oj0 oj0Var, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(oj0Var.b);
        arrayList.add(i2, (nj0) arrayList.remove(i));
        mj0 mj0Var = new mj0(oj0Var.a, f2);
        float f3 = f;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            nj0 nj0Var = (nj0) arrayList.get(i5);
            float f4 = nj0Var.d;
            mj0Var.b((f4 / 2.0f) + f3, nj0Var.c, f4, i5 >= i3 && i5 <= i4, nj0Var.e, nj0Var.f, 0.0f, 0.0f);
            f3 += nj0Var.d;
            i5++;
        }
        return mj0Var.d();
    }

    public static oj0 g(oj0 oj0Var, float f, float f2, boolean z, float f3) {
        int i;
        List list = oj0Var.b;
        ArrayList arrayList = new ArrayList(list);
        float f4 = oj0Var.a;
        mj0 mj0Var = new mj0(f4, f2);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((nj0) it.next()).e) {
                i2++;
            }
        }
        float size = f / (list.size() - i2);
        float f5 = z ? f : 0.0f;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            nj0 nj0Var = (nj0) arrayList.get(i3);
            if (nj0Var.e) {
                i = i3;
                mj0Var.b(nj0Var.b, nj0Var.c, nj0Var.d, false, true, nj0Var.f, 0.0f, 0.0f);
            } else {
                i = i3;
                boolean z2 = i >= oj0Var.c && i <= oj0Var.d;
                float f6 = nj0Var.d - size;
                float fB = CarouselStrategy.b(f6, f4, f3);
                float f7 = (f6 / 2.0f) + f5;
                float f8 = f7 - nj0Var.b;
                float f9 = nj0Var.f;
                float f10 = f8;
                if (!z) {
                    f8 = 0.0f;
                }
                if (z) {
                    f10 = 0.0f;
                }
                mj0Var.b(f7, fB, f6, z2, false, f9, f8, f10);
                f5 += f6;
            }
            i3 = i + 1;
        }
        return mj0Var.d();
    }

    public final oj0 a() {
        return (oj0) this.c.get(r1.size() - 1);
    }

    public final oj0 b(float f, float f2, float f3, boolean z) {
        float fB;
        List list;
        float[] fArr;
        float f4 = this.f;
        float f5 = f2 + f4;
        float f6 = this.g;
        float f7 = f3 - f6;
        float f8 = c().a().g;
        float f9 = a().c().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            fB = AnimationUtils.b(1.0f, 0.0f, f2, f5, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f7) {
                return this.a;
            }
            fB = AnimationUtils.b(0.0f, 1.0f, f7, f3, f);
            list = this.c;
            fArr = this.e;
        }
        if (z) {
            float[] fArrE = e(list, fB, fArr);
            return fArrE[0] >= 0.5f ? (oj0) list.get((int) fArrE[2]) : (oj0) list.get((int) fArrE[1]);
        }
        float[] fArrE2 = e(list, fB, fArr);
        oj0 oj0Var = (oj0) list.get((int) fArrE2[1]);
        oj0 oj0Var2 = (oj0) list.get((int) fArrE2[2]);
        float f10 = fArrE2[0];
        float f11 = oj0Var.a;
        List list2 = oj0Var.b;
        if (f11 != oj0Var2.a) {
            u7.r("Keylines being linearly interpolated must have the same item size.");
            return null;
        }
        List list3 = oj0Var2.b;
        if (list2.size() != list3.size()) {
            u7.r("Keylines being linearly interpolated must have the same number of keylines.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            nj0 nj0Var = (nj0) list2.get(i);
            nj0 nj0Var2 = (nj0) list3.get(i);
            arrayList.add(new nj0(AnimationUtils.a(nj0Var.a, nj0Var2.a, f10), AnimationUtils.a(nj0Var.b, nj0Var2.b, f10), AnimationUtils.a(nj0Var.c, nj0Var2.c, f10), AnimationUtils.a(nj0Var.d, nj0Var2.d, f10), false, 0.0f, 0.0f, 0.0f));
        }
        return new oj0(oj0Var.a, arrayList, AnimationUtils.c(f10, oj0Var.c, oj0Var2.c), AnimationUtils.c(f10, oj0Var.d, oj0Var2.d));
    }

    public final oj0 c() {
        return (oj0) this.b.get(r1.size() - 1);
    }
}
