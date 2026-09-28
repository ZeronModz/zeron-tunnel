package com.android.volley.toolbox;

import com.android.volley.Request;
import defpackage.u7;
import java.net.URI;
import java.util.Collections;
import java.util.Map;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HttpClientStack implements HttpStack {
    public final HttpClient a;

    public HttpClientStack(HttpClient httpClient) {
        this.a = httpClient;
    }

    @Override // com.android.volley.toolbox.HttpStack
    public final org.apache.http.HttpResponse performRequest(Request request, Map map) {
        HttpUriRequest httpGet;
        int i = request.b;
        String str = request.c;
        switch (i) {
            case -1:
                byte[] bArrG = request.g();
                if (bArrG != null) {
                    HttpPost httpPost = new HttpPost(str);
                    httpPost.addHeader("Content-Type", request.h());
                    httpPost.setEntity(new ByteArrayEntity(bArrG));
                    httpGet = httpPost;
                } else {
                    httpGet = new HttpGet(str);
                }
                break;
            case 0:
                httpGet = new HttpGet(str);
                break;
            case 1:
                HttpPost httpPost2 = new HttpPost(str);
                httpPost2.addHeader("Content-Type", request.e());
                byte[] bArrD = request.d();
                httpGet = httpPost2;
                if (bArrD != null) {
                    httpPost2.setEntity(new ByteArrayEntity(bArrD));
                    httpGet = httpPost2;
                }
                break;
            case 2:
                HttpPut httpPut = new HttpPut(str);
                httpPut.addHeader("Content-Type", request.e());
                byte[] bArrD2 = request.d();
                httpGet = httpPut;
                if (bArrD2 != null) {
                    httpPut.setEntity(new ByteArrayEntity(bArrD2));
                    httpGet = httpPut;
                }
                break;
            case 3:
                httpGet = new HttpDelete(str);
                break;
            case 4:
                httpGet = new HttpHead(str);
                break;
            case 5:
                httpGet = new HttpOptions(str);
                break;
            case 6:
                httpGet = new HttpTrace(str);
                break;
            case 7:
                HttpPatch httpPatch = new HttpPatch(str);
                httpPatch.addHeader("Content-Type", request.e());
                byte[] bArrD3 = request.d();
                httpGet = httpPatch;
                if (bArrD3 != null) {
                    httpPatch.setEntity(new ByteArrayEntity(bArrD3));
                    httpGet = httpPatch;
                }
                break;
            default:
                u7.p("Unknown request method.");
                return null;
        }
        for (String str2 : map.keySet()) {
            httpGet.setHeader(str2, (String) map.get(str2));
        }
        Map map2 = Collections.EMPTY_MAP;
        for (String str3 : map2.keySet()) {
            httpGet.setHeader(str3, (String) map2.get(str3));
        }
        HttpParams params = httpGet.getParams();
        int i2 = request.j.a;
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, i2);
        return this.a.execute(httpGet);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static final class HttpPatch extends HttpEntityEnclosingRequestBase {
        public HttpPatch(String str) {
            setURI(URI.create(str));
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public final String getMethod() {
            return "PATCH";
        }

        public HttpPatch(URI uri) {
            setURI(uri);
        }

        public HttpPatch() {
        }
    }
}
