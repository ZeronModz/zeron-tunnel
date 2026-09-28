package defpackage;

import com.google.android.gms.internal.ads.z;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class r63 {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public r63() {
        r63 r63Var = z.a;
        this.a = Arrays.copyOf(r63Var.a, 10);
        this.b = Arrays.copyOf(r63Var.b, 10);
        this.c = Arrays.copyOf(r63Var.c, 10);
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(r63 r63Var, int i) {
        k02.F(this.a, r63Var.a, i);
        k02.F(this.b, r63Var.b, i);
        k02.F(this.c, r63Var.c, i);
    }

    public r63(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
