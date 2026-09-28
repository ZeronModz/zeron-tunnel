package defpackage;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.HttpStack;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends BaseHttpStack {
    public final HttpStack a;

    public x3(HttpStack httpStack) {
        this.a = httpStack;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public final HttpResponse a(Request request, Map map) throws IOException, AuthFailureError {
        try {
            org.apache.http.HttpResponse httpResponsePerformRequest = this.a.performRequest(request, map);
            int statusCode = httpResponsePerformRequest.getStatusLine().getStatusCode();
            Header[] allHeaders = httpResponsePerformRequest.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new com.android.volley.Header(header.getName(), header.getValue()));
            }
            if (httpResponsePerformRequest.getEntity() == null) {
                return new HttpResponse(statusCode, arrayList);
            }
            long contentLength = httpResponsePerformRequest.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new HttpResponse(statusCode, arrayList, (int) httpResponsePerformRequest.getEntity().getContentLength(), httpResponsePerformRequest.getEntity().getContent());
            }
            p60.f(hz.r(contentLength, "Response too large: "));
            return null;
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
