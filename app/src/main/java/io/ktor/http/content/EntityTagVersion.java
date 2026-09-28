package io.ktor.http.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.le0;
import defpackage.pc0;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.http.HeaderValue;
import io.ktor.http.HeadersBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.text.g;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/ktor/http/content/EntityTagVersion;", "Lio/ktor/http/content/Version;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "etag", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "weak", "<init>", "(Ljava/lang/String;Z)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EntityTagVersion implements Version {
    public static final Companion d = new Companion(null);
    public static final EntityTagVersion e = new EntityTagVersion(Marker.ANY_MARKER, false);
    public final String a;
    public final boolean b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/EntityTagVersion$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public static ArrayList a(String str) {
            boolean z;
            EntityTagVersion entityTagVersion;
            List<HeaderValue> listA = io.ktor.http.b.a(str);
            ArrayList arrayList = new ArrayList(c.l(listA, 10));
            for (HeaderValue headerValue : listA) {
                double d = headerValue.c;
                List list = headerValue.b;
                if (d != 1.0d) {
                    throw new IllegalStateException(("entity-tag quality parameter is not allowed: " + headerValue.c + '.').toString());
                }
                if (!list.isEmpty()) {
                    throw new IllegalStateException(("entity-tag parameters are not allowed: " + list + '.').toString());
                }
                Companion companion = EntityTagVersion.d;
                String strB = headerValue.a;
                companion.getClass();
                strB.getClass();
                if (strB.equals(Marker.ANY_MARKER)) {
                    entityTagVersion = EntityTagVersion.e;
                } else {
                    if (g.R(strB, "W/", false)) {
                        strB = g.s(2, strB);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!g.R(strB, "\"", false)) {
                        strB = pc0.b(strB);
                    }
                    entityTagVersion = new EntityTagVersion(strB, z);
                }
                arrayList.add(entityTagVersion);
            }
            return arrayList;
        }
    }

    public EntityTagVersion(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = (str.equals(Marker.ANY_MARKER) || g.R(str, "\"", false)) ? str : pc0.b(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = this.a.charAt(i);
            if ((yg0.q(cCharAt, 32) <= 0 || cCharAt == '\"') && i != 0 && i != this.a.length() - 1) {
                throw new IllegalArgumentException(("Character '" + cCharAt + "' is not allowed in entity-tag.").toString());
            }
        }
    }

    @Override // io.ktor.http.content.Version
    public final void appendHeadersTo(HeadersBuilder headersBuilder) {
        headersBuilder.getClass();
        String str = this.c;
        str.getClass();
        List list = le0.a;
        headersBuilder.set("ETag", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[RETURN] */
    @Override // io.ktor.http.content.Version
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.ktor.http.content.VersionCheckResult check(io.ktor.http.Headers r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.List r0 = defpackage.le0.a
            java.lang.String r0 = "If-None-Match"
            java.lang.String r0 = r8.get(r0)
            r1 = 1
            java.lang.String r2 = r7.c
            io.ktor.http.content.EntityTagVersion r3 = io.ktor.http.content.EntityTagVersion.e
            io.ktor.http.content.EntityTagVersion$Companion r4 = io.ktor.http.content.EntityTagVersion.d
            if (r0 == 0) goto L5f
            r4.getClass()
            java.util.ArrayList r0 = io.ktor.http.content.EntityTagVersion.Companion.a(r0)
            boolean r5 = r0.contains(r3)
            if (r5 == 0) goto L24
            io.ktor.http.content.VersionCheckResult r0 = io.ktor.http.content.VersionCheckResult.OK
            goto L5a
        L24:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L2b
            goto L58
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r0.next()
            io.ktor.http.content.EntityTagVersion r5 = (io.ktor.http.content.EntityTagVersion) r5
            r5.getClass()
            boolean r6 = r7.equals(r3)
            if (r6 != 0) goto L52
            boolean r6 = r5.equals(r3)
            if (r6 == 0) goto L4b
            goto L52
        L4b:
            java.lang.String r5 = r5.c
            boolean r5 = defpackage.yg0.a(r2, r5)
            goto L53
        L52:
            r5 = r1
        L53:
            if (r5 == 0) goto L2f
            io.ktor.http.content.VersionCheckResult r0 = io.ktor.http.content.VersionCheckResult.NOT_MODIFIED
            goto L5a
        L58:
            io.ktor.http.content.VersionCheckResult r0 = io.ktor.http.content.VersionCheckResult.OK
        L5a:
            io.ktor.http.content.VersionCheckResult r5 = io.ktor.http.content.VersionCheckResult.OK
            if (r0 == r5) goto L5f
            return r0
        L5f:
            java.util.List r0 = defpackage.le0.a
            java.lang.String r0 = "If-Match"
            java.lang.String r8 = r8.get(r0)
            if (r8 == 0) goto Lb6
            r4.getClass()
            java.util.ArrayList r8 = io.ktor.http.content.EntityTagVersion.Companion.a(r8)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L79
            io.ktor.http.content.VersionCheckResult r7 = io.ktor.http.content.VersionCheckResult.OK
            goto Lb1
        L79:
            boolean r0 = r8.contains(r3)
            if (r0 == 0) goto L82
            io.ktor.http.content.VersionCheckResult r7 = io.ktor.http.content.VersionCheckResult.OK
            goto Lb1
        L82:
            java.util.Iterator r8 = r8.iterator()
        L86:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r8.next()
            io.ktor.http.content.EntityTagVersion r0 = (io.ktor.http.content.EntityTagVersion) r0
            r0.getClass()
            boolean r4 = r7.equals(r3)
            if (r4 != 0) goto La9
            boolean r4 = r0.equals(r3)
            if (r4 == 0) goto La2
            goto La9
        La2:
            java.lang.String r0 = r0.c
            boolean r0 = defpackage.yg0.a(r2, r0)
            goto Laa
        La9:
            r0 = r1
        Laa:
            if (r0 == 0) goto L86
            io.ktor.http.content.VersionCheckResult r7 = io.ktor.http.content.VersionCheckResult.OK
            goto Lb1
        Laf:
            io.ktor.http.content.VersionCheckResult r7 = io.ktor.http.content.VersionCheckResult.PRECONDITION_FAILED
        Lb1:
            io.ktor.http.content.VersionCheckResult r8 = io.ktor.http.content.VersionCheckResult.OK
            if (r7 == r8) goto Lb6
            return r7
        Lb6:
            io.ktor.http.content.VersionCheckResult r7 = io.ktor.http.content.VersionCheckResult.OK
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.EntityTagVersion.check(io.ktor.http.Headers):io.ktor.http.content.VersionCheckResult");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityTagVersion)) {
            return false;
        }
        EntityTagVersion entityTagVersion = (EntityTagVersion) obj;
        return this.a.equals(entityTagVersion.a) && this.b == entityTagVersion.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "EntityTagVersion(etag=" + this.a + ", weak=" + this.b + ')';
    }
}
