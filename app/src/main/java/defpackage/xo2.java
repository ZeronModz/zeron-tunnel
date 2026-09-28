package defpackage;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzejg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xo2 extends zzejg {
    public Activity a;
    public zzm b;
    public String c;
    public String d;

    public final yo2 a() {
        Activity activity = this.a;
        if (activity != null) {
            return new yo2(activity, this.b, this.c, this.d);
        }
        u7.p("Missing required properties: activity");
        return null;
    }
}
