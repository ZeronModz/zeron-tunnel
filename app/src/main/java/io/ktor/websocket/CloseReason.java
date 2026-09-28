package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.utils.io.InternalAPI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lio/ktor/websocket/CloseReason;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "code", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "message", "<init>", "(SLjava/lang/String;)V", "Lio/ktor/websocket/CloseReason$Codes;", "(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V", "Codes", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloseReason {
    public final short a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "code", "<init>", "(Ljava/lang/String;IS)V", "S", "getCode", "()S", "Companion", "NORMAL", "GOING_AWAY", "PROTOCOL_ERROR", "CANNOT_ACCEPT", "CLOSED_ABNORMALLY", "NOT_CONSISTENT", "VIOLATED_POLICY", "TOO_BIG", "NO_EXTENSION", "INTERNAL_ERROR", "SERVICE_RESTART", "TRY_AGAIN_LATER", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Codes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Codes[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Codes UNEXPECTED_CONDITION;
        private static final Map<Short, Codes> byCodeMap;
        private final short code;
        public static final Codes NORMAL = new Codes("NORMAL", 0, 1000);
        public static final Codes GOING_AWAY = new Codes("GOING_AWAY", 1, 1001);
        public static final Codes PROTOCOL_ERROR = new Codes("PROTOCOL_ERROR", 2, 1002);
        public static final Codes CANNOT_ACCEPT = new Codes("CANNOT_ACCEPT", 3, 1003);

        @InternalAPI
        @Deprecated(message = "This code MUST NOT be set as a status code in a Close control frame by an endpoint")
        public static final Codes CLOSED_ABNORMALLY = new Codes("CLOSED_ABNORMALLY", 4, 1006);
        public static final Codes NOT_CONSISTENT = new Codes("NOT_CONSISTENT", 5, 1007);
        public static final Codes VIOLATED_POLICY = new Codes("VIOLATED_POLICY", 6, 1008);
        public static final Codes TOO_BIG = new Codes("TOO_BIG", 7, 1009);
        public static final Codes NO_EXTENSION = new Codes("NO_EXTENSION", 8, 1010);
        public static final Codes INTERNAL_ERROR = new Codes("INTERNAL_ERROR", 9, 1011);
        public static final Codes SERVICE_RESTART = new Codes("SERVICE_RESTART", 10, 1012);
        public static final Codes TRY_AGAIN_LATER = new Codes("TRY_AGAIN_LATER", 11, 1013);

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/websocket/CloseReason$Codes;", "byCodeMap", "Ljava/util/Map;", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public Companion(xu xuVar) {
            }
        }

        private static final /* synthetic */ Codes[] $values() {
            return new Codes[]{NORMAL, GOING_AWAY, PROTOCOL_ERROR, CANNOT_ACCEPT, CLOSED_ABNORMALLY, NOT_CONSISTENT, VIOLATED_POLICY, TOO_BIG, NO_EXTENSION, INTERNAL_ERROR, SERVICE_RESTART, TRY_AGAIN_LATER};
        }

        static {
            Codes[] codesArr$values = $values();
            $VALUES = codesArr$values;
            $ENTRIES = kotlin.enums.a.a(codesArr$values);
            INSTANCE = new Companion(null);
            EnumEntries<Codes> entries = getEntries();
            int iC = kotlin.collections.d.c(kotlin.collections.c.l(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iC < 16 ? 16 : iC);
            for (Codes codes : entries) {
                linkedHashMap.put(Short.valueOf(codes.code), codes);
            }
            byCodeMap = linkedHashMap;
            UNEXPECTED_CONDITION = INTERNAL_ERROR;
        }

        private Codes(String str, int i, short s) {
            this.code = s;
        }

        public static EnumEntries<Codes> getEntries() {
            return $ENTRIES;
        }

        public static Codes valueOf(String str) {
            return (Codes) Enum.valueOf(Codes.class, str);
        }

        public static Codes[] values() {
            return (Codes[]) $VALUES.clone();
        }

        public final short getCode() {
            return this.code;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseReason(Codes codes, String str) {
        this(codes.getCode(), str);
        codes.getClass();
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseReason)) {
            return false;
        }
        CloseReason closeReason = (CloseReason) obj;
        return this.a == closeReason.a && yg0.a(this.b, closeReason.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        Codes.INSTANCE.getClass();
        Map map = Codes.byCodeMap;
        short s = this.a;
        Object objValueOf = (Codes) map.get(Short.valueOf(s));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s);
        }
        sb.append(objValueOf);
        sb.append(", message=");
        return vh.q(sb, this.b, ')');
    }

    public CloseReason(short s, String str) {
        str.getClass();
        this.a = s;
        this.b = str;
    }
}
