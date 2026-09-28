package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzj;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.internal.cloudmessaging.zzf;
import defpackage.ek3;
import defpackage.jj3;
import defpackage.ui3;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ui3 implements ServiceConnection {
    public jj3 c;
    public final /* synthetic */ zk3 f;
    public int a = 0;
    public final Messenger b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            ui3 ui3Var = this.a;
            synchronized (ui3Var) {
                try {
                    ek3 ek3Var = (ek3) ui3Var.e.get(i);
                    if (ek3Var == null) {
                        return true;
                    }
                    ui3Var.e.remove(i);
                    ui3Var.c();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        ek3Var.c(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    ek3Var.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    public final ArrayDeque d = new ArrayDeque();
    public final SparseArray e = new SparseArray();

    public /* synthetic */ ui3(zk3 zk3Var) {
        this.f = zk3Var;
    }

    public final synchronized void a(int i, String str) {
        b(i, str, null);
    }

    public final synchronized void b(int i, String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i2 = this.a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 4;
            nq.b().c((Context) this.f.c, this);
            zzt zztVar = new zzt(i, str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ek3) it.next()).c(zztVar);
            }
            this.d.clear();
            int i3 = 0;
            while (true) {
                int size = this.e.size();
                SparseArray sparseArray = this.e;
                if (i3 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((ek3) sparseArray.valueAt(i3)).c(zztVar);
                    i3++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 3;
            nq.b().c((Context) this.f.c, this);
        }
    }

    public final synchronized boolean d(ek3 ek3Var) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(ek3Var);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(ek3Var);
            ((ScheduledExecutorService) this.f.d).execute(new zzj(this));
            return true;
        }
        this.d.add(ek3Var);
        yg0.p(this.a == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (nq.b().a((Context) this.f.c, intent, this, 1)) {
                ((ScheduledExecutorService) this.f.d).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ui3 ui3Var = this.a;
                        synchronized (ui3Var) {
                            if (ui3Var.a == 1) {
                                ui3Var.a(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.f.d).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                ui3 ui3Var = this.a;
                IBinder iBinder2 = iBinder;
                synchronized (ui3Var) {
                    if (iBinder2 == null) {
                        ui3Var.a(0, "Null service connection");
                        return;
                    }
                    try {
                        ui3Var.c = new jj3(iBinder2);
                        ui3Var.a = 2;
                        ((ScheduledExecutorService) ui3Var.f.d).execute(new zzj(ui3Var));
                    } catch (RemoteException e) {
                        ui3Var.a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.f.d).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(2, "Service disconnected");
            }
        });
    }
}
