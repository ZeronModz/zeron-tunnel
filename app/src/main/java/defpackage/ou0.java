package defpackage;

import com.github.mikephil.charting.utils.ObjectPool$Poolable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 {
    public static int g;
    public int a;
    public int b;
    public Object[] c;
    public int d;
    public ObjectPool$Poolable e;
    public float f;

    public static synchronized ou0 a(int i, ObjectPool$Poolable objectPool$Poolable) {
        ou0 ou0Var;
        ou0Var = new ou0();
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        ou0Var.b = i;
        ou0Var.c = new Object[i];
        ou0Var.d = 0;
        ou0Var.e = objectPool$Poolable;
        ou0Var.f = 1.0f;
        ou0Var.d();
        int i2 = g;
        ou0Var.a = i2;
        g = i2 + 1;
        return ou0Var;
    }

    public final synchronized ObjectPool$Poolable b() {
        ObjectPool$Poolable objectPool$Poolable;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            objectPool$Poolable = (ObjectPool$Poolable) objArr[i];
            objectPool$Poolable.a = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return objectPool$Poolable;
    }

    public final synchronized void c(ObjectPool$Poolable objectPool$Poolable) {
        try {
            int i = objectPool$Poolable.a;
            if (i != -1) {
                if (i == this.a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + objectPool$Poolable.a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            Object[] objArr = this.c;
            if (i2 >= objArr.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            objectPool$Poolable.a = this.a;
            objArr[this.d] = objectPool$Poolable;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
