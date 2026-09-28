package defpackage;

import com.google.android.gms.internal.ads.zzdql;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ek2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzdql b;

    public /* synthetic */ ek2(zzdql zzdqlVar, int i) {
        this.a = i;
        this.b = zzdqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzdql zzdqlVar = this.b;
        switch (i) {
            case 0:
                return zzdqlVar.c;
            case 1:
                return zzdqlVar.b;
            default:
                return zzdqlVar.a;
        }
    }
}
