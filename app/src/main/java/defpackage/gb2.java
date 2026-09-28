package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzcia;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gb2 extends zzb {
    public final zzcge a;
    public final zzchr b;
    public final String c;
    public final String[] d;

    public gb2(zzcge zzcgeVar, zzchr zzchrVar, String str, String[] strArr) {
        this.a = zzcgeVar;
        this.b = zzchrVar;
        this.c = str;
        this.d = strArr;
        zzt.zzB().a.add(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.b.b(this.c, this.d);
        } finally {
            zzs.zza.post(new vn1(this, 24));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) zzbd.zzc().a(p32.C2)).booleanValue() && (this.b instanceof zzcia)) ? g3.f.zzc(new hc0(this, 4)) : super.zzb();
    }
}
