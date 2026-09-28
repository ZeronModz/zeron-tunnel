package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmn;
import com.google.android.gms.internal.measurement.zzmo;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import com.google.android.gms.internal.measurement.zzrc;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgn;
import java.util.DesugarCollections;
import java.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cj3 extends oi3 {
    public static boolean B(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean C(zzmn zzmnVar, int i) {
        if (i < zzmnVar.size() * 64) {
            return ((1 << (i % 64)) & ((Long) zzmnVar.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList D(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static zznl I(x0 x0Var, byte[] bArr) {
        tg3 tg3VarB;
        tg3 tg3Var = tg3.b;
        if (tg3Var == null) {
            synchronized (tg3.class) {
                try {
                    tg3VarB = tg3.b;
                    if (tg3VarB == null) {
                        f1 f1Var = f1.c;
                        tg3VarB = zzlz.b();
                        tg3.b = tg3VarB;
                    }
                } finally {
                }
            }
            tg3Var = tg3VarB;
        }
        return tg3Var != null ? x0Var.zzaV(bArr, tg3Var) : x0Var.zzaW(bArr);
    }

    public static int J(String str, jd3 jd3Var) {
        for (int i = 0; i < ((f0) jd3Var.b).T1(); i++) {
            if (str.equals(((f0) jd3Var.b).U1(i).p())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] K(zzmo zzmoVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = zzmoVar.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var != null) {
                Bundle bundle = new Bundle();
                for (c0 c0Var2 : c0Var.x()) {
                    if (c0Var2.p()) {
                        bundle.putString(c0Var2.o(), c0Var2.q());
                    } else if (c0Var2.r()) {
                        bundle.putLong(c0Var2.o(), c0Var2.s());
                    } else if (c0Var2.v()) {
                        bundle.putDouble(c0Var2.o(), c0Var2.w());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap L(boolean z, Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(L(false, (Bundle) parcelable));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(L(false, (Bundle) obj2));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(L(false, (Bundle) obj));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static zzbg e(zzaa zzaaVar) {
        Object obj;
        Bundle bundleF = f(zzaaVar.c, true);
        String string = (!bundleF.containsKey("_o") || (obj = bundleF.get("_o")) == null) ? "app" : obj.toString();
        String strL = kf2.L(zzaaVar.a, xg0.n, xg0.p);
        if (strL == null) {
            strL = zzaaVar.a;
        }
        return new zzbg(strL, new m12(bundleF), string, zzaaVar.b);
    }

    public static Bundle f(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(f((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void g(fa3 fa3Var, String str, Long l) {
        List listK = fa3Var.k();
        int i = 0;
        while (true) {
            if (i >= listK.size()) {
                i = -1;
                break;
            } else if (str.equals(((c0) listK.get(i)).o())) {
                break;
            } else {
                i++;
            }
        }
        sb3 sb3VarZ = c0.z();
        sb3VarZ.k(str);
        sb3VarZ.m(l.longValue());
        if (i < 0) {
            fa3Var.o(sb3VarZ);
        } else {
            fa3Var.f();
            ((a0) fa3Var.b).y(i, (c0) sb3VarZ.h());
        }
    }

    public static final Bundle h(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            String strO = c0Var.o();
            if (c0Var.v()) {
                bundle.putDouble(strO, c0Var.w());
            } else if (c0Var.t()) {
                bundle.putFloat(strO, c0Var.u());
            } else if (c0Var.p()) {
                bundle.putString(strO, c0Var.q());
            } else if (c0Var.r()) {
                bundle.putLong(strO, c0Var.s());
            }
        }
        return bundle;
    }

    public static final c0 i(a0 a0Var, String str) {
        for (c0 c0Var : a0Var.n()) {
            if (c0Var.o().equals(str)) {
                return c0Var;
            }
        }
        return null;
    }

    public static final Serializable j(a0 a0Var, String str) {
        c0 c0VarI = i(a0Var, str);
        if (c0VarI == null) {
            return null;
        }
        return p(c0VarI);
    }

    public static final void m(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void n(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String o(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable p(c0 c0Var) {
        if (c0Var.p()) {
            return c0Var.q();
        }
        if (c0Var.r()) {
            return Long.valueOf(c0Var.s());
        }
        if (c0Var.v()) {
            return Double.valueOf(c0Var.w());
        }
        if (c0Var.y() > 0) {
            return K((zzmo) c0Var.x());
        }
        return null;
    }

    public static final void q(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                n(builder, str3, string, set);
            }
        }
    }

    public static final void r(StringBuilder sb, String str, h0 h0Var) {
        if (h0Var == null) {
            return;
        }
        m(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (h0Var.q() != 0) {
            m(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : h0Var.p()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (h0Var.o() != 0) {
            m(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : h0Var.n()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (h0Var.s() != 0) {
            m(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (z zVar : h0Var.r()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(zVar.n() ? Integer.valueOf(zVar.o()) : null);
                sb.append(":");
                sb.append(zVar.p() ? Long.valueOf(zVar.q()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (h0Var.u() != 0) {
            m(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (i0 i0Var : h0Var.t()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(i0Var.n() ? Integer.valueOf(i0Var.o()) : null);
                sb.append(": [");
                Iterator it = i0Var.p().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m(3, sb);
        sb.append("}\n");
    }

    public static final void s(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void t(StringBuilder sb, int i, String str, e eVar) {
        if (eVar == null) {
            return;
        }
        m(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (eVar.n()) {
            int iX = eVar.x();
            s(sb, i, "comparison_type", iX != 1 ? iX != 2 ? iX != 3 ? iX != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (eVar.o()) {
            s(sb, i, "match_as_float", Boolean.valueOf(eVar.p()));
        }
        if (eVar.q()) {
            s(sb, i, "comparison_value", eVar.r());
        }
        if (eVar.s()) {
            s(sb, i, "min_comparison_value", eVar.t());
        }
        if (eVar.u()) {
            s(sb, i, "max_comparison_value", eVar.v());
        }
        m(i, sb);
        sb.append("}\n");
    }

    public final Parcelable A(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (SafeParcelReader$ParseException unused) {
                m mVar = this.a.f;
                r.h(mVar);
                mVar.f.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final List E(zzmn zzmnVar, List list) {
        int i;
        ArrayList arrayList = new ArrayList(zzmnVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            r rVar = this.a;
            if (iIntValue < 0) {
                m mVar = rVar.f;
                r.h(mVar);
                mVar.i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    m mVar2 = rVar.f;
                    r.h(mVar2);
                    mVar2.i.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean F(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        this.a.k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long G(byte[] bArr) {
        yg0.m(bArr);
        r rVar = this.a;
        com.google.android.gms.measurement.internal.h0 h0Var = rVar.i;
        r.f(h0Var);
        h0Var.a();
        MessageDigest messageDigestR = com.google.android.gms.measurement.internal.h0.r();
        if (messageDigestR != null) {
            return com.google.android.gms.measurement.internal.h0.s(messageDigestR.digest(bArr));
        }
        m mVar = rVar.f;
        r.h(mVar);
        mVar.f.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] H(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            m mVar = this.a.f;
            r.h(mVar);
            mVar.f.b(e, "Failed to gzip content");
            throw e;
        }
    }

    public final void k(StringBuilder sb, int i, zzmo zzmoVar) {
        if (zzmoVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = zzmoVar.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var != null) {
                m(i2, sb);
                sb.append("param {\n");
                s(sb, i2, "name", c0Var.n() ? this.a.j.b(c0Var.o()) : null);
                s(sb, i2, "string_value", c0Var.p() ? c0Var.q() : null);
                s(sb, i2, "int_value", c0Var.r() ? Long.valueOf(c0Var.s()) : null);
                s(sb, i2, "double_value", c0Var.v() ? Double.valueOf(c0Var.w()) : null);
                if (c0Var.y() > 0) {
                    k(sb, i2, (zzmo) c0Var.x());
                }
                m(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void l(StringBuilder sb, int i, d dVar) {
        String str;
        if (dVar == null) {
            return;
        }
        m(i, sb);
        sb.append("filter {\n");
        if (dVar.r()) {
            s(sb, i, "complement", Boolean.valueOf(dVar.s()));
        }
        if (dVar.t()) {
            s(sb, i, "param_name", this.a.j.b(dVar.u()));
        }
        if (dVar.n()) {
            int i2 = i + 1;
            g gVarO = dVar.o();
            if (gVarO != null) {
                m(i2, sb);
                sb.append("string_filter {\n");
                if (gVarO.n()) {
                    switch (gVarO.v()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    s(sb, i2, "match_type", str);
                }
                if (gVarO.o()) {
                    s(sb, i2, "expression", gVarO.p());
                }
                if (gVarO.q()) {
                    s(sb, i2, "case_sensitive", Boolean.valueOf(gVarO.r()));
                }
                if (gVarO.t() > 0) {
                    m(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : gVarO.s()) {
                        m(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m(i2, sb);
                sb.append("}\n");
            }
        }
        if (dVar.p()) {
            t(sb, i + 1, "number_filter", dVar.q());
        }
        m(i, sb);
        sb.append("}\n");
    }

    public final void u(bf3 bf3Var, Object obj) {
        bf3Var.f();
        ((k0) bf3Var.b).C();
        bf3Var.f();
        ((k0) bf3Var.b).E();
        bf3Var.f();
        ((k0) bf3Var.b).G();
        if (obj instanceof String) {
            bf3Var.f();
            ((k0) bf3Var.b).B((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            bf3Var.f();
            ((k0) bf3Var.b).D(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            bf3Var.f();
            ((k0) bf3Var.b).F(dDoubleValue);
        } else {
            m mVar = this.a.f;
            r.h(mVar);
            mVar.f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void v(sb3 sb3Var, Object obj) {
        sb3Var.f();
        ((c0) sb3Var.b).C();
        sb3Var.f();
        ((c0) sb3Var.b).E();
        sb3Var.f();
        ((c0) sb3Var.b).G();
        sb3Var.f();
        ((c0) sb3Var.b).J();
        if (obj instanceof String) {
            sb3Var.l((String) obj);
            return;
        }
        if (obj instanceof Long) {
            sb3Var.m(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            sb3Var.f();
            ((c0) sb3Var.b).F(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            m mVar = this.a.f;
            r.h(mVar);
            mVar.f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                sb3 sb3VarZ = c0.z();
                for (String str : bundle.keySet()) {
                    sb3 sb3VarZ2 = c0.z();
                    sb3VarZ2.k(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        sb3VarZ2.m(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        sb3VarZ2.l((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        sb3VarZ2.f();
                        ((c0) sb3VarZ2.b).F(dDoubleValue2);
                    }
                    sb3VarZ.f();
                    ((c0) sb3VarZ.b).H((c0) sb3VarZ2.h());
                }
                if (((c0) sb3VarZ.b).y() > 0) {
                    arrayList.add((c0) sb3VarZ.h());
                }
            }
        }
        sb3Var.f();
        ((c0) sb3Var.b).I(arrayList);
    }

    public final fi3 w(String str, jd3 jd3Var, fa3 fa3Var, String str2) {
        int iIndexOf;
        zzqp.a();
        r rVar = this.a;
        b bVar = rVar.d;
        if (!bVar.k(str, l.Q0)) {
            return null;
        }
        rVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = bVar.g(str, l.v0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                p60.e(str3, "duplicate element: ");
                return null;
            }
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        g0 g0Var = this.b;
        ri3 ri3Var = g0Var.j;
        o oVar = g0Var.a;
        o oVar2 = ri3Var.b.a;
        g0.P(oVar2);
        String strN = oVar2.n(str);
        Uri.Builder builder = new Uri.Builder();
        b bVar2 = ri3Var.a.d;
        builder.scheme(bVar2.g(str, l.o0));
        if (TextUtils.isEmpty(strN)) {
            builder.authority(bVar2.g(str, l.p0));
        } else {
            String strG = bVar2.g(str, l.p0);
            StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 1 + String.valueOf(strG).length());
            sb.append(strN);
            sb.append(".");
            sb.append(strG);
            builder.authority(sb.toString());
        }
        builder.path(bVar2.g(str, l.q0));
        n(builder, "gmp_app_id", ((f0) jd3Var.b).C(), setUnmodifiableSet);
        bVar.f();
        n(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strW = ((f0) jd3Var.b).w();
        k kVar = l.T0;
        if (bVar.k(str, kVar)) {
            g0.P(oVar);
            if (oVar.t(str)) {
                strW = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        }
        n(builder, "app_instance_id", strW, setUnmodifiableSet);
        n(builder, "rdid", ((f0) jd3Var.b).t(), setUnmodifiableSet);
        n(builder, "bundle_id", jd3Var.r(), setUnmodifiableSet);
        String strQ = fa3Var.q();
        String strL = kf2.L(strQ, xg0.p, xg0.n);
        if (true != TextUtils.isEmpty(strL)) {
            strQ = strL;
        }
        n(builder, "app_event_name", strQ, setUnmodifiableSet);
        n(builder, "app_version", String.valueOf(((f0) jd3Var.b).I()), setUnmodifiableSet);
        String strG2 = ((f0) jd3Var.b).g2();
        if (bVar.k(str, kVar)) {
            g0.P(oVar);
            if (oVar.s(str) && !TextUtils.isEmpty(strG2) && (iIndexOf = strG2.indexOf(".")) != -1) {
                strG2 = strG2.substring(0, iIndexOf);
            }
        }
        n(builder, "os_version", strG2, setUnmodifiableSet);
        n(builder, "timestamp", String.valueOf(fa3Var.r()), setUnmodifiableSet);
        if (((f0) jd3Var.b).v()) {
            n(builder, "lat", "1", setUnmodifiableSet);
        }
        n(builder, "privacy_sandbox_version", String.valueOf(((f0) jd3Var.b).E0()), setUnmodifiableSet);
        n(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        n(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        n(builder, "request_uuid", str2, setUnmodifiableSet);
        List<c0> listK = fa3Var.k();
        Bundle bundle = new Bundle();
        for (c0 c0Var : listK) {
            String strO = c0Var.o();
            if (c0Var.v()) {
                bundle.putString(strO, String.valueOf(c0Var.w()));
            } else if (c0Var.t()) {
                bundle.putString(strO, String.valueOf(c0Var.u()));
            } else if (c0Var.p()) {
                bundle.putString(strO, c0Var.q());
            } else if (c0Var.r()) {
                bundle.putString(strO, String.valueOf(c0Var.s()));
            }
        }
        q(builder, bVar.g(str, l.u0).split("\\|"), bundle, setUnmodifiableSet);
        List<k0> listUnmodifiableList = DesugarCollections.unmodifiableList(((f0) jd3Var.b).S1());
        Bundle bundle2 = new Bundle();
        for (k0 k0Var : listUnmodifiableList) {
            String strP = k0Var.p();
            if (k0Var.w()) {
                bundle2.putString(strP, String.valueOf(k0Var.x()));
            } else if (k0Var.u()) {
                bundle2.putString(strP, String.valueOf(k0Var.v()));
            } else if (k0Var.q()) {
                bundle2.putString(strP, k0Var.r());
            } else if (k0Var.s()) {
                bundle2.putString(strP, String.valueOf(k0Var.t()));
            }
        }
        q(builder, bVar.g(str, l.t0).split("\\|"), bundle2, setUnmodifiableSet);
        n(builder, "dma", true != ((f0) jd3Var.b).B0() ? "0" : "1", setUnmodifiableSet);
        if (!((f0) jd3Var.b).D0().isEmpty()) {
            n(builder, "dma_cps", ((f0) jd3Var.b).D0(), setUnmodifiableSet);
        }
        if (((f0) jd3Var.b).J0()) {
            t tVarK0 = ((f0) jd3Var.b).K0();
            if (!tVarK0.x().isEmpty()) {
                n(builder, "dl_gclid", tVarK0.x(), setUnmodifiableSet);
            }
            if (!tVarK0.z().isEmpty()) {
                n(builder, "dl_gbraid", tVarK0.z(), setUnmodifiableSet);
            }
            if (!tVarK0.B().isEmpty()) {
                n(builder, "dl_gs", tVarK0.B(), setUnmodifiableSet);
            }
            if (tVarK0.D() > 0) {
                n(builder, "dl_ss_ts", String.valueOf(tVarK0.D()), setUnmodifiableSet);
            }
            if (!tVarK0.F().isEmpty()) {
                n(builder, "mr_gclid", tVarK0.F(), setUnmodifiableSet);
            }
            if (!tVarK0.H().isEmpty()) {
                n(builder, "mr_gbraid", tVarK0.H(), setUnmodifiableSet);
            }
            if (!tVarK0.J().isEmpty()) {
                n(builder, "mr_gs", tVarK0.J(), setUnmodifiableSet);
            }
            if (tVarK0.L() > 0) {
                n(builder, "mr_click_ts", String.valueOf(tVarK0.L()), setUnmodifiableSet);
            }
        }
        return new fi3(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final a0 x(w02 w02Var) {
        fa3 fa3VarX = a0.x();
        long j = w02Var.e;
        fa3VarX.f();
        ((a0) fa3VarX.b).F(j);
        Bundle bundle = w02Var.f.a;
        for (String str : bundle.keySet()) {
            sb3 sb3VarZ = c0.z();
            sb3VarZ.k(str);
            Object obj = bundle.get(str);
            yg0.m(obj);
            v(sb3VarZ, obj);
            fa3VarX.o(sb3VarZ);
        }
        String str2 = w02Var.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            sb3 sb3VarZ2 = c0.z();
            sb3VarZ2.k("_o");
            sb3VarZ2.l(str2);
            fa3VarX.n((c0) sb3VarZ2.h());
        }
        return (a0) fa3VarX.h();
    }

    public final String y(e0 e0Var) {
        v vVarG0;
        StringBuilder sbY = hz.y("\nbatch {\n");
        if (e0Var.s()) {
            s(sbY, 0, "upload_subdomain", e0Var.t());
        }
        if (e0Var.q()) {
            s(sbY, 0, "sgtm_join_id", e0Var.r());
        }
        for (f0 f0Var : e0Var.n()) {
            if (f0Var != null) {
                m(1, sbY);
                sbY.append("bundle {\n");
                if (f0Var.N()) {
                    s(sbY, 1, "protocol_version", Integer.valueOf(f0Var.N0()));
                }
                ((zzrc) zzrb.b.a.get()).zza();
                r rVar = this.a;
                b bVar = rVar.d;
                zzgn zzgnVar = rVar.j;
                if (bVar.k(f0Var.n(), l.N0) && f0Var.t0()) {
                    s(sbY, 1, "session_stitching_token", f0Var.u0());
                }
                s(sbY, 1, "platform", f0Var.f2());
                if (f0Var.p()) {
                    s(sbY, 1, "gmp_version", Long.valueOf(f0Var.q()));
                }
                if (f0Var.r()) {
                    s(sbY, 1, "uploading_gmp_version", Long.valueOf(f0Var.s()));
                }
                if (f0Var.p0()) {
                    s(sbY, 1, "dynamite_version", Long.valueOf(f0Var.q0()));
                }
                if (f0Var.J()) {
                    s(sbY, 1, "config_version", Long.valueOf(f0Var.K()));
                }
                s(sbY, 1, "gmp_app_id", f0Var.C());
                s(sbY, 1, "app_id", f0Var.n());
                s(sbY, 1, "app_version", f0Var.o());
                if (f0Var.H()) {
                    s(sbY, 1, "app_version_major", Integer.valueOf(f0Var.I()));
                }
                s(sbY, 1, "firebase_instance_id", f0Var.G());
                if (f0Var.x()) {
                    s(sbY, 1, "dev_cert_hash", Long.valueOf(f0Var.y()));
                }
                s(sbY, 1, "app_store", f0Var.l2());
                if (f0Var.V1()) {
                    s(sbY, 1, "upload_timestamp_millis", Long.valueOf(f0Var.W1()));
                }
                if (f0Var.X1()) {
                    s(sbY, 1, "start_timestamp_millis", Long.valueOf(f0Var.Y1()));
                }
                if (f0Var.Z1()) {
                    s(sbY, 1, "end_timestamp_millis", Long.valueOf(f0Var.a2()));
                }
                if (f0Var.b2()) {
                    s(sbY, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(f0Var.c2()));
                }
                if (f0Var.d2()) {
                    s(sbY, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(f0Var.e2()));
                }
                s(sbY, 1, "app_instance_id", f0Var.w());
                s(sbY, 1, "resettable_device_id", f0Var.t());
                s(sbY, 1, "ds_id", f0Var.M());
                if (f0Var.u()) {
                    s(sbY, 1, "limited_ad_tracking", Boolean.valueOf(f0Var.v()));
                }
                s(sbY, 1, "os_version", f0Var.g2());
                s(sbY, 1, "device_model", f0Var.h2());
                s(sbY, 1, "user_default_language", f0Var.i2());
                if (f0Var.j2()) {
                    s(sbY, 1, "time_zone_offset_minutes", Integer.valueOf(f0Var.k2()));
                }
                if (f0Var.z()) {
                    s(sbY, 1, "bundle_sequential_index", Integer.valueOf(f0Var.A()));
                }
                if (f0Var.H0()) {
                    s(sbY, 1, "delivery_index", Integer.valueOf(f0Var.I0()));
                }
                if (f0Var.D()) {
                    s(sbY, 1, "service_upload", Boolean.valueOf(f0Var.E()));
                }
                s(sbY, 1, "health_monitor", f0Var.B());
                if (f0Var.n0()) {
                    s(sbY, 1, "retry_counter", Integer.valueOf(f0Var.o0()));
                }
                if (f0Var.r0()) {
                    s(sbY, 1, "consent_signals", f0Var.s0());
                }
                if (f0Var.A0()) {
                    s(sbY, 1, "is_dma_region", Boolean.valueOf(f0Var.B0()));
                }
                if (f0Var.C0()) {
                    s(sbY, 1, "core_platform_services", f0Var.D0());
                }
                if (f0Var.y0()) {
                    s(sbY, 1, "consent_diagnostics", f0Var.z0());
                }
                if (f0Var.v0()) {
                    s(sbY, 1, "target_os_version", Long.valueOf(f0Var.w0()));
                }
                zzqp.a();
                if (rVar.d.k(f0Var.n(), l.Q0)) {
                    s(sbY, 1, "ad_services_version", Integer.valueOf(f0Var.E0()));
                    if (f0Var.F0() && (vVarG0 = f0Var.G0()) != null) {
                        m(2, sbY);
                        sbY.append("attribution_eligibility_status {\n");
                        s(sbY, 2, "eligible", Boolean.valueOf(vVarG0.n()));
                        s(sbY, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(vVarG0.o()));
                        s(sbY, 2, "pre_r", Boolean.valueOf(vVarG0.p()));
                        s(sbY, 2, "r_extensions_too_old", Boolean.valueOf(vVarG0.q()));
                        s(sbY, 2, "adservices_extension_too_old", Boolean.valueOf(vVarG0.r()));
                        s(sbY, 2, "ad_storage_not_allowed", Boolean.valueOf(vVarG0.s()));
                        s(sbY, 2, "measurement_manager_disabled", Boolean.valueOf(vVarG0.t()));
                        m(2, sbY);
                        sbY.append("}\n");
                    }
                }
                if (f0Var.J0()) {
                    t tVarK0 = f0Var.K0();
                    m(2, sbY);
                    sbY.append("ad_campaign_info {\n");
                    if (tVarK0.w()) {
                        s(sbY, 2, "deep_link_gclid", tVarK0.x());
                    }
                    if (tVarK0.y()) {
                        s(sbY, 2, "deep_link_gbraid", tVarK0.z());
                    }
                    if (tVarK0.A()) {
                        s(sbY, 2, "deep_link_gad_source", tVarK0.B());
                    }
                    if (tVarK0.C()) {
                        s(sbY, 2, "deep_link_session_millis", Long.valueOf(tVarK0.D()));
                    }
                    if (tVarK0.E()) {
                        s(sbY, 2, "market_referrer_gclid", tVarK0.F());
                    }
                    if (tVarK0.G()) {
                        s(sbY, 2, "market_referrer_gbraid", tVarK0.H());
                    }
                    if (tVarK0.I()) {
                        s(sbY, 2, "market_referrer_gad_source", tVarK0.J());
                    }
                    if (tVarK0.K()) {
                        s(sbY, 2, "market_referrer_click_millis", Long.valueOf(tVarK0.L()));
                    }
                    m(2, sbY);
                    sbY.append("}\n");
                }
                if (f0Var.O()) {
                    s(sbY, 1, "batching_timestamp_millis", Long.valueOf(f0Var.P()));
                }
                if (f0Var.L0()) {
                    j0 j0VarM0 = f0Var.M0();
                    m(2, sbY);
                    sbY.append("sgtm_diagnostics {\n");
                    int iR = j0VarM0.r();
                    s(sbY, 2, "upload_type", iR != 1 ? iR != 2 ? iR != 3 ? iR != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    s(sbY, 2, "client_upload_eligibility", j0VarM0.n().name());
                    int iS = j0VarM0.s();
                    s(sbY, 2, "service_upload_eligibility", iS != 1 ? iS != 2 ? iS != 3 ? iS != 4 ? iS != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    m(2, sbY);
                    sbY.append("}\n");
                }
                if (f0Var.Q()) {
                    y yVarR = f0Var.R();
                    m(2, sbY);
                    sbY.append("consent_info_extra {\n");
                    for (x xVar : yVarR.n()) {
                        m(3, sbY);
                        sbY.append("limited_data_modes {\n");
                        int iO = xVar.o();
                        s(sbY, 3, "type", iO != 1 ? iO != 2 ? iO != 3 ? iO != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iP = xVar.p();
                        s(sbY, 3, "mode", iP != 1 ? iP != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m(3, sbY);
                        sbY.append("}\n");
                    }
                    m(2, sbY);
                    sbY.append("}\n");
                }
                zzmo<k0> zzmoVarS1 = f0Var.S1();
                if (zzmoVarS1 != null) {
                    for (k0 k0Var : zzmoVarS1) {
                        if (k0Var != null) {
                            m(2, sbY);
                            sbY.append("user_property {\n");
                            s(sbY, 2, "set_timestamp_millis", k0Var.n() ? Long.valueOf(k0Var.o()) : null);
                            s(sbY, 2, "name", zzgnVar.c(k0Var.p()));
                            s(sbY, 2, "string_value", k0Var.r());
                            s(sbY, 2, "int_value", k0Var.s() ? Long.valueOf(k0Var.t()) : null);
                            s(sbY, 2, "double_value", k0Var.w() ? Double.valueOf(k0Var.x()) : null);
                            m(2, sbY);
                            sbY.append("}\n");
                        }
                    }
                }
                zzmo<w> zzmoVarF = f0Var.F();
                if (zzmoVarF != null) {
                    for (w wVar : zzmoVarF) {
                        if (wVar != null) {
                            m(2, sbY);
                            sbY.append("audience_membership {\n");
                            if (wVar.n()) {
                                s(sbY, 2, "audience_id", Integer.valueOf(wVar.o()));
                            }
                            if (wVar.s()) {
                                s(sbY, 2, "new_audience", Boolean.valueOf(wVar.t()));
                            }
                            r(sbY, "current_data", wVar.p());
                            if (wVar.q()) {
                                r(sbY, "previous_data", wVar.r());
                            }
                            m(2, sbY);
                            sbY.append("}\n");
                        }
                    }
                }
                List<a0> listN1 = f0Var.N1();
                if (listN1 != null) {
                    for (a0 a0Var : listN1) {
                        if (a0Var != null) {
                            m(2, sbY);
                            sbY.append("event {\n");
                            s(sbY, 2, "name", zzgnVar.a(a0Var.q()));
                            if (a0Var.r()) {
                                s(sbY, 2, "timestamp_millis", Long.valueOf(a0Var.s()));
                            }
                            if (a0Var.t()) {
                                s(sbY, 2, "previous_timestamp_millis", Long.valueOf(a0Var.u()));
                            }
                            if (a0Var.v()) {
                                s(sbY, 2, "count", Integer.valueOf(a0Var.w()));
                            }
                            if (a0Var.o() != 0) {
                                k(sbY, 2, (zzmo) a0Var.n());
                            }
                            m(2, sbY);
                            sbY.append("}\n");
                        }
                    }
                }
                m(1, sbY);
                sbY.append("}\n");
            }
        }
        sbY.append("} // End-of-batch\n");
        return sbY.toString();
    }

    public final String z(f fVar) {
        StringBuilder sbY = hz.y("\nproperty_filter {\n");
        if (fVar.n()) {
            s(sbY, 0, "filter_id", Integer.valueOf(fVar.o()));
        }
        s(sbY, 0, "property_name", this.a.j.c(fVar.p()));
        String strO = o(fVar.r(), fVar.s(), fVar.u());
        if (!strO.isEmpty()) {
            s(sbY, 0, "filter_type", strO);
        }
        l(sbY, 1, fVar.q());
        sbY.append("}\n");
        return sbY.toString();
    }

    @Override // defpackage.oi3
    public final void d() {
    }
}
