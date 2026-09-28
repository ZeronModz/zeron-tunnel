package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.k;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o6 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, k kVar) {
        Objects.requireNonNull(kVar);
        n6 n6Var = new n6(kVar, 0);
        t1.g(obj).registerOnBackInvokedCallback(1000000, n6Var);
        return n6Var;
    }

    public static void c(Object obj, Object obj2) {
        t1.g(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
