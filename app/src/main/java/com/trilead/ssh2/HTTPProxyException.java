package com.trilead.ssh2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class HTTPProxyException extends IOException {
    private static final long serialVersionUID = 2241537397104426186L;
    public final int httpErrorCode;
    public final String httpResponse;

    public HTTPProxyException(String str, int i) {
        super("HTTP Proxy Error (" + i + " " + str + ")");
        this.httpResponse = str;
        this.httpErrorCode = i;
    }
}
