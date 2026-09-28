package defpackage;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.camera.video.internal.encoder.AudioEncoderInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w8 extends x implements AudioEncoderInfo {
    public final MediaCodecInfo.AudioCapabilities c;

    public w8(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = ((MediaCodecInfo.CodecCapabilities) this.b).getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.c = audioCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderInfo
    public final Range getBitrateRange() {
        return this.c.getBitrateRange();
    }
}
