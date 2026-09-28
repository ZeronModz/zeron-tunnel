package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import java.util.Objects;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f02 {
    public static final f02 f = new f02((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public f02(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.e = enumMap;
        enumMap.put(zzjk.AD_USER_DATA, bool == null ? zzji.UNINITIALIZED : bool.booleanValue() ? zzji.GRANTED : zzji.DENIED);
        this.a = i;
        this.b = e();
        this.c = bool2;
        this.d = str;
    }

    public static f02 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.DMA.zza();
        int length = zzjkVarArrZza.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(zzjkVarArrZza[i3], zzjl.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new f02(enumMap, i, (Boolean) null, (String) null);
    }

    public static f02 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new f02((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            enumMap.put(zzjkVar, zzjl.d(bundle.getString(zzjkVar.zze)));
        }
        return new f02(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean d(Bundle bundle) {
        zzji zzjiVarD;
        if (bundle == null || (zzjiVarD = zzjl.d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjiVarD.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final zzji a() {
        zzji zzjiVar = (zzji) this.e.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb.append(":");
            sb.append(zzjl.h((zzji) this.e.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f02)) {
            return false;
        }
        f02 f02Var = (f02) obj;
        if (this.b.equalsIgnoreCase(f02Var.b) && Objects.equals(this.c, f02Var.c)) {
            return Objects.equals(this.d, f02Var.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjl.a(this.a));
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append("=");
            zzji zzjiVar = (zzji) this.e.get(zzjkVar);
            if (zzjiVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzjiVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public f02(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = e();
        this.c = bool;
        this.d = str;
    }
}
