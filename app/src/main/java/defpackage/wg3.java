package defpackage;

import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzlv;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzou;
import java.util.DesugarCollections;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wg3 {
    public static final wg3 c = new wg3(0);
    public final ci3 a = new ci3();
    public boolean b;

    public wg3(int i) {
        a();
        a();
    }

    public static void e(u0 u0Var, zzot zzotVar, int i, Object obj) throws IOException {
        if (zzotVar == zzot.zzj) {
            zznm zznmVar = (zznm) obj;
            if (zznmVar instanceof zzkt) {
                throw null;
            }
            u0Var.e(i, 3);
            zznmVar.zzcB(u0Var);
            u0Var.e(i, 4);
            return;
        }
        u0Var.e(i, zzotVar.zzb());
        zzou zzouVar = zzou.INT;
        switch (zzotVar.ordinal()) {
            case 0:
                u0Var.r(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                u0Var.p(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                u0Var.q(((Long) obj).longValue());
                return;
            case 3:
                u0Var.q(((Long) obj).longValue());
                return;
            case 4:
                u0Var.n(((Integer) obj).intValue());
                return;
            case 5:
                u0Var.r(((Long) obj).longValue());
                return;
            case 6:
                u0Var.p(((Integer) obj).intValue());
                return;
            case 7:
                u0Var.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof zzlh)) {
                    u0Var.s((String) obj);
                    return;
                }
                zzlh zzlhVar = (zzlh) obj;
                t0 t0Var = (t0) u0Var;
                t0Var.o(zzlhVar.zzc());
                zzlhVar.zzf(t0Var);
                return;
            case 9:
                ((zznm) obj).zzcB(u0Var);
                return;
            case 10:
                u0Var.l((zznm) obj);
                return;
            case 11:
                if (obj instanceof zzlh) {
                    zzlh zzlhVar2 = (zzlh) obj;
                    t0 t0Var2 = (t0) u0Var;
                    t0Var2.o(zzlhVar2.zzc());
                    zzlhVar2.zzf(t0Var2);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                t0 t0Var3 = (t0) u0Var;
                t0Var3.o(length);
                t0Var3.u(length, bArr);
                return;
            case 12:
                u0Var.o(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof zzmj) {
                    u0Var.n(((zzmj) obj).zza());
                    return;
                } else {
                    u0Var.n(((Integer) obj).intValue());
                    return;
                }
            case 14:
                u0Var.p(((Integer) obj).intValue());
                return;
            case 15:
                u0Var.r(((Long) obj).longValue());
                return;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                u0Var.o((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                u0Var.q((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return;
            default:
                return;
        }
    }

    public static int f(zzot zzotVar, int i, Object obj) {
        int iT = u0.t(i << 3);
        if (zzotVar == zzot.zzj) {
            if (((zznm) obj) instanceof zzkt) {
                throw null;
            }
            iT += iT;
        }
        return g(zzotVar, obj) + iT;
    }

    public static int g(zzot zzotVar, Object obj) {
        int iZzc;
        int iT;
        zzot zzotVar2 = zzot.zza;
        zzou zzouVar = zzou.INT;
        switch (zzotVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = u0.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = u0.b;
                return 4;
            case 2:
                return u0.a(((Long) obj).longValue());
            case 3:
                return u0.a(((Long) obj).longValue());
            case 4:
                return u0.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = u0.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = u0.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = u0.b;
                return 1;
            case 8:
                if (!(obj instanceof zzlh)) {
                    return u0.b((String) obj);
                }
                Logger logger6 = u0.b;
                iZzc = ((zzlh) obj).zzc();
                iT = u0.t(iZzc);
                break;
                break;
            case 9:
                return ((zznm) obj).zzcn();
            case 10:
                return u0.c((zznm) obj);
            case 11:
                if (!(obj instanceof zzlh)) {
                    Logger logger7 = u0.b;
                    iZzc = ((byte[]) obj).length;
                    iT = u0.t(iZzc);
                } else {
                    Logger logger8 = u0.b;
                    iZzc = ((zzlh) obj).zzc();
                    iT = u0.t(iZzc);
                }
                break;
            case 12:
                return u0.t(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzmj ? u0.a(((zzmj) obj).zza()) : u0.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = u0.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = u0.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return u0.t((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return u0.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                s31.f("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iT + iZzc;
    }

    public static int h(zzlv zzlvVar, Object obj) {
        zzot zzotVarZzb = zzlvVar.zzb();
        int iZza = zzlvVar.zza();
        if (!zzlvVar.zzd()) {
            return f(zzotVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzlvVar.zze()) {
            int iF = 0;
            while (i < size) {
                iF += f(zzotVarZzb, iZza, list.get(i));
                i++;
            }
            return iF;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iG = 0;
        while (i < size) {
            iG += g(zzotVarZzb, list.get(i));
            i++;
        }
        return u0.t(iG) + u0.t(iZza << 3) + iG;
    }

    public static boolean i(Map.Entry entry) {
        zzlv zzlvVar = (zzlv) entry.getKey();
        if (zzlvVar.zzc() != zzou.MESSAGE) {
            return true;
        }
        if (!zzlvVar.zzd()) {
            Object value = entry.getValue();
            if (value instanceof zznn) {
                return ((zznn) value).zzcD();
            }
            u7.r("Wrong object type used with protocol message reflection.");
            return false;
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(obj instanceof zznn)) {
                u7.r("Wrong object type used with protocol message reflection.");
                return false;
            }
            if (!((zznn) obj).zzcD()) {
                return false;
            }
        }
        return true;
    }

    public static final int j(Map.Entry entry) {
        zzlv zzlvVar = (zzlv) entry.getKey();
        Object value = entry.getValue();
        if (zzlvVar.zzc() != zzou.MESSAGE || zzlvVar.zzd() || zzlvVar.zze()) {
            return h(zzlvVar, value);
        }
        int iZza = ((zzlv) entry.getKey()).zza();
        int iT = u0.t(8);
        int iT2 = u0.t(iZza) + u0.t(16);
        return iT + iT + iT2 + u0.c((zznm) value) + u0.t(24);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void k(zzlv zzlvVar, Object obj) {
        boolean z;
        zzlvVar.zzb();
        Charset charset = ih3.a;
        obj.getClass();
        zzot zzotVar = zzot.zza;
        zzou zzouVar = zzou.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzlh) || (obj instanceof byte[])) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzmj)) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if (obj instanceof zznm) {
                }
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            default:
                zu0.m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ci3 ci3Var = this.a;
        int i = ci3Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ci3Var.a(i2).b;
            if (obj instanceof zzmf) {
                ((zzmf) obj).e();
            }
        }
        Iterator it = ci3Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzmf) {
                ((zzmf) value).e();
            }
        }
        if (!ci3Var.d) {
            for (int i3 = 0; i3 < ci3Var.b; i3++) {
                di3 di3VarA = ci3Var.a(i3);
                if (((zzlv) di3VarA.a).zzd()) {
                    di3VarA.setValue(DesugarCollections.unmodifiableList((List) di3VarA.b));
                }
            }
            for (Map.Entry entry : ci3Var.b()) {
                if (((zzlv) entry.getKey()).zzd()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!ci3Var.d) {
            ci3Var.c = ci3Var.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(ci3Var.c);
            ci3Var.f = ci3Var.f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(ci3Var.f);
            ci3Var.d = true;
        }
        this.b = true;
    }

    public final Iterator b() {
        ci3 ci3Var = this.a;
        return ci3Var.isEmpty() ? Collections.emptyIterator() : ((c1) ci3Var.entrySet()).iterator();
    }

    public final void c(zzlv zzlvVar, Object obj) {
        if (!zzlvVar.zzd()) {
            k(zzlvVar, obj);
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
                k(zzlvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.a.put(zzlvVar, obj);
    }

    public final Object clone() {
        wg3 wg3Var = new wg3();
        ci3 ci3Var = this.a;
        int i = ci3Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            di3 di3VarA = ci3Var.a(i2);
            wg3Var.c((zzlv) di3VarA.a, di3VarA.b);
        }
        for (Map.Entry entry : ci3Var.b()) {
            wg3Var.c((zzlv) entry.getKey(), entry.getValue());
        }
        return wg3Var;
    }

    public final boolean d() {
        ci3 ci3Var = this.a;
        int i = ci3Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = ci3Var.b().iterator();
                while (it.hasNext()) {
                    if (!i((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!i(ci3Var.a(i2))) {
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
        if (obj instanceof wg3) {
            return this.a.equals(((wg3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wg3() {
    }
}
