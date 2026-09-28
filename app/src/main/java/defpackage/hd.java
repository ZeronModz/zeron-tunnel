package defpackage;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hd extends VideoValidatedEncoderProfilesProxy {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final EncoderProfilesProxy.AudioProfileProxy e;
    public final EncoderProfilesProxy.VideoProfileProxy f;

    public hd(int i, int i2, List list, List list2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            io0.e("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 == null) {
            io0.e("Null videoProfiles");
            throw null;
        }
        this.d = list2;
        this.e = audioProfileProxy;
        if (videoProfileProxy != null) {
            this.f = videoProfileProxy;
        } else {
            io0.e("Null defaultVideoProfile");
            throw null;
        }
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final EncoderProfilesProxy.AudioProfileProxy a() {
        return this.e;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final EncoderProfilesProxy.VideoProfileProxy b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoValidatedEncoderProfilesProxy)) {
            return false;
        }
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (VideoValidatedEncoderProfilesProxy) obj;
        if (this.a != videoValidatedEncoderProfilesProxy.getDefaultDurationSeconds() || this.b != videoValidatedEncoderProfilesProxy.getRecommendedFileFormat() || !this.c.equals(videoValidatedEncoderProfilesProxy.getAudioProfiles()) || !this.d.equals(videoValidatedEncoderProfilesProxy.getVideoProfiles())) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.e;
        if (audioProfileProxy == null) {
            if (videoValidatedEncoderProfilesProxy.a() != null) {
                return false;
            }
        } else if (!audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.a())) {
            return false;
        }
        return this.f.equals(videoValidatedEncoderProfilesProxy.b());
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getAudioProfiles() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getVideoProfiles() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.e;
        return this.f.hashCode() ^ ((iHashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
