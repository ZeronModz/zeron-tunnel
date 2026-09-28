package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uf1 {
    public static WeakReference d;
    public final SharedPreferences a;
    public tj1 b;
    public final ScheduledThreadPoolExecutor c;

    public uf1(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized tf1 a() {
        tf1 tf1Var;
        String strJ = this.b.j();
        Pattern pattern = tf1.d;
        tf1Var = null;
        if (!TextUtils.isEmpty(strJ)) {
            String[] strArrSplit = strJ.split("!", -1);
            if (strArrSplit.length == 2) {
                tf1Var = new tf1(strArrSplit[0], strArrSplit[1]);
            }
        }
        return tf1Var;
    }

    public final synchronized void b() {
        this.b = tj1.e(this.a, this.c);
    }

    public final synchronized void c(tf1 tf1Var) {
        this.b.n(tf1Var.c);
    }
}
