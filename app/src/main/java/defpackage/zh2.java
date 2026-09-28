package defpackage;

import android.os.HandlerThread;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzfix;
import com.google.android.gms.internal.ads.zzgru;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh2 implements zzdhc, zzgru {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ zh2(zzfix zzfixVar) {
        this.a = 1;
        this.b = zzfixVar.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 2:
                return new HandlerThread(wd.b(i2, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(wd.b(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
    }

    public /* synthetic */ zh2(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        ((zzr) obj).zzdT(this.b);
    }
}
