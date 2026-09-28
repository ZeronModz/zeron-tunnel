package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.icu.text.DecimalFormatSymbols;
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.format.DateUtils;
import android.view.PixelCopy;
import android.view.PointerIcon;
import android.view.Surface;
import android.view.SurfaceView;
import android.webkit.ServiceWorkerController;
import androidx.core.util.Pair;
import androidx.webkit.internal.ServiceWorkerWebSettingsImpl;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.base.Optional;
import java.util.stream.IntStream;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.b;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qf3 {
    public static volatile Optional a;

    public static boolean A(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean B(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static final boolean C(String str) {
        return str != null && str.length() > 0;
    }

    public static boolean D(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void E(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
    }

    public static void F(SurfaceView surfaceView, Bitmap bitmap, sc1 sc1Var, Handler handler) {
        PixelCopy.request(surfaceView, bitmap, sc1Var, handler);
    }

    public static final void G(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static void H(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void I(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }

    public static final String J(long j) {
        String[] strArr = {"B", "KB", "MB", "GB", "TB", "PB"};
        double d = j;
        int i = 0;
        while (d >= 1000.0d && i < 5) {
            d /= 1024.0d;
            i++;
        }
        return String.format("%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(d), strArr[i]}, 2));
    }

    public static final void K(Context context, int i) {
        context.getClass();
        Typeface typeface = cf1.a;
        cf1.b(context, context.getString(i)).show();
    }

    public static final void L(Context context, String str) {
        context.getClass();
        cf1.b(context, str).show();
    }

    public static final void M(Context context, int i) {
        context.getClass();
        Typeface typeface = cf1.a;
        cf1.a(context, context.getString(i), n8.p(context, 2131230922), context.getColor(R.color.errorColor), context.getColor(R.color.defaultTextColor), 0, true).show();
    }

    public static final void N(Context context, String str) {
        Typeface typeface = cf1.a;
        cf1.a(context, str, n8.p(context, 2131230922), context.getColor(R.color.errorColor), context.getColor(R.color.defaultTextColor), 0, true).show();
    }

    public static final void O(Context context) {
        context.getClass();
        Typeface typeface = cf1.a;
        cf1.a(context, context.getString(R.string.toast_success), n8.p(context, 2131230919), context.getColor(R.color.successColor), context.getColor(R.color.defaultTextColor), 0, true).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, all -> 0x006d, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x014a, B:15:0x0025, B:17:0x002d, B:22:0x003d, B:24:0x0043, B:26:0x0049, B:27:0x004d, B:74:0x0145, B:76:0x014d, B:77:0x0150, B:78:0x0151, B:28:0x0051, B:30:0x0055, B:31:0x0062, B:33:0x0068, B:38:0x0079, B:40:0x007f, B:41:0x0085, B:61:0x0128, B:62:0x012b, B:70:0x013a, B:69:0x0137, B:71:0x013b, B:72:0x0140, B:73:0x0141, B:36:0x0070, B:37:0x0075), top: B:85:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.base.Optional P(android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf3.P(android.content.Context):com.google.common.base.Optional");
    }

    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static IntStream b(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.chars());
    }

    public static IntStream c(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
    }

    public static final String d(String str, String... strArr) {
        StringBuilder sb = new StringBuilder(g.e0(new char[]{'/'}, str));
        for (String str2 : strArr) {
            char[] cArr = {'/'};
            str2.getClass();
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean zD = b.d(cArr, str2.charAt(!z ? i : length));
                if (z) {
                    if (!zD) {
                        break;
                    }
                    length--;
                } else if (zD) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = str2.subSequence(i, length + 1).toString();
            if (string.length() > 0) {
                sb.append('/');
                sb.append(string);
            }
        }
        return sb.toString();
    }

    public static Context e(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static Context f(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList g(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static boolean h(Notification.Action action) {
        return action.getAllowGeneratedReplies();
    }

    public static File i(Context context) {
        return context.getDataDir();
    }

    public static File j(Context context) {
        return context.getDataDir();
    }

    public static Pair k(Long l, Long l2) {
        if (l == null && l2 == null) {
            return new Pair(null, null);
        }
        if (l == null) {
            return new Pair(null, l(l2.longValue()));
        }
        if (l2 == null) {
            return new Pair(l(l.longValue()), null);
        }
        Calendar calendarH = ol1.h();
        Calendar calendarI = ol1.i(null);
        calendarI.setTimeInMillis(l.longValue());
        Calendar calendarI2 = ol1.i(null);
        calendarI2.setTimeInMillis(l2.longValue());
        return calendarI.get(1) == calendarI2.get(1) ? calendarI.get(1) == calendarH.get(1) ? new Pair(q(l.longValue(), Locale.getDefault()), q(l2.longValue(), Locale.getDefault())) : new Pair(q(l.longValue(), Locale.getDefault()), z(l2.longValue(), Locale.getDefault())) : new Pair(z(l.longValue(), Locale.getDefault()), z(l2.longValue(), Locale.getDefault()));
    }

    public static String l(long j) {
        Calendar calendarH = ol1.h();
        Calendar calendarI = ol1.i(null);
        calendarI.setTimeInMillis(j);
        return calendarH.get(1) == calendarI.get(1) ? q(j, Locale.getDefault()) : z(j, Locale.getDefault());
    }

    public static String m(Context context, long j, boolean z, boolean z2, boolean z3) {
        String str;
        Calendar calendarH = ol1.h();
        Calendar calendarI = ol1.i(null);
        calendarI.setTimeInMillis(j);
        if (calendarH.get(1) == calendarI.get(1)) {
            Locale locale = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? ol1.c("MMMMEEEEd", locale).format(new Date(j)) : ol1.g(0, locale).format(new Date(j));
        } else {
            Locale locale2 = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? ol1.c("yMMMMEEEEd", locale2).format(new Date(j)) : ol1.g(0, locale2).format(new Date(j));
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        return z2 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), str) : z3 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), str) : str;
    }

    public static final String n(URI uri) {
        String host = uri.getHost();
        String strM = host != null ? g.M(g.M(host, "[", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), "]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : null;
        return strM == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strM;
    }

    public static DecimalFormatSymbols o(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList p(Configuration configuration) {
        return configuration.getLocales();
    }

    public static String q(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ol1.c("MMMd", locale).format(new Date(j));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) ol1.g(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int iB = ol1.b(1, 0, pattern, "yY");
        if (iB < pattern.length()) {
            int iB2 = ol1.b(1, iB, pattern, "EMd");
            pattern = pattern.replace(pattern.substring(ol1.b(-1, iB, pattern, iB2 < pattern.length() ? "EMd," : "EMd") + 1, iB2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j));
    }

    public static final long r(HttpURLConnection httpURLConnection) {
        return Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
    }

    public static ServiceWorkerController s() {
        return ServiceWorkerController.getInstance();
    }

    public static void t(ServiceWorkerController serviceWorkerController) {
        new ServiceWorkerWebSettingsImpl(serviceWorkerController.getServiceWorkerWebSettings());
    }

    public static PointerIcon u(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static int v(AudioRecord audioRecord, AudioTimestamp audioTimestamp) {
        return audioRecord.getTimestamp(audioTimestamp, 0);
    }

    public static String[] w(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] x(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static String y(long j) {
        return Build.VERSION.SDK_INT >= 24 ? ol1.c("yMMMM", Locale.getDefault()).format(new Date(j)) : DateUtils.formatDateTime(null, j, 8228);
    }

    public static String z(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? ol1.c("yMMMd", locale).format(new Date(j)) : ol1.g(2, locale).format(new Date(j));
    }
}
