package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.h0;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzcen;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i72 implements zzbsp {
    public final zzbsr a;
    public final zzbss b;
    public final zzbsl c;
    public final String d;

    public i72(zzbsl zzbslVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.c = zzbslVar;
        this.d = str;
        this.b = zzbssVar;
        this.a = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final ListenableFuture zzb(Object obj) {
        zzcen zzcenVar = new zzcen();
        zzbsf zzbsfVarB = this.c.b();
        zze.zza("callJs > getEngine: Promise created");
        zzbsfVarB.a(new h0(this, zzbsfVarB, obj, zzcenVar), new i31(this, 11, zzcenVar, zzbsfVarB));
        return zzcenVar;
    }
}
