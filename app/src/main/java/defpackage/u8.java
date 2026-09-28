package defpackage;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u8 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ u8(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int iAbs = Math.abs(((Integer) obj).intValue() - i2) - Math.abs(((Integer) obj2).intValue() - i2);
                return (int) (iAbs == 0 ? Math.signum(r3.intValue() - r4.intValue()) : Math.signum(iAbs));
            default:
                return Math.abs(p81.a((Size) obj) - i2) - Math.abs(p81.a((Size) obj2) - i2);
        }
    }
}
