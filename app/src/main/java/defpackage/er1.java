package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.g;
import java.util.Objects;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class er1 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public cr1 e;
    public boolean f;

    public er1(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.d.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                cr1 cr1Var = this.e;
                if (cr1Var == null || !cr1Var.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.f) {
                        this.f = true;
                        if (!nq.b().a(this.a, this.b, this, 65)) {
                            this.f = false;
                            ArrayDeque arrayDeque = this.d;
                            while (!arrayDeque.isEmpty()) {
                                ((dr1) arrayDeque.poll()).b.d(null);
                            }
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.e.a((dr1) this.d.poll());
            }
        } finally {
        }
    }

    public final synchronized g b(Intent intent) {
        dr1 dr1Var;
        Log.isLoggable("FirebaseMessaging", 3);
        dr1Var = new dr1(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        dr1Var.b.a.b(scheduledThreadPoolExecutor, new q21(scheduledThreadPoolExecutor.schedule(new he1(dr1Var, 5), 20L, TimeUnit.SECONDS), 10));
        this.d.add(dr1Var);
        a();
        return dr1Var.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof cr1) {
                this.e = (cr1) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.d;
                while (!arrayDeque.isEmpty()) {
                    ((dr1) arrayDeque.poll()).b.d(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
