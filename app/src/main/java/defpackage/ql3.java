package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import com.google.android.gms.internal.ads.zzyn;
import com.google.android.gms.internal.ads.zzzk;
import java.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ql3 extends g52 {
    public static final ql3 F = new ql3(new zzzk());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        String str = wt2.a;
        Integer.toString(1000, 36);
        Integer.toString(DescriptorProtos$Edition.EDITION_2024_VALUE, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public ql3(zzzk zzzkVar) {
        super(zzzkVar);
        this.w = zzzkVar.w;
        this.x = zzzkVar.x;
        this.y = zzzkVar.y;
        this.z = zzzkVar.z;
        this.A = zzzkVar.A;
        this.B = zzzkVar.B;
        this.C = zzzkVar.C;
        this.D = zzzkVar.D;
        this.E = zzzkVar.E;
    }

    @Override // defpackage.g52
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ql3.class == obj.getClass()) {
            ql3 ql3Var = (ql3) obj;
            if (super.equals(ql3Var) && this.w == ql3Var.w && this.x == ql3Var.x && this.y == ql3Var.y && this.z == ql3Var.z && this.A == ql3Var.A && this.B == ql3Var.B && this.C == ql3Var.C) {
                SparseBooleanArray sparseBooleanArray = ql3Var.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = ql3Var.D;
                            SparseArray sparseArray2 = this.D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzyn zzynVar = (zzyn) entry.getKey();
                                                if (!map2.containsKey(zzynVar) || !Objects.equals(entry.getValue(), map2.get(zzynVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.g52
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 28629151) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}
