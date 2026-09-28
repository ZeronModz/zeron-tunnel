package defpackage;

import com.google.android.gms.internal.ads.zzgrd;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b23 extends i23 {
    public Object a;
    public int b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b23(f23 f23Var, Set set, Set set2) {
        this();
        this.c = 1;
        this.e = set2;
        this.d = set.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        n8.A0(this.b != 4);
        int i = this.b;
        int i2 = i - 1;
        Object obj = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = 4;
            int i3 = this.c;
            Object obj2 = this.e;
            Iterator it = this.d;
            switch (i3) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((zzgrd) obj2).zza(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((Set) obj2).contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = 3;
                    break;
            }
            this.a = obj;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            p60.m();
            return null;
        }
        this.b = 2;
        Object obj = this.a;
        this.a = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b23(Iterator it, zzgrd zzgrdVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = zzgrdVar;
    }

    public b23() {
        this.b = 2;
    }
}
