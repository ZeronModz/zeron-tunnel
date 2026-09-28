package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\u0084\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\fHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001e\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001c¨\u0006@"}, d2 = {"Lcom/v2ray/ang/dto/SubscriptionItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remarks", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "url", "enabled", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "addedTime", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "lastUpdated", "autoUpdate", "updateInterval", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "prevProfile", "nextProfile", "filter", "allowInsecureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZJJZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getRemarks", "()Ljava/lang/String;", "setRemarks", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getEnabled", "()Z", "setEnabled", "(Z)V", "getAddedTime", "()J", "getLastUpdated", "setLastUpdated", "(J)V", "getAutoUpdate", "setAutoUpdate", "getUpdateInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrevProfile", "setPrevProfile", "getNextProfile", "setNextProfile", "getFilter", "setFilter", "getAllowInsecureUrl", "setAllowInsecureUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;ZJJZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/v2ray/ang/dto/SubscriptionItem;", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionItem {
    private final long addedTime;
    private boolean allowInsecureUrl;
    private boolean autoUpdate;
    private boolean enabled;
    private String filter;
    private long lastUpdated;
    private String nextProfile;
    private String prevProfile;
    private String remarks;
    private final Integer updateInterval;
    private String url;

    public /* synthetic */ SubscriptionItem(String str, String str2, boolean z, long j, long j2, boolean z2, Integer num, String str3, String str4, String str5, boolean z3, int i, xu xuVar) {
        this((i & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i & 2) == 0 ? str2 : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (i & 4) != 0 ? true : z, (i & 8) != 0 ? System.currentTimeMillis() : j, (i & 16) != 0 ? -1L : j2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) == 0 ? str5 : null, (i & 1024) != 0 ? false : z3);
    }

    public static /* synthetic */ SubscriptionItem copy$default(SubscriptionItem subscriptionItem, String str, String str2, boolean z, long j, long j2, boolean z2, Integer num, String str3, String str4, String str5, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionItem.remarks;
        }
        return subscriptionItem.copy(str, (i & 2) != 0 ? subscriptionItem.url : str2, (i & 4) != 0 ? subscriptionItem.enabled : z, (i & 8) != 0 ? subscriptionItem.addedTime : j, (i & 16) != 0 ? subscriptionItem.lastUpdated : j2, (i & 32) != 0 ? subscriptionItem.autoUpdate : z2, (i & 64) != 0 ? subscriptionItem.updateInterval : num, (i & 128) != 0 ? subscriptionItem.prevProfile : str3, (i & 256) != 0 ? subscriptionItem.nextProfile : str4, (i & 512) != 0 ? subscriptionItem.filter : str5, (i & 1024) != 0 ? subscriptionItem.allowInsecureUrl : z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFilter() {
        return this.filter;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getAllowInsecureUrl() {
        return this.allowInsecureUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAddedTime() {
        return this.addedTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getUpdateInterval() {
        return this.updateInterval;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrevProfile() {
        return this.prevProfile;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNextProfile() {
        return this.nextProfile;
    }

    public final SubscriptionItem copy(String remarks, String url, boolean enabled, long addedTime, long lastUpdated, boolean autoUpdate, Integer updateInterval, String prevProfile, String nextProfile, String filter, boolean allowInsecureUrl) {
        remarks.getClass();
        url.getClass();
        return new SubscriptionItem(remarks, url, enabled, addedTime, lastUpdated, autoUpdate, updateInterval, prevProfile, nextProfile, filter, allowInsecureUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionItem)) {
            return false;
        }
        SubscriptionItem subscriptionItem = (SubscriptionItem) other;
        return yg0.a(this.remarks, subscriptionItem.remarks) && yg0.a(this.url, subscriptionItem.url) && this.enabled == subscriptionItem.enabled && this.addedTime == subscriptionItem.addedTime && this.lastUpdated == subscriptionItem.lastUpdated && this.autoUpdate == subscriptionItem.autoUpdate && yg0.a(this.updateInterval, subscriptionItem.updateInterval) && yg0.a(this.prevProfile, subscriptionItem.prevProfile) && yg0.a(this.nextProfile, subscriptionItem.nextProfile) && yg0.a(this.filter, subscriptionItem.filter) && this.allowInsecureUrl == subscriptionItem.allowInsecureUrl;
    }

    public final long getAddedTime() {
        return this.addedTime;
    }

    public final boolean getAllowInsecureUrl() {
        return this.allowInsecureUrl;
    }

    public final boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFilter() {
        return this.filter;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final String getNextProfile() {
        return this.nextProfile;
    }

    public final String getPrevProfile() {
        return this.prevProfile;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final Integer getUpdateInterval() {
        return this.updateInterval;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = vh.c(this.remarks.hashCode() * 31, 31, this.url);
        int i = this.enabled ? 1231 : 1237;
        long j = this.addedTime;
        int i2 = (((iC + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.lastUpdated;
        int i3 = (((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.autoUpdate ? 1231 : 1237)) * 31;
        Integer num = this.updateInterval;
        int iHashCode = (i3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.prevProfile;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextProfile;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filter;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.allowInsecureUrl ? 1231 : 1237);
    }

    public final void setAllowInsecureUrl(boolean z) {
        this.allowInsecureUrl = z;
    }

    public final void setAutoUpdate(boolean z) {
        this.autoUpdate = z;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setFilter(String str) {
        this.filter = str;
    }

    public final void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public final void setNextProfile(String str) {
        this.nextProfile = str;
    }

    public final void setPrevProfile(String str) {
        this.prevProfile = str;
    }

    public final void setRemarks(String str) {
        str.getClass();
        this.remarks = str;
    }

    public final void setUrl(String str) {
        str.getClass();
        this.url = str;
    }

    public String toString() {
        String str = this.remarks;
        String str2 = this.url;
        boolean z = this.enabled;
        long j = this.addedTime;
        long j2 = this.lastUpdated;
        boolean z2 = this.autoUpdate;
        Integer num = this.updateInterval;
        String str3 = this.prevProfile;
        String str4 = this.nextProfile;
        String str5 = this.filter;
        boolean z3 = this.allowInsecureUrl;
        StringBuilder sbA = hz.A("SubscriptionItem(remarks=", str, ", url=", str2, ", enabled=");
        sbA.append(z);
        sbA.append(", addedTime=");
        sbA.append(j);
        hz.G(sbA, ", lastUpdated=", j2, ", autoUpdate=");
        sbA.append(z2);
        sbA.append(", updateInterval=");
        sbA.append(num);
        sbA.append(", prevProfile=");
        hz.H(sbA, str3, ", nextProfile=", str4, ", filter=");
        sbA.append(str5);
        sbA.append(", allowInsecureUrl=");
        sbA.append(z3);
        sbA.append(")");
        return sbA.toString();
    }

    public SubscriptionItem(String str, String str2, boolean z, long j, long j2, boolean z2, Integer num, String str3, String str4, String str5, boolean z3) {
        str.getClass();
        str2.getClass();
        this.remarks = str;
        this.url = str2;
        this.enabled = z;
        this.addedTime = j;
        this.lastUpdated = j2;
        this.autoUpdate = z2;
        this.updateInterval = num;
        this.prevProfile = str3;
        this.nextProfile = str4;
        this.filter = str5;
        this.allowInsecureUrl = z3;
    }

    public SubscriptionItem() {
        this(null, null, false, 0L, 0L, false, null, null, null, null, false, 2047, null);
    }
}
