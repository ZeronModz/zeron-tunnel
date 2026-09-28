package io.ktor.client.request.forms;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.x10;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.http.Headers;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/request/forms/FormPart;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", "value", "Lio/ktor/http/Headers;", "headers", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FormPart<T> {
    public final String a;
    public final Object b;
    public final Headers c;

    public FormPart(String str, T t, Headers headers) {
        str.getClass();
        t.getClass();
        headers.getClass();
        this.a = str;
        this.b = t;
        this.c = headers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormPart)) {
            return false;
        }
        FormPart formPart = (FormPart) obj;
        return yg0.a(this.a, formPart.a) && yg0.a(this.b, formPart.b) && yg0.a(this.c, formPart.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FormPart(key=" + this.a + ", value=" + this.b + ", headers=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FormPart(String str, Object obj, Headers headers, int i, xu xuVar) {
        if ((i & 4) != 0) {
            Headers.Companion.getClass();
            headers = x10.a;
        }
        this(str, obj, headers);
    }
}
