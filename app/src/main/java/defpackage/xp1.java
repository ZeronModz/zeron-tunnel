package defpackage;

import androidx.webkit.internal.IncompatibleApkWebViewProviderFactory;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.webkit.internal.WebViewProviderFactoryAdapter;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xp1 {
    public static final WebViewProviderFactory a;

    static {
        WebViewProviderFactory incompatibleApkWebViewProviderFactory;
        try {
            incompatibleApkWebViewProviderFactory = new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, ay2.f()));
        } catch (ClassNotFoundException unused) {
            incompatibleApkWebViewProviderFactory = new IncompatibleApkWebViewProviderFactory();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            p60.l(e);
            return;
        }
        a = incompatibleApkWebViewProviderFactory;
    }
}
