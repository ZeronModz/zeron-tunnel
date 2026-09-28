package defpackage;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nd3 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = n0.a();

    public final /* synthetic */ void a(int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = this.b;
        pattern.set(i, i2);
        this.a.setPattern(pattern);
    }
}
