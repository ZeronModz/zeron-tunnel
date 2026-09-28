package defpackage;

import kotlinx.coroutines.Delay;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import kotlinx.coroutines.internal.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ev {
    public static final Delay a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        Delay delay;
        int i = md1.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            lv lvVar = oy.a;
            MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
            delay = (a.a(mainCoroutineDispatcher) || !(mainCoroutineDispatcher instanceof Delay)) ? e.k : (Delay) mainCoroutineDispatcher;
        } else {
            delay = e.k;
        }
        a = delay;
    }
}
