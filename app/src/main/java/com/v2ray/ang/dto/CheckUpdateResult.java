package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/v2ray/ang/dto/CheckUpdateResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "hasUpdate", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "latestVersion", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "releaseNotes", "downloadUrl", "error", "isPreRelease", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getHasUpdate", "()Z", "getLatestVersion", "()Ljava/lang/String;", "getReleaseNotes", "getDownloadUrl", "getError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckUpdateResult {
    private final String downloadUrl;
    private final String error;
    private final boolean hasUpdate;
    private final boolean isPreRelease;
    private final String latestVersion;
    private final String releaseNotes;

    public /* synthetic */ CheckUpdateResult(boolean z, String str, String str2, String str3, String str4, boolean z2, int i, xu xuVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z2);
    }

    public static /* synthetic */ CheckUpdateResult copy$default(CheckUpdateResult checkUpdateResult, boolean z, String str, String str2, String str3, String str4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkUpdateResult.hasUpdate;
        }
        if ((i & 2) != 0) {
            str = checkUpdateResult.latestVersion;
        }
        if ((i & 4) != 0) {
            str2 = checkUpdateResult.releaseNotes;
        }
        if ((i & 8) != 0) {
            str3 = checkUpdateResult.downloadUrl;
        }
        if ((i & 16) != 0) {
            str4 = checkUpdateResult.error;
        }
        if ((i & 32) != 0) {
            z2 = checkUpdateResult.isPreRelease;
        }
        String str5 = str4;
        boolean z3 = z2;
        return checkUpdateResult.copy(z, str, str2, str3, str5, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLatestVersion() {
        return this.latestVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReleaseNotes() {
        return this.releaseNotes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsPreRelease() {
        return this.isPreRelease;
    }

    public final CheckUpdateResult copy(boolean hasUpdate, String latestVersion, String releaseNotes, String downloadUrl, String error, boolean isPreRelease) {
        return new CheckUpdateResult(hasUpdate, latestVersion, releaseNotes, downloadUrl, error, isPreRelease);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckUpdateResult)) {
            return false;
        }
        CheckUpdateResult checkUpdateResult = (CheckUpdateResult) other;
        return this.hasUpdate == checkUpdateResult.hasUpdate && yg0.a(this.latestVersion, checkUpdateResult.latestVersion) && yg0.a(this.releaseNotes, checkUpdateResult.releaseNotes) && yg0.a(this.downloadUrl, checkUpdateResult.downloadUrl) && yg0.a(this.error, checkUpdateResult.error) && this.isPreRelease == checkUpdateResult.isPreRelease;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    public final String getLatestVersion() {
        return this.latestVersion;
    }

    public final String getReleaseNotes() {
        return this.releaseNotes;
    }

    public int hashCode() {
        int i = (this.hasUpdate ? 1231 : 1237) * 31;
        String str = this.latestVersion;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.releaseNotes;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.downloadUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.isPreRelease ? 1231 : 1237);
    }

    public final boolean isPreRelease() {
        return this.isPreRelease;
    }

    public String toString() {
        boolean z = this.hasUpdate;
        String str = this.latestVersion;
        String str2 = this.releaseNotes;
        String str3 = this.downloadUrl;
        String str4 = this.error;
        boolean z2 = this.isPreRelease;
        StringBuilder sb = new StringBuilder("CheckUpdateResult(hasUpdate=");
        sb.append(z);
        sb.append(", latestVersion=");
        sb.append(str);
        sb.append(", releaseNotes=");
        hz.H(sb, str2, ", downloadUrl=", str3, ", error=");
        sb.append(str4);
        sb.append(", isPreRelease=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public CheckUpdateResult(boolean z, String str, String str2, String str3, String str4, boolean z2) {
        this.hasUpdate = z;
        this.latestVersion = str;
        this.releaseNotes = str2;
        this.downloadUrl = str3;
        this.error = str4;
        this.isPreRelease = z2;
    }
}
