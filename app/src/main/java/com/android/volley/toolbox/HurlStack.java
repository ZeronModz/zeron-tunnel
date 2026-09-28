package com.android.volley.toolbox;

import com.android.volley.Header;
import com.android.volley.Request;
import defpackage.p60;
import defpackage.qe0;
import defpackage.u7;
import defpackage.vh;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class HurlStack extends BaseHttpStack {
    public final UrlRewriter a;
    public final SSLSocketFactory b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface UrlRewriter extends com.android.volley.toolbox.UrlRewriter {
    }

    public HurlStack(UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        this.a = urlRewriter;
        this.b = sSLSocketFactory;
    }

    public static void b(HttpURLConnection httpURLConnection, Request request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.e());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Header((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void d(HttpURLConnection httpURLConnection, Request request) throws IOException {
        switch (request.b) {
            case -1:
                byte[] bArrG = request.g();
                if (bArrG != null) {
                    httpURLConnection.setRequestMethod("POST");
                    b(httpURLConnection, request, bArrG);
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrD = request.d();
                if (bArrD != null) {
                    b(httpURLConnection, request, bArrD);
                }
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] bArrD2 = request.d();
                if (bArrD2 != null) {
                    b(httpURLConnection, request, bArrD2);
                }
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] bArrD3 = request.d();
                if (bArrD3 != null) {
                    b(httpURLConnection, request, bArrD3);
                }
                break;
            default:
                u7.p("Unknown method type.");
                break;
        }
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public final HttpResponse a(Request request, Map map) throws Throwable {
        SSLSocketFactory sSLSocketFactory;
        String str = request.c;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(Collections.EMPTY_MAP);
        UrlRewriter urlRewriter = this.a;
        if (urlRewriter != null) {
            String strRewriteUrl = urlRewriter.rewriteUrl(str);
            if (strRewriteUrl == null) {
                p60.f(vh.l("URL blocked by rewriter: ", str));
                return null;
            }
            str = strRewriteUrl;
        }
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = request.j.a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            d(httpURLConnection, request);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (request.b == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                HttpResponse httpResponse = new HttpResponse(responseCode, c(httpURLConnection.getHeaderFields()));
                httpURLConnection.disconnect();
                return httpResponse;
            }
            try {
                return new HttpResponse(responseCode, c(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new qe0(httpURLConnection, 0));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public HurlStack(UrlRewriter urlRewriter) {
        this(urlRewriter, null);
    }

    public HurlStack() {
        this(null);
    }
}
