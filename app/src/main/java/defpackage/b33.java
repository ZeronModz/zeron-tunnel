package defpackage;

import com.google.android.gms.internal.ads.g7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b33 {
    public static final b33 c;
    public static final b33 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (g7.f) {
            d = null;
            c = null;
        } else {
            d = new b33(null, false);
            c = new b33(null, true);
        }
    }

    public b33(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
