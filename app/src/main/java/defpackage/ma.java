package defpackage;

import android.media.MediaFormat;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.EncoderConfig;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ma implements EncoderConfig {
    public final String a;
    public final int b;
    public final Timebase c;
    public final int d;
    public final int e;
    public final int f;

    public ma(String str, int i, Timebase timebase, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = timebase;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ma) {
            ma maVar = (ma) obj;
            if (this.a.equals(maVar.a) && this.b == maVar.b && this.c.equals(maVar.c) && this.d == maVar.d && this.e == maVar.e && this.f == maVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final Timebase getInputTimebase() {
        return this.c;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final String getMimeType() {
        return this.a;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final int getProfile() {
        return this.b;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final MediaFormat toMediaFormat() {
        int i = this.e;
        int i2 = this.f;
        String str = this.a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.d);
        int i3 = this.b;
        if (i3 != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i3);
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", i3);
        }
        return mediaFormatCreateAudioFormat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", sampleRate=");
        sb.append(this.e);
        sb.append(", channelCount=");
        return hz.q(this.f, "}", sb);
    }
}
