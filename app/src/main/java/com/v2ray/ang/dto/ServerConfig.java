package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.V2rayConfig;
import defpackage.p60;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010#\u001a\u0004\u0018\u00010\fJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003JS\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/v2ray/ang/dto/ServerConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "configVersion", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "configType", "Lcom/v2ray/ang/dto/EConfigType;", "subscriptionId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "addedTime", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remarks", "outboundBean", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean;", "fullConfig", "Lcom/v2ray/ang/dto/V2rayConfig;", "<init>", "(ILcom/v2ray/ang/dto/EConfigType;Ljava/lang/String;JLjava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean;Lcom/v2ray/ang/dto/V2rayConfig;)V", "getConfigVersion", "()I", "getConfigType", "()Lcom/v2ray/ang/dto/EConfigType;", "getSubscriptionId", "()Ljava/lang/String;", "setSubscriptionId", "(Ljava/lang/String;)V", "getAddedTime", "()J", "getRemarks", "setRemarks", "getOutboundBean", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean;", "getFullConfig", "()Lcom/v2ray/ang/dto/V2rayConfig;", "setFullConfig", "(Lcom/v2ray/ang/dto/V2rayConfig;)V", "getProxyOutbound", "getAllOutboundTags", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServerConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long addedTime;
    private final EConfigType configType;
    private final int configVersion;
    private V2rayConfig fullConfig;
    private final V2rayConfig.OutboundBean outboundBean;
    private String remarks;
    private String subscriptionId;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ServerConfig(int i, EConfigType eConfigType, String str, long j, String str2, V2rayConfig.OutboundBean outboundBean, V2rayConfig v2rayConfig, int i2, xu xuVar) {
        V2rayConfig v2rayConfig2;
        V2rayConfig.OutboundBean outboundBean2;
        String str3;
        i = (i2 & 1) != 0 ? 3 : i;
        str = (i2 & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        j = (i2 & 8) != 0 ? System.currentTimeMillis() : j;
        str2 = (i2 & 16) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
        outboundBean = (i2 & 32) != 0 ? null : outboundBean;
        if ((i2 & 64) != 0) {
            v2rayConfig2 = null;
            str3 = str2;
            outboundBean2 = outboundBean;
        } else {
            v2rayConfig2 = v2rayConfig;
            outboundBean2 = outboundBean;
            str3 = str2;
        }
        this(i, eConfigType, str, j, str3, outboundBean2, v2rayConfig2);
    }

    public static /* synthetic */ ServerConfig copy$default(ServerConfig serverConfig, int i, EConfigType eConfigType, String str, long j, String str2, V2rayConfig.OutboundBean outboundBean, V2rayConfig v2rayConfig, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serverConfig.configVersion;
        }
        if ((i2 & 2) != 0) {
            eConfigType = serverConfig.configType;
        }
        if ((i2 & 4) != 0) {
            str = serverConfig.subscriptionId;
        }
        if ((i2 & 8) != 0) {
            j = serverConfig.addedTime;
        }
        if ((i2 & 16) != 0) {
            str2 = serverConfig.remarks;
        }
        if ((i2 & 32) != 0) {
            outboundBean = serverConfig.outboundBean;
        }
        if ((i2 & 64) != 0) {
            v2rayConfig = serverConfig.fullConfig;
        }
        V2rayConfig v2rayConfig2 = v2rayConfig;
        String str3 = str2;
        long j2 = j;
        String str4 = str;
        return serverConfig.copy(i, eConfigType, str4, j2, str3, outboundBean, v2rayConfig2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConfigVersion() {
        return this.configVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EConfigType getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAddedTime() {
        return this.addedTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final V2rayConfig.OutboundBean getOutboundBean() {
        return this.outboundBean;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final V2rayConfig getFullConfig() {
        return this.fullConfig;
    }

    public final ServerConfig copy(int configVersion, EConfigType configType, String subscriptionId, long addedTime, String remarks, V2rayConfig.OutboundBean outboundBean, V2rayConfig fullConfig) {
        configType.getClass();
        subscriptionId.getClass();
        remarks.getClass();
        return new ServerConfig(configVersion, configType, subscriptionId, addedTime, remarks, outboundBean, fullConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerConfig)) {
            return false;
        }
        ServerConfig serverConfig = (ServerConfig) other;
        return this.configVersion == serverConfig.configVersion && this.configType == serverConfig.configType && yg0.a(this.subscriptionId, serverConfig.subscriptionId) && this.addedTime == serverConfig.addedTime && yg0.a(this.remarks, serverConfig.remarks) && yg0.a(this.outboundBean, serverConfig.outboundBean) && yg0.a(this.fullConfig, serverConfig.fullConfig);
    }

    public final long getAddedTime() {
        return this.addedTime;
    }

    public final List<String> getAllOutboundTags() {
        if (this.configType != EConfigType.CUSTOM) {
            return c.B("proxy", "direct", "block");
        }
        V2rayConfig v2rayConfig = this.fullConfig;
        if (v2rayConfig == null) {
            return new ArrayList();
        }
        ArrayList<V2rayConfig.OutboundBean> outbounds = v2rayConfig.getOutbounds();
        ArrayList arrayList = new ArrayList(c.l(outbounds, 10));
        Iterator<T> it = outbounds.iterator();
        while (it.hasNext()) {
            arrayList.add(((V2rayConfig.OutboundBean) it.next()).getTag());
        }
        return new ArrayList(arrayList);
    }

    public final EConfigType getConfigType() {
        return this.configType;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    public final V2rayConfig getFullConfig() {
        return this.fullConfig;
    }

    public final V2rayConfig.OutboundBean getOutboundBean() {
        return this.outboundBean;
    }

    public final V2rayConfig.OutboundBean getProxyOutbound() {
        if (this.configType != EConfigType.CUSTOM) {
            return this.outboundBean;
        }
        V2rayConfig v2rayConfig = this.fullConfig;
        if (v2rayConfig != null) {
            return v2rayConfig.getProxyOutbound();
        }
        return null;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public int hashCode() {
        int iC = vh.c((this.configType.hashCode() + (this.configVersion * 31)) * 31, 31, this.subscriptionId);
        long j = this.addedTime;
        int iC2 = vh.c((iC + ((int) (j ^ (j >>> 32)))) * 31, 31, this.remarks);
        V2rayConfig.OutboundBean outboundBean = this.outboundBean;
        int iHashCode = (iC2 + (outboundBean == null ? 0 : outboundBean.hashCode())) * 31;
        V2rayConfig v2rayConfig = this.fullConfig;
        return iHashCode + (v2rayConfig != null ? v2rayConfig.hashCode() : 0);
    }

    public final void setFullConfig(V2rayConfig v2rayConfig) {
        this.fullConfig = v2rayConfig;
    }

    public final void setRemarks(String str) {
        str.getClass();
        this.remarks = str;
    }

    public final void setSubscriptionId(String str) {
        str.getClass();
        this.subscriptionId = str;
    }

    public String toString() {
        return "ServerConfig(configVersion=" + this.configVersion + ", configType=" + this.configType + ", subscriptionId=" + this.subscriptionId + ", addedTime=" + this.addedTime + ", remarks=" + this.remarks + ", outboundBean=" + this.outboundBean + ", fullConfig=" + this.fullConfig + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/dto/ServerConfig$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "create", "Lcom/v2ray/ang/dto/ServerConfig;", "configType", "Lcom/v2ray/ang/dto/EConfigType;", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EConfigType.values().length];
                try {
                    iArr[EConfigType.VMESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EConfigType.VLESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EConfigType.CUSTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EConfigType.SHADOWSOCKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EConfigType.SOCKS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EConfigType.HTTP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EConfigType.TROJAN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EConfigType.HYSTERIA2.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EConfigType.WIREGUARD.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(xu xuVar) {
            this();
        }

        public final ServerConfig create(EConfigType configType) {
            configType.getClass();
            switch (WhenMappings.$EnumSwitchMapping$0[configType.ordinal()]) {
                case 1:
                case 2:
                    String lowerCase = configType.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String str = null;
                    List listZ = c.z(new V2rayConfig.OutboundBean.OutSettingsBean.VnextBean(null, 0, c.z(new V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean(null, null, null, 0, null, null, 63, null)), 3, null));
                    V2rayConfig v2rayConfig = null;
                    V2rayConfig.OutboundBean outboundBean = new V2rayConfig.OutboundBean(null, lowerCase, new V2rayConfig.OutboundBean.OutSettingsBean(listZ, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070, null), new V2rayConfig.OutboundBean.StreamSettingsBean(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null), null, null, null, 113, null);
                    return new ServerConfig(0, configType, null, 0L, str, outboundBean, v2rayConfig, 93, null);
                case 3:
                    return new ServerConfig(0, configType, null, 0L, null, null, null, 125, null);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    String lowerCase2 = configType.name().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    V2rayConfig v2rayConfig2 = null;
                    V2rayConfig.OutboundBean outboundBean2 = new V2rayConfig.OutboundBean(null, lowerCase2, new V2rayConfig.OutboundBean.OutSettingsBean(null, null, null, c.z(new V2rayConfig.OutboundBean.OutSettingsBean.ServersBean(null, null, false, null, 0, 0, null, null, null, null, 1023, null)), null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null), new V2rayConfig.OutboundBean.StreamSettingsBean(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null), null, null, null, 113, null);
                    return new ServerConfig(0, configType, null, 0L, null, outboundBean2, v2rayConfig2, 93, null);
                case 9:
                    String lowerCase3 = configType.name().toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    String str2 = null;
                    V2rayConfig v2rayConfig3 = null;
                    V2rayConfig.OutboundBean outboundBean3 = new V2rayConfig.OutboundBean(null, lowerCase3, new V2rayConfig.OutboundBean.OutSettingsBean(null, null, null, null, null, null, null, null, null, null, null, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, c.z(new V2rayConfig.OutboundBean.OutSettingsBean.WireGuardBean(null, null, null, 7, null)), null, null, null, 118783, null), null, null, null, null, 121, null);
                    return new ServerConfig(0, configType, null, 0L, str2, outboundBean3, v2rayConfig3, 93, null);
                default:
                    p60.b();
                    return null;
            }
        }

        private Companion() {
        }
    }

    public ServerConfig(int i, EConfigType eConfigType, String str, long j, String str2, V2rayConfig.OutboundBean outboundBean, V2rayConfig v2rayConfig) {
        eConfigType.getClass();
        str.getClass();
        str2.getClass();
        this.configVersion = i;
        this.configType = eConfigType;
        this.subscriptionId = str;
        this.addedTime = j;
        this.remarks = str2;
        this.outboundBean = outboundBean;
        this.fullConfig = v2rayConfig;
    }
}
