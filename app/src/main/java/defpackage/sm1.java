package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 implements VideoEncoderInfo {
    public final VideoEncoderInfo a;
    public final Range b;
    public final Range c;
    public final HashSet d;

    public sm1(VideoEncoderInfo videoEncoderInfo) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.a = videoEncoderInfo;
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        this.b = Range.create(Integer.valueOf(widthAlignment), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) widthAlignment))) * widthAlignment));
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        this.c = Range.create(Integer.valueOf(heightAlignment), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) heightAlignment))) * heightAlignment));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static VideoEncoderInfo a(VideoEncoderInfo videoEncoderInfo, Size size) {
        if (!(videoEncoderInfo instanceof sm1)) {
            if (nx.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                videoEncoderInfo = new sm1(videoEncoderInfo);
            } else if (size != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(size.getWidth(), size.getHeight())) {
                Range<Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
                Range<Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
                size.toString();
                Objects.toString(supportedWidths);
                Objects.toString(supportedHeights);
                km0.g("VideoEncoderInfoWrapper");
                videoEncoderInfo = new sm1(videoEncoderInfo);
            }
        }
        if (size != null && (videoEncoderInfo instanceof sm1)) {
            ((sm1) videoEncoderInfo).d.add(size);
        }
        return videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return this.a.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.a.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public final String getName() {
        return this.a.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedBitrateRange() {
        return this.a.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeights() {
        return this.c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedHeightsFor(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean zContains = range.contains(numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.a;
        jx0.b(zContains && i % videoEncoderInfo.getWidthAlignment() == 0, "Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.getWidthAlignment());
        return this.c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidths() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range getSupportedWidthsFor(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean zContains = range.contains(numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.a;
        jx0.b(zContains && i % videoEncoderInfo.getHeightAlignment() == 0, "Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.getHeightAlignment());
        return this.b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.a.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int i, int i2) {
        VideoEncoderInfo videoEncoderInfo = this.a;
        if (videoEncoderInfo.isSizeSupported(i, i2)) {
            return true;
        }
        for (Size size : this.d) {
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        return this.b.contains(Integer.valueOf(i)) && this.c.contains(Integer.valueOf(i2)) && i % videoEncoderInfo.getWidthAlignment() == 0 && i2 % videoEncoderInfo.getHeightAlignment() == 0;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final /* synthetic */ boolean isSizeSupportedAllowSwapping(int i, int i2) {
        return ec1.w(this, i, i2);
    }
}
