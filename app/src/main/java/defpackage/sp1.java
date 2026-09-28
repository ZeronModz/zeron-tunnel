package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.WebViewProviderAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sp1 {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.parse(Marker.ANY_MARKER);
        Uri.parse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static WebViewProviderAdapter b(WebView webView) {
        return new WebViewProviderAdapter(xp1.a.createWebView(webView));
    }

    public static String c() {
        if (vp1.k.b()) {
            return xp1.a.getStatics().getVariationsHeader();
        }
        throw vp1.a();
    }

    public static WebViewClient d(WebView webView) {
        p5 p5Var = vp1.f;
        if (p5Var.a()) {
            return i5.j(webView);
        }
        if (!p5Var.b()) {
            throw vp1.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper looperZ = j5.z(webView);
            if (looperZ != Looper.myLooper()) {
                StringBuilder sb = new StringBuilder("A WebView method was called on thread '");
                sb.append(Thread.currentThread().getName());
                sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
                sb.append(looperZ);
                sb.append(" called on ");
                sb.append(Looper.myLooper());
                Looper mainLooper = Looper.getMainLooper();
                sb.append(", FYI main Looper is ");
                sb.append(mainLooper);
                sb.append(")");
                throw new RuntimeException(sb.toString());
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                p60.l(e);
                return null;
            }
        }
        return b(webView).a.getWebViewClient();
    }
}
