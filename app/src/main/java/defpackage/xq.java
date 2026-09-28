package defpackage;

import android.content.Context;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.LinkedHashSet;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xq {
    public final TaskExecutor a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public xq(Context context, TaskExecutor taskExecutor) {
        this.a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.getMainThreadExecutor().execute(new r4(18, c.R(this.d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
