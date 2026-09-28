package defpackage;

import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import com.google.android.gms.internal.measurement.zzae;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zg implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public Iterable c;

    public zg(zzae zzaeVar) {
        this.a = 1;
        this.c = zzaeVar;
        this.b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((CLObject) this.c).c.size()) {
                }
                break;
            default:
                if (this.b < ((zzae) this.c).c()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                CLKey cLKey = (CLKey) ((CLObject) this.c).c.get(this.b);
                this.b++;
                return cLKey;
            default:
                zzae zzaeVar = (zzae) this.c;
                int i = this.b;
                int iC = zzaeVar.c();
                int i2 = this.b;
                if (i < iC) {
                    this.b = i2 + 1;
                    return zzaeVar.d(i2);
                }
                s31.k(vh.i(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                return null;
        }
    }
}
