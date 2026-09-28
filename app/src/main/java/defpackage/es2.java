package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzfax;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class es2 implements zzfax {
    public final ApplicationInfo a;
    public final PackageInfo b;
    public final Context c;

    public es2(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.a = applicationInfo;
        this.b = packageInfo;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzfax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            r9 = this;
            android.content.Context r0 = r9.c
            android.content.pm.ApplicationInfo r1 = r9.a
            java.lang.String r3 = r1.packageName
            r1 = 0
            android.content.pm.PackageInfo r9 = r9.b
            if (r9 != 0) goto Ld
            r4 = r1
            goto L14
        Ld:
            int r2 = r9.versionCode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = r2
        L14:
            if (r9 != 0) goto L18
            r5 = r1
            goto L1b
        L18:
            java.lang.String r9 = r9.versionName
            r5 = r9
        L1b:
            com.google.android.gms.internal.ads.zzfyn r9 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r9 = com.google.android.gms.common.wrappers.Wrappers.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            android.content.Context r9 = r9.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            r6 = 0
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.CharSequence r9 = r2.getApplicationLabel(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3a
            r6 = r9
            goto L3b
        L3a:
            r6 = r1
        L3b:
            int r9 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r9 < r2) goto L90
            l32 r9 = defpackage.p32.ke
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r2.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L90
            android.content.pm.PackageManager r9 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8d
            android.content.pm.InstallSourceInfo r9 = r9.getInstallSourceInfo(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8d
            if (r9 == 0) goto L90
            java.lang.String r2 = r9.getInstallingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8d
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6e
            if (r0 == 0) goto L71
            java.lang.String r0 = "No installing package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6e
            r2 = r1
            goto L71
        L6e:
            r0 = move-exception
            r9 = r0
            goto L8b
        L71:
            java.lang.String r9 = r9.getInitiatingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            if (r0 == 0) goto L85
            java.lang.String r0 = "No initiating package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
        L80:
            r8 = r1
        L81:
            r7 = r2
            goto L9e
        L83:
            r0 = move-exception
            goto L87
        L85:
            r8 = r9
            goto L81
        L87:
            r1 = r9
            goto L94
        L89:
            r0 = move-exception
            goto L94
        L8b:
            r0 = r9
            goto L94
        L8d:
            r0 = move-exception
            r9 = r0
            goto L93
        L90:
            r7 = r1
            r8 = r7
            goto L9e
        L93:
            r2 = r1
        L94:
            java.lang.String r9 = "PackageInfoSignalSource.getInstallSourceInfo"
            com.google.android.gms.internal.ads.zzcdu r7 = com.google.android.gms.ads.internal.zzt.zzh()
            r7.f(r9, r0)
            goto L80
        L9e:
            com.google.android.gms.internal.ads.zzezl r2 = new com.google.android.gms.internal.ads.zzezl
            r2.<init>(r3, r4, r5, r6, r7, r8)
            u33 r9 = com.google.android.gms.internal.ads.z.j(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es2.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 29;
    }
}
