package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcti;
import com.google.android.gms.internal.ads.zzdko;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzgqt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah2 implements zzgqt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ah2(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                tt2 tt2Var = (tt2) obj;
                zzat zzatVar = new zzat((Context) obj4);
                zzatVar.zze(tt2Var.B);
                zzatVar.zzf(tt2Var.C.toString());
                zzatVar.zzd(((VersionInfoParcel) obj3).afmaVersion);
                zzatVar.zzc(((cu2) obj2).g);
                return zzatVar;
            case 1:
                zzcjl zzcjlVar = (zzcjl) obj4;
                if (((tt2) obj3).M) {
                    zzcjlVar.zzav();
                }
                zzcjlVar.zzJ();
                zzcjlVar.onPause();
                return ((zzcti) obj2).d();
            case 2:
                zzcjl zzcjlVar2 = (zzcjl) obj4;
                if (((tt2) obj3).M) {
                    zzcjlVar2.zzav();
                }
                zzcjlVar2.zzJ();
                zzcjlVar2.onPause();
                return ((zzdko) obj2).d();
            default:
                zzcjl zzcjlVar3 = (zzcjl) obj4;
                if (((tt2) obj3).M) {
                    zzcjlVar3.zzav();
                }
                zzcjlVar3.zzJ();
                zzcjlVar3.onPause();
                return ((zzdua) obj2).d();
        }
    }
}
