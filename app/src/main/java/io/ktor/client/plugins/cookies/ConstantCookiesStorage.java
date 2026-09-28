package io.ktor.client.plugins.cookies;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.sb2;
import io.ktor.http.Cookie;
import io.ktor.http.URLBuilder;
import io.ktor.http.Url;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/cookies/ConstantCookiesStorage;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/Cookie;", "cookies", "<init>", "([Lio/ktor/http/Cookie;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConstantCookiesStorage implements CookiesStorage {
    public final List a;

    public ConstantCookiesStorage(Cookie... cookieArr) {
        cookieArr.getClass();
        ArrayList arrayList = new ArrayList(cookieArr.length);
        for (Cookie cookie : cookieArr) {
            arrayList.add(sb2.g(cookie, new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null).b()));
        }
        this.a = kotlin.collections.c.R(arrayList);
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public final Object addCookie(Url url, Cookie cookie, Continuation continuation) {
        return mk1.a;
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public final Object get(Url url, Continuation continuation) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (sb2.m((Cookie) obj, url)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
