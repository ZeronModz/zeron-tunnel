package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzug;
import com.google.android.gms.internal.ads.zzuj;
import com.google.android.gms.internal.ads.zzuk;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class al3 implements zzuk {
    public final MediaCodec a;
    public final zzug b;

    public /* synthetic */ al3(MediaCodec mediaCodec, zzug zzugVar) {
        this.a = mediaCodec;
        this.b = zzugVar;
        if (Build.VERSION.SDK_INT < 35 || zzugVar == null) {
            return;
        }
        zzugVar.b(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zza(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzb(int i, int i2, zzie zzieVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, 0, zzieVar.i, j, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzc(int i, boolean z) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzd(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zze() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final MediaFormat zzg() {
        return this.a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final ByteBuffer zzh(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzi(Runnable runnable) {
        runnable.run();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final ByteBuffer zzj(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzk() {
        this.a.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzl() {
        zzug zzugVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && zzugVar != null) {
                zzugVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && zzugVar != null) {
                zzugVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final boolean zzm(zzuj zzujVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzn(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzo() {
        this.a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzp(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzq(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzr(List list) {
        this.a.subscribeToVendorParameters(list);
    }
}
