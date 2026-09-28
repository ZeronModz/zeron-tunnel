package defpackage;

import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.zzhzc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lc3 extends ka {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc3(zzhzc zzhzcVar, int i) {
        super(zzhzcVar);
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.ka, java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return next().f;
            default:
                return super.next();
        }
    }
}
