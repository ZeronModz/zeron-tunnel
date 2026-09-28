package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzeuf;
import com.google.android.gms.internal.ads.zzeyj;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pr2 implements zzfax {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public pr2(VersionInfoParcel versionInfoParcel, zzgzy zzgzyVar) {
        this.a = 1;
        this.c = versionInfoParcel;
        this.b = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) zzbd.zzc().a(p32.J3)).booleanValue()) {
                    return z.j(new zzeuf(null));
                }
                return z.b0(((zzcdu) obj).j(), ox1.n, (ta2) obj2);
            case 1:
                return ((zzgzy) obj2).zzc(new hc0(this, 14));
            case 2:
                return ((zzgzy) obj2).zzc(new hc0(this, 20));
            case 3:
                zze.zza("HsdpMigrationSignal.produce");
                if (!((Boolean) zzbd.zzc().a(p32.f3me)).booleanValue()) {
                    return z.j(new zzeyj(null));
                }
                boolean z = false;
                try {
                    if (((Intent) obj).resolveActivity(((Context) obj2).getPackageManager()) != null) {
                        zze.zza("HSDP intent is supported");
                        z = true;
                    }
                } catch (Exception e) {
                    zzt.zzh().f("HsdpMigrationSignal.isHsdpMigrationSupported", e);
                }
                return z.j(new zzeyj(Boolean.valueOf(z)));
            case 4:
                return ((zzgzy) obj2).zzc(new hc0(this, 22));
            default:
                return ((zzgzy) obj2).zzc(new hc0(this, 25));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        switch (this.a) {
            case 0:
                return 10;
            case 1:
                return 54;
            case 2:
                return 21;
            case 3:
                return 60;
            case 4:
                return 23;
            default:
                return 62;
        }
    }

    public /* synthetic */ pr2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
