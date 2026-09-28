package com.android.volley;

import android.text.TextUtils;
import defpackage.vh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class Header {
    public final String a;
    public final String b;

    public Header(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Header.class == obj.getClass()) {
            Header header = (Header) obj;
            if (TextUtils.equals(this.a, header.a) && TextUtils.equals(this.b, header.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return vh.s(sb, this.b, "]");
    }
}
