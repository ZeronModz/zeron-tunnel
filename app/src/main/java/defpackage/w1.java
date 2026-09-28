package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.LocaleList;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1 {
    public static Context a(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static JobScheduler b(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float d(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void e(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int g(Context context) {
        return context.getDeviceId();
    }

    public static int h(Context context) {
        return context.getDeviceId();
    }

    public static LocaleList i(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getLocales();
    }

    public static int j(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int k(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static long l(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getTransitionTimeMillis();
    }

    public static boolean m(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static boolean n(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float o(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void p(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static int q(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float r(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float s(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
