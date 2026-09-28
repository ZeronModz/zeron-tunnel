package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.b;
import com.google.firebase.a;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import defpackage.fy;
import defpackage.i60;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vb0 {
    public final a a;
    public final uq b;
    public final Rpc c;
    public final Provider d;
    public final Provider e;
    public final FirebaseInstallationsApi f;

    public vb0(a aVar, uq uqVar, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        aVar.a();
        Rpc rpc = new Rpc(aVar.a);
        this.a = aVar;
        this.b = uqVar;
        this.c = rpc;
        this.d = provider;
        this.e = provider2;
        this.f = firebaseInstallationsApi;
    }

    public final Task a(Task task) {
        return task.f(new s3(0), new p60(this));
    }

    public final void b(String str, Bundle bundle, String str2) {
        int i;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatCode;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        a aVar = this.a;
        aVar.a();
        bundle.putString("gmp_app_id", aVar.c.b);
        uq uqVar = this.b;
        synchronized (uqVar) {
            try {
                if (uqVar.a == 0) {
                    try {
                        packageInfo = ((Context) uqVar.c).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        uqVar.a = packageInfo.versionCode;
                    }
                }
                i = uqVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        a aVar2 = this.a;
        aVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(aVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((InstallationTokenResult) b.a(this.f.getToken(false))).a();
            if (!TextUtils.isEmpty(strA)) {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) b.a(this.f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.e.get();
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) this.d.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
        bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
    }

    public final Task c(String str, final Bundle bundle, String str2) {
        int i;
        try {
            b(str, bundle, str2);
            final Rpc rpc = this.c;
            fy fyVar = fy.e;
            zzw zzwVar = rpc.c;
            if (zzwVar.a() < 12000000) {
                return zzwVar.b() != 0 ? rpc.a(bundle).g(fyVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Bundle bundle2;
                        Rpc rpc2 = rpc;
                        rpc2.getClass();
                        return (task.m() && (bundle2 = (Bundle) task.i()) != null && bundle2.containsKey("google.messenger")) ? rpc2.a(bundle).n(fy.e, i60.o) : task;
                    }
                }) : b.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            zk3 zk3VarE = zk3.e(rpc.b);
            synchronized (zk3VarE) {
                i = zk3VarE.b;
                zk3VarE.b = i + 1;
            }
            return zk3VarE.f(new uj3(i, 1, bundle, 1)).f(fyVar, i60.j);
        } catch (InterruptedException | ExecutionException e) {
            return b.d(e);
        }
    }
}
