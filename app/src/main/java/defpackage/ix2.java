package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.b;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ix2 implements AppUpdateManager {
    public final xj3 a;
    public final zzc b;
    public final Context c;
    public final Handler d = new Handler(Looper.getMainLooper());

    public ix2(xj3 xj3Var, zzc zzcVar, Context context) {
        this.a = xj3Var;
        this.b = zzcVar;
        this.c = context;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task completeUpdate() {
        String packageName = this.c.getPackageName();
        xj3 xj3Var = this.a;
        zzx zzxVar = xj3Var.a;
        if (zzxVar != null) {
            xj3.e.c("completeUpdate(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            bh3 bh3Var = new bh3(xj3Var, taskCompletionSource, taskCompletionSource, packageName, 1);
            zzxVar.a().post(new bh3(zzxVar, bh3Var.a, taskCompletionSource, bh3Var, 2));
            return taskCompletionSource.a;
        }
        zzm zzmVar = xj3.e;
        Object[] objArr = {-9};
        zzmVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            zzm.d(zzmVar.a, "onError(%d)", objArr);
        }
        return b.d(new InstallException(-9));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task getAppUpdateInfo() {
        String packageName = this.c.getPackageName();
        xj3 xj3Var = this.a;
        zzx zzxVar = xj3Var.a;
        if (zzxVar != null) {
            xj3.e.c("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            bh3 bh3Var = new bh3(xj3Var, taskCompletionSource, packageName, taskCompletionSource);
            zzxVar.a().post(new bh3(zzxVar, bh3Var.a, taskCompletionSource, bh3Var, 2));
            return taskCompletionSource.a;
        }
        zzm zzmVar = xj3.e;
        Object[] objArr = {-9};
        zzmVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            zzm.d(zzmVar.a, "onError(%d)", objArr);
        }
        return b.d(new InstallException(-9));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.b.a(installStateUpdatedListener);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task startUpdateFlow(v7 v7Var, Activity activity, AppUpdateOptions appUpdateOptions) {
        if (v7Var == null || activity == null || appUpdateOptions == null || v7Var.h) {
            return b.d(new InstallException(-4));
        }
        if (v7Var.a(appUpdateOptions) == null) {
            return b.d(new InstallException(-6));
        }
        v7Var.h = true;
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", v7Var.a(appUpdateOptions));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new qm2(this.d, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.a;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(v7 v7Var, ActivityResultLauncher activityResultLauncher, AppUpdateOptions appUpdateOptions) {
        if (v7Var == null || activityResultLauncher == null || appUpdateOptions == null || v7Var.a(appUpdateOptions) == null || v7Var.h) {
            return false;
        }
        v7Var.h = true;
        IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(v7Var.a(appUpdateOptions).getIntentSender());
        activityResultLauncher.a(new IntentSenderRequest(builder.a, builder.b, builder.c, builder.d));
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.b.b(installStateUpdatedListener);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(v7 v7Var, int i, IntentSenderForResultStarter intentSenderForResultStarter, int i2) {
        return startUpdateFlowForResult(v7Var, intentSenderForResultStarter, AppUpdateOptions.c(i).a(), i2);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(v7 v7Var, Activity activity, AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException {
        if (activity == null || v7Var == null || appUpdateOptions == null || v7Var.a(appUpdateOptions) == null || v7Var.h) {
            return false;
        }
        v7Var.h = true;
        activity.startIntentSenderForResult(v7Var.a(appUpdateOptions).getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(v7 v7Var, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        hl3 hl3VarA = AppUpdateOptions.c(i).a();
        if (activity == null || v7Var == null || v7Var.a(hl3VarA) == null || v7Var.h) {
            return false;
        }
        v7Var.h = true;
        activity.startIntentSenderForResult(v7Var.a(hl3VarA).getIntentSender(), i2, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(v7 v7Var, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException {
        if (v7Var == null || intentSenderForResultStarter == null || appUpdateOptions == null || v7Var.a(appUpdateOptions) == null || v7Var.h) {
            return false;
        }
        v7Var.h = true;
        intentSenderForResultStarter.startIntentSenderForResult(v7Var.a(appUpdateOptions).getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }
}
