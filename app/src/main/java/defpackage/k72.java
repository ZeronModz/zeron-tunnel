package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzchc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k72 implements zzcer, zzchc {
    public final /* synthetic */ zzcen a;

    @Override // com.google.android.gms.internal.ads.zzchc
    public /* synthetic */ void zza(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("mediaUrl", str);
        this.a.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcer, com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        this.a.a((zzbsm) obj);
    }
}
