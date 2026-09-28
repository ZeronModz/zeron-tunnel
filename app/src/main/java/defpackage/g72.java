package defpackage;

import android.os.RemoteException;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.zzfub;
import com.google.android.gms.internal.ads.zzfuz;
import com.google.android.gms.internal.consent_sdk.a;
import com.google.android.gms.internal.consent_sdk.zzbv;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 0:
                zzbv zzbvVar = (zzbv) this.b;
                int i = zzbv.d;
                if (str != null && str.startsWith("consent://")) {
                    zzbvVar.b.a(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                zzbv zzbvVar = (zzbv) this.b;
                if (!zzbvVar.c) {
                    zzbvVar.c = true;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 0:
                a aVar = ((zzbv) this.b).b;
                aVar.getClass();
                Locale locale = Locale.US;
                zzg zzgVar = new zzg(2, "WebResourceError(" + i + ", " + str2 + "): " + str);
                n02 n02Var = (n02) aVar.g.i.getAndSet(null);
                if (n02Var != null) {
                    n02Var.onConsentFormLoadFailure(zzgVar.zza());
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
            case 1:
                String string = renderProcessGoneDetail.toString();
                String strValueOf = String.valueOf(webView);
                new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length());
                zzfub zzfubVar = (zzfub) this.b;
                if (zzfubVar.c() == webView) {
                    zzfubVar.b = new zzfuz(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zzbv zzbvVar = (zzbv) obj;
                int i2 = zzbv.d;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                zzbvVar.b.a(str);
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                zzs zzsVar = (zzs) obj;
                if (str.startsWith(zzsVar.zzO())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    if (zzsVar.zzX() != null) {
                        try {
                            zzsVar.zzX().zzd(xg0.P(3, null, null));
                        } catch (RemoteException e) {
                            zzo.zzl("#007 Could not call remote method.", e);
                        }
                        break;
                    }
                    if (zzsVar.zzX() != null) {
                        try {
                            zzsVar.zzX().zzc(3);
                        } catch (RemoteException e2) {
                            zzo.zzl("#007 Could not call remote method.", e2);
                        }
                        break;
                    }
                    zzsVar.zzM(0);
                    return true;
                }
                if (str.startsWith("gmsg://scriptLoadFailed")) {
                    if (zzsVar.zzX() != null) {
                        try {
                            zzsVar.zzX().zzd(xg0.P(1, null, null));
                        } catch (RemoteException e3) {
                            zzo.zzl("#007 Could not call remote method.", e3);
                        }
                        break;
                    }
                    if (zzsVar.zzX() != null) {
                        try {
                            zzsVar.zzX().zzc(0);
                        } catch (RemoteException e4) {
                            zzo.zzl("#007 Could not call remote method.", e4);
                        }
                        break;
                    }
                    zzsVar.zzM(0);
                    return true;
                }
                if (str.startsWith("gmsg://adResized")) {
                    if (zzsVar.zzX() != null) {
                        try {
                            zzsVar.zzX().zzf();
                        } catch (RemoteException e5) {
                            zzo.zzl("#007 Could not call remote method.", e5);
                        }
                        break;
                    }
                    zzsVar.zzM(zzsVar.zzL(str));
                    return true;
                }
                if (str.startsWith("gmsg://")) {
                    return true;
                }
                if (zzsVar.zzX() != null) {
                    try {
                        zzsVar.zzX().zzh();
                        zzsVar.zzX().zze();
                    } catch (RemoteException e6) {
                        zzo.zzl("#007 Could not call remote method.", e6);
                    }
                    break;
                }
                zzsVar.zzV(str);
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 2:
                zzs zzsVar = (zzs) this.b;
                if (zzsVar.zzX() != null) {
                    try {
                        zzsVar.zzX().zzd(xg0.P(1, null, null));
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzsVar.zzX() != null) {
                    try {
                        zzsVar.zzX().zzc(0);
                    } catch (RemoteException e2) {
                        zzo.zzl("#007 Could not call remote method.", e2);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                String string = webResourceRequest.getUrl().toString();
                zzbv zzbvVar = (zzbv) this.b;
                int i = zzbv.d;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                zzbvVar.b.a(string);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
