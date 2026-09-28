package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzrb;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzta;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nk3 implements zzrg {
    public final /* synthetic */ zzta a;

    public /* synthetic */ nk3(zzta zztaVar) {
        this.a = zztaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrg
    public final void zza(Exception exc) {
        ii2.S("Audio sink error", exc);
        zzrb zzrbVar = this.a.C0;
        Handler handler = zzrbVar.a;
        if (handler != null) {
            handler.post(new wn2(27, zzrbVar, exc));
        }
    }
}
