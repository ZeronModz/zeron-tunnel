package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bh1 {
    public static void a(String str, Bundle bundle) {
        if (bundle.containsKey(str)) {
            return;
        }
        u7.r("Bundle must contain ".concat(str));
    }
}
