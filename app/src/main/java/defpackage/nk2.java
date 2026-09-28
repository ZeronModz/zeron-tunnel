package defpackage;

import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nk2 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ i33 b;

    public /* synthetic */ nk2(i33 i33Var, int i) {
        this.a = i;
        this.b = i33Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) throws zzenv {
        int i = this.a;
        i33 i33Var = this.b;
        zzcjl zzcjlVar = (zzcjl) obj;
        switch (i) {
            case 0:
                if (zzcjlVar != null) {
                    return i33Var;
                }
                throw new zzenv(1, "Retrieve Web View from image ad response failed.");
            default:
                if (zzcjlVar == null || zzcjlVar.zzh() == null) {
                    throw new zzenv(1, "Retrieve video view in html5 ad response failed.");
                }
                return i33Var;
        }
    }
}
