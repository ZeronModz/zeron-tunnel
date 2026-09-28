package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/v2ray/ang/dto/NetworkType;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "TCP", "KCP", "WS", "HTTP_UPGRADE", "XHTTP", "HTTP", "H2", "GRPC", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String type;
    public static final NetworkType TCP = new NetworkType("TCP", 0, "tcp");
    public static final NetworkType KCP = new NetworkType("KCP", 1, "kcp");
    public static final NetworkType WS = new NetworkType("WS", 2, "ws");
    public static final NetworkType HTTP_UPGRADE = new NetworkType("HTTP_UPGRADE", 3, "httpupgrade");
    public static final NetworkType XHTTP = new NetworkType("XHTTP", 4, "xhttp");
    public static final NetworkType HTTP = new NetworkType("HTTP", 5, "http");
    public static final NetworkType H2 = new NetworkType("H2", 6, "h2");
    public static final NetworkType GRPC = new NetworkType("GRPC", 7, "grpc");

    private static final /* synthetic */ NetworkType[] $values() {
        return new NetworkType[]{TCP, KCP, WS, HTTP_UPGRADE, XHTTP, HTTP, H2, GRPC};
    }

    static {
        NetworkType[] networkTypeArr$values = $values();
        $VALUES = networkTypeArr$values;
        $ENTRIES = a.a(networkTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private NetworkType(String str, int i, String str2) {
        this.type = str2;
    }

    public static EnumEntries<NetworkType> getEntries() {
        return $ENTRIES;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/dto/NetworkType$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "fromString", "Lcom/v2ray/ang/dto/NetworkType;", "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(xu xuVar) {
            this();
        }

        public final NetworkType fromString(String type) {
            NetworkType next;
            Iterator<NetworkType> it = NetworkType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (yg0.a(next.getType(), type)) {
                    break;
                }
            }
            NetworkType networkType = next;
            return networkType == null ? NetworkType.TCP : networkType;
        }

        private Companion() {
        }
    }
}
