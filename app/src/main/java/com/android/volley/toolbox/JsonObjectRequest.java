package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response$ErrorListener;
import com.android.volley.Response$Listener;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class JsonObjectRequest extends JsonRequest<JSONObject> {
    @Deprecated
    public JsonObjectRequest(String str, JSONObject jSONObject, Response$Listener<JSONObject> response$Listener, Response$ErrorListener response$ErrorListener) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, response$Listener, response$ErrorListener);
    }

    @Override // com.android.volley.Request
    public final com.android.volley.a n(NetworkResponse networkResponse) {
        try {
            return new com.android.volley.a(new JSONObject(new String(networkResponse.a, HttpHeaderParser.b("utf-8", networkResponse.b))), HttpHeaderParser.a(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return new com.android.volley.a(new ParseError(e));
        } catch (JSONException e2) {
            return new com.android.volley.a(new ParseError(e2));
        }
    }

    public JsonObjectRequest(String str, Response$Listener<JSONObject> response$Listener, Response$ErrorListener response$ErrorListener) {
        super(0, str, null, response$Listener, response$ErrorListener);
    }

    public JsonObjectRequest(int i, String str, JSONObject jSONObject, Response$Listener<JSONObject> response$Listener, Response$ErrorListener response$ErrorListener) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, response$Listener, response$ErrorListener);
    }
}
