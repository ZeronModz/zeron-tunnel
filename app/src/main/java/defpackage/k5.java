package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.widget.TextView;
import androidx.core.graphics.BlendModeCompat;
import androidx.lifecycle.p;
import androidx.vectordrawable.graphics.drawable.f;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundService;
import com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText;
import com.google.android.gms.internal.ads.zd;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzuw;
import com.google.android.gms.internal.ads.zzuy;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.b;
import com.sandok.tunnel.core.VpnProfile;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k5 {
    public static void A(AudioRecord audioRecord, Executor executor, AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioManager$AudioRecordingCallback);
    }

    public static void B(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            u7.r("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return;
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i & 2;
        if (i3 == 0 && (i & 4) == 0) {
            u7.r("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return;
        }
        if (i3 != 0 && (i & 4) != 0) {
            u7.r("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            i5.o(context, broadcastReceiver, intentFilter, i);
            return;
        }
        if (i4 >= 26) {
            i5.n(context, broadcastReceiver, intentFilter, i);
        } else if ((i & 4) != 0) {
            context.registerReceiver(broadcastReceiver, intentFilter, u(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    public static void C(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void D(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void E(Notification.Action.Builder builder, boolean z) {
        builder.setContextual(z);
    }

    public static final void F(SyntaxHighlightEditText syntaxHighlightEditText, int i) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i, i});
            gradientDrawable.setSize((int) TypedValue.applyDimension(2, 2.0f, syntaxHighlightEditText.getResources().getDisplayMetrics()), (int) syntaxHighlightEditText.getTextSize());
            syntaxHighlightEditText.setTextCursorDrawable(gradientDrawable);
            return;
        }
        try {
            Field fieldE = e(TextView.class, "mEditor");
            Object obj = fieldE != null ? fieldE.get(syntaxHighlightEditText) : null;
            if (obj == null) {
                obj = syntaxHighlightEditText;
            }
            Class cls = fieldE != null ? obj.getClass() : TextView.class;
            Field fieldE2 = e(TextView.class, "mCursorDrawableRes");
            Object obj2 = fieldE2 != null ? fieldE2.get(syntaxHighlightEditText) : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (num == null || (drawable = syntaxHighlightEditText.getContext().getDrawable(num.intValue())) == null) {
                return;
            }
            if (drawable instanceof f) {
                ((f) drawable).setTintList(ColorStateList.valueOf(i));
            } else if (drawable instanceof VectorDrawable) {
                ((VectorDrawable) drawable).setTintList(ColorStateList.valueOf(i));
            } else {
                drawable.setTint(i);
                drawable = qj1.E(drawable);
                drawable.getClass();
            }
            Field fieldE3 = i2 >= 28 ? e(cls, "mDrawableForCursor") : null;
            if (fieldE3 != null) {
                fieldE3.set(obj, drawable);
                return;
            }
            Field fieldE4 = e(cls, "mCursorDrawable", "mDrawableForCursor");
            if (fieldE4 != null) {
                fieldE4.set(obj, new Drawable[]{drawable, drawable});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void G(RemoteInput.Builder builder, int i) {
        builder.setEditChoicesBeforeSending(i);
    }

    public static void H(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }

    public static void I(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void J(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            Logger loggerA = Logger.a();
            int i3 = SystemForegroundService.e;
            loggerA.getClass();
        } catch (SecurityException unused2) {
            Logger loggerA2 = Logger.a();
            int i4 = SystemForegroundService.e;
            loggerA2.getClass();
        }
    }

    public static void K(AudioRecord audioRecord, c9 c9Var) {
        audioRecord.unregisterAudioRecordingCallback(c9Var);
    }

    public static int L(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (fj3.a(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && if3.f == null) {
                int iM = Build.VERSION.SDK_INT >= 35 ? 2 : M(false);
                int iM2 = M(true);
                if (iM != 0 && (iM2 != 0 ? !(iM != 2 || iM2 != 2) : iM == 2)) {
                    z = false;
                }
                if3.f = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static int M(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.d("video/avc");
            yk3 yk3Var = new yk3(zztVar);
            if (yk3Var.m != null) {
                zzguf zzgufVarB = zd.b(zzuw.zzb, yk3Var, z, false);
                for (int i = 0; i < zzgufVarB.size(); i++) {
                    if (((vk3) zzgufVarB.get(i)).d != null && (videoCapabilities = ((vk3) zzgufVarB.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(VpnProfile.DEFAULT_MSSFIX_SIZE, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (fj3.a(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (zzuy unused) {
        }
        return 0;
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new bu0(context).a() ? 0 : -1;
        }
        io0.e("permission must be non-null");
        return 0;
    }

    public static LocusId b(String str) {
        return new LocusId(str);
    }

    public static ColorFilter c(Object obj) {
        return new BlendModeColorFilter(0, (BlendMode) obj);
    }

    public static DisplayCutout d(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4);
    }

    public static final Field e(Class cls, String... strArr) {
        for (String str : strArr) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static AudioRecordingConfiguration f(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean g(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata h(Notification notification) {
        return notification.getBubbleMetadata();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList i(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            q31 r1 = new q31
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.r31.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.r31.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            p31 r5 = (defpackage.p31) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L88
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            return r3
        L54:
            java.lang.ThreadLocal r2 = defpackage.r31.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L7d
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.mo.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7d
        L7d:
            if (r4 == 0) goto L83
            defpackage.r31.a(r1, r9, r4, r8)
            goto L87
        L83:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        L87:
            return r4
        L88:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.i(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static int j(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static int k(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static String l(LocusId locusId) {
        return locusId.getId();
    }

    public static LocusId m(Notification notification) {
        return notification.getLocusId();
    }

    public static Executor n(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? j5.i(context) : new t30(new Handler(context.getMainLooper()), 0);
    }

    public static String o(Context context) {
        return context.getOpPackageName();
    }

    public static void p(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (k02.p(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT < 29) {
            b.e(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                SharedPreferences.Editor editorEdit = k02.p(context).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                context.getPackageName();
            }
        } finally {
            taskCompletionSource.d(null);
        }
    }

    public static boolean q(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static boolean r(Notification.Action action) {
        return action.isContextual();
    }

    public static boolean s() {
        return Trace.isEnabled();
    }

    public static boolean t(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            context.getPackageName();
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        Log.isLoggable("FirebaseMessaging", 3);
        return true;
    }

    public static String u(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (ii2.d(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (ii2.d(context, str) == 0) {
                return str;
            }
        }
        s31.f(vh.m("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static Object v(BlendModeCompat blendModeCompat) {
        switch (ve.a[blendModeCompat.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return BlendMode.EXCLUSION;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                return BlendMode.MULTIPLY;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                return BlendMode.COLOR;
            case ErrorCodes.SSH_FX_OWNER_INVALID /* 29 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets w(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void x(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }

    public static void y(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void z(Activity activity, p.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
