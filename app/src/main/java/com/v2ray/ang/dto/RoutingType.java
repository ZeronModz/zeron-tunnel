package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/v2ray/ang/dto/RoutingType;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "fileName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "WHITE", "BLACK", "GLOBAL", "WHITE_IRAN", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoutingType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RoutingType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String fileName;
    public static final RoutingType WHITE = new RoutingType("WHITE", 0, "custom_routing_white");
    public static final RoutingType BLACK = new RoutingType("BLACK", 1, "custom_routing_black");
    public static final RoutingType GLOBAL = new RoutingType("GLOBAL", 2, "custom_routing_global");
    public static final RoutingType WHITE_IRAN = new RoutingType("WHITE_IRAN", 3, "custom_routing_white_iran");

    private static final /* synthetic */ RoutingType[] $values() {
        return new RoutingType[]{WHITE, BLACK, GLOBAL, WHITE_IRAN};
    }

    static {
        RoutingType[] routingTypeArr$values = $values();
        $VALUES = routingTypeArr$values;
        $ENTRIES = a.a(routingTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private RoutingType(String str, int i, String str2) {
        this.fileName = str2;
    }

    public static EnumEntries<RoutingType> getEntries() {
        return $ENTRIES;
    }

    public static RoutingType valueOf(String str) {
        return (RoutingType) Enum.valueOf(RoutingType.class, str);
    }

    public static RoutingType[] values() {
        return (RoutingType[]) $VALUES.clone();
    }

    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/dto/RoutingType$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "fromIndex", "Lcom/v2ray/ang/dto/RoutingType;", "index", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(xu xuVar) {
            this();
        }

        public final RoutingType fromIndex(int index) {
            return index != 0 ? index != 1 ? index != 2 ? index != 3 ? RoutingType.WHITE : RoutingType.WHITE_IRAN : RoutingType.GLOBAL : RoutingType.BLACK : RoutingType.WHITE;
        }

        private Companion() {
        }
    }
}
