package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v02 {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a;
    public long b;
    public long c;
    public boolean d;

    public static v02 a(Context context, Executor executor) {
        String[] strArr = e;
        v02 v02Var = new v02();
        v02Var.a = 0L;
        v02Var.b = 0L;
        v02Var.c = -1L;
        v02Var.d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new u02(v02Var, 0));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return v02Var;
    }
}
