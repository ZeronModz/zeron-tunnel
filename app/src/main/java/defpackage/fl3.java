package defpackage;

import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwk;
import com.google.android.gms.internal.ads.zzwu;
import com.google.android.gms.internal.ads.zzwv;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl3 implements zzdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzwu b;
    public final /* synthetic */ zzwb c;
    public final /* synthetic */ zzwg d;

    public /* synthetic */ fl3(zzwu zzwuVar, zzwb zzwbVar, zzwg zzwgVar, int i) {
        this.a = i;
        this.b = zzwuVar;
        this.c = zzwbVar;
        this.d = zzwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final /* synthetic */ void zza(Object obj) {
        int i = this.a;
        zzwg zzwgVar = this.d;
        zzwb zzwbVar = this.c;
        zzwk zzwkVar = this.b.a;
        zzwv zzwvVar = (zzwv) obj;
        switch (i) {
            case 0:
                zzwvVar.zzaj(0, zzwkVar, zzwbVar, zzwgVar);
                break;
            default:
                zzwvVar.zzak(0, zzwkVar, zzwbVar, zzwgVar);
                break;
        }
    }
}
