package defpackage;

import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bd3 {
    public int a;
    public int b;
    public na c;

    public static bd3 d(InputStream inputStream) {
        if (inputStream != null) {
            return new ad3(inputStream);
        }
        byte[] bArr = kd3.b;
        int length = bArr.length;
        return e(0, 0, bArr);
    }

    public static ma e(int i, int i2, byte[] bArr) {
        ma maVar = new ma(bArr, i, i2);
        try {
            maVar.C(i2);
            return maVar;
        } catch (zzicg e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int g(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long h(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract long B();

    public abstract int C(int i);

    public abstract void a(int i);

    public abstract boolean b();

    public abstract int c();

    public final void f() {
        int i;
        do {
            i = i();
            if (i == 0) {
                return;
            }
            int i2 = this.a;
            int i3 = this.b;
            if (i2 + i3 >= 100) {
                zg1.r("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i3 + 1;
                this.b--;
            }
        } while (k(i));
    }

    public abstract int i();

    public abstract void j(int i);

    public abstract boolean k(int i);

    public abstract double l();

    public abstract float m();

    public abstract long n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract boolean s();

    public abstract String t();

    public abstract String u();

    public abstract zzian v();

    public abstract int w();

    public abstract int x();

    public abstract int y();

    public abstract long z();
}
