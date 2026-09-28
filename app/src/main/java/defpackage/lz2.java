package defpackage;

import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzjk;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lz2 extends hx2 {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public final long i;
    public final long j;
    public List k;
    public String l;
    public int m;
    public String n;
    public String o;
    public long p;
    public String q;

    public lz2(r rVar, long j, long j2) {
        super(rVar);
        this.p = 0L;
        this.q = null;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.hx2
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0260 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wj3 e(java.lang.String r47) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz2.e(java.lang.String):wj3");
    }

    public final void f() {
        String str;
        a();
        r rVar = this.a;
        f63 f63Var = rVar.e;
        m mVar = rVar.f;
        r.f(f63Var);
        if (f63Var.h().i(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            h0 h0Var = rVar.i;
            r.f(h0Var);
            h0Var.Y().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            r.h(mVar);
            mVar.m.a("Analytics Storage consent is not granted");
            str = null;
        }
        r.h(mVar);
        mVar.m.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.o = str;
        rVar.k.getClass();
        this.p = System.currentTimeMillis();
    }

    public final String g() {
        b();
        yg0.m(this.c);
        return this.c;
    }

    public final String h() {
        a();
        b();
        yg0.m(this.n);
        return this.n;
    }
}
