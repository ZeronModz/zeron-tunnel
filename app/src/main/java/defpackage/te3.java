package defpackage;

import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class te3 implements zzikg, zzika {
    public static final te3 b = new te3(null);
    public final Object a;

    public te3(Object obj) {
        this.a = obj;
    }

    public static te3 a(Object obj) {
        k02.E(obj, "instance cannot be null");
        return new te3(obj);
    }

    public static te3 b(Object obj) {
        return obj == null ? b : new te3(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        return this.a;
    }
}
