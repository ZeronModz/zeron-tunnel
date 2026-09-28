package com.android.volley.toolbox;

import com.android.volley.Header;
import com.android.volley.Request;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseHttpStack implements HttpStack {
    public abstract HttpResponse a(Request request, Map map);

    @Override // com.android.volley.toolbox.HttpStack
    public final org.apache.http.HttpResponse performRequest(Request request, Map map) {
        HttpResponse httpResponseA = a(request, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), httpResponseA.a, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        ArrayList arrayList = new ArrayList();
        for (Header header : DesugarCollections.unmodifiableList(httpResponseA.b)) {
            arrayList.add(new BasicHeader(header.a, header.b));
        }
        basicHttpResponse.setHeaders((org.apache.http.Header[]) arrayList.toArray(new org.apache.http.Header[0]));
        byte[] bArr = httpResponseA.e;
        InputStream byteArrayInputStream = httpResponseA.d;
        if (byteArrayInputStream == null) {
            byteArrayInputStream = bArr != null ? new ByteArrayInputStream(bArr) : null;
        }
        if (byteArrayInputStream != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(byteArrayInputStream);
            basicHttpEntity.setContentLength(httpResponseA.c);
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
