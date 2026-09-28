package defpackage;

import com.google.android.gms.internal.ads.zza;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n92 {
    public static final n92 b = new n92(new zza[0]);
    public static final zza c;
    public final zza[] a;

    static {
        zza zzaVar = new zza(0L);
        int[] iArr = zzaVar.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = zzaVar.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        lx1[] lx1VarArr = (lx1[]) Arrays.copyOf(zzaVar.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(zzaVar.f, 0);
        m02[] m02VarArr = zzaVar.g;
        c = new zza(0, iArrCopyOf, lx1VarArr, jArrCopyOf, strArr, (m02[]) Arrays.copyOf(m02VarArr, Math.max(0, m02VarArr.length)));
        String str = wt2.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public n92(zza[] zzaVarArr) {
        this.a = zzaVarArr;
    }

    public final zza a(int i) {
        return i < 0 ? c : this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n92.class == obj.getClass() && Arrays.equals(this.a, ((n92) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 961;
    }

    public final String toString() {
        return vh.l("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
