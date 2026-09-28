package defpackage;

import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzibf;
import com.google.android.gms.internal.ads.zzibr;
import com.google.android.gms.internal.ads.zzibv;
import com.google.android.gms.internal.ads.zzidc;
import com.google.android.gms.internal.ads.zzidd;
import com.google.android.gms.internal.ads.zzies;
import com.google.android.gms.internal.ads.zziet;
import java.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class id3 {
    public static final id3 c = new id3(0);
    public final qd3 a = new qd3();
    public boolean b;

    public id3(int i) {
        a();
        a();
    }

    public static void e(ed3 ed3Var, zzies zziesVar, int i, Object obj) {
        if (zziesVar == zzies.zzj) {
            ed3Var.e(i, 3);
            ((zzidc) obj).zzcX(ed3Var);
            ed3Var.e(i, 4);
            return;
        }
        ed3Var.e(i, zziesVar.zzb());
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                ed3Var.y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                ed3Var.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                ed3Var.x(((Long) obj).longValue());
                break;
            case 3:
                ed3Var.x(((Long) obj).longValue());
                break;
            case 4:
                ed3Var.u(((Integer) obj).intValue());
                break;
            case 5:
                ed3Var.y(((Long) obj).longValue());
                break;
            case 6:
                ed3Var.w(((Integer) obj).intValue());
                break;
            case 7:
                ed3Var.t(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzian)) {
                    ed3Var.z((String) obj);
                } else {
                    ed3Var.o((zzian) obj);
                }
                break;
            case 9:
                ((zzidc) obj).zzcX(ed3Var);
                break;
            case 10:
                ed3Var.s((zzidc) obj);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    byte[] bArr = (byte[]) obj;
                    ed3Var.p(bArr.length, bArr);
                } else {
                    ed3Var.o((zzian) obj);
                }
                break;
            case 12:
                ed3Var.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzibv)) {
                    ed3Var.u(((Integer) obj).intValue());
                } else {
                    ed3Var.u(((zzibv) obj).zza());
                }
                break;
            case 14:
                ed3Var.w(((Integer) obj).intValue());
                break;
            case 15:
                ed3Var.y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                ed3Var.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                ed3Var.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int f(zzies zziesVar, int i, Object obj) {
        int iB = ed3.b(i << 3);
        if (zziesVar == zzies.zzj) {
            iB += iB;
        }
        return g(zziesVar, obj) + iB;
    }

    public static int g(zzies zziesVar, Object obj) {
        int iA;
        int iB;
        zzies zziesVar2 = zzies.zza;
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = ed3.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = ed3.b;
                return 4;
            case 2:
                return ed3.c(((Long) obj).longValue());
            case 3:
                return ed3.c(((Long) obj).longValue());
            case 4:
                return ed3.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z3 = ed3.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = ed3.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = ed3.b;
                return 1;
            case 8:
                if (!(obj instanceof zzian)) {
                    boolean z6 = ed3.b;
                    iA = cb.a((String) obj);
                    iB = ed3.b(iA);
                } else {
                    boolean z7 = ed3.b;
                    iA = ((zzian) obj).zzc();
                    iB = ed3.b(iA);
                }
                break;
            case 9:
                return ((zzidc) obj).zzbr();
            case 10:
                boolean z8 = ed3.b;
                iA = ((zzidc) obj).zzbr();
                iB = ed3.b(iA);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    boolean z9 = ed3.b;
                    iA = ((byte[]) obj).length;
                    iB = ed3.b(iA);
                } else {
                    boolean z10 = ed3.b;
                    iA = ((zzian) obj).zzc();
                    iB = ed3.b(iA);
                }
                break;
            case 12:
                return ed3.b(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzibv ? ed3.c(((zzibv) obj).zza()) : ed3.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z11 = ed3.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z12 = ed3.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return ed3.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return ed3.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                s31.f("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iB + iA;
    }

    public static int h(zzibf zzibfVar, Object obj) {
        zzies zziesVarZzb = zzibfVar.zzb();
        int iZza = zzibfVar.zza();
        if (!zzibfVar.zzd()) {
            return f(zziesVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzibfVar.zze()) {
            int iF = 0;
            while (i < size) {
                iF += f(zziesVarZzb, iZza, list.get(i));
                i++;
            }
            return iF;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iG = 0;
        while (i < size) {
            iG += g(zziesVarZzb, list.get(i));
            i++;
        }
        return ed3.b(iG) + ed3.b(iZza << 3) + iG;
    }

    public static boolean i(Map.Entry entry) {
        zzibf zzibfVar = (zzibf) entry.getKey();
        if (zzibfVar.zzc() != zziet.MESSAGE) {
            return true;
        }
        if (!zzibfVar.zzd()) {
            Object value = entry.getValue();
            if (value instanceof zzidd) {
                return ((zzidd) value).zzbi();
            }
            u7.r("Wrong object type used with protocol message reflection.");
            return false;
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(obj instanceof zzidd)) {
                u7.r("Wrong object type used with protocol message reflection.");
                return false;
            }
            if (!((zzidd) obj).zzbi()) {
                return false;
            }
        }
        return true;
    }

    public static final int j(Map.Entry entry) {
        zzibf zzibfVar = (zzibf) entry.getKey();
        Object value = entry.getValue();
        if (zzibfVar.zzc() != zziet.MESSAGE || zzibfVar.zzd() || zzibfVar.zze()) {
            return h(zzibfVar, value);
        }
        int iZza = ((zzibf) entry.getKey()).zza();
        int iB = ed3.b(8);
        int iB2 = ed3.b(iZza) + ed3.b(16);
        int iB3 = ed3.b(24);
        int iZzbr = ((zzidc) value).zzbr();
        return iB + iB + iB2 + ec1.E(iZzbr, iZzbr, iB3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzibf zzibfVar, Object obj) {
        boolean z;
        zzibfVar.zzb();
        Charset charset = kd3.a;
        obj.getClass();
        zzies zziesVar = zzies.zza;
        zziet zzietVar = zziet.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzian) || (obj instanceof byte[])) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzibv)) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if (obj instanceof zzidc) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
            default:
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzibfVar.zza()), zzibfVar.zzb().zza(), obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        qd3 qd3Var = this.a;
        int i = qd3Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = qd3Var.a(i2).b;
            if (obj instanceof zzibr) {
                ((zzibr) obj).m();
            }
        }
        Iterator it = qd3Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzibr) {
                ((zzibr) value).m();
            }
        }
        if (!qd3Var.d) {
            for (int i3 = 0; i3 < qd3Var.b; i3++) {
                rd3 rd3VarA = qd3Var.a(i3);
                if (((zzibf) rd3VarA.a).zzd()) {
                    rd3VarA.setValue(DesugarCollections.unmodifiableList((List) rd3VarA.b));
                }
            }
            for (Map.Entry entry : qd3Var.b()) {
                if (((zzibf) entry.getKey()).zzd()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!qd3Var.d) {
            qd3Var.c = qd3Var.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(qd3Var.c);
            qd3Var.f = qd3Var.f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(qd3Var.f);
            qd3Var.d = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        qd3 qd3Var = this.a;
        return qd3Var.isEmpty() ? Collections.emptyIterator() : ((c1) qd3Var.entrySet()).iterator();
    }

    public final void c(zzibf zzibfVar, Object obj) {
        if (!zzibfVar.zzd()) {
            k(zzibfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                u7.r("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                k(zzibfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.a.put(zzibfVar, obj);
    }

    public final Object clone() {
        id3 id3Var = new id3();
        qd3 qd3Var = this.a;
        int i = qd3Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            rd3 rd3VarA = qd3Var.a(i2);
            id3Var.c((zzibf) rd3VarA.a, rd3VarA.b);
        }
        for (Map.Entry entry : qd3Var.b()) {
            id3Var.c((zzibf) entry.getKey(), entry.getValue());
        }
        return id3Var;
    }

    public final boolean d() {
        qd3 qd3Var = this.a;
        int i = qd3Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = qd3Var.b().iterator();
                while (it.hasNext()) {
                    if (!i((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!i(qd3Var.a(i2))) {
                break;
            }
            i2++;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof id3) {
            return this.a.equals(((id3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public id3() {
    }
}
