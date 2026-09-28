package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzedt;
import com.google.android.gms.internal.ads.zzegw;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn2 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbzu b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yn2(Object obj, zzbzu zzbzuVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = zzbzuVar;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        int i = this.a;
        int i2 = this.c;
        zzbzu zzbzuVar = this.b;
        Object obj2 = this.d;
        int i3 = 1;
        switch (i) {
            case 0:
                zzecz zzeczVar = (zzecz) obj2;
                Bundle bundle = zzbzuVar.m;
                if (bundle != null) {
                    bundle.putBoolean("ls", true);
                }
                return z.Z(((zzegw) zzeczVar.d.zzb()).a(zzbzuVar, i2), new y12(zzbzuVar, i3), zzeczVar.b);
            default:
                zzedt zzedtVar = (zzedt) obj2;
                zzedtVar.getClass();
                Bundle bundle2 = zzbzuVar.m;
                if (bundle2 != null) {
                    bundle2.putBoolean("ls", true);
                }
                return z.Z(((zzegw) zzedtVar.e.zzb()).d(zzbzuVar, i2), new y12(zzbzuVar, 2), zzedtVar.b);
        }
    }
}
