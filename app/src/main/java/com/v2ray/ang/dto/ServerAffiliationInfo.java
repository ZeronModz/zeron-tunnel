package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/v2ray/ang/dto/ServerAffiliationInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "testDelayMillis", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(J)V", "getTestDelayMillis", "()J", "setTestDelayMillis", "getTestDelayString", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "component1", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServerAffiliationInfo {
    private long testDelayMillis;

    public /* synthetic */ ServerAffiliationInfo(long j, int i, xu xuVar) {
        this((i & 1) != 0 ? 0L : j);
    }

    public static /* synthetic */ ServerAffiliationInfo copy$default(ServerAffiliationInfo serverAffiliationInfo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = serverAffiliationInfo.testDelayMillis;
        }
        return serverAffiliationInfo.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTestDelayMillis() {
        return this.testDelayMillis;
    }

    public final ServerAffiliationInfo copy(long testDelayMillis) {
        return new ServerAffiliationInfo(testDelayMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ServerAffiliationInfo) && this.testDelayMillis == ((ServerAffiliationInfo) other).testDelayMillis;
    }

    public final long getTestDelayMillis() {
        return this.testDelayMillis;
    }

    public final String getTestDelayString() {
        long j = this.testDelayMillis;
        if (j == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return j + "ms";
    }

    public int hashCode() {
        long j = this.testDelayMillis;
        return (int) (j ^ (j >>> 32));
    }

    public final void setTestDelayMillis(long j) {
        this.testDelayMillis = j;
    }

    public String toString() {
        return vh.j(this.testDelayMillis, "ServerAffiliationInfo(testDelayMillis=", ")");
    }

    public ServerAffiliationInfo(long j) {
        this.testDelayMillis = j;
    }

    public ServerAffiliationInfo() {
        this(0L, 1, null);
    }
}
