package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static DisplayCutout b(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
    }

    public static AccessibilityNodeInfo.RangeInfo c(float f, float f2, float f3, int i) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }

    public static Icon d(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static Rect e(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    public static String f(Context context) {
        return context.getAttributionTag();
    }

    public static Rect g(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }

    public static void h(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static NetworkSpecifier i(NetworkRequest networkRequest) {
        return networkRequest.getNetworkSpecifier();
    }

    public static CharSequence j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static AccessibilityWindowInfo k() {
        return new AccessibilityWindowInfo();
    }

    public static Rect l(Activity activity) {
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    public static void m(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void n(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void o(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void p(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void q(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            ii2.S("Failed to call Surface.setFrameRate", e);
        }
    }
}
