package defpackage;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x33 {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;
    public final r a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public Boolean q;
    public long r;
    public ArrayList s;
    public String t;
    public boolean u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public Long z;

    public x33(r rVar, String str) {
        yg0.m(rVar);
        yg0.j(str);
        this.a = rVar;
        this.b = str;
        q qVar = rVar.g;
        r.h(qVar);
        qVar.a();
    }

    public final void A(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.w != j;
        this.w = j;
    }

    public final void B(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.B != j;
        this.B = j;
    }

    public final String C() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.C;
    }

    public final String D() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.b;
    }

    public final String E() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.c;
    }

    public final void F(String str) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= !Objects.equals(this.c, str);
        this.c = str;
    }

    public final String G() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.d;
    }

    public final void H(String str) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.d, str);
        this.d = str;
    }

    public final void I(String str) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= !Objects.equals(this.e, str);
        this.e = str;
    }

    public final String J() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.f;
    }

    public final void K(String str) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= !Objects.equals(this.f, str);
        this.f = str;
    }

    public final void L(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.h != j;
        this.h = j;
    }

    public final void M(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.i != j;
        this.i = j;
    }

    public final String N() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.j;
    }

    public final void O(String str) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.k;
    }

    public final void Q(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.k != j;
        this.k = j;
    }

    public final void R(String str) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= !Objects.equals(this.l, str);
        this.l = str;
    }

    public final void S(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.m != j;
        this.m = j;
    }

    public final void a(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.n != j;
        this.n = j;
    }

    public final long b() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.r;
    }

    public final void c(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.r != j;
        this.r = j;
    }

    public final void d(boolean z) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.o != z;
        this.o = z;
    }

    public final void e(long j) {
        yg0.e(j >= 0);
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.g != j;
        this.g = j;
    }

    public final void f(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.R != j;
        this.R = j;
    }

    public final void g(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.S != j;
        this.S = j;
    }

    public final void h(long j) {
        r rVar = this.a;
        q qVar = rVar.g;
        m mVar = rVar.f;
        r.h(qVar);
        qVar.a();
        long j2 = this.g + j;
        String str = this.b;
        if (j2 > 2147483647L) {
            r.h(mVar);
            mVar.i.b(m.e(str), "Bundle index overflow. appId");
            j2 = (-1) + j;
        }
        long j3 = this.F + 1;
        if (j3 > 2147483647L) {
            r.h(mVar);
            mVar.i.b(m.e(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.Q = true;
        this.g = j2;
        this.F = j3;
    }

    public final void i(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.J != j;
        this.J = j;
    }

    public final void j(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.K != j;
        this.K = j;
    }

    public final void k(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.L != j;
        this.L = j;
    }

    public final void l(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.M != j;
        this.M = j;
    }

    public final void m(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.O != j;
        this.O = j;
    }

    public final void n(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.N != j;
        this.N = j;
    }

    public final boolean o() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.Q;
    }

    public final void p(int i) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.D != i;
        this.D = i;
    }

    public final void q(int i) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.E != i;
        this.E = i;
    }

    public final void r(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.F != j;
        this.F = j;
    }

    public final String s() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.G;
    }

    public final int t() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.I;
    }

    public final String u() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        String str = this.P;
        v(null);
        return str;
    }

    public final void v(String str) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final Boolean w() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.q;
    }

    public final void x(List list) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        if (Objects.equals(this.s, list)) {
            return;
        }
        this.Q = true;
        this.s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        return this.u;
    }

    public final void z(long j) {
        q qVar = this.a.g;
        r.h(qVar);
        qVar.a();
        this.Q |= this.v != j;
        this.v = j;
    }
}
