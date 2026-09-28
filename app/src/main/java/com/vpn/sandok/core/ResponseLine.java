package com.vpn.sandok.core;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ResponseLine {
    public static final String TAG = "ResponseLine";
    private String reason;
    private int statusCode;
    private String statusLine;
    private String version;

    public ResponseLine(String str) {
        this.statusLine = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            int iIndexOf = str.indexOf(" ");
            if (iIndexOf == -1) {
                return;
            }
            this.version = str.substring(0, iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1);
            int iIndexOf2 = strSubstring.indexOf(" ");
            if (iIndexOf2 == -1) {
                return;
            }
            this.statusCode = Integer.parseInt(strSubstring.substring(0, iIndexOf2));
            this.reason = strSubstring.substring(iIndexOf2 + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getReason() {
        return this.reason;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusLine() {
        return this.statusLine;
    }

    public String getVersion() {
        return this.version;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusLine(String str) {
        this.statusLine = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
