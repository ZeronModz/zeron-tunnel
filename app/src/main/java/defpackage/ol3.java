package defpackage;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ol3 {
    public final String a;
    public final boolean b;
    public final h0 c;
    public final BitSet d;
    public final BitSet e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final /* synthetic */ xv1 h;

    public /* synthetic */ ol3(xv1 xv1Var, String str, h0 h0Var, BitSet bitSet, BitSet bitSet2, ArrayMap arrayMap, ArrayMap arrayMap2) {
        this.h = xv1Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = arrayMap;
        this.g = new ArrayMap();
        for (Integer num : (b8) arrayMap2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) arrayMap2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = h0Var;
    }

    public final void a(zu1 zu1Var) {
        int iO;
        switch (zu1Var.g) {
            case 0:
                iO = ((c) zu1Var.i).o();
                break;
            default:
                iO = ((f) zu1Var.i).o();
                break;
        }
        boolean z = true;
        if (zu1Var.c != null) {
            this.e.set(iO, true);
        }
        Boolean bool = zu1Var.d;
        if (bool != null) {
            this.d.set(iO, bool.booleanValue());
        }
        if (zu1Var.e != null) {
            Integer numValueOf = Integer.valueOf(iO);
            ArrayMap arrayMap = this.f;
            Long l = (Long) arrayMap.get(numValueOf);
            long jLongValue = zu1Var.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                arrayMap.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (zu1Var.f != null) {
            Integer numValueOf2 = Integer.valueOf(iO);
            ArrayMap arrayMap2 = this.g;
            List arrayList = (List) arrayMap2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                arrayMap2.put(numValueOf2, arrayList);
            }
            boolean zT = false;
            switch (zu1Var.g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            zzpu.a();
            r rVar = this.h.a;
            b bVar = rVar.d;
            k kVar = l.G0;
            String str = this.a;
            if (bVar.k(str, kVar)) {
                switch (zu1Var.g) {
                    case 0:
                        zT = ((c) zu1Var.i).t();
                        break;
                }
                if (zT) {
                    arrayList.clear();
                }
            }
            zzpu.a();
            boolean zK = rVar.d.k(str, kVar);
            Long l2 = zu1Var.f;
            if (!zK) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final w b(int i) {
        List list;
        p53 p53VarU = w.u();
        p53VarU.f();
        ((w) p53VarU.b).v(i);
        p53VarU.f();
        ((w) p53VarU.b).y(this.b);
        h0 h0Var = this.c;
        if (h0Var != null) {
            p53VarU.f();
            ((w) p53VarU.b).x(h0Var);
        }
        he3 he3VarV = h0.v();
        ArrayList arrayListD = cj3.D(this.d);
        he3VarV.f();
        ((h0) he3VarV.b).z(arrayListD);
        ArrayList arrayListD2 = cj3.D(this.e);
        he3VarV.f();
        ((h0) he3VarV.b).x(arrayListD2);
        ArrayMap arrayMap = this.f;
        ArrayList arrayList = new ArrayList(arrayMap.c);
        for (Integer num : arrayMap.keySet()) {
            int iIntValue = num.intValue();
            Long l = (Long) arrayMap.get(num);
            if (l != null) {
                l93 l93VarR = z.r();
                l93VarR.f();
                ((z) l93VarR.b).s(iIntValue);
                long jLongValue = l.longValue();
                l93VarR.f();
                ((z) l93VarR.b).t(jLongValue);
                arrayList.add((z) l93VarR.h());
            }
        }
        he3VarV.f();
        ((h0) he3VarV.b).B(arrayList);
        ArrayMap arrayMap2 = this.g;
        if (arrayMap2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayMap2.c);
            for (Integer num2 : (b8) arrayMap2.keySet()) {
                ne3 ne3VarS = i0.s();
                int iIntValue2 = num2.intValue();
                ne3VarS.f();
                ((i0) ne3VarS.b).t(iIntValue2);
                List list2 = (List) arrayMap2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    ne3VarS.f();
                    ((i0) ne3VarS.b).u(list2);
                }
                arrayList2.add((i0) ne3VarS.h());
            }
            list = arrayList2;
        }
        he3VarV.f();
        ((h0) he3VarV.b).D(list);
        p53VarU.f();
        ((w) p53VarU.b).w((h0) he3VarV.h());
        return (w) p53VarU.h();
    }

    public /* synthetic */ ol3(xv1 xv1Var, String str) {
        this.h = xv1Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new ArrayMap();
        this.g = new ArrayMap();
    }
}
