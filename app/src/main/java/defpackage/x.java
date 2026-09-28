package defpackage;

import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.EncoderInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.r;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzehn;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.b;
import java.util.Objects;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements EncoderInfo {
    public final Object a;
    public final Object b;

    public x(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        this.a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(vh.l("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    public void a() {
        r rVar = (r) this.a;
        CancellationSignal cancellationSignal = (CancellationSignal) this.b;
        HashSet hashSet = rVar.e;
        if (hashSet.remove(cancellationSignal) && hashSet.isEmpty()) {
            rVar.b();
        }
    }

    public abstract String b();

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getName() {
        return ((MediaCodecInfo) this.a).getName();
    }

    public x(zzehn zzehnVar, zzg zzgVar) {
        this.b = zzehnVar;
        this.a = zzgVar;
    }

    public x(BitArray bitArray) {
        this.a = bitArray;
        this.b = new b(bitArray);
    }

    public x(r rVar, CancellationSignal cancellationSignal) {
        this.a = rVar;
        this.b = cancellationSignal;
    }
}
