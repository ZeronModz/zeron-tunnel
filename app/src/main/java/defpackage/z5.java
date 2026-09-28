package defpackage;

import java.util.HashSet;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z5 implements IntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
            case 1:
                return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
            case 2:
                return i != 0 ? i != 1 ? String.valueOf(i) : "vertical" : "horizontal";
            default:
                HashSet hashSet = new HashSet();
                if (i == 0) {
                    hashSet.add("none");
                }
                if (i == 1) {
                    hashSet.add("beginning");
                }
                if (i == 2) {
                    hashSet.add("middle");
                }
                if (i == 4) {
                    hashSet.add("end");
                }
                return hashSet;
        }
    }
}
