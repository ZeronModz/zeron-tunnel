package defpackage;

import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.service.notification.StatusBarNotification;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.browser.trusted.TrustedWebActivityService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends ITrustedWebActivityService.Stub {
    public final /* synthetic */ TrustedWebActivityService a;

    public ah1(TrustedWebActivityService trustedWebActivityService) {
        this.a = trustedWebActivityService;
    }

    public final void a() {
        TrustedWebActivityService trustedWebActivityService = this.a;
        if (trustedWebActivityService.b == -1) {
            trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            trustedWebActivityService.b().load();
            trustedWebActivityService.getPackageManager();
        }
        if (trustedWebActivityService.b != Binder.getCallingUid()) {
            throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
        }
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle areNotificationsEnabled(Bundle bundle) {
        a();
        bh1.a("android.support.customtabs.trusted.CHANNEL_NAME", bundle);
        String string = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
        TrustedWebActivityService trustedWebActivityService = this.a;
        if (trustedWebActivityService.a == null) {
            u7.p("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            return null;
        }
        boolean zB = !new bu0(trustedWebActivityService).a() ? false : Build.VERSION.SDK_INT < 26 ? true : vt0.b(trustedWebActivityService.a, TrustedWebActivityService.a(string));
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", zB);
        return bundle2;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final void cancelNotification(Bundle bundle) {
        a();
        bh1.a("android.support.customtabs.trusted.PLATFORM_TAG", bundle);
        bh1.a("android.support.customtabs.trusted.PLATFORM_ID", bundle);
        String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
        int i = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
        NotificationManager notificationManager = this.a.a;
        if (notificationManager != null) {
            notificationManager.cancel(string, i);
        } else {
            u7.p("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface;
        a();
        if (iBinder == null || (iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.DESCRIPTOR)) == null || !(iInterfaceQueryLocalInterface instanceof ITrustedWebActivityCallback)) {
            return null;
        }
        return null;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle getActiveNotifications() {
        a();
        NotificationManager notificationManager = this.a.a;
        if (notificationManager == null) {
            u7.p("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            return null;
        }
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
        return bundle;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final Bundle getSmallIconBitmap() {
        a();
        TrustedWebActivityService trustedWebActivityService = this.a;
        int iC = trustedWebActivityService.c();
        Bundle bundle = new Bundle();
        if (iC == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService.getResources(), iC));
        return bundle;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    public final int getSmallIconId() {
        a();
        return this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[PHI: r2
      0x0055: PHI (r2v3 android.app.Notification) = (r2v2 android.app.Notification), (r2v4 android.app.Notification) binds: [B:8:0x0040, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.support.customtabs.trusted.ITrustedWebActivityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle notifyNotificationWithChannel(android.os.Bundle r7) {
        /*
            r6 = this;
            r6.a()
            java.lang.String r0 = "android.support.customtabs.trusted.PLATFORM_TAG"
            defpackage.bh1.a(r0, r7)
            java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_ID"
            defpackage.bh1.a(r1, r7)
            java.lang.String r2 = "android.support.customtabs.trusted.NOTIFICATION"
            defpackage.bh1.a(r2, r7)
            java.lang.String r3 = "android.support.customtabs.trusted.CHANNEL_NAME"
            defpackage.bh1.a(r3, r7)
            java.lang.String r0 = r7.getString(r0)
            int r1 = r7.getInt(r1)
            android.os.Parcelable r2 = r7.getParcelable(r2)
            android.app.Notification r2 = (android.app.Notification) r2
            java.lang.String r7 = r7.getString(r3)
            androidx.browser.trusted.TrustedWebActivityService r6 = r6.a
            android.app.NotificationManager r3 = r6.a
            if (r3 == 0) goto L66
            bu0 r3 = new bu0
            r3.<init>(r6)
            boolean r3 = r3.a()
            r4 = 0
            if (r3 != 0) goto L3c
            goto L5b
        L3c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r3 < r5) goto L55
            java.lang.String r3 = androidx.browser.trusted.TrustedWebActivityService.a(r7)
            android.app.NotificationManager r5 = r6.a
            android.app.Notification r2 = defpackage.vt0.a(r6, r5, r2, r3, r7)
            android.app.NotificationManager r7 = r6.a
            boolean r7 = defpackage.vt0.b(r7, r3)
            if (r7 != 0) goto L55
            goto L5b
        L55:
            android.app.NotificationManager r6 = r6.a
            r6.notify(r0, r1, r2)
            r4 = 1
        L5b:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS"
            r6.putBoolean(r7, r4)
            return r6
        L66:
            java.lang.String r6 = "TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah1.notifyNotificationWithChannel(android.os.Bundle):android.os.Bundle");
    }
}
