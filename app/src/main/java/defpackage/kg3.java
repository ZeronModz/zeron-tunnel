package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kg3 {
    public final zzm a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d = new HashSet();
    public r6 e = null;

    public kg3(zzm zzmVar, IntentFilter intentFilter, Context context) {
        this.a = zzmVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(InstallStateUpdatedListener installStateUpdatedListener) {
        this.a.c("registerListener", new Object[0]);
        if (installStateUpdatedListener == null) {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
        this.d.add(installStateUpdatedListener);
        d();
    }

    public final synchronized void b(InstallStateUpdatedListener installStateUpdatedListener) {
        this.a.c("unregisterListener", new Object[0]);
        if (installStateUpdatedListener == null) {
            throw new NullPointerException("Unregistered Play Core listener should not be null.");
        }
        this.d.remove(installStateUpdatedListener);
        d();
    }

    public final synchronized void c(su1 su1Var) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(su1Var);
        }
    }

    public final void d() {
        r6 r6Var;
        HashSet hashSet = this.d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!zIsEmpty && this.e == null) {
            r6 r6Var2 = new r6(this, 10);
            this.e = r6Var2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(r6Var2, intentFilter, 2);
            } else {
                context.registerReceiver(r6Var2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (r6Var = this.e) == null) {
            return;
        }
        context.unregisterReceiver(r6Var);
        this.e = null;
    }
}
