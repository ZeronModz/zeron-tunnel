package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import com.google.android.gms.internal.ads.zzed;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gk3 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ hk3 a;

    public gk3(hk3 hk3Var) {
        this.a = hk3Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzed zzedVar = this.a.c.h;
        zzedVar.c(-1, ni3.g);
        zzedVar.d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzed zzedVar = this.a.c.h;
        zzedVar.c(-1, ni3.e);
        zzedVar.d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzed zzedVar = this.a.c.h;
        zzedVar.c(-1, ni3.f);
        zzedVar.d();
    }
}
