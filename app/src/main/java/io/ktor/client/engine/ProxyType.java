package io.ktor.client.engine;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/engine/ProxyType;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "SOCKS", "HTTP", "UNKNOWN", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProxyType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProxyType[] $VALUES;
    public static final ProxyType SOCKS = new ProxyType("SOCKS", 0);
    public static final ProxyType HTTP = new ProxyType("HTTP", 1);
    public static final ProxyType UNKNOWN = new ProxyType("UNKNOWN", 2);

    private static final /* synthetic */ ProxyType[] $values() {
        return new ProxyType[]{SOCKS, HTTP, UNKNOWN};
    }

    static {
        ProxyType[] proxyTypeArr$values = $values();
        $VALUES = proxyTypeArr$values;
        $ENTRIES = kotlin.enums.a.a(proxyTypeArr$values);
    }

    private ProxyType(String str, int i) {
    }

    public static EnumEntries<ProxyType> getEntries() {
        return $ENTRIES;
    }

    public static ProxyType valueOf(String str) {
        return (ProxyType) Enum.valueOf(ProxyType.class, str);
    }

    public static ProxyType[] values() {
        return (ProxyType[]) $VALUES.clone();
    }
}
