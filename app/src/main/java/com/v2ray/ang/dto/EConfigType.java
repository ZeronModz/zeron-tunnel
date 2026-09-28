package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/v2ray/ang/dto/EConfigType;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "protocolScheme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getProtocolScheme", "()Ljava/lang/String;", "VMESS", "CUSTOM", "SHADOWSOCKS", "SOCKS", "VLESS", "TROJAN", "WIREGUARD", "HYSTERIA2", "HTTP", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EConfigType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EConfigType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String protocolScheme;
    private final int value;
    public static final EConfigType VMESS = new EConfigType("VMESS", 0, 1, "vmess://");
    public static final EConfigType CUSTOM = new EConfigType("CUSTOM", 1, 2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final EConfigType SHADOWSOCKS = new EConfigType("SHADOWSOCKS", 2, 3, "ss://");
    public static final EConfigType SOCKS = new EConfigType("SOCKS", 3, 4, "socks://");
    public static final EConfigType VLESS = new EConfigType("VLESS", 4, 5, "vless://");
    public static final EConfigType TROJAN = new EConfigType("TROJAN", 5, 6, "trojan://");
    public static final EConfigType WIREGUARD = new EConfigType("WIREGUARD", 6, 7, "wireguard://");
    public static final EConfigType HYSTERIA2 = new EConfigType("HYSTERIA2", 7, 9, "hysteria2://");
    public static final EConfigType HTTP = new EConfigType("HTTP", 8, 10, "http://");

    private static final /* synthetic */ EConfigType[] $values() {
        return new EConfigType[]{VMESS, CUSTOM, SHADOWSOCKS, SOCKS, VLESS, TROJAN, WIREGUARD, HYSTERIA2, HTTP};
    }

    static {
        EConfigType[] eConfigTypeArr$values = $values();
        $VALUES = eConfigTypeArr$values;
        $ENTRIES = a.a(eConfigTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private EConfigType(String str, int i, int i2, String str2) {
        this.value = i2;
        this.protocolScheme = str2;
    }

    public static EnumEntries<EConfigType> getEntries() {
        return $ENTRIES;
    }

    public static EConfigType valueOf(String str) {
        return (EConfigType) Enum.valueOf(EConfigType.class, str);
    }

    public static EConfigType[] values() {
        return (EConfigType[]) $VALUES.clone();
    }

    public final String getProtocolScheme() {
        return this.protocolScheme;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/dto/EConfigType$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "fromInt", "Lcom/v2ray/ang/dto/EConfigType;", "value", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(xu xuVar) {
            this();
        }

        public final EConfigType fromInt(int value) {
            EConfigType next;
            Iterator<EConfigType> it = EConfigType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == value) {
                    break;
                }
            }
            return next;
        }

        private Companion() {
        }
    }
}
