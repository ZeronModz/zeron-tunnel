package defpackage;

import com.google.android.gms.internal.ads.zzfdc;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class et2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzfdc b;

    public /* synthetic */ et2(zzfdc zzfdcVar, int i) {
        this.a = i;
        this.b = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzfdc zzfdcVar = this.b;
        switch (i) {
            case 0:
                String str = zzfdcVar.a.d;
                k02.J(str);
                return str;
            case 1:
                return Integer.valueOf(zzfdcVar.b);
            case 2:
                return Boolean.valueOf(zzfdcVar.a.l);
            case 3:
                return Boolean.valueOf(zzfdcVar.a.k);
            case 4:
                String str2 = zzfdcVar.a.h;
                k02.J(str2);
                return str2;
            case 5:
                return Integer.valueOf(zzfdcVar.a());
            default:
                return Integer.valueOf(zzfdcVar.a.o);
        }
    }
}
