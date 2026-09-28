package defpackage;

import com.google.android.material.progressindicator.h;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ig0 {
    public h a;
    public final ArrayList b = new ArrayList();

    public ig0(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new pz());
        }
    }

    public static float b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(be beVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
