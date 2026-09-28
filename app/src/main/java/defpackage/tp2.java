package defpackage;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzelv;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tp2 extends zzbvf {
    public final zzekj a;
    public final /* synthetic */ zzelp b;

    public /* synthetic */ tp2(zzelp zzelpVar, zzekj zzekjVar) {
        this.b = zzelpVar;
        this.a = zzekjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.b.c = (View) a.d(iObjectWrapper);
        ((zzelv) this.a.c).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(String str) {
        ((zzelv) this.a.c).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(zze zzeVar) {
        ((zzelv) this.a.c).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh(zzbuc zzbucVar) {
        this.b.d = zzbucVar;
        ((zzelv) this.a.c).zzj();
    }
}
