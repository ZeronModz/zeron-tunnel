package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import defpackage.ec1;
import defpackage.hz;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, d2 = {"Lcom/v2ray/ang/dto/GitHubRelease;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "tagName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "body", "assets", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/dto/GitHubRelease$Asset;", "prerelease", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "publishedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "getTagName", "()Ljava/lang/String;", "getBody", "getAssets", "()Ljava/util/List;", "getPrerelease", "()Z", "getPublishedAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "Asset", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GitHubRelease {

    @SerializedName("assets")
    private final List<Asset> assets;

    @SerializedName("body")
    private final String body;

    @SerializedName("prerelease")
    private final boolean prerelease;

    @SerializedName("published_at")
    private final String publishedAt;

    @SerializedName("tag_name")
    private final String tagName;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/v2ray/ang/dto/GitHubRelease$Asset;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "browserDownloadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getBrowserDownloadUrl", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Asset {

        @SerializedName("browser_download_url")
        private final String browserDownloadUrl;

        @SerializedName("name")
        private final String name;

        public Asset(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.browserDownloadUrl = str2;
        }

        public static /* synthetic */ Asset copy$default(Asset asset, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = asset.name;
            }
            if ((i & 2) != 0) {
                str2 = asset.browserDownloadUrl;
            }
            return asset.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBrowserDownloadUrl() {
            return this.browserDownloadUrl;
        }

        public final Asset copy(String name, String browserDownloadUrl) {
            name.getClass();
            browserDownloadUrl.getClass();
            return new Asset(name, browserDownloadUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) other;
            return yg0.a(this.name, asset.name) && yg0.a(this.browserDownloadUrl, asset.browserDownloadUrl);
        }

        public final String getBrowserDownloadUrl() {
            return this.browserDownloadUrl;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.browserDownloadUrl.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return ec1.L("Asset(name=", this.name, ", browserDownloadUrl=", this.browserDownloadUrl, ")");
        }
    }

    public GitHubRelease(String str, String str2, List<Asset> list, boolean z, String str3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        this.tagName = str;
        this.body = str2;
        this.assets = list;
        this.prerelease = z;
        this.publishedAt = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GitHubRelease copy$default(GitHubRelease gitHubRelease, String str, String str2, List list, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gitHubRelease.tagName;
        }
        if ((i & 2) != 0) {
            str2 = gitHubRelease.body;
        }
        if ((i & 4) != 0) {
            list = gitHubRelease.assets;
        }
        if ((i & 8) != 0) {
            z = gitHubRelease.prerelease;
        }
        if ((i & 16) != 0) {
            str3 = gitHubRelease.publishedAt;
        }
        String str4 = str3;
        List list2 = list;
        return gitHubRelease.copy(str, str2, list2, z, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final List<Asset> component3() {
        return this.assets;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPrerelease() {
        return this.prerelease;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final GitHubRelease copy(String tagName, String body, List<Asset> assets, boolean prerelease, String publishedAt) {
        tagName.getClass();
        body.getClass();
        assets.getClass();
        publishedAt.getClass();
        return new GitHubRelease(tagName, body, assets, prerelease, publishedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitHubRelease)) {
            return false;
        }
        GitHubRelease gitHubRelease = (GitHubRelease) other;
        return yg0.a(this.tagName, gitHubRelease.tagName) && yg0.a(this.body, gitHubRelease.body) && yg0.a(this.assets, gitHubRelease.assets) && this.prerelease == gitHubRelease.prerelease && yg0.a(this.publishedAt, gitHubRelease.publishedAt);
    }

    public final List<Asset> getAssets() {
        return this.assets;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getPrerelease() {
        return this.prerelease;
    }

    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public int hashCode() {
        return this.publishedAt.hashCode() + ((((this.assets.hashCode() + vh.c(this.tagName.hashCode() * 31, 31, this.body)) * 31) + (this.prerelease ? 1231 : 1237)) * 31);
    }

    public String toString() {
        String str = this.tagName;
        String str2 = this.body;
        List<Asset> list = this.assets;
        boolean z = this.prerelease;
        String str3 = this.publishedAt;
        StringBuilder sbA = hz.A("GitHubRelease(tagName=", str, ", body=", str2, ", assets=");
        sbA.append(list);
        sbA.append(", prerelease=");
        sbA.append(z);
        sbA.append(", publishedAt=");
        return vh.s(sbA, str3, ")");
    }

    public /* synthetic */ GitHubRelease(String str, String str2, List list, boolean z, String str3, int i, xu xuVar) {
        this(str, str2, list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3);
    }
}
