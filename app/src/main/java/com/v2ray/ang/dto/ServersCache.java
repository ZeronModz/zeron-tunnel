package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/v2ray/ang/dto/ServersCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "guid", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "profile", "Lcom/v2ray/ang/dto/ProfileItem;", "<init>", "(Ljava/lang/String;Lcom/v2ray/ang/dto/ProfileItem;)V", "getGuid", "()Ljava/lang/String;", "getProfile", "()Lcom/v2ray/ang/dto/ProfileItem;", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServersCache {
    private final String guid;
    private final ProfileItem profile;

    public ServersCache(String str, ProfileItem profileItem) {
        str.getClass();
        profileItem.getClass();
        this.guid = str;
        this.profile = profileItem;
    }

    public static /* synthetic */ ServersCache copy$default(ServersCache serversCache, String str, ProfileItem profileItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serversCache.guid;
        }
        if ((i & 2) != 0) {
            profileItem = serversCache.profile;
        }
        return serversCache.copy(str, profileItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProfileItem getProfile() {
        return this.profile;
    }

    public final ServersCache copy(String guid, ProfileItem profile) {
        guid.getClass();
        profile.getClass();
        return new ServersCache(guid, profile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServersCache)) {
            return false;
        }
        ServersCache serversCache = (ServersCache) other;
        return yg0.a(this.guid, serversCache.guid) && yg0.a(this.profile, serversCache.profile);
    }

    public final String getGuid() {
        return this.guid;
    }

    public final ProfileItem getProfile() {
        return this.profile;
    }

    public int hashCode() {
        return this.profile.hashCode() + (this.guid.hashCode() * 31);
    }

    public String toString() {
        return "ServersCache(guid=" + this.guid + ", profile=" + this.profile + ")";
    }
}
