package io.ktor.client.plugins.cache;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ce0;
import defpackage.fh;
import defpackage.hu;
import defpackage.le0;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.http.c;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.d;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(boolean r4, io.ktor.client.statement.HttpResponse r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 r0 = (io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 r0 = new io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            boolean r4 = r0.Z$0
            java.lang.Object r5 = r0.L$0
            io.ktor.client.statement.HttpResponse r5 = (io.ktor.client.statement.HttpResponse) r5
            kotlin.d.b(r6)
            goto L48
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L34:
            kotlin.d.b(r6)
            io.ktor.utils.io.ByteReadChannel r6 = r5.getG()
            r0.L$0 = r5
            r0.Z$0 = r4
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.c.s(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            kotlinx.io.Source r6 = (kotlinx.io.Source) r6
            byte[] r6 = defpackage.mc2.B(r6)
            io.ktor.client.plugins.cache.HttpCacheEntry r0 = new io.ktor.client.plugins.cache.HttpCacheEntry
            io.ktor.util.date.GMTDate r4 = b(r5, r4)
            java.util.Map r1 = d(r5)
            r0.<init>(r4, r1, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.a.a(boolean, io.ktor.client.statement.HttpResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static GMTDate b(HttpResponse httpResponse, boolean z) {
        String str;
        Object next;
        String str2;
        String str3;
        httpResponse.getClass();
        List listA = c.a(httpResponse);
        if (!z || (listA != null && listA.isEmpty())) {
            str = "max-age";
        } else {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                str = "s-maxage";
                if (g.R(((HeaderValue) it.next()).a, "s-maxage", false)) {
                    break;
                }
            }
            str = "max-age";
        }
        Iterator it2 = listA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (g.R(((HeaderValue) next).a, str, false)) {
                break;
            }
        }
        HeaderValue headerValue = (HeaderValue) next;
        Long lB0 = (headerValue == null || (str2 = headerValue.a) == null || (str3 = (String) kotlin.collections.c.u(1, g.O(str2, new String[]{"="}, 6))) == null) ? null : g.b0(str3);
        if (lB0 != null) {
            GMTDate e = httpResponse.getE();
            long jLongValue = lB0.longValue() * 1000;
            e.getClass();
            return io.ktor.util.date.a.b(Long.valueOf(e.i + jLongValue));
        }
        Headers h = httpResponse.getH();
        List list = le0.a;
        String str4 = h.get("Expires");
        if (str4 == null) {
            return io.ktor.util.date.a.b(null);
        }
        if (str4.equals("0") || g.B(str4)) {
            return io.ktor.util.date.a.b(null);
        }
        try {
            return hu.a(str4);
        } catch (Throwable unused) {
            return io.ktor.util.date.a.b(null);
        }
    }

    public static final ValidateStatus c(GMTDate gMTDate, Headers headers, HttpRequestBuilder httpRequestBuilder) {
        int iIntValue;
        Object next;
        Integer numValueOf;
        String str;
        Integer numA0;
        String str2;
        String str3;
        headers.getClass();
        URLBuilder uRLBuilder = httpRequestBuilder.a;
        HeadersBuilder headersBuilder = httpRequestBuilder.c;
        List list = le0.a;
        List<String> all = headers.getAll("Cache-Control");
        Object obj = null;
        List listA = io.ktor.http.b.a(all != null ? kotlin.collections.c.w(all, ",", null, null, null, 62) : null);
        List all2 = headersBuilder.getAll("Cache-Control");
        List listA2 = io.ktor.http.b.a(all2 != null ? kotlin.collections.c.w(all2, ",", null, null, null, 62) : null);
        if (listA2.contains(fh.b)) {
            ce0.a.trace("\"no-cache\" is set for " + uRLBuilder + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        Iterator it = listA2.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (g.R(((HeaderValue) next).a, "max-age=", false)) {
                break;
            }
        }
        HeaderValue headerValue = (HeaderValue) next;
        if (headerValue == null || (str2 = headerValue.a) == null || (str3 = (String) g.O(str2, new String[]{"="}, 6).get(1)) == null) {
            numValueOf = null;
        } else {
            Integer numA02 = g.a0(str3);
            numValueOf = Integer.valueOf(numA02 != null ? numA02.intValue() : 0);
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ce0.a.trace("\"max-age\" is not set for " + uRLBuilder + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        if (listA.contains(fh.b)) {
            ce0.a.trace("\"no-cache\" is set for " + uRLBuilder + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        long j = gMTDate.i;
        TimeZone timeZone = io.ktor.util.date.a.a;
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            ce0.a.trace("Cached response is valid for " + uRLBuilder + ", should not validate");
            return ValidateStatus.ShouldNotValidate;
        }
        if (listA.contains(fh.e)) {
            ce0.a.trace("\"must-revalidate\" is set for " + uRLBuilder + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        Iterator it2 = listA2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (g.R(((HeaderValue) next2).a, "max-stale=", false)) {
                obj = next2;
                break;
            }
        }
        HeaderValue headerValue2 = (HeaderValue) obj;
        if (headerValue2 != null && (str = headerValue2.a) != null && (numA0 = g.a0(str.substring(10))) != null) {
            iIntValue = numA0.intValue();
        }
        if ((((long) iIntValue) * 1000) + jCurrentTimeMillis > 0) {
            ce0.a.trace("Cached response is stale for " + uRLBuilder + " but less than max-stale, should warn");
            return ValidateStatus.ShouldWarn;
        }
        ce0.a.trace("Cached response is stale for " + uRLBuilder + ", should validate cached response");
        return ValidateStatus.ShouldValidate;
    }

    public static final Map d(HttpResponse httpResponse) {
        ArrayList<String> arrayList;
        httpResponse.getClass();
        Headers h = httpResponse.getH();
        List list = le0.a;
        List<String> all = h.getAll("Vary");
        if (all != null) {
            arrayList = new ArrayList();
            Iterator<T> it = all.iterator();
            while (it.hasNext()) {
                List listO = g.O((String) it.next(), new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList(kotlin.collections.c.l(listO, 10));
                Iterator it2 = listO.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(g.c0((String) it2.next()).toString());
                }
                kotlin.collections.c.i(arrayList, arrayList2);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return d.a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Headers h2 = httpResponse.getA().c().getH();
        for (String str : arrayList) {
            String str2 = h2.get(str);
            if (str2 == null) {
                str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
