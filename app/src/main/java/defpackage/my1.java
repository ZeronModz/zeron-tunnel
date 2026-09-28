package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class my1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzbtt e;
    public final /* synthetic */ zzaz f;

    public my1(zzaz zzazVar, Context context, zzr zzrVar, String str, zzbtt zzbttVar) {
        this.b = context;
        this.c = zzrVar;
        this.d = str;
        this.e = zzbttVar;
        this.f = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b, "interstitial");
        return new zzfk();
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f.zzn().zza(this.b, this.c, this.d, this.e, 2);
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzc(new a(this.b), this.c, this.d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
