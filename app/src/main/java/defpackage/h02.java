package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h02 {
    public NetworkCapabilities a;

    public static h02 a(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        h02 h02Var = new h02();
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new jt0(h02Var, 1));
                return h02Var;
            } catch (RuntimeException unused) {
                synchronized (h02.class) {
                    h02Var.a = null;
                }
            }
        }
        return h02Var;
    }
}
