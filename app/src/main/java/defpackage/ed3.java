package defpackage;

import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.zziae;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzidc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed3 extends zziae {
    public static final boolean b = vd3.e;
    public oa a;

    public static int b(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int c(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void d() {
        if (j() == 0) {
            return;
        }
        u7.p("Did not write as much data as expected.");
    }

    public abstract void e(int i, int i2);

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void i(int i, long j);

    public abstract int j();

    public abstract void k(int i, long j);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, String str);

    public abstract void n(int i, zzian zzianVar);

    public abstract void o(zzian zzianVar);

    public abstract void p(int i, byte[] bArr);

    public abstract void q(int i, zzidc zzidcVar);

    public abstract void r(int i, zzian zzianVar);

    public abstract void s(zzidc zzidcVar);

    public abstract void t(byte b2);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(int i);

    public abstract void x(long j);

    public abstract void y(long j);

    public abstract void z(String str);
}
