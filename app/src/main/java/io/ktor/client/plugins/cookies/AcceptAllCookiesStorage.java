package io.ktor.client.plugins.cookies;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.ds0;
import defpackage.o0;
import defpackage.xu;
import io.ktor.client.plugins.cookies.AcceptAllCookiesStorage;
import io.ktor.http.Cookie;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/Function0;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "clock", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "CookieWithTimestamp", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AcceptAllCookiesStorage implements CookiesStorage {
    public final Function0 a;
    public final ArrayList b;
    public final MutexImpl c;
    private volatile /* synthetic */ long oldestCookie;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/Cookie;", "cookie", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "createdAt", "<init>", "(Lio/ktor/http/Cookie;J)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CookieWithTimestamp {
        public final Cookie a;
        public final long b;

        public CookieWithTimestamp(Cookie cookie, long j) {
            cookie.getClass();
            this.a = cookie;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CookieWithTimestamp)) {
                return false;
            }
            CookieWithTimestamp cookieWithTimestamp = (CookieWithTimestamp) obj;
            return this.a.equals(cookieWithTimestamp.a) && this.b == cookieWithTimestamp.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            long j = this.b;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "CookieWithTimestamp(cookie=" + this.a + ", createdAt=" + this.b + ')';
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0, 0}, l = {77}, m = "addCookie", n = {"this", "requestUrl", "cookie", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return AcceptAllCookiesStorage.this.addCookie(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0}, l = {77}, m = "get", n = {"this", "requestUrl", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    final class C00271 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00271(Continuation<? super C00271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return AcceptAllCookiesStorage.this.get(null, this);
        }
    }

    public AcceptAllCookiesStorage(Function0<Long> function0) {
        function0.getClass();
        this.a = function0;
        this.b = new ArrayList();
        this.oldestCookie = 0L;
        this.c = ds0.a();
    }

    public static Long b(Cookie cookie, long j) {
        Integer num = cookie.d;
        if (num != null) {
            return Long.valueOf((((long) num.intValue()) * 1000) + j);
        }
        GMTDate gMTDate = cookie.e;
        if (gMTDate != null) {
            return Long.valueOf(gMTDate.i);
        }
        return null;
    }

    public final void a(final long j) {
        kotlin.collections.c.G(this.b, new Function1(this) { // from class: io.ktor.client.plugins.cookies.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AcceptAllCookiesStorage.CookieWithTimestamp cookieWithTimestamp = (AcceptAllCookiesStorage.CookieWithTimestamp) obj;
                cookieWithTimestamp.getClass();
                Long lB = AcceptAllCookiesStorage.b(cookieWithTimestamp.a, cookieWithTimestamp.b);
                boolean z = false;
                if (lB != null && lB.longValue() < j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        long jMin = Long.MAX_VALUE;
        for (CookieWithTimestamp cookieWithTimestamp : this.b) {
            Long lB = b(cookieWithTimestamp.a, cookieWithTimestamp.b);
            if (lB != null) {
                jMin = Math.min(jMin, lB.longValue());
            }
        }
        this.oldestCookie = jMin;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addCookie(final io.ktor.http.Url r7, final io.ktor.http.Cookie r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r6 = this;
            mk1 r0 = defpackage.mk1.a
            boolean r1 = r9 instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.AnonymousClass1
            if (r1 == 0) goto L15
            r1 = r9
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 r1 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 r1 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1
            r1.<init>(r9)
        L1a:
            java.lang.Object r9 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L43
            if (r3 != r4) goto L3d
            java.lang.Object r6 = r1.L$3
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r1.L$2
            r8 = r7
            io.ktor.http.Cookie r8 = (io.ktor.http.Cookie) r8
            java.lang.Object r7 = r1.L$1
            io.ktor.http.Url r7 = (io.ktor.http.Url) r7
            java.lang.Object r1 = r1.L$0
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage r1 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage) r1
            kotlin.d.b(r9)
            r9 = r6
            r6 = r1
            goto L62
        L3d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r5
        L43:
            kotlin.d.b(r9)
            java.lang.String r9 = r8.a
            boolean r9 = kotlin.text.g.B(r9)
            if (r9 == 0) goto L4f
            return r0
        L4f:
            kotlinx.coroutines.sync.MutexImpl r9 = r6.c
            r1.L$0 = r6
            r1.L$1 = r7
            r1.L$2 = r8
            r1.L$3 = r9
            r1.label = r4
            java.lang.Object r1 = r9.lock(r5, r1)
            if (r1 != r2) goto L62
            return r2
        L62:
            java.util.ArrayList r1 = r6.b     // Catch: java.lang.Throwable -> L99
            io.ktor.client.plugins.cookies.a r2 = new io.ktor.client.plugins.cookies.a     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            kotlin.collections.c.G(r1, r2)     // Catch: java.lang.Throwable -> L99
            kotlin.jvm.functions.Function0 r1 = r6.a     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L99
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L99
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L99
            java.util.ArrayList r3 = r6.b     // Catch: java.lang.Throwable -> L99
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp r4 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp     // Catch: java.lang.Throwable -> L99
            io.ktor.http.Cookie r7 = defpackage.sb2.g(r8, r7)     // Catch: java.lang.Throwable -> L99
            r4.<init>(r7, r1)     // Catch: java.lang.Throwable -> L99
            r3.add(r4)     // Catch: java.lang.Throwable -> L99
            java.lang.Long r7 = b(r8, r1)     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L9b
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L99
            long r1 = r6.oldestCookie     // Catch: java.lang.Throwable -> L99
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L9b
            r6.oldestCookie = r7     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r6 = move-exception
            goto L9f
        L9b:
            r9.unlock(r5)
            return r0
        L9f:
            r9.unlock(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.addCookie(io.ktor.http.Url, io.ktor.http.Cookie, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(io.ktor.http.Url r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.C00271
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.C00271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 r0 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r6 = r0.L$1
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage) r0
            kotlin.d.b(r7)
            r7 = r5
            r5 = r0
            goto L50
        L36:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            return r4
        L3c:
            kotlin.d.b(r7)
            kotlinx.coroutines.sync.MutexImpl r7 = r5.c
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            kotlin.jvm.functions.Function0 r0 = r5.a     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L66
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L66
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L66
            long r2 = r5.oldestCookie     // Catch: java.lang.Throwable -> L66
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L68
            r5.a(r0)     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r5 = move-exception
            goto Lb1
        L68:
            java.util.ArrayList r5 = r5.b     // Catch: java.lang.Throwable -> L66
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L66
        L73:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L66
            r2 = r1
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp r2 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) r2     // Catch: java.lang.Throwable -> L66
            io.ktor.http.Cookie r2 = r2.a     // Catch: java.lang.Throwable -> L66
            boolean r2 = defpackage.sb2.m(r2, r6)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L73
            r0.add(r1)     // Catch: java.lang.Throwable -> L66
            goto L73
        L8c:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L66
            r6 = 10
            int r6 = kotlin.collections.c.l(r0, r6)     // Catch: java.lang.Throwable -> L66
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L66
        L9b:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L66
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) r0     // Catch: java.lang.Throwable -> L66
            io.ktor.http.Cookie r0 = r0.a     // Catch: java.lang.Throwable -> L66
            r5.add(r0)     // Catch: java.lang.Throwable -> L66
            goto L9b
        Lad:
            r7.unlock(r4)
            return r5
        Lb1:
            r7.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.get(io.ktor.http.Url, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcceptAllCookiesStorage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AcceptAllCookiesStorage(Function0 function0, int i, xu xuVar) {
        this((i & 1) != 0 ? new o0(1) : function0);
    }
}
