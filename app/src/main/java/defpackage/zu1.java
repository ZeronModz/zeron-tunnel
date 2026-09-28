package defpackage;

import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzgn;
import java.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zu1 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ xv1 h;
    public final zzmf i;

    public zu1(xv1 xv1Var, String str, int i, zzmf zzmfVar, int i2) {
        this.g = i2;
        this.h = xv1Var;
        this.a = str;
        this.b = i;
        this.i = zzmfVar;
    }

    public static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, g gVar, m mVar) {
        List listS;
        yg0.m(gVar);
        if (str != null && gVar.n() && gVar.v() != 1 && (gVar.v() != 7 ? gVar.o() : gVar.t() != 0)) {
            int iV = gVar.v();
            boolean zR = gVar.r();
            String strP = (zR || iV == 2 || iV == 7) ? gVar.p() : gVar.p().toUpperCase(Locale.ENGLISH);
            if (gVar.t() == 0) {
                listS = null;
            } else {
                listS = gVar.s();
                if (!zR) {
                    ArrayList arrayList = new ArrayList(listS.size());
                    Iterator it = listS.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listS = DesugarCollections.unmodifiableList(arrayList);
                }
            }
            String str2 = iV == 2 ? strP : null;
            if (iV != 7 ? strP != null : listS != null && !listS.isEmpty()) {
                if (!zR && iV != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iV - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zR ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (mVar != null) {
                                    mVar.i.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strP));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strP));
                    case 4:
                        return Boolean.valueOf(str.contains(strP));
                    case 5:
                        return Boolean.valueOf(str.equals(strP));
                    case 6:
                        if (listS != null) {
                            return Boolean.valueOf(listS.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.e r9, double r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.e, double):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c4 A[EDGE_INSN: B:234:0x03c4->B:161:0x03c4 BREAK  A[LOOP:3: B:89:0x0241->B:238:0x0241], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.a0 r24, long r25, defpackage.x02 r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu1.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.a0, long, x02, boolean):boolean");
    }

    public boolean b(Long l, Long l2, k0 k0Var, boolean z) {
        boolean z2;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        zzpu.a();
        r rVar = this.h.a;
        b bVar = rVar.d;
        zzgn zzgnVar = rVar.j;
        m mVar = rVar.f;
        boolean zK = bVar.k(this.a, l.E0);
        f fVar = (f) this.i;
        boolean zR = fVar.r();
        boolean zS = fVar.s();
        boolean zU = fVar.u();
        boolean z3 = zR || zS || zU;
        if (z && !z3) {
            r.h(mVar);
            mVar.n.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), fVar.n() ? Integer.valueOf(fVar.o()) : null);
            return true;
        }
        d dVarQ = fVar.q();
        boolean zS2 = dVarQ.s();
        if (!k0Var.s()) {
            z2 = zU;
            if (!k0Var.w()) {
                if (!k0Var.q()) {
                    r.h(mVar);
                    mVar.i.b(zzgnVar.c(k0Var.p()), "User property has no value, property");
                } else if (dVarQ.n()) {
                    String strR = k0Var.r();
                    g gVarO = dVarQ.o();
                    r.h(mVar);
                    boolC = c(d(strR, gVarO, mVar), zS2);
                } else if (!dVarQ.p()) {
                    r.h(mVar);
                    mVar.i.b(zzgnVar.c(k0Var.p()), "No string or number filter defined. property");
                } else if (cj3.B(k0Var.r())) {
                    String strR2 = k0Var.r();
                    e eVarQ = dVarQ.q();
                    if (cj3.B(strR2)) {
                        try {
                            boolE = e(new BigDecimal(strR2), eVarQ, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                        boolC = c(boolE, zS2);
                    } else {
                        boolE = null;
                        boolC = c(boolE, zS2);
                    }
                } else {
                    r.h(mVar);
                    mVar.i.c("Invalid user property value for Numeric number filter. property, value", zzgnVar.c(k0Var.p()), k0Var.r());
                }
                boolC = null;
            } else if (dVarQ.p()) {
                double dX = k0Var.x();
                try {
                    boolE2 = e(new BigDecimal(dX), dVarQ.q(), Math.ulp(dX));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zS2);
            } else {
                r.h(mVar);
                mVar.i.b(zzgnVar.c(k0Var.p()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (dVarQ.p()) {
            z2 = zU;
            try {
                boolE3 = e(new BigDecimal(k0Var.t()), dVarQ.q(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zS2);
        } else {
            r.h(mVar);
            mVar.i.b(zzgnVar.c(k0Var.p()), "No number filter for long property. property");
            z2 = zU;
            boolC = null;
        }
        r.h(mVar);
        mVar.n.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolC.booleanValue()) {
            if (!z || fVar.r()) {
                this.d = boolC;
            }
            if (boolC.booleanValue() && z3 && k0Var.n()) {
                long jO = k0Var.o();
                if (l != null) {
                    jO = l.longValue();
                }
                if (zK && fVar.r() && !fVar.s() && l2 != null) {
                    jO = l2.longValue();
                }
                if (fVar.s()) {
                    this.f = Long.valueOf(jO);
                } else {
                    this.e = Long.valueOf(jO);
                }
            }
        }
        return true;
    }
}
