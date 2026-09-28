package defpackage;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoMimeInfo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ed extends VideoMimeInfo {
    public final String a;
    public final int b;
    public final EncoderProfilesProxy.VideoProfileProxy c;

    public ed(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.a = str;
        this.b = i;
        this.c = videoProfileProxy;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final String a() {
        return this.a;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final int b() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.config.VideoMimeInfo
    public final EncoderProfilesProxy.VideoProfileProxy c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoMimeInfo)) {
            return false;
        }
        VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
        if (!this.a.equals(videoMimeInfo.a()) || this.b != videoMimeInfo.b()) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.c;
        return videoProfileProxy == null ? videoMimeInfo.c() == null : videoProfileProxy.equals(videoMimeInfo.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.c;
        return (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}
