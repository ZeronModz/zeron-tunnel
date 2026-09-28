package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a41 {
    public static a41 b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    public static synchronized a41 a() {
        a41 a41Var;
        a41Var = b;
        if (a41Var == null) {
            a41Var = new a41();
            b = a41Var;
        }
        return a41Var;
    }
}
