package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 {
    public final ComponentName a;
    public final Clock b;
    public final boolean c;

    static {
        Logger.b("SystemJobInfoConverter");
    }

    public ld1(Context context, Clock clock, boolean z) {
        this.b = clock;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r3 < 26) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.job.JobInfo a(androidx.work.impl.model.WorkSpec r13, int r14) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld1.a(androidx.work.impl.model.WorkSpec, int):android.app.job.JobInfo");
    }
}
