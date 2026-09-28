package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzdrp;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kk2 {
    public final zzgzy a;
    public final zzdrp b;
    public final tj1 c;
    public final zzdxt d;

    public kk2(zzgzy zzgzyVar, zzdrp zzdrpVar, tj1 tj1Var, zzdxt zzdxtVar) {
        this.a = zzgzyVar;
        this.b = zzdrpVar;
        this.c = tj1Var;
        this.d = zzdxtVar;
    }

    public final void a(ListenableFuture listenableFuture, zzdxh zzdxhVar) {
        if (((Boolean) zzbd.zzc().a(p32.R2)).booleanValue()) {
            listenableFuture.addListener(new s33(0, listenableFuture, new i31(25, this, zzdxhVar)), this.a);
        }
    }
}
