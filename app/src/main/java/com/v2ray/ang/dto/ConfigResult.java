package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/v2ray/ang/dto/ConfigResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "status", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "guid", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "content", "socksPort", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getStatus", "()Z", "setStatus", "(Z)V", "getGuid", "()Ljava/lang/String;", "setGuid", "(Ljava/lang/String;)V", "getContent", "setContent", "getSocksPort", "()Ljava/lang/Integer;", "setSocksPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/v2ray/ang/dto/ConfigResult;", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfigResult {
    private String content;
    private String guid;
    private Integer socksPort;
    private boolean status;

    public /* synthetic */ ConfigResult(boolean z, String str, String str2, Integer num, int i, xu xuVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2, (i & 8) != 0 ? null : num);
    }

    public static /* synthetic */ ConfigResult copy$default(ConfigResult configResult, boolean z, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = configResult.status;
        }
        if ((i & 2) != 0) {
            str = configResult.guid;
        }
        if ((i & 4) != 0) {
            str2 = configResult.content;
        }
        if ((i & 8) != 0) {
            num = configResult.socksPort;
        }
        return configResult.copy(z, str, str2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSocksPort() {
        return this.socksPort;
    }

    public final ConfigResult copy(boolean status, String guid, String content, Integer socksPort) {
        content.getClass();
        return new ConfigResult(status, guid, content, socksPort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigResult)) {
            return false;
        }
        ConfigResult configResult = (ConfigResult) other;
        return this.status == configResult.status && yg0.a(this.guid, configResult.guid) && yg0.a(this.content, configResult.content) && yg0.a(this.socksPort, configResult.socksPort);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final Integer getSocksPort() {
        return this.socksPort;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i = (this.status ? 1231 : 1237) * 31;
        String str = this.guid;
        int iC = vh.c((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.content);
        Integer num = this.socksPort;
        return iC + (num != null ? num.hashCode() : 0);
    }

    public final void setContent(String str) {
        str.getClass();
        this.content = str;
    }

    public final void setGuid(String str) {
        this.guid = str;
    }

    public final void setSocksPort(Integer num) {
        this.socksPort = num;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    public String toString() {
        return "ConfigResult(status=" + this.status + ", guid=" + this.guid + ", content=" + this.content + ", socksPort=" + this.socksPort + ")";
    }

    public ConfigResult(boolean z, String str, String str2, Integer num) {
        str2.getClass();
        this.status = z;
        this.guid = str;
        this.content = str2;
        this.socksPort = num;
    }
}
