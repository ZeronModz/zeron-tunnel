package defpackage;

import com.google.android.gms.internal.ads.zzaut;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jz1 implements Supplier {
    public final /* synthetic */ int a;
    public static final /* synthetic */ jz1 c = new jz1(1);
    public static final /* synthetic */ jz1 b = new jz1(0);

    public /* synthetic */ jz1(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.a != 0 ? mz1.a(null) : new zzaut();
    }
}
