package defpackage;

import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.c9;
import com.google.android.gms.internal.ads.i;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.v;
import com.google.android.gms.internal.ads.w8;
import com.google.android.gms.internal.ads.z8;
import com.google.android.gms.internal.ads.zzhaw;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbf;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhix;
import com.google.android.gms.internal.ads.zzhjj;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhjx;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhlm;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g43 implements zzhjj {
    public final List a;
    public final f73 b;
    public final g43 c;

    public g43(List list, f73 f73Var) throws GeneralSecurityException {
        this.a = list;
        this.b = f73Var;
        if (((AtomicBoolean) p63.a.b).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                n7 n7Var = (n7) it.next();
                int i = n7Var.c;
                if (hashSet.contains(Integer.valueOf(i))) {
                    throw new GeneralSecurityException(vh.r(new StringBuilder(String.valueOf(i).length() + 121), "KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i));
                z |= n7Var.d;
            }
            if (!z) {
                zg1.m("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                throw null;
            }
        }
        this.c = null;
    }

    public static final g43 a(a9 a9Var) {
        zzhaz zzhjoVar;
        boolean z;
        if (a9Var == null || a9Var.x() <= 0) {
            zg1.m("empty keyset");
            return null;
        }
        i43 i43Var = i43.a;
        ArrayList arrayList = new ArrayList(a9Var.x());
        for (z8 z8Var : a9Var.w()) {
            int iW = z8Var.w();
            try {
                s73 s73VarG = g(z8Var);
                zzhkg zzhkgVar = zzhkg.b;
                y73 y73Var = (y73) zzhkgVar.a.get();
                y73Var.getClass();
                zzhjoVar = !y73Var.b.containsKey(new w73(s73.class, s73VarG.b)) ? new zzhjo(s73VarG, i43Var) : zzhkgVar.e(s73VarG);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) p63.a.b).get()) {
                    throw e;
                }
                zzhjoVar = new zzhjo(g(z8Var), i43Var);
                z = true;
            }
            if (((AtomicBoolean) p63.a.b).get() && !h(z8Var.C())) {
                zg1.m("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            boolean z2 = true;
            int iC = z8Var.C();
            if (iW != a9Var.v()) {
                z2 = false;
            }
            arrayList.add(new n7(zzhjoVar, iC, iW, z2, z, i.c));
        }
        return new g43(DesugarCollections.unmodifiableList(arrayList), f73.b);
    }

    public static final g43 e(zzhbp zzhbpVar) {
        int i;
        zzhbf zzhbfVar = new zzhbf();
        f43 f43Var = new f43(zzhbpVar);
        i60 i60Var = i60.n;
        f43Var.c = i60Var;
        f43Var.a = true;
        ArrayList<f43> arrayList = zzhbfVar.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f43) it.next()).a = false;
        }
        arrayList.add(f43Var);
        if (zzhbfVar.c) {
            zg1.m("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        zzhbfVar.c = true;
        ArrayList<n7> arrayList2 = new ArrayList(arrayList.size());
        int i2 = 0;
        while (i2 < arrayList.size() - 1) {
            int i3 = i2 + 1;
            if (((f43) arrayList.get(i2)).c == i60Var && ((f43) arrayList.get(i3)).c != i60Var) {
                zg1.m("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (f43 f43Var2 : arrayList) {
            f43Var2.getClass();
            zzhbp zzhbpVar2 = f43Var2.b;
            i60 i60Var2 = f43Var2.c;
            if (i60Var2 == null) {
                zg1.m("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            if (i60Var2 == i60Var) {
                int i4 = 0;
                while (true) {
                    if (i4 != 0 && !hashSet.contains(Integer.valueOf(i4))) {
                        break;
                    }
                    int i5 = z73.a;
                    i4 = 0;
                    while (i4 == 0) {
                        byte[] bArrA = u73.a(4);
                        i4 = (bArrA[3] & 255) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8);
                    }
                }
                i = i4;
            } else {
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(vh.r(new StringBuilder(String.valueOf(i).length() + 31), "Id ", i, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzhaz zzhazVarB = zzhjx.b.b(zzhbpVar2, true != zzhbpVar2.a() ? null : numValueOf);
            boolean z = f43Var2.a;
            n7 n7Var = new n7(zzhazVarB, 3, i, z, false, i.c);
            if (z) {
                if (num != null) {
                    zg1.m("Two primaries were set");
                    return null;
                }
                num = numValueOf;
            }
            arrayList2.add(n7Var);
        }
        if (num == null) {
            zg1.m("No primary was set");
            return null;
        }
        f73 f73Var = zzhbfVar.b;
        g43 g43Var = new g43(arrayList2, f73Var);
        if (f73Var.a.isEmpty()) {
            return g43Var;
        }
        v vVar = new v(g43Var, f73Var);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (n7 n7Var2 : arrayList2) {
            arrayList3.add(new n7(n7Var2.a, n7Var2.g, n7Var2.c, n7Var2.d, n7Var2.e, vVar));
        }
        return new g43(arrayList3, f73Var, g43Var);
    }

    public static s73 g(z8 z8Var) {
        return s73.a(z8Var.v().v(), z8Var.v().w(), z8Var.v().x(), z8Var.x(), z8Var.x() == zzhqy.RAW ? null : Integer.valueOf(z8Var.w()));
    }

    public static boolean h(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final a9 b() {
        try {
            x93 x93VarB = a9.B();
            for (n7 n7Var : this.a) {
                zzhaz zzhazVarA = n7Var.a();
                int i = n7Var.c;
                int i2 = n7Var.g;
                s73 s73Var = (s73) zzhkg.b.f(zzhazVarA);
                Integer numB = zzhazVarA.b();
                if (numB != null && numB.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                y93 y93VarY = z8.y();
                v93 v93VarY = w8.y();
                String str = s73Var.a;
                v93VarY.d();
                ((w8) v93VarY.b).A(str);
                zzian zzianVar = s73Var.c;
                v93VarY.d();
                ((w8) v93VarY.b).B(zzianVar);
                zzhqb zzhqbVar = s73Var.d;
                v93VarY.d();
                ((w8) v93VarY.b).C(zzhqbVar);
                y93VarY.d();
                ((z8) y93VarY.b).z((w8) v93VarY.e());
                y93VarY.d();
                ((z8) y93VarY.b).D(i2);
                y93VarY.d();
                ((z8) y93VarY.b).A(i);
                zzhqy zzhqyVar = s73Var.e;
                y93VarY.d();
                ((z8) y93VarY.b).B(zzhqyVar);
                z8 z8Var = (z8) y93VarY.e();
                x93VarB.d();
                ((a9) x93VarB.b).D(z8Var);
                if (n7Var.d) {
                    x93VarB.d();
                    ((a9) x93VarB.b).C(i);
                }
            }
            return (a9) x93VarB.e();
        } catch (GeneralSecurityException e) {
            throw new zzhlm(e);
        }
    }

    public final n7 c() {
        for (n7 n7Var : this.a) {
            if (n7Var != null && n7Var.d) {
                if (n7Var.b == e43.c) {
                    return n7Var;
                }
                u7.p("Keyset has primary which isn't enabled");
                return null;
            }
        }
        u7.p("Keyset has no valid primary");
        return null;
    }

    public final n7 d(int i) {
        List list = this.a;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            u7.i(hz.n(i, size, "Invalid index ", " for keyset of size ", new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length())));
            return null;
        }
        n7 n7Var = (n7) list.get(i);
        if (!h(n7Var.g)) {
            u7.p(vh.r(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
            return null;
        }
        if (!n7Var.e) {
            return (n7) list.get(i);
        }
        u7.p(vh.r(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        return null;
    }

    public final Object f(zzhaw zzhawVar, Class cls) throws GeneralSecurityException {
        if (!(zzhawVar instanceof zzhix)) {
            zg1.m("Currently only subclasses of InternalConfiguration are accepted");
            return null;
        }
        zzhix zzhixVar = (zzhix) zzhawVar;
        g43 g43Var = this.c;
        a9 a9VarB = (g43Var == null ? this : g43Var).b();
        int i = j43.a;
        int iV = a9VarB.v();
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        for (z8 z8Var : a9VarB.w()) {
            if (z8Var.C() == 3) {
                if (!z8Var.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(z8Var.w())));
                }
                if (z8Var.x() == zzhqy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(z8Var.w())));
                }
                if (z8Var.C() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(z8Var.w())));
                }
                if (z8Var.w() == iV) {
                    if (z2) {
                        zg1.m("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                z &= z8Var.v().x() == zzhqb.ASYMMETRIC_PUBLIC;
                i3++;
            }
        }
        if (i3 == 0) {
            zg1.m("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z2 && !z) {
            zg1.m("keyset doesn't contain a valid primary key");
            return null;
        }
        while (true) {
            List list = this.a;
            if (i2 >= list.size()) {
                if (g43Var == null) {
                    g43Var = this;
                }
                return zzhixVar.a(g43Var, this.b, cls);
            }
            if (((n7) list.get(i2)).e || !h(((n7) list.get(i2)).g)) {
                break;
            }
            i2++;
        }
        String strV = a9VarB.y(i2).v().v();
        StringBuilder sb = new StringBuilder(String.valueOf(strV).length() + String.valueOf(i2).length() + 44 + 32);
        sb.append("Key parsing of key with index ");
        sb.append(i2);
        sb.append(" and type_url ");
        sb.append(strV);
        sb.append(" failed, unable to get primitive");
        throw new GeneralSecurityException(sb.toString());
    }

    public final String toString() {
        a9 a9VarB = b();
        int i = j43.a;
        z93 z93VarV = c9.v();
        int iV = a9VarB.v();
        z93VarV.d();
        ((c9) z93VarV.b).w(iV);
        for (z8 z8Var : a9VarB.w()) {
            aa3 aa3VarV = b9.v();
            String strV = z8Var.v().v();
            aa3VarV.d();
            ((b9) aa3VarV.b).w(strV);
            int iC = z8Var.C();
            aa3VarV.d();
            ((b9) aa3VarV.b).z(iC);
            zzhqy zzhqyVarX = z8Var.x();
            aa3VarV.d();
            ((b9) aa3VarV.b).y(zzhqyVarX);
            int iW = z8Var.w();
            aa3VarV.d();
            ((b9) aa3VarV.b).x(iW);
            b9 b9Var = (b9) aa3VarV.e();
            z93VarV.d();
            ((c9) z93VarV.b).x(b9Var);
        }
        return ((c9) z93VarV.e()).toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhjj
    public final int zzd() {
        return this.a.size();
    }

    public g43(ArrayList arrayList, f73 f73Var, g43 g43Var) {
        this.a = arrayList;
        this.b = f73Var;
        this.c = g43Var;
    }
}
