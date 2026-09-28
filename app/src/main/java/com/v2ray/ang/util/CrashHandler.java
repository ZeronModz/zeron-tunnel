package com.v2ray.ang.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.v2ray.ang.ui.CrashActivity;
import defpackage.r4;
import java.lang.Thread;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/util/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    public final Context a;

    public CrashHandler(Context context) {
        context.getClass();
        this.a = context;
        Thread.getDefaultUncaughtExceptionHandler();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        thread.getClass();
        th.getClass();
        try {
            try {
                String strB = kotlin.b.b(th);
                Context applicationContext = this.a.getApplicationContext();
                Intent intent = new Intent(applicationContext, (Class<?>) CrashActivity.class);
                intent.putExtra("error", strB);
                intent.addFlags(268468224);
                applicationContext.startActivity(intent);
                new Handler(Looper.getMainLooper()).post(new r4(19, this, strB));
                Thread.sleep(2000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
