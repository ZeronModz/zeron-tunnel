package defpackage;

import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qy1 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ zzas c;

    public /* synthetic */ qy1(zzas zzasVar, int i) {
        this.a = i;
        this.c = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        zzas zzasVar = this.c;
        switch (i) {
            case 0:
                if (this.b < zzasVar.a.length()) {
                }
                break;
            default:
                if (this.b < zzasVar.a.length()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.a;
        zzas zzasVar = this.c;
        switch (i) {
            case 0:
                String str = zzasVar.a;
                int i2 = this.b;
                if (i2 >= str.length()) {
                    p60.m();
                } else {
                    this.b = i2 + 1;
                }
                break;
            default:
                String str2 = zzasVar.a;
                int i3 = this.b;
                if (i3 >= str2.length()) {
                    p60.m();
                } else {
                    this.b = i3 + 1;
                }
                break;
        }
        return null;
    }
}
