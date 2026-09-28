package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/v2ray/ang/dto/AssetUrlItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remarks", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "url", "addedTime", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "lastUpdated", "locked", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;)V", "getRemarks", "()Ljava/lang/String;", "setRemarks", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getAddedTime", "()J", "getLastUpdated", "setLastUpdated", "(J)V", "getLocked", "()Ljava/lang/Boolean;", "setLocked", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Boolean;)Lcom/v2ray/ang/dto/AssetUrlItem;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetUrlItem {
    private final long addedTime;
    private long lastUpdated;
    private Boolean locked;
    private String remarks;
    private String url;

    public /* synthetic */ AssetUrlItem(String str, String str2, long j, long j2, Boolean bool, int i, xu xuVar) {
        this((i & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i & 2) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2, (i & 4) != 0 ? System.currentTimeMillis() : j, (i & 8) != 0 ? -1L : j2, (i & 16) != 0 ? Boolean.FALSE : bool);
    }

    public static /* synthetic */ AssetUrlItem copy$default(AssetUrlItem assetUrlItem, String str, String str2, long j, long j2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetUrlItem.remarks;
        }
        if ((i & 2) != 0) {
            str2 = assetUrlItem.url;
        }
        if ((i & 4) != 0) {
            j = assetUrlItem.addedTime;
        }
        if ((i & 8) != 0) {
            j2 = assetUrlItem.lastUpdated;
        }
        if ((i & 16) != 0) {
            bool = assetUrlItem.locked;
        }
        Boolean bool2 = bool;
        long j3 = j2;
        return assetUrlItem.copy(str, str2, j, j3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAddedTime() {
        return this.addedTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getLocked() {
        return this.locked;
    }

    public final AssetUrlItem copy(String remarks, String url, long addedTime, long lastUpdated, Boolean locked) {
        remarks.getClass();
        url.getClass();
        return new AssetUrlItem(remarks, url, addedTime, lastUpdated, locked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetUrlItem)) {
            return false;
        }
        AssetUrlItem assetUrlItem = (AssetUrlItem) other;
        return yg0.a(this.remarks, assetUrlItem.remarks) && yg0.a(this.url, assetUrlItem.url) && this.addedTime == assetUrlItem.addedTime && this.lastUpdated == assetUrlItem.lastUpdated && yg0.a(this.locked, assetUrlItem.locked);
    }

    public final long getAddedTime() {
        return this.addedTime;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final Boolean getLocked() {
        return this.locked;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = vh.c(this.remarks.hashCode() * 31, 31, this.url);
        long j = this.addedTime;
        int i = (iC + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.lastUpdated;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Boolean bool = this.locked;
        return i2 + (bool == null ? 0 : bool.hashCode());
    }

    public final void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public final void setLocked(Boolean bool) {
        this.locked = bool;
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
        long j = this.addedTime;
        long j2 = this.lastUpdated;
        Boolean bool = this.locked;
        StringBuilder sbA = hz.A("AssetUrlItem(remarks=", str, ", url=", str2, ", addedTime=");
        sbA.append(j);
        hz.G(sbA, ", lastUpdated=", j2, ", locked=");
        sbA.append(bool);
        sbA.append(")");
        return sbA.toString();
    }

    public AssetUrlItem(String str, String str2, long j, long j2, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.remarks = str;
        this.url = str2;
        this.addedTime = j;
        this.lastUpdated = j2;
        this.locked = bool;
    }

    public AssetUrlItem() {
        this(null, null, 0L, 0L, null, 31, null);
    }
}
