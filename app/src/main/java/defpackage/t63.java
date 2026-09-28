package defpackage;

import com.google.android.gms.internal.ads.z;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t63 {
    public final wp2 a;
    public final long[] b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t63(int i) {
        this(new wp2(6), new long[10]);
        switch (i) {
            case 1:
                break;
            default:
                t63 t63Var = z.b;
                this.a = new wp2(t63Var.a);
                this.b = Arrays.copyOf(t63Var.b, 10);
                break;
        }
    }

    public static void a(t63 t63Var, t63 t63Var2) {
        wp2 wp2Var = t63Var2.a;
        wp2 wp2Var2 = t63Var.a;
        long[] jArr = (long[]) wp2Var2.b;
        long[] jArr2 = (long[]) wp2Var.b;
        long[] jArr3 = t63Var2.b;
        n8.r0(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) wp2Var2.c;
        long[] jArr5 = (long[]) wp2Var.c;
        long[] jArr6 = (long[]) wp2Var.d;
        n8.r0(jArr4, jArr5, jArr6);
        n8.r0((long[]) wp2Var2.d, jArr6, jArr3);
        n8.r0(t63Var.b, jArr2, jArr5);
    }

    public /* synthetic */ t63(wp2 wp2Var, long[] jArr) {
        this.a = wp2Var;
        this.b = jArr;
    }

    public t63(t63 t63Var) {
        this(1);
        a(this, t63Var);
    }
}
