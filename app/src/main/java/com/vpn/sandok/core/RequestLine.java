package com.vpn.sandok.core;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class RequestLine {
    public static final String TAG = "RequestLine";
    private String method;
    private String statusLine;
    private String uri;
    private String version;

    public RequestLine(String str) {
        this.statusLine = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            int iIndexOf = str.indexOf(" ");
            if (iIndexOf == -1) {
                return;
            }
            this.method = str.substring(0, iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1);
            int iIndexOf2 = strSubstring.indexOf(" ");
            if (iIndexOf2 == -1) {
                return;
            }
            this.uri = strSubstring.substring(0, iIndexOf2);
            String strSubstring2 = strSubstring.substring(iIndexOf2 + 1);
            if (TextUtils.isEmpty(strSubstring2)) {
                return;
            }
            this.version = strSubstring2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getMethod() {
        return this.method;
    }

    public String getStatusLine() {
        return this.statusLine;
    }

    public String getUri() {
        return this.uri;
    }

    public String getVersion() {
        return this.version;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setStatusLine(String str) {
        this.statusLine = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
