package defpackage;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzcfs;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ya2 {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) zzbd.zzc().a(p32.n0)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, zzcfs zzcfsVar) {
        if (zzcfsVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.c) {
            long j = timestamp - this.b;
            if (Math.abs(j) < this.a) {
                return;
            }
        }
        this.c = false;
        this.b = timestamp;
        zzs.zza.post(new vn1(zzcfsVar, 23));
    }
}
