package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.f4;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzetx;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nr2 implements zzfax {
    public final /* synthetic */ int a;
    public final Context b;
    public final zzgzy c;

    public /* synthetic */ nr2(Context context, zzgzy zzgzyVar, int i) {
        this.a = i;
        this.b = context;
        this.c = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        int i = this.a;
        zzgzy zzgzyVar = this.c;
        switch (i) {
            case 0:
                if (!((Boolean) zzbd.zzc().a(p32.re)).booleanValue()) {
                    return z.j(new zzetx(null, false));
                }
                ContentResolver contentResolver = this.b.getContentResolver();
                return contentResolver == null ? z.j(new zzetx(null, false)) : zzgzyVar.zzc(new hc0(contentResolver, 12));
            case 1:
                return zzgzyVar.zzc(new hc0(this, 18));
            case 2:
                return zzgzyVar.zzc(new hc0(this, 19));
            case 3:
                return zzgzyVar.zzc(new f4(this, 0));
            default:
                return ((Boolean) c42.b.g()).booleanValue() ? zzgzyVar.zzc(new hc0(this, 29)) : z.j(new ts2(-1, -1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        switch (this.a) {
            case 0:
                return 61;
            case 1:
                return 18;
            case 2:
                return 57;
            case 3:
                return 37;
            default:
                return 59;
        }
    }

    public /* synthetic */ nr2(zzgzy zzgzyVar, Context context, int i) {
        this.a = i;
        this.c = zzgzyVar;
        this.b = context;
    }
}
