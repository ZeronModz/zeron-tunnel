package defpackage;

import android.app.PendingIntent;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v7 {
    public final int a;
    public final long b;
    public final long c;
    public final PendingIntent d;
    public final PendingIntent e;
    public final PendingIntent f;
    public final PendingIntent g;
    public boolean h = false;

    public v7(int i, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap map) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = pendingIntent;
        this.e = pendingIntent2;
        this.f = pendingIntent3;
        this.g = pendingIntent4;
    }

    public final PendingIntent a(AppUpdateOptions appUpdateOptions) {
        int iB = appUpdateOptions.b();
        long j = this.c;
        long j2 = this.b;
        if (iB == 0) {
            PendingIntent pendingIntent = this.e;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!appUpdateOptions.a() || j2 > j) {
                return null;
            }
            return this.g;
        }
        if (appUpdateOptions.b() == 1) {
            PendingIntent pendingIntent2 = this.d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (appUpdateOptions.a() && j2 <= j) {
                return this.f;
            }
        }
        return null;
    }
}
