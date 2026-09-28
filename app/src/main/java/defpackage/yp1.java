package defpackage;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcessClient;
import androidx.webkit.internal.WebViewRenderProcessImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewRenderProcessClient b;
    public final /* synthetic */ WebView c;

    public /* synthetic */ yp1(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl, int i) {
        this.a = i;
        this.b = webViewRenderProcessClient;
        this.c = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WebViewRenderProcessClient webViewRenderProcessClient = this.b;
        switch (i) {
            case 0:
                webViewRenderProcessClient.a();
                break;
            default:
                webViewRenderProcessClient.b();
                break;
        }
    }
}
