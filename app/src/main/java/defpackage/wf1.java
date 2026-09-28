package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.b;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wf1 {
    public final Context a;
    public final uq b;
    public final vb0 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final uf1 h;
    public final ArrayMap e = new ArrayMap();
    public boolean g = false;

    public wf1(FirebaseMessaging firebaseMessaging, uq uqVar, uf1 uf1Var, vb0 vb0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = uqVar;
        this.h = uf1Var;
        this.c = vb0Var;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void b(Task task) throws IOException {
        try {
            b.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void d() {
        if (Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT != 23) {
            return;
        }
        Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void a(tf1 tf1Var, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.e) {
            try {
                String str = tf1Var.c;
                if (this.e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.e.get(str);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(str));
        bundle.putString("delete", "1");
        String strConcat = "/topics/".concat(str);
        vb0 vb0Var = this.c;
        b(vb0Var.a(vb0Var.c(strA, bundle, strConcat)));
    }

    public final void e(tf1 tf1Var) {
        synchronized (this.e) {
            try {
                String str = tf1Var.c;
                if (this.e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f(boolean z) {
        this.g = z;
    }

    public final void g() {
        boolean z;
        if (this.h.a() != null) {
            synchronized (this) {
                z = this.g;
            }
            if (z) {
                return;
            }
            i(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: IOException -> 0x0072, TRY_LEAVE, TryCatch #0 {IOException -> 0x0072, blocks: (B:11:0x0013, B:22:0x0066, B:16:0x0024, B:18:0x002c, B:19:0x0033, B:21:0x003b), top: B:41:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws java.io.IOException {
        /*
            r8 = this;
        L0:
            monitor-enter(r8)
            uf1 r0 = r8.h     // Catch: java.lang.Throwable -> Lf
            tf1 r0 = r0.a()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L12
            d()     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            goto La5
        L12:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r0.b     // Catch: java.io.IOException -> L72
            java.lang.String r2 = r0.a     // Catch: java.io.IOException -> L72
            int r3 = r1.hashCode()     // Catch: java.io.IOException -> L72
            r4 = 83
            if (r3 == r4) goto L33
            r4 = 85
            if (r3 == r4) goto L24
            goto L66
        L24:
            java.lang.String r3 = "U"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> L72
            if (r1 == 0) goto L66
            r8.c(r2)     // Catch: java.io.IOException -> L72
            d()     // Catch: java.io.IOException -> L72
            goto L69
        L33:
            java.lang.String r3 = "S"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> L72
            if (r1 == 0) goto L66
            vb0 r1 = r8.c     // Catch: java.io.IOException -> L72
            com.google.firebase.messaging.FirebaseMessaging r3 = r8.d     // Catch: java.io.IOException -> L72
            java.lang.String r3 = r3.a()     // Catch: java.io.IOException -> L72
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.io.IOException -> L72
            r4.<init>()     // Catch: java.io.IOException -> L72
            java.lang.String r5 = "gcm.topic"
            java.lang.String r6 = "/topics/"
            java.lang.String r7 = r6.concat(r2)     // Catch: java.io.IOException -> L72
            r4.putString(r5, r7)     // Catch: java.io.IOException -> L72
            java.lang.String r2 = r6.concat(r2)     // Catch: java.io.IOException -> L72
            com.google.android.gms.tasks.Task r2 = r1.c(r3, r4, r2)     // Catch: java.io.IOException -> L72
            com.google.android.gms.tasks.Task r1 = r1.a(r2)     // Catch: java.io.IOException -> L72
            b(r1)     // Catch: java.io.IOException -> L72
            d()     // Catch: java.io.IOException -> L72
            goto L69
        L66:
            d()     // Catch: java.io.IOException -> L72
        L69:
            uf1 r1 = r8.h
            r1.c(r0)
            r8.e(r0)
            goto L0
        L72:
            r8 = move-exception
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r1 = r8.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La0
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            java.lang.String r1 = r8.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La0
            java.lang.String r0 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r1 = r8.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L98
            goto La0
        L98:
            java.lang.String r0 = r8.getMessage()
            if (r0 != 0) goto L9f
            goto La3
        L9f:
            throw r8
        La0:
            r8.getMessage()
        La3:
            r8 = 0
            return r8
        La5:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf1.h():boolean");
    }

    public final void i(long j) {
        this.f.schedule(new c(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        f(true);
    }
}
