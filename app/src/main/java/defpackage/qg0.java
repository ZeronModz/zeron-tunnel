package defpackage;

import kotlin.time.Clock;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qg0 {
    public static final Clock a;

    static {
        yw0.a.getClass();
        Integer num = sh0.a;
        a = (num == null || num.intValue() >= 26) ? new ww(16) : new th0();
    }
}
