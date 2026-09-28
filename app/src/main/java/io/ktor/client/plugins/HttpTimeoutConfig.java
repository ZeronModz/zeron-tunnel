package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.u7;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB-\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/ktor/client/plugins/HttpTimeoutConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Companion", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpTimeoutConfig {
    public Long a;
    public Long b;
    public Long c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/HttpTimeoutConfig$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "INFINITE_TIMEOUT_MS", "J", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        TypeReference typeReferenceB = null;
        new Companion(null);
        ClassReference classReferenceA = Reflection.a(HttpTimeoutConfig.class);
        try {
            typeReferenceB = Reflection.b(HttpTimeoutConfig.class);
        } catch (Throwable unused) {
        }
        new AttributeKey("TimeoutConfiguration", new TypeInfo(classReferenceA, typeReferenceB));
    }

    public HttpTimeoutConfig(Long l, Long l2, Long l3) {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        a(l);
        this.a = l;
        a(l2);
        this.b = l2;
        a(l3);
        this.c = l3;
    }

    public static void a(Long l) {
        if (l == null || l.longValue() > 0) {
            return;
        }
        u7.r("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HttpTimeoutConfig.class != obj.getClass()) {
            return false;
        }
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) obj;
        return yg0.a(this.a, httpTimeoutConfig.a) && yg0.a(this.b, httpTimeoutConfig.b) && yg0.a(this.c, httpTimeoutConfig.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public /* synthetic */ HttpTimeoutConfig(Long l, Long l2, Long l3, int i, xu xuVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3);
    }
}
