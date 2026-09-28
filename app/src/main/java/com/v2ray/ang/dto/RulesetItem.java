package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010'J\u0088\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006;"}, d2 = {"Lcom/v2ray/ang/dto/RulesetItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remarks", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ip", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "domain", "outboundTag", "port", "network", "protocol", "enabled", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "locked", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;)V", "getRemarks", "()Ljava/lang/String;", "setRemarks", "(Ljava/lang/String;)V", "getIp", "()Ljava/util/List;", "setIp", "(Ljava/util/List;)V", "getDomain", "setDomain", "getOutboundTag", "setOutboundTag", "getPort", "setPort", "getNetwork", "setNetwork", "getProtocol", "setProtocol", "getEnabled", "()Z", "setEnabled", "(Z)V", "getLocked", "()Ljava/lang/Boolean;", "setLocked", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;)Lcom/v2ray/ang/dto/RulesetItem;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RulesetItem {
    private List<String> domain;
    private boolean enabled;
    private List<String> ip;
    private Boolean locked;
    private String network;
    private String outboundTag;
    private String port;
    private List<String> protocol;
    private String remarks;

    public /* synthetic */ RulesetItem(String str, List list, List list2, String str2, String str3, String str4, List list3, boolean z, Boolean bool, int i, xu xuVar) {
        this((i & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? true : z, (i & 256) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RulesetItem copy$default(RulesetItem rulesetItem, String str, List list, List list2, String str2, String str3, String str4, List list3, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rulesetItem.remarks;
        }
        if ((i & 2) != 0) {
            list = rulesetItem.ip;
        }
        if ((i & 4) != 0) {
            list2 = rulesetItem.domain;
        }
        if ((i & 8) != 0) {
            str2 = rulesetItem.outboundTag;
        }
        if ((i & 16) != 0) {
            str3 = rulesetItem.port;
        }
        if ((i & 32) != 0) {
            str4 = rulesetItem.network;
        }
        if ((i & 64) != 0) {
            list3 = rulesetItem.protocol;
        }
        if ((i & 128) != 0) {
            z = rulesetItem.enabled;
        }
        if ((i & 256) != 0) {
            bool = rulesetItem.locked;
        }
        boolean z2 = z;
        Boolean bool2 = bool;
        String str5 = str4;
        List list4 = list3;
        String str6 = str3;
        List list5 = list2;
        return rulesetItem.copy(str, list, list5, str2, str6, str5, list4, z2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    public final List<String> component2() {
        return this.ip;
    }

    public final List<String> component3() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOutboundTag() {
        return this.outboundTag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    public final List<String> component7() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getLocked() {
        return this.locked;
    }

    public final RulesetItem copy(String remarks, List<String> ip, List<String> domain, String outboundTag, String port, String network, List<String> protocol, boolean enabled, Boolean locked) {
        outboundTag.getClass();
        return new RulesetItem(remarks, ip, domain, outboundTag, port, network, protocol, enabled, locked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RulesetItem)) {
            return false;
        }
        RulesetItem rulesetItem = (RulesetItem) other;
        return yg0.a(this.remarks, rulesetItem.remarks) && yg0.a(this.ip, rulesetItem.ip) && yg0.a(this.domain, rulesetItem.domain) && yg0.a(this.outboundTag, rulesetItem.outboundTag) && yg0.a(this.port, rulesetItem.port) && yg0.a(this.network, rulesetItem.network) && yg0.a(this.protocol, rulesetItem.protocol) && this.enabled == rulesetItem.enabled && yg0.a(this.locked, rulesetItem.locked);
    }

    public final List<String> getDomain() {
        return this.domain;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> getIp() {
        return this.ip;
    }

    public final Boolean getLocked() {
        return this.locked;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getOutboundTag() {
        return this.outboundTag;
    }

    public final String getPort() {
        return this.port;
    }

    public final List<String> getProtocol() {
        return this.protocol;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public int hashCode() {
        String str = this.remarks;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.ip;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.domain;
        int iC = vh.c((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.outboundTag);
        String str2 = this.port;
        int iHashCode3 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.network;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list3 = this.protocol;
        int iHashCode5 = (((iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31) + (this.enabled ? 1231 : 1237)) * 31;
        Boolean bool = this.locked;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setDomain(List<String> list) {
        this.domain = list;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setIp(List<String> list) {
        this.ip = list;
    }

    public final void setLocked(Boolean bool) {
        this.locked = bool;
    }

    public final void setNetwork(String str) {
        this.network = str;
    }

    public final void setOutboundTag(String str) {
        str.getClass();
        this.outboundTag = str;
    }

    public final void setPort(String str) {
        this.port = str;
    }

    public final void setProtocol(List<String> list) {
        this.protocol = list;
    }

    public final void setRemarks(String str) {
        this.remarks = str;
    }

    public String toString() {
        String str = this.remarks;
        List<String> list = this.ip;
        List<String> list2 = this.domain;
        String str2 = this.outboundTag;
        String str3 = this.port;
        String str4 = this.network;
        List<String> list3 = this.protocol;
        boolean z = this.enabled;
        Boolean bool = this.locked;
        StringBuilder sb = new StringBuilder("RulesetItem(remarks=");
        sb.append(str);
        sb.append(", ip=");
        sb.append(list);
        sb.append(", domain=");
        sb.append(list2);
        sb.append(", outboundTag=");
        sb.append(str2);
        sb.append(", port=");
        hz.H(sb, str3, ", network=", str4, ", protocol=");
        sb.append(list3);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", locked=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public RulesetItem(String str, List<String> list, List<String> list2, String str2, String str3, String str4, List<String> list3, boolean z, Boolean bool) {
        str2.getClass();
        this.remarks = str;
        this.ip = list;
        this.domain = list2;
        this.outboundTag = str2;
        this.port = str3;
        this.network = str4;
        this.protocol = list3;
        this.enabled = z;
        this.locked = bool;
    }

    public RulesetItem() {
        this(null, null, null, null, null, null, null, false, null, 511, null);
    }
}
