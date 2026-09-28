package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbee;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n12 implements ValueCallback {
    public final /* synthetic */ wq a;
    public final /* synthetic */ zzbdu b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ n12(wq wqVar, zzbdu zzbduVar, WebView webView, boolean z) {
        this.a = wqVar;
        this.b = zzbduVar;
        this.c = webView;
        this.d = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        zzbee zzbeeVar = (zzbee) this.a.d;
        zzbdu zzbduVar = this.b;
        WebView webView = this.c;
        String str = (String) obj;
        boolean z = this.d;
        synchronized (zzbduVar.g) {
            zzbduVar.m--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (zzbeeVar.n || TextUtils.isEmpty(webView.getTitle())) {
                    zzbduVar.b(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    zzbduVar.b(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzbduVar.a()) {
                zzbeeVar.d.a(zzbduVar);
            }
        } catch (JSONException unused) {
            zzo.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            zzo.zze("Failed to get webview content.", th);
            zzt.zzh().f("ContentFetchTask.processWebViewContent", th);
        }
    }
}
