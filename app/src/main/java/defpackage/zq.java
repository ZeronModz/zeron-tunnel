package defpackage;

import android.content.Context;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zq {
    public static final /* synthetic */ int d = 0;
    public final Clock a;
    public final int b;
    public final WorkConstraintsTracker c;

    static {
        Logger.b("ConstraintsCmdHandler");
    }

    public zq(Context context, Clock clock, int i, hd1 hd1Var) {
        this.a = clock;
        this.b = i;
        this.c = new WorkConstraintsTracker(hd1Var.e.l);
    }
}
