package defpackage;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.EncoderConfig;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cd implements EncoderConfig {
    public final String a;
    public final int b;
    public final Timebase c;
    public final Size d;
    public final int e;
    public final dd f;
    public final int g;
    public final int h;
    public final int i;

    public cd(String str, int i, Timebase timebase, Size size, int i2, dd ddVar, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = timebase;
        this.d = size;
        this.e = i2;
        this.f = ddVar;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public static bd a() {
        bd bdVar = new bd();
        bdVar.b = -1;
        bdVar.h = 1;
        bdVar.e = 2130708361;
        bdVar.f = dd.d;
        return bdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cd) {
            cd cdVar = (cd) obj;
            if (this.a.equals(cdVar.a) && this.b == cdVar.b && this.c.equals(cdVar.c) && this.d.equals(cdVar.d) && this.e == cdVar.e && this.f.equals(cdVar.f) && this.g == cdVar.g && this.h == cdVar.h && this.i == cdVar.i) {
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
        return this.i ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final MediaFormat toMediaFormat() {
        Size size = this.d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.g);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.h);
        int i = this.b;
        if (i != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i);
        }
        dd ddVar = this.f;
        int i2 = ddVar.a;
        if (i2 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        }
        int i3 = ddVar.b;
        if (i3 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
        }
        int i4 = ddVar.c;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i4);
        }
        return mediaFormatCreateVideoFormat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return hz.q(this.i, "}", sb);
    }
}
