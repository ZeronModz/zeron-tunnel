package defpackage;

import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzwi;
import com.google.android.gms.internal.ads.zzyn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl3 implements zzgqt {
    public static final /* synthetic */ bl3 b = new bl3(0);
    public static final /* synthetic */ bl3 c = new bl3(1);
    public static final /* synthetic */ bl3 d = new bl3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ bl3(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                zzaeu zzaeuVar = (zzaeu) obj;
                zzaeuVar.zzg();
                return zzaeuVar.getClass().getSimpleName();
            case 1:
                return zzguf.zzq(z.u(((zzwi) obj).zzd().b, d));
            default:
                zzyn zzynVar = zzyn.d;
                return Integer.valueOf(((zzbg) obj).c);
        }
    }
}
