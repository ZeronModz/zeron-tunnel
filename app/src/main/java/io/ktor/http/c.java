package io.ktor.http;

import defpackage.le0;
import io.ktor.http.ContentType;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final List a(HttpMessage httpMessage) {
        List listA;
        httpMessage.getClass();
        Headers h = httpMessage.getH();
        List list = le0.a;
        String str = h.get("Cache-Control");
        return (str == null || (listA = b.a(str)) == null) ? EmptyList.INSTANCE : listA;
    }

    public static final Long b(HttpMessage httpMessage) {
        httpMessage.getClass();
        Headers h = httpMessage.getH();
        List list = le0.a;
        String str = h.get("Content-Length");
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final ContentType c(HttpMessageBuilder httpMessageBuilder) {
        httpMessageBuilder.getClass();
        HeadersBuilder c = httpMessageBuilder.getC();
        List list = le0.a;
        String str = c.get("Content-Type");
        if (str == null) {
            return null;
        }
        ContentType.f.getClass();
        return ContentType.Companion.a(str);
    }
}
